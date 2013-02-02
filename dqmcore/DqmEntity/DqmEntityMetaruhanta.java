package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityMetaruhanta extends EntityMob
{
	/** The ItemStack that any Riripat holds (a bow). */
	private static final ItemStack defaultHeldItem;

	public DqmEntityMetaruhanta(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Metaruhanta.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.3F, 1.8F);
		//*******************************Speed***************************************
		moveSpeed = 0.30F;
		//*******************************ATK***************************************
		attackStrength = 8;
		//*******************************EXP***************************************
		experienceValue = 48;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;
		//*******************************Koudo***************************************
		//heightOffset = 0.5F;



		tasks.addTask(1, new EntityAISwimming(this));
		//tasks.addTask(2, new EntityAIRestrictSun(this));
		tasks.addTask(3, new EntityAIFleeSun(this, moveSpeed));
		tasks.addTask(4, new EntityAIArrowAttack(this, moveSpeed, 1, 30));
		tasks.addTask(5, new EntityAIWander(this, moveSpeed));
		tasks.addTask(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 55;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	//protected void fall(float par1) {}
	//*******************************Sound***************************************
	//protected String getLivingSound()    {        return "none";    }
	@Override
	protected String getHurtSound()    {        return "mob.irongolem.hit";    }
	@Override
	protected String getDeathSound()    {        return "mob.irongolem.death";    }
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		this.dropItem(mod_Dqm.Metaru.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Kagaminoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Koorinokessyou.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
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
	case 2:dropItem(mod_Dqm.Yuuwakunoyumi.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}
	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	public boolean isAIEnabled()
	{
		return true;
	}


	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}
	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	/*protected String getLivingSound()
    {
        return "mob.skeleton";
    }*/

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	/*protected String getHurtSound()
    {
        return "mob.skeletonhurt";
    }*/

	/**
	 * Returns the sound this mob makes on death.
	 */
	/*protected String getDeathSound()
    {
        return "mob.skeletonhurt";
    }*/

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItem()
	{
		return defaultHeldItem;
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	/*public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }*/

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	/*
    public void onLivingUpdate()
    {
        if (worldObj.isDaytime() && !worldObj.isRemote)
        {
            float f = getBrightness(1.0F);

            if (f > 0.5F && worldObj.canBlockSeeTheSky(MathHelper.floor_double(posX), MathHelper.floor_double(posY), MathHelper.floor_double(posZ)) && rand.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                setFire(8);
            }
        }

        super.onLivingUpdate();
    }*/

	/**
	 * Called when the mob's health reaches 0.
	 */

	@Override
	public void onDeath(DamageSource par1DamageSource)
	{
		super.onDeath(par1DamageSource);

		if ((par1DamageSource.getSourceOfDamage() instanceof EntityArrow) && (par1DamageSource.getEntity() instanceof EntityPlayer))
		{
			EntityPlayer entityplayer = (EntityPlayer)par1DamageSource.getEntity();
			double d = entityplayer.posX - posX;
			double d1 = entityplayer.posZ - posZ;

			if (d * d + d1 * d1 >= 2500D)
			{
				entityplayer.triggerAchievement(AchievementList.snipeSkeleton);
			}
		}
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	@Override
	protected int getDropItemId()
	{
		return mod_Dqm.Hosinokakera.shiftedIndex;
	}





	/**
	 * Drop 0-2 items of this living's type
	 */

	/*
    protected void dropRareDrop(int par1)
    {
        if (par1 > 0)
        {
            ItemStack itemstack = new ItemStack(Item.bow);
            EnchantmentHelper.func_48441_a(rand, itemstack, 5);
            entityDropItem(itemstack, 0.0F);
        }
        else
        {
            dropItem(Item.bow.shiftedIndex, 1);
        }
    }*/

	static
	{
		defaultHeldItem = new ItemStack(Item.bow, 1);
	}

}
