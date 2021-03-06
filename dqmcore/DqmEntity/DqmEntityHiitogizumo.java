package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityHiitogizumo extends DqmEntityMob
{


	//EntityAnimal,EntityZombie,EntityMob,EntityWaterMob
	private int field_40152_d;
	public DqmEntityHiitogizumo(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Hiitogizumo.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 1.4F);
		//*******************************Speed***************************************
		moveSpeed = 0.55F;
		//*******************************ATK***************************************
		attackStrength = 6;
		//*******************************EXP***************************************
		experienceValue = 25;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;

		//*******************************ETC***************************************
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, true));
		this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
		this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 16.0F, 0, false));

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 28;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 10;    }
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
		//this.dropItem(mod_Dqm.Tekkouseki.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Ikazutinotama.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Hananomitu.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.Metaru.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
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
	//case 2:dropItem(mod_Dqm.Sabitakabuto.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}


	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}
	@Override
	protected void entityInit()
	{
		super.entityInit();
		dataWatcher.addObject(16, new Byte((byte)0));
	}
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
		return super.attackEntityFrom(par1DamageSource, par2);
	}
	@Override
	public void onDeath(DamageSource par1DamageSource)
	{
		super.onDeath(par1DamageSource);
	}
	@Override
	protected void attackEntity(Entity par1Entity, float par2)
	{
		if (attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > boundingBox.minY && par1Entity.boundingBox.minY < boundingBox.maxY)
		{
			attackTime = 5;
			attackEntityAsMob(par1Entity);
		}
		else if (par2 < 30F)
		{
			double d = par1Entity.posX - posX;
			double d1 = (par1Entity.boundingBox.minY + (par1Entity.height / 2.0F)) - (posY + (height / 2.0F));
			double d2 = par1Entity.posZ - posZ;


			if (attackTime == 0)
			{
				field_40152_d++;

				if (field_40152_d == 1)
				{
					//3発を吐くまでの時間（10で1秒くらい）
					attackTime = 70;
					func_40150_a(true);
				}
				else if (field_40152_d <= 4)
				{
					//3発吐く間隔
					attackTime = 70;
				}
				else
				{
					//3発打ち終わったあと次の3発を打ち出すまでの時間
					attackTime = 70;
					field_40152_d = 0;
					func_40150_a(false);
				}


				if (field_40152_d > 1)
				{
					float f = MathHelper.sqrt_float(par2) * 0.5F;
					worldObj.playAuxSFXAtEntity(null, 1009, (int)posX, (int)posY, (int)posZ, 0);

					for (int i = 0; i < 1; i++)
					{
						EntitySmallFireball entitysmallfireball = new EntitySmallFireball(worldObj, this, d + rand.nextGaussian() * f, d1, d2 + rand.nextGaussian() * f);
						entitysmallfireball.posY = posY + (height / 2.0F) + 0.5D;
						worldObj.spawnEntityInWorld(entitysmallfireball);
						this.worldObj.playSoundAtEntity(this, "DQM_Sound.Jumon", 1.0F, 1.0F);
					}
				}}


			rotationYaw = (float)((Math.atan2(d2, d) * 180D) / Math.PI) - 90F;
			//hasAttacked = true;
		}
	}
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
	}
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
	}
	public boolean func_40151_ac()
	{
		return (dataWatcher.getWatchableObjectByte(16) & 1) != 0;
	}
	public void func_40150_a(boolean par1)
	{
		byte byte0 = dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			byte0 |= 1;
		}
		else
		{
			byte0 &= 0xfe;
		}

		dataWatcher.updateObject(16, Byte.valueOf(byte0));
	}

}
