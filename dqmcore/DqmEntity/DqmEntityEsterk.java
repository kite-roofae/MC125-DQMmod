package net.minecraft.src.dqmcore.DqmEntity;

import java.util.Random;

import net.minecraft.src.*;

public class DqmEntityEsterk extends DqmEntityMob
{
	protected Random Ran = new Random();
	private int field_40152_d;
	//EntityAnimal,EntityZombie,EntityMob,EntityWaterMob
	int timeSinceIgnited;
	int lastActiveTime;

	public DqmEntityEsterk(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Esterk.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 3.5F);
		//*******************************Speed***************************************
		moveSpeed = 2.0F;
		//*******************************ATK***************************************
		attackStrength = 40;
		//*******************************EXP***************************************
		experienceValue = 3000;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;

		//*******************************ETC***************************************

		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 16.0F, 0, false));
		tasks.addTask(2, new DqmEntityAIEsterkSwell(this, null));

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 500;    }
	//*******************************Armor***************************************
	@Override
	public int getTotalArmorValue()    {        return 5;    }
	//*******************************Fall taisei***************************************
	@Override
	protected void fall(float par1) {}
	//*******************************Sound***************************************

	@Override
	protected String getDeathSound()
	{
		this.worldObj.playSoundAtEntity(this, "DQM_Sound.PetBoss", 1.0F, 1.0F);
		return "";
	}
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		this.dropItem(mod_Dqm.Akaitama.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		this.dropItem(mod_Dqm.MysteryEgg.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Seireiseki.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);
		this.dropItem(mod_Dqm.MysteryEgg.shiftedIndex, 1);
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
	//case 1:dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);                break;
	case 1:dropItem(mod_Dqm.Rotonoturugi.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Rotonotate.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Hosifuru.shiftedIndex, 1);                break;
	case 4:dropItem(mod_Dqm.Sefiramunoyumi.shiftedIndex, 1);                break;
	}}


	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//001*******************************Jump kougeki***************************************
	private static int getRandom(int max, int min) {
		int ret = (int)Math.floor(Math.random()*(max-min+1))+min;

		return ret;
	}
	@Override
	protected void attackEntity(Entity par1Entity, float par2)
	{        int x = 0;
		float var3 = this.getBrightness(1.0F);
	if (var3 > 0.5F && this.rand.nextInt(100) == 0)	{
		this.entityToAttack = null;        }
	else        {
		if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0)            {
			int x3 = x+getRandom(3, -3);


			if(x3==-3){
		if (this.onGround)                {
			this.worldObj.playSoundAtEntity(this, "DQM_Sound.Esterkunari", 1.0F, 1.0F);
		}
		}
			if(x3<=-1){
		if (this.onGround)                {
			this.worldObj.playSoundAtEntity(this, "DQM_Sound.Esterk", 1.0F, 1.0F);
			double var4 = par1Entity.posX - this.posX;
			double var6 = par1Entity.posZ - this.posZ;
			float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
			this.motionX = var4 / var8 * 0.5D * 0.800000011920929D + this.motionX * 0.50000000298023224D;
			this.motionZ = var6 / var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.50000000298023224D;
			this.motionY = 1.0000000059604645D;}
			}
		if( x3 >= 1){
	if (this.onGround)                {
		this.worldObj.playSoundAtEntity(this, "DQM_Sound.Esterk", 1.0F, 1.0F);
		double var4 = par1Entity.posX - this.posX;
		double var6 = par1Entity.posZ - this.posZ;
		float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
		this.motionX = var4 / var8 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
		this.motionZ = var6 / var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
		this.motionY = 1.5000000059604645D;}
		}
		if( x3 == 0){
	if (this.onGround)                {
		this.worldObj.playSoundAtEntity(this, "DQM_Sound.Esterk", 1.0F, 1.0F);
		double var4 = par1Entity.posX - this.posX;
		double var6 = par1Entity.posZ - this.posZ;
		float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
		this.motionX = var4 / var8 * 0.5D * 0.800000011920929D + this.motionX * 1.50000000298023224D;
		this.motionZ = var6 / var8 * 0.5D * 0.800000011920929D + this.motionZ * 1.50000000298023224D;
		this.motionY = 0.2000000059604645D;}
		}
		}

	else            {
		super.attackEntity(par1Entity, par2);            }
		}

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









	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	public boolean isAIEnabled()
	{
		int x = 0;
		//if (this.onGround)
		{
			int x3 = x+getRandom(5, -5);
			//if (isEntityAlive())
			if(x3==-3)
			{
			return true;
			}
		}
		return false;
	}


	@Override
	protected void entityInit()
	{
		super.entityInit();
		dataWatcher.addObject(16, Byte.valueOf((byte) - 1));
		dataWatcher.addObject(17, Byte.valueOf((byte)0));
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);

		if (dataWatcher.getWatchableObjectByte(17) == 1)
		{
			par1NBTTagCompound.setBoolean("powered", true);
		}
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		dataWatcher.updateObject(17, Byte.valueOf((byte)(par1NBTTagCompound.getBoolean("powered") ? 1 : 0)));
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{	int x = 0;
		int x3 = x+getRandom(3, -3);
		//if (isEntityAlive())
		if(x3>=2)
		{
			lastActiveTime = timeSinceIgnited;
			int i = getCreeperState();

			if (i > 0 && timeSinceIgnited == 0)
			{
				worldObj.playSoundAtEntity(this, "random.fuse", 1.0F, 0.5F);
				//this.worldObj.playSoundAtEntity(this, "DQM_Sound.Jumon", 1.0F, 1.0F);
			}

			timeSinceIgnited += i;

			if (timeSinceIgnited < 0)
			{
				timeSinceIgnited = 0;
			}

			if (timeSinceIgnited >= 7)
			{
				timeSinceIgnited = 30;

				if (!worldObj.isRemote)
				{
					if (getPowered())
					{
						worldObj.createExplosion(this, posX, posY, posZ, 8F);
					}
					else
					{
						worldObj.createExplosion(this, posX, posY, posZ, 1F);
					}
					timeSinceIgnited = 0;

					//setDead();
				}
			}
		}

		super.onUpdate();
	}






	/**
	 * Returns true if the creeper is powered by a lightning bolt.
	 */
	public boolean getPowered()
	{
		return dataWatcher.getWatchableObjectByte(17) == 1;
	}

	/**
	 * Connects the the creeper flashes to the creeper's color multiplier
	 */
	public float setCreeperFlashTime(float par1)
	{
		return (lastActiveTime + (timeSinceIgnited - lastActiveTime) * par1) / 28F;
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */


	/**
	 * Returns the current state of creeper, -1 is idle, 1 is 'in fuse'
	 */
	public int getCreeperState()
	{
		return dataWatcher.getWatchableObjectByte(16);
	}

	/**
	 * Sets the state of creeper, -1 to idle and 1 to be 'in fuse'
	 */
	public void setCreeperState(int par1)
	{
		dataWatcher.updateObject(16, Byte.valueOf((byte)par1));
	}

	/**
	 * Called when a lightning bolt hits the entity.
	 */
	@Override
	public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt)
	{
		super.onStruckByLightning(par1EntityLightningBolt);
		dataWatcher.updateObject(17, Byte.valueOf((byte)1));
	}
	//001*******************************Jump kougeki***************************************

	//*******************************SpawnMax***************************************
	@Override
	public int getMaxSpawnedInChunk()    {        return 1;    }
}