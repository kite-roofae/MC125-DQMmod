package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityMetaking extends EntityMob
{
	/**
	 * The tempt AI task for this mob, used to prevent taming while it is fleeing.
	 */
	private EntityAITempt aiTempt;

	public DqmEntityMetaking(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Metaking.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(0.5F, 0.5F);
		//*******************************Speed***************************************
		//moveSpeed = 0.25F;
		//*******************************ATK***************************************
		attackStrength = 6;
		//*******************************EXP***************************************
		experienceValue = 750;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;


		//getNavigator().func_48664_a(true);
		tasks.addTask(1, new EntityAISwimming(this));
		//tasks.addTask(2, aiSit);
		tasks.addTask(3, aiTempt = new EntityAITempt(this, 0.18F, Item.fishRaw.shiftedIndex, true));
		tasks.addTask(4, new EntityAIAvoidEntity(this, net.minecraft.src.EntityPlayer.class, 16F, 0.30F, 0.50F));  //nige
		//tasks.addTask(5, new EntityAIFollowOwner(this, 0.3F, 10F, 5F));
		//tasks.addTask(6, new EntityAIOcelotSit(this, 0.4F));
		tasks.addTask(7, new EntityAILeapAtTarget(this, 0.3F));
		tasks.addTask(8, new EntityAIOcelotAttack(this));
		//tasks.addTask(9, new EntityAIMate(this, 0.23F));
		tasks.addTask(10, new EntityAIWander(this, 0.23F));
		tasks.addTask(11, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 10F));
		//targetTasks.addTask(1, new EntityAITargetNonTamed(this, net.minecraft.src.EntityChicken.class, 14F, 750, false));

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 30;    }
	//*******************************Armor***************************************
	@Override
	public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	@Override
	protected void fall(float par1) {}
	//*******************************Sound***************************************
	//protected String getLivingSound()    {        return "none";    }
	//protected String getHurtSound()    {        return "mob.irongolem.hit";    }
	//protected String getDeathSound()    {        return "mob.irongolem.death";    }
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		this.dropItem(mod_Dqm.Puratina.shiftedIndex, 1);
		this.dropItem(Item.diamond.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Tikaranotane.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Metaru.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Misriru.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Tikaranotane.shiftedIndex, 1);
		//this.dropItem(Item.bone.shiftedIndex, 1);
	}    	}
	/*
    		[Akaitama][Amatuyunoito][Bakudanisi][Dokukesisou][Goldburesuretto][Goldring][Hayatenoring][Hikarinoisi][Hosifuru][Hosinokakera]
    		[Inferunoswordnoha][Inferunoswordnotuka][Kazekirinohane][Kinkai][Koorinokessyou][Koumorinohane][Littlemedal][Madarakumonoito]
    		[Majuunokawa][Majuunotuno][Mamorinotane][Metaloubu][Metaru][Metarukingnoha][Metarukingnotuka][Midorinokoke][Migakizuna]
    		[Misriru][MysteryEgg][Oriharukon][Puratina][Rotonoha][Rotonotuka][Seijanohai][Seireiseki][Sinkanohiseki][Subayasanotane][Suraimunokanmuri]
    		[Suraimuzeri][Syurizai][Tekkouseki][Tikaranotane][Tokinosuisyou][Tyounohane][Uruwasikinoko][Usaginosippo][Yakusou][Yawarakauru]
    		[Yogoretahoutai][Yougansekinokakera]*/

	//*******************************REA***************************************
	@Override
	protected void dropRareDrop(int par1)    {        switch (rand.nextInt(4))        {
	case 1:dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Sabitakabuto.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Metaloubu.shiftedIndex, 1);                break;
	case 4:dropItem(mod_Dqm.Metarukingnoturugi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}

	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}


	@Override
	protected String getHurtSound()
	{
		return "mob.slime";
	}

	@Override
	protected String getDeathSound()
	{
		return "mob.slime";
	}


	@Override
	protected void entityInit()
	{
		super.entityInit();
		dataWatcher.addObject(18, Byte.valueOf((byte)0));
	}

	/**
	 * main AI tick function, replaces updateEntityActionState
	 */
	@Override
	public void updateAITick()
	{
		if (!getMoveHelper().func_48186_a())
		{
			setSneaking(false);
			setSprinting(false);
		}
		else
		{
			float f = getMoveHelper().getSpeed();

			if (f == 0.18F)
			{
				setSneaking(true);
				setSprinting(false);
			}
			else if (f == 0.4F)
			{
				setSneaking(false);
				setSprinting(true);
			}
			else
			{
				setSneaking(false);
				setSprinting(false);
			}
		}
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setInteger("CatType", func_48148_ad());
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		func_48147_c(par1NBTTagCompound.getInteger("CatType"));
	}


	@Override
	public boolean attackEntityAsMob(Entity par1Entity)
	{
		return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 3);
	}

	public boolean isWheat(ItemStack par1ItemStack)
	{
		return par1ItemStack != null && par1ItemStack.itemID == Item.slimeBall.shiftedIndex;
	}


	public int func_48148_ad()
	{
		return dataWatcher.getWatchableObjectByte(18);
	}

	public void func_48147_c(int par1)
	{
		dataWatcher.updateObject(18, Byte.valueOf((byte)par1));
	}



}




