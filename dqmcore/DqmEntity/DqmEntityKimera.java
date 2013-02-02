package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityKimera extends EntityMob
{
	/** Random offset used in floating behaviour */
	private float heightOffset;

	/** ticks until heightOffset is randomized */
	private int heightOffsetUpdateTime;
	private int field_40152_d;

	public DqmEntityKimera(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Kimera.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 2.0F);
		//*******************************Speed***************************************
		moveSpeed = 0.4F;
		//*******************************ATK***************************************
		attackStrength = 5;
		//*******************************EXP***************************************
		experienceValue = 23;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;



		tasks.addTask(1, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityPlayer.class, moveSpeed, false));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
		//super(par1World);
		heightOffset = 0.5F;



	}

	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 26;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 20;    }
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
		this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Rengokunohane.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Tikaranotane.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		this.dropItem(mod_Dqm.Kimeranotubasa.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Kazekirinohane.shiftedIndex, 1);
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
	case 2:dropItem(mod_Dqm.Kimeranotubasa.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
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
	public void onLivingUpdate()
	{
		if (!worldObj.isRemote)
		{
			if (isWet())
			{
				attackEntityFrom(DamageSource.drown, 1);
			}

			heightOffsetUpdateTime--;

			if (heightOffsetUpdateTime <= 0)
			{
				heightOffsetUpdateTime = 1;
				heightOffset = 0.5F + (float)rand.nextGaussian() * 3F;
			}

			if (getEntityToAttack() != null && getEntityToAttack().posY + getEntityToAttack().getEyeHeight() > posY + getEyeHeight() + heightOffset)
			{
				motionY = motionY + (0.30000001192092896D - motionY) * 0.30000001192092896D;
			}
		}

		if (rand.nextInt(24) == 0)
		{
			worldObj.playSoundEffect(posX + 0.5D, posY + 0.5D, posZ + 0.5D, "fire.fire", 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F);
		}

		if (!onGround && motionY < 0.0D)
		{
			motionY *= 0.09999999999999998D;
		}
/*
		for (int i = 0; i < 2; i++)
		{
			worldObj.spawnParticle("largesmoke", posX + (rand.nextDouble() - 0.5D) * width, posY + rand.nextDouble() * height, posZ + (rand.nextDouble() - 0.5D) * width, 0.0D, 0.0D, 0.0D);

		}*/

		super.onLivingUpdate();
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
					attackTime = 150;
					func_40150_a(true);
				}
				else if (field_40152_d <= 4)
				{
					attackTime = 150;
				}
				else
				{
					attackTime = 150;
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
					}
				}
			}

			rotationYaw = (float)((Math.atan2(d2, d) * 180D) / Math.PI) - 90F;
			hasAttacked = true;
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


