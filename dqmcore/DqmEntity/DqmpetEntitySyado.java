package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmpetEntitySyado extends DqmEntityTameable
{
	//*******************************ATK***************************************
	protected int attackStrength = 6;
	/**
	 * This flag is set when the wolf is looking at a player with interest, i.e. with tilted head. This happens when
	 * tamed wolf is wound and player holds porkchop (raw or cooked), or when wild wolf sees bone in player's hands.
	 */
	private boolean looksWithInterest = false;
	private float field_25048_b;
	private float field_25054_c;

	/** true is the wolf is wet else false */
	private boolean isShaking;
	private boolean field_25052_g;

	/**
	 * This time increases while wolf is shaking and emitting water particles.
	 */
	private float timeWolfIsShaking;
	private float prevTimeWolfIsShaking;

	public DqmpetEntitySyado(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Syado.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 1.8F);
		//*******************************Speed***************************************
		moveSpeed = 0.35F;
		//*******************************ATK***************************************
		attackStrength = 6;
		//*******************************EXP***************************************
		experienceValue = 21;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;
		//*******************************Koudo***************************************
		//heightOffset = 0.5F;
		//*******************************ETC***************************************
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
		this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
		this.tasks.addTask(5, new EntityAIFollowOwner(this, this.moveSpeed, 10.0F, 2.0F));
		this.tasks.addTask(6, new EntityAIMate(this, this.moveSpeed));
		this.tasks.addTask(7, new EntityAIWander(this, this.moveSpeed));
		//this.tasks.addTask(8, new EntityAIBeg(this, 8.0F));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
		this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		//this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntitySheep.class, 16.0F, 200, false));
	}

	//*******************************Texture(zzz,pet,Ang)***************************************
	@Override
	public String getTexture()
	{
		return this.isSitting() ? "/dqm/SyadoPetzzz.png" : isTamed() ? "/dqm/SyadoPet.png":(this.isAngry() ? "/dqm/Syado.png" : super.getTexture());
	}
	//*******************************HP(PetTameHP,MobHP***************************************
	@Override
	public int getMaxHealth()    {        return this.isTamed() ? 27 : 27;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	//protected void fall(float par1) {}
	//*******************************Sound***************************************
	//protected String getLivingSound()    {        return "none";    }
	//protected String getHurtSound()    {        return "mob.irongolem.hit";    }
	//protected String getDeathSound()    {        return "mob.irongolem.death";    }

	//protected String getHurtSound()    {        return "mob.slime";    }
	//protected String getDeathSound()    {        return "mob.slime";    }
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		//this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Yorunotobari.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		this.dropItem(mod_Dqm.Uruwasikinoko.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		//this.dropItem(mod_Dqm.Seijanohai.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Seijanohai.shiftedIndex, 1);
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
	case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}

	//*******************************PetItem/SENTOU_HP***************************************

	@Override
	public boolean interact(EntityPlayer par1EntityPlayer)    {        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();        if (!this.isTamed())        {
		if (var2 != null && var2.itemID == mod_Dqm.Koumorinohane.shiftedIndex && !this.isAngry())            {
			if (!par1EntityPlayer.capabilities.isCreativeMode)                {                    --var2.stackSize;                }
			if (var2.stackSize <= 0)               {                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);                }
			if (!this.worldObj.isRemote)                {                    if (this.rand.nextInt(3) == 0)                    {
				this.setTamed(true);
				this.setPathToEntity((PathEntity)null);
				this.setAttackTarget((EntityLiving)null);
				this.aiSit.setIsSitting(true);
				//ペット時サウンド************************************************************************
				this.worldObj.playSoundAtEntity(this, "DQM_Sound.Pet", 1.0F, 1.0F);
				//*******************************SENTOU_HP************************************************
				this.setEntityHealth(32);
				this.setOwner(par1EntityPlayer.username);
				this.playTameEffect(true);
				this.worldObj.setEntityState(this, (byte)7);                    }
			else
			{
				this.playTameEffect(false);
				this.worldObj.setEntityState(this, (byte)6);
			}
			}

			return true;
		}
	}
	else
	{
		if (var2 != null && Item.itemsList[var2.itemID] instanceof ItemFood)
		{
			ItemFood var3 = (ItemFood)Item.itemsList[var2.itemID];

			if (var3.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 20)
			{
				if (!par1EntityPlayer.capabilities.isCreativeMode)
				{
					--var2.stackSize;
				}

				this.heal(var3.getHealAmount());

				if (var2.stackSize <= 0)
				{
					par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
				}

				return true;
			}
		}

		if (par1EntityPlayer.username.equalsIgnoreCase(this.getOwnerName()) && !this.worldObj.isRemote && !this.isWheat(var2))
		{
			this.aiSit.setIsSitting(!this.isSitting());
			this.isJumping = false;
			this.setPathToEntity((PathEntity)null);
		}
	}

	return super.interact(par1EntityPlayer);
	}














	@Override
	public boolean isAIEnabled()
	{
		return true;
	}
	/**
	 * Sets the active target the Task system uses for tracking
	 */
	@Override
	public void setAttackTarget(EntityLiving par1EntityLiving)
	{
		super.setAttackTarget(par1EntityLiving);

		if (par1EntityLiving instanceof EntityPlayer)
		{
			this.setAngry(true);
		}
	}
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
		if (super.attackEntityFrom(par1DamageSource, par2))
		{
			Entity var3 = par1DamageSource.getEntity();

			if (this.riddenByEntity != var3 && this.ridingEntity != var3)
			{
				if (var3 != this)
				{
					this.entityToAttack = var3;
				}

				return true;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity par1Entity)
	{
		int var2 = this.attackStrength;

		if (this.isPotionActive(Potion.damageBoost))
		{
			var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
		}

		if (this.isPotionActive(Potion.weakness))
		{
			var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
		}

		return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);
	}
	/**
	 * main AI tick function, replaces updateEntityActionState
	 */
	@Override
	protected void updateAITick()
	{
		this.dataWatcher.updateObject(18, Integer.valueOf(this.getHealth()));
	}
	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(18, new Integer(this.getHealth()));
	}
	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	@Override
	protected boolean canTriggerWalking()
	{
		return false;
	}
	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setBoolean("Angry", this.isAngry());
	}
	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		this.setAngry(par1NBTTagCompound.getBoolean("Angry"));
	}
	/**
	 * Determines if an entity can be despawned, used on idle far away entities
	 */
    protected boolean canDespawn()
    {
        return this.isAngry();
    }

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	/*
    protected String getLivingSound()
    {
        return this.isAngry() ? "mob.slime" : (this.rand.nextInt(3) == 0 ? (this.isTamed() && this.dataWatcher.getWatchableObjectInt(18) < 10 ? "mob.slime" : "mob.slime") : "mob.slime");
    }*/

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	@Override
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	/*
    protected int getDropItemId()
    {
        return -1;
    }*/

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (!this.worldObj.isRemote && this.isShaking && !this.field_25052_g && !this.hasPath() && this.onGround)
		{
			this.field_25052_g = true;
			this.timeWolfIsShaking = 0.0F;
			this.prevTimeWolfIsShaking = 0.0F;
			this.worldObj.setEntityState(this, (byte)8);
		}
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		this.field_25054_c = this.field_25048_b;

		if (this.looksWithInterest)
		{
			this.field_25048_b += (1.0F - this.field_25048_b) * 0.4F;
		}
		else
		{
			this.field_25048_b += (0.0F - this.field_25048_b) * 0.4F;
		}

		if (this.looksWithInterest)
		{
			this.numTicksToChaseTarget = 10;
		}

		if (this.isWet())
		{
			this.isShaking = true;
			this.field_25052_g = false;
			this.timeWolfIsShaking = 0.0F;
			this.prevTimeWolfIsShaking = 0.0F;
		}
		else if ((this.isShaking || this.field_25052_g) && this.field_25052_g)
		{
			if (this.timeWolfIsShaking == 0.0F)
			{
				this.worldObj.playSoundAtEntity(this, "mob.slime", this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}

			this.prevTimeWolfIsShaking = this.timeWolfIsShaking;
			this.timeWolfIsShaking += 0.05F;

			if (this.prevTimeWolfIsShaking >= 2.0F)
			{
				this.isShaking = false;
				this.field_25052_g = false;
				this.prevTimeWolfIsShaking = 0.0F;
				this.timeWolfIsShaking = 0.0F;
			}

			if (this.timeWolfIsShaking > 0.4F)
			{
				float var1 = (float)this.boundingBox.minY;
				int var2 = (int)(MathHelper.sin((this.timeWolfIsShaking - 0.4F) * (float)Math.PI) * 7.0F);

				for (int var3 = 0; var3 < var2; ++var3)
				{
					float var4 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
					float var5 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
					this.worldObj.spawnParticle("splash", this.posX + var4, (var1 + 0.8F), this.posZ + var5, this.motionX, this.motionY, this.motionZ);
				}
			}
		}
	}

	@Override
	public boolean getWolfShaking()
	{
		return this.isShaking;
	}

	/**
	 * Used when calculating the amount of shading to apply while the wolf is shaking.
	 */
	@Override
	public float getShadingWhileShaking(float par1)
	{
		return 0.75F + (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * par1) / 2.0F * 0.25F;
	}

	@Override
	public float getShakeAngle(float par1, float par2)
	{
		float var3 = (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * par1 + par2) / 1.8F;

		if (var3 < 0.0F)
		{
			var3 = 0.0F;
		}
		else if (var3 > 1.0F)
		{
			var3 = 1.0F;
		}

		return MathHelper.sin(var3 * (float)Math.PI) * MathHelper.sin(var3 * (float)Math.PI * 11.0F) * 0.15F * (float)Math.PI;
	}

	@Override
	public float getInterestedAngle(float par1)
	{
		return (this.field_25054_c + (this.field_25048_b - this.field_25054_c) * par1) * 0.15F * (float)Math.PI;
	}

	@Override
	public float getEyeHeight()
	{
		return this.height * 0.8F;
	}

	/**
	 * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
	 * use in wolves.
	 */
	@Override
	public int getVerticalFaceSpeed()
	{
		return this.isSitting() ? 20 : super.getVerticalFaceSpeed();
	}

	/**
	 * Called when the entity is attacked.
	 *//*
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
        Entity var3 = par1DamageSource.getEntity();
        this.aiSit.setIsSitting(false);

        if (var3 != null && !(var3 instanceof EntityPlayer) && !(var3 instanceof EntityArrow))
        {
            par2 = (par2 + 1) / 2;
        }

        return super.attackEntityFrom(par1DamageSource, par2);
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int var2 = this.isTamed() ? 4 : 2;
        return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);
    }*/



	@Override
	public void handleHealthUpdate(byte par1)
	{
		if (par1 == 8)
		{
			this.field_25052_g = true;
			this.timeWolfIsShaking = 0.0F;
			this.prevTimeWolfIsShaking = 0.0F;
		}
		else
		{
			super.handleHealthUpdate(par1);
		}
	}

	@Override
	public float getTailRotation()
	{
		return this.isAngry() ? 1.5393804F : (this.isTamed() ? (0.55F - (20 - this.dataWatcher.getWatchableObjectInt(18)) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F));
	}

	/**
	 * Checks if the parameter is an wheat item.
	 */
	@Override
	public boolean isWheat(ItemStack par1ItemStack)
	{
		return par1ItemStack == null ? false : (!(Item.itemsList[par1ItemStack.itemID] instanceof ItemFood) ? false : ((ItemFood)Item.itemsList[par1ItemStack.itemID]).isWolfsFavoriteMeat());
	}

	/**
	 * Will return how many at most can spawn in a chunk at once.
	 */
	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}

	/**
	 * Determines whether this wolf is angry or not.
	 */
	@Override
	public boolean isAngry()
	{
		return (this.dataWatcher.getWatchableObjectByte(16) & 2) != 0;
	}

	/**
	 * Sets whether this wolf is angry or not.
	 */
	@Override
	public void setAngry(boolean par1)
	{
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 2)));
		}
		else
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -3)));
		}
	}

	/**
	 * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
	 */
	@Override
	public EntityAnimal spawnBabyAnimal(EntityAnimal par1EntityAnimal)
	{
		DqmpetEntitySyado var2 = new DqmpetEntitySyado(this.worldObj);
		var2.setOwner(this.getOwnerName());
		var2.setTamed(true);
		return var2;
	}

	@Override
	public void func_48150_h(boolean par1)
	{
		this.looksWithInterest = par1;
	}

	/**
	 * Returns true if the mob is currently able to mate with the specified mob.
	 */
	@Override
	public boolean canMateWith(EntityAnimal par1EntityAnimal)
	{
		if (par1EntityAnimal == this)
		{
			return false;
		}
		else if (!this.isTamed())
		{
			return false;
		}
		else if (!(par1EntityAnimal instanceof DqmpetEntitySyado))
		{
			return false;
		}
		else
		{
			DqmpetEntitySyado var2 = (DqmpetEntitySyado)par1EntityAnimal;
			return !var2.isTamed() ? false : (var2.isSitting() ? false : this.isInLove() && var2.isInLove());
		}
	}
}
