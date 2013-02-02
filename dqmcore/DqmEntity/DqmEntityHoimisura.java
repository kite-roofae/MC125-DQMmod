package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityHoimisura extends EntityWaterMob
{
	public float field_21089_a;
	public float field_21088_b;
	public float field_21087_c;
	public float field_21086_f;
	public float field_21085_g;
	public float field_21084_h;

	/** angle of the tentacles in radians */
	public float tentacleAngle;

	/** the last calculated angle of the tentacles in radians */
	public float lastTentacleAngle;
	private float randomMotionSpeed;
	private float field_21080_l;
	private float field_21079_m;
	private float randomMotionVecX;
	private float randomMotionVecY;
	private float randomMotionVecZ;

	public DqmEntityHoimisura(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Hoimisura.png";
		//*******************************Size(yoko*tate)***************************************
		//setSize(0.5F, 0.5F);
		//*******************************Speed***************************************
		//moveSpeed = 0.45F;
		//*******************************ATK***************************************
		//attackStrength = 2;
		//*******************************EXP***************************************
		experienceValue = 6;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;

		field_21089_a = 0.0F;
		field_21088_b = 0.0F;
		field_21087_c = 0.0F;
		field_21086_f = 0.0F;
		field_21085_g = 0.0F;
		field_21084_h = 0.0F;
		tentacleAngle = 0.0F;
		lastTentacleAngle = 0.0F;
		randomMotionSpeed = 0.0F;
		field_21080_l = 0.0F;
		field_21079_m = 0.0F;
		randomMotionVecX = 0.0F;
		randomMotionVecY = 0.0F;
		randomMotionVecZ = 0.0F;
		setSize(0.95F, 0.95F);
		field_21080_l = (1.0F / (rand.nextFloat() + 1.0F)) * 0.2F;

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 13;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	//protected void fall(float par1) {}
	//*******************************Sound***************************************
	@Override
	protected String getDeathSound()
	{
		this.worldObj.playSoundAtEntity(this, "DQM_Sound.Death", 1.0F, 1.0F);
		return "";
	}
	@Override
	protected String getLivingSound()
	{
		return "mob.slime";
	}
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		this.dropItem(mod_Dqm.Yakusou.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Tikaranotane.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Bannouyaku.shiftedIndex, 1);
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
	case 2:dropItem(mod_Dqm.Sabitakabuto.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Sekaijunoha.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}
	@Override
	public int getMaxSpawnedInChunk()
	{
		return 2;
	}


	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
	}


	@Override
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	@Override
	protected int getDropItemId()
	{
		return 0;
	}

	/**
	 * Drop 0-2 items of this living's type
	 */


	/**
	 * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	 */
	@Override
	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		return super.interact(par1EntityPlayer);
	}

	/**
	 * Checks if this entity is inside water (if inWater field is true as a result of handleWaterMovement() returning
	 * true)
	 */
	@Override
	public boolean isInWater()
	{
		return worldObj.handleMaterialAcceleration(boundingBox.expand(0.0D, -0.60000002384185791D, 0.0D), Material.water, this);
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
		field_21088_b = field_21089_a;
		field_21086_f = field_21087_c;
		field_21084_h = field_21085_g;
		lastTentacleAngle = tentacleAngle;
		field_21085_g += field_21080_l;

		if (field_21085_g > ((float)Math.PI * 2F))
		{
			field_21085_g -= ((float)Math.PI * 2F);

			if (rand.nextInt(10) == 0)
			{
				field_21080_l = (1.0F / (rand.nextFloat() + 1.0F)) * 0.2F;
			}
		}

		if (isInWater())
		{
			if (field_21085_g < (float)Math.PI)
			{
				float f = field_21085_g / (float)Math.PI;
				tentacleAngle = MathHelper.sin(f * f * (float)Math.PI) * (float)Math.PI * 0.25F;

				if (f > 0.75D)
				{
					randomMotionSpeed = 1.0F;
					field_21079_m = 1.0F;
				}
				else
				{
					field_21079_m = field_21079_m * 0.8F;
				}
			}
			else
			{
				tentacleAngle = 0.0F;
				randomMotionSpeed = randomMotionSpeed * 0.9F;
				field_21079_m = field_21079_m * 0.99F;
			}

			if (!worldObj.isRemote)
			{
				motionX = randomMotionVecX * randomMotionSpeed;
				motionY = randomMotionVecY * randomMotionSpeed;
				motionZ = randomMotionVecZ * randomMotionSpeed;
			}

			float f1 = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
			renderYawOffset += ((-(float)Math.atan2(motionX, motionZ) * 180F) / (float)Math.PI - renderYawOffset) * 0.1F;
			rotationYaw = renderYawOffset;
			field_21087_c = field_21087_c + (float)Math.PI * field_21079_m * 1.5F;
			field_21089_a += ((-(float)Math.atan2(f1, motionY) * 180F) / (float)Math.PI - field_21089_a) * 0.1F;
		}
		else
		{
			tentacleAngle = MathHelper.abs(MathHelper.sin(field_21085_g)) * (float)Math.PI * 0.25F;

			if (!worldObj.isRemote)
			{
				motionX = 0.0D;
				motionY -= 0.080000000000000002D;
				motionY *= 0.98000001907348633D;
				motionZ = 0.0D;
			}

			field_21089_a += (-90F - field_21089_a) * 0.02D;
		}
	}

	/**
	 * Moves the entity based on the specified heading.  Args: strafe, forward
	 */
	@Override
	public void moveEntityWithHeading(float par1, float par2)
	{
		moveEntity(motionX, motionY, motionZ);
	}

	@Override
	protected void updateEntityActionState()
	{
		entityAge++;

		if (entityAge > 100)
		{
			randomMotionVecX = randomMotionVecY = randomMotionVecZ = 0.0F;
		}
		else if (rand.nextInt(50) == 0 || !inWater || randomMotionVecX == 0.0F && randomMotionVecY == 0.0F && randomMotionVecZ == 0.0F)
		{
			float f = rand.nextFloat() * (float)Math.PI * 2.0F;
			randomMotionVecX = MathHelper.cos(f) * 0.2F;
			randomMotionVecY = -0.1F + rand.nextFloat() * 0.2F;
			randomMotionVecZ = MathHelper.sin(f) * 0.2F;
		}

		despawnEntity();
	}

	/**
	 * Checks if the entity's current position is a valid location to spawn this entity.
	 */
	/*
    public boolean getCanSpawnHere()
    {
        return posY > 45D && posY < 63D && super.getCanSpawnHere();
    }*/
}




















/*package net.minecraft.src;

import java.util.Random;

public class EntityHoimisura extends EntityWaterMob
{
    //EntityAnimal,EntityZombie,EntityMob,EntityWaterMob

    public EntityHoimisura(World par1World)
    {
        super(par1World);
        texture = "/mob/Hoimisura.png";
        setSize(0.5F, 0.5F);
        moveSpeed = 0.25F;
        //attackStrength = 3;
        tasks.addTask(1, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityPlayer.class, moveSpeed, false));
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));

    }

     return "mob.slime";
    }

    protected String getDeathSound()
    {
        return "mob.slime";
    }



    protected void dropFewItems(boolean par1, int par2)
    {
        int i = rand.nextInt(3) + rand.nextInt(1 + par2);

        for (int j = 0; j < i; j++)
        {
            dropItem(Item.slimeBall.shiftedIndex, 1);
        }

        if (isBurning())
        {
            dropItem(Item.melon.shiftedIndex, 1);
        }
        else
        {
            dropItem(Item.melon.shiftedIndex, 1);
        }
    }



}*/