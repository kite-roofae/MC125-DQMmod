package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityZoma extends EntityMob
{
	/** Random offset used in floating behaviour */
	//private float heightOffset;

	/** ticks until heightOffset is randomized */
	//private int heightOffsetUpdateTime;
	private int field_40152_d;
	//protected int attackStrength = 25;

	public DqmEntityZoma(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Zoma.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 2.5F);
		//*******************************Speed***************************************
		moveSpeed = 0.6F;
		//*******************************ATK***************************************
		attackStrength = 25;
		//*******************************EXP***************************************
		experienceValue = 4000;
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
	public int getMaxHealth()    {        return 400;    }
	//*******************************Armor***************************************
	@Override
	public int getTotalArmorValue()    {        return 2;    }
	//*******************************Fall taisei***************************************
	@Override
	protected void fall(float par1) {}
	//*******************************Sound***************************************

	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		this.dropItem(mod_Dqm.Akaitama.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 2);
		this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 2);
		this.dropItem(mod_Dqm.Kenjanoisi.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Seireiseki.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Taiyounoisi.shiftedIndex, 1);
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
	case 1:dropItem(mod_Dqm.Rotonoyoroi.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Rotonokote.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Metarukingnoturugi.shiftedIndex, 1);                break;
	case 4:dropItem(mod_Dqm.Sefiramunoyumi.shiftedIndex, 1);                break;
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



/*
	@Override
	protected String getLivingSound()
	{
		return "mob.blaze.breathe";
	}
	@Override
	protected String getHurtSound()
	{
		return "mob.blaze.hit";
	}
	@Override
	protected String getDeathSound()
	{
		return "mob.blaze.death";
	}
*/

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

			//écÇËHP320-201ÇÃéû
			if(health<=380 && health>=201){
			if (attackTime == 0)
			{
				field_40152_d++;

				if (field_40152_d == 1)
				{
					//3î≠ÇìfÇ≠Ç‹Ç≈ÇÃéûä‘Åi10Ç≈1ïbÇ≠ÇÁÇ¢Åj
					attackTime = 20;
					func_40150_a(true);
				}
				else if (field_40152_d <= 4)
				{
					//3î≠ìfÇ≠ä‘äu
					attackTime = 20;
				}
				else
				{
					//3î≠ë≈ÇøèIÇÌÇ¡ÇΩÇ†Ç∆éüÇÃ3î≠Çë≈ÇøèoÇ∑Ç‹Ç≈ÇÃéûä‘
					attackTime = 20;
					field_40152_d = 0;
					func_40150_a(false);
				}
				/*//ÉWÉÉÉìÉv
				if (this.onGround)                {
					double var4 = par1Entity.posX - this.posX;
					double var6 = par1Entity.posZ - this.posZ;
					float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
					this.motionX = var4 / var8 * 0.9D * 0.800000011920929D + this.motionX * 0.50000000298023224D;
					this.motionZ = var6 / var8 * 0.9D * 0.800000011920929D + this.motionZ * 0.50000000298023224D;
					this.motionY = 0.4000000059604645D;   }*/

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
				}}}
			//écÇËHP200-101ÇÃéû
			if(health<=200  && health>=101){
			if (attackTime == 0)
			{
				field_40152_d++;

				if (field_40152_d == 1)
				{
					//3î≠ÇìfÇ≠Ç‹Ç≈ÇÃéûä‘Åi10Ç≈1ïbÇ≠ÇÁÇ¢Åj
					attackTime = 10;
					func_40150_a(true);
				}
				else if (field_40152_d <= 4)
				{
					//3î≠ìfÇ≠ä‘äu
					attackTime = 5;
				}
				else
				{
					//3î≠ë≈ÇøèIÇÌÇ¡ÇΩÇ†Ç∆éüÇÃ3î≠Çë≈ÇøèoÇ∑Ç‹Ç≈ÇÃéûä‘
					attackTime = 10;
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
				}}}
			//écÇËHP100à»â∫ÇÃéû
			if(health<=100){
			if (attackTime == 0)
			{
				field_40152_d++;

				if (field_40152_d == 1)
				{
					//3î≠ÇìfÇ≠Ç‹Ç≈ÇÃéûä‘Åi10Ç≈1ïbÇ≠ÇÁÇ¢Åj
					attackTime = 5;
					func_40150_a(true);
				}
				else if (field_40152_d <= 4)
				{
					//3î≠ìfÇ≠ä‘äu
					attackTime = 1;
				}
				else
				{
					//3î≠ë≈ÇøèIÇÌÇ¡ÇΩÇ†Ç∆éüÇÃ3î≠Çë≈ÇøèoÇ∑Ç‹Ç≈ÇÃéûä‘
					attackTime = 7;
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
				}}}

			rotationYaw = (float)((Math.atan2(d2, d) * 180D) / Math.PI) - 90F;
			//hasAttacked = true;
		}
	}

	//if(health==200)



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

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	/*protected int getDropItemId()
    {
        return Item.blazeRod.shiftedIndex;
    }*/


	/**
	 * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
	 */
/*
	@Override
	public boolean isBurning()
	{
		return func_40151_ac();
	}
*/
	/**
	 * Drop 0-2 items of this living's type
	 */

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

	/**
	 * Checks to make sure the light is not too bright where the mob is spawning
	 */
	/*protected boolean isValidLightLevel()
    {
        return true;
    }*/
}


