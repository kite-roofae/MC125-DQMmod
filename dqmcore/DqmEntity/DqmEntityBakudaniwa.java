package net.minecraft.src.dqmcore.DqmEntity;
import net.minecraft.src.*;


public class DqmEntityBakudaniwa extends DqmEntityMob
{
	/**
	 * The amount of time since the creeper was close enough to the player to ignite
	 */
	int timeSinceIgnited;
	int lastActiveTime;


	public DqmEntityBakudaniwa(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Bakudaniwa.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 1.0F);
		//*******************************Speed***************************************
		moveSpeed = 0.25F;
		//*******************************ATK***************************************
		attackStrength = 5;
		//*******************************EXP***************************************
		experienceValue = 18;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;

		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new DqmEntityAIBakudaniwaSwell(this, null));
		tasks.addTask(3, new EntityAIAvoidEntity(this, net.minecraft.src.EntityOcelot.class, 6F, 0.25F, 0.3F));
		tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.25F, false));
		tasks.addTask(5, new EntityAIWander(this, 0.2F));
		tasks.addTask(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
		targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 25;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 10;    }
	//*******************************Fall taisei***************************************
	//protected void fall(float par1) {}
	//*******************************Sound***************************************
	//protected String getLivingSound()    {        return "none";    }
	//protected String getHurtSound()    {        return "mob.irongolem.hit";    }
	//protected String getDeathSound()    {        return "mob.irongolem.death";    }
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		//this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Bakudanisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Tikaranotane.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);
	}
	else        {             //100%
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Tekkouseki.shiftedIndex, 1);
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
	//case 2:dropItem(mod_Dqm.Sabitakabuto.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}



	@Override
	public boolean isAIEnabled()
	{
		return true;
	}
	@Override
	protected void entityInit()
	{
		super.entityInit();
		dataWatcher.addObject(16, Byte.valueOf((byte) - 1));
		dataWatcher.addObject(17, Byte.valueOf((byte)0));
	}
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);

		if (dataWatcher.getWatchableObjectByte(17) == 1)
		{
			par1NBTTagCompound.setBoolean("powered", true);
		}
	}
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		dataWatcher.updateObject(17, Byte.valueOf((byte)(par1NBTTagCompound.getBoolean("powered") ? 1 : 0)));
	}

	
	
	@Override
	public void onUpdate()
	{
		if (isEntityAlive())
		{
			lastActiveTime = timeSinceIgnited;
			int i = getCreeperState();

			if (i > 0 && timeSinceIgnited == 0)
			{
				worldObj.playSoundAtEntity(this, "random.fuse", 1.0F, 0.5F);
			}

			timeSinceIgnited += i;

			if (timeSinceIgnited < 0)
			{
				timeSinceIgnited = 0;
			}

			if (timeSinceIgnited >= 30)
			{
				timeSinceIgnited = 30;

				if (!worldObj.isRemote)
				{
					if (getPowered())
					{
						worldObj.createExplosion(this, posX, posY, posZ, 7F);
					}
					else
					{
						worldObj.createExplosion(this, posX, posY, posZ, 5F);
					}

					setDead();
				}
			}
		}

		super.onUpdate();
	}

	@Override
	protected String getHurtSound()
	{
		return "mob.creeper";
	}
	@Override
	protected String getDeathSound()
	{
		return "mob.creeperdeath";
	}
	public boolean getPowered()
	{
		return dataWatcher.getWatchableObjectByte(17) == 1;
	}
	public float setCreeperFlashTime(float par1)
	{
		return (lastActiveTime + (timeSinceIgnited - lastActiveTime) * par1) / 28F;
	}
	public int getCreeperState()
	{
		return dataWatcher.getWatchableObjectByte(16);
	}
	public void setCreeperState(int par1)
	{
		dataWatcher.updateObject(16, Byte.valueOf((byte)par1));
	}
	@Override
	public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt)
	{
		super.onStruckByLightning(par1EntityLightningBolt);
		dataWatcher.updateObject(17, Byte.valueOf((byte)1));
	}
}
