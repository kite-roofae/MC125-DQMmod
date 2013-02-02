package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityAyasiikage extends EntityEnderman
{
	private static boolean[] canCarryBlocks = new boolean[Block.blocksList.length];

	/** Is the enderman attacking another entity? */
	public boolean isAttacking;

	/**
	 * Counter to delay the teleportation of an enderman towards the currently attacked target
	 */
	private int teleportDelay;
	public DqmEntityAyasiikage(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Ayasiikage.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(0.7F, 2.0F);
		//*******************************Speed***************************************
		moveSpeed = 0.25F;
		//*******************************ATK***************************************
		attackStrength = 5;
		//*******************************EXP***************************************
		experienceValue = 10;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;
		isAttacking = false;
		teleportDelay = 0;
		stepHeight = 1.0F;

	}

	/*
    public DqmEntityAyasiikage(World par1World,int a,float m,int e,float s,float z,boolean f)
    {
        super(par1World);

        attackStrength = a;
        moveSpeed = m;
        experienceValue = e;
        setSize(s, z);}

    DqmEntityAyasiikage = new DqmEntityAyasiikage(5,0.25,10,0.7,2.0,"/dqm/Ayasiikage.png");
	 */

	//*******************************HP***************************************
	@Override
	public int getMaxHealth()
	{
		return 17;
	}
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
	protected void dropFewItems(boolean par1, int par2)
	{
		int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
		for (int var4 = 0; var4 < var3; ++var4)        {
			//Randam 0-1
			//this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
			this.dropItem(mod_Dqm.Seijanohai.shiftedIndex, 1);
		}
		if (this.isBurning())    {//Fire
			//this.dropItem(mod_Dqm.Metaru.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		}
		else        {             //100%
			this.dropItem(mod_Dqm.Bannouyaku.shiftedIndex, 1);
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
	protected void dropRareDrop(int par1)
	{        switch (rand.nextInt(4))        {
	case 1:dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakabuto.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}
	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}


	/**
	 * Checks to see if this enderman should be attacking this player
	 */
	private boolean shouldAttackPlayer(EntityPlayer par1EntityPlayer)
	{
		ItemStack itemstack = par1EntityPlayer.inventory.armorInventory[3];

		if (itemstack != null && itemstack.itemID == Block.pumpkin.blockID)
		{
			return false;
		}

		Vec3D vec3d = par1EntityPlayer.getLook(1.0F).normalize();
		Vec3D vec3d1 = Vec3D.createVector(posX - par1EntityPlayer.posX, (boundingBox.minY + (height / 2.0F)) - (par1EntityPlayer.posY + par1EntityPlayer.getEyeHeight()), posZ - par1EntityPlayer.posZ);
		double d = vec3d1.lengthVector();
		vec3d1 = vec3d1.normalize();
		double d1 = vec3d.dotProduct(vec3d1);

		if (d1 > 1.0D - 0.025000000000000001D / d)
		{
			return par1EntityPlayer.canEntityBeSeen(this);
		}
		else
		{
			return false;
		}
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate()
	{
		if (isWet())
		{
			attackEntityFrom(DamageSource.drown, 1);
		}

		isAttacking = entityToAttack != null;
		moveSpeed = entityToAttack == null ? 0.3F : 6.5F;

		if (!worldObj.isRemote)
		{
			if (getCarried() == 0)
			{
				if (rand.nextInt(20) == 0)
				{
					int i = MathHelper.floor_double((posX - 2D) + rand.nextDouble() * 4D);
					int l = MathHelper.floor_double(posY + rand.nextDouble() * 3D);
					int j1 = MathHelper.floor_double((posZ - 2D) + rand.nextDouble() * 4D);
					int l1 = worldObj.getBlockId(i, l, j1);

					if (canCarryBlocks[l1])
					{
						setCarried(worldObj.getBlockId(i, l, j1));
						setCarryingData(worldObj.getBlockMetadata(i, l, j1));
						worldObj.setBlockWithNotify(i, l, j1, 0);
					}
				}
			}
			else if (rand.nextInt(2000) == 0)
			{
				int j = MathHelper.floor_double((posX - 1.0D) + rand.nextDouble() * 2D);
				int i1 = MathHelper.floor_double(posY + rand.nextDouble() * 2D);
				int k1 = MathHelper.floor_double((posZ - 1.0D) + rand.nextDouble() * 2D);
				int i2 = worldObj.getBlockId(j, i1, k1);
				int j2 = worldObj.getBlockId(j, i1 - 1, k1);

				if (i2 == 0 && j2 > 0 && Block.blocksList[j2].renderAsNormalBlock())
				{
					worldObj.setBlockAndMetadataWithNotify(j, i1, k1, getCarried(), getCarryingData());
					setCarried(0);
				}
			}
		}

		for (int k = 0; k < 2; k++)
		{
			worldObj.spawnParticle("portal", posX + (rand.nextDouble() - 0.5D) * width, (posY + rand.nextDouble() * height) - 0.25D, posZ + (rand.nextDouble() - 0.5D) * width, (rand.nextDouble() - 0.5D) * 2D, -rand.nextDouble(), (rand.nextDouble() - 0.5D) * 2D);
		}

		if (worldObj.isDaytime() && !worldObj.isRemote)
		{
			float f = getBrightness(1.0F);

			if (f > 0.5F && worldObj.canBlockSeeTheSky(MathHelper.floor_double(posX), MathHelper.floor_double(posY), MathHelper.floor_double(posZ)) && rand.nextFloat() * 30F < (f - 0.4F) * 2.0F)
			{
				entityToAttack = null;
				teleportRandomly();
			}
		}

		if (isWet())
		{
			entityToAttack = null;
			teleportRandomly();
		}

		isJumping = false;

		if (entityToAttack != null)
		{
			faceEntity(entityToAttack, 100F, 100F);
		}

		if (!worldObj.isRemote && isEntityAlive())
		{
			if (entityToAttack != null)
			{
				if ((entityToAttack instanceof EntityPlayer) && shouldAttackPlayer((EntityPlayer)entityToAttack))
				{
					moveStrafing = moveForward = 0.0F;
					moveSpeed = 0.0F;

					if (entityToAttack.getDistanceSqToEntity(this) < 16D)
					{
						teleportRandomly();
					}

					teleportDelay = 0;
				}
				else if (entityToAttack.getDistanceSqToEntity(this) > 256D && teleportDelay++ >= 30 && teleportToEntity(entityToAttack))
				{
					teleportDelay = 0;
				}
			}
			else
			{
				teleportDelay = 0;
			}
		}

		super.onLivingUpdate();
	}


	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound()
	{
		return "mob.slime.idle";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return "mob.slime.hit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return "mob.slime.death";
	}

	static
	{
		/*canCarryBlocks[Block.grass.blockID] = true;
        canCarryBlocks[Block.dirt.blockID] = true;
        canCarryBlocks[Block.sand.blockID] = true;
        canCarryBlocks[Block.gravel.blockID] = true;
        canCarryBlocks[Block.plantYellow.blockID] = true;
        canCarryBlocks[Block.plantRed.blockID] = true;
        canCarryBlocks[Block.mushroomBrown.blockID] = true;
        canCarryBlocks[Block.mushroomRed.blockID] = true;
        canCarryBlocks[Block.tnt.blockID] = true;
        canCarryBlocks[Block.cactus.blockID] = true;
        canCarryBlocks[Block.blockClay.blockID] = true;
        canCarryBlocks[Block.pumpkin.blockID] = true;*/
		canCarryBlocks[Block.melon.blockID] = true;
		//canCarryBlocks[Block.mycelium.blockID] = true;
	}
}
