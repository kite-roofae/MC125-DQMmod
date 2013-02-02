package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityHagumeta extends DqmEntityMob
{

	private int field_40152_d;
	public DqmEntityHagumeta(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Hagumeta.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 0.3F);
		//*******************************Speed***************************************
		//moveSpeed = 0.25F;
		//*******************************ATK***************************************
		attackStrength = 4;
		//*******************************EXP***************************************
		experienceValue = 300;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;



		tasks.addTask(1, new EntityAISwimming(this));
		//ì¶Ç∞ÇÈ
		tasks.addTask(4, new EntityAIAvoidEntity(this, net.minecraft.src.EntityPlayer.class, 16F, 0.45F, 0.50F));

		//â£ÇÁÇÍÇΩÇÁçUåÇÇ∑ÇÈ
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		//ÉvÉåÉCÉÑÅ[ÇçUåÇÇ∑ÇÈ
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));

		tasks.addTask(7, new EntityAILeapAtTarget(this, 0.3F));
		tasks.addTask(8, new EntityAIOcelotAttack(this));
		tasks.addTask(10, new EntityAIWander(this, 0.23F));
		tasks.addTask(11, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 10F));

	}

	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 12;    }
	//*******************************Armor***************************************
	@Override
	public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	@Override
	protected void fall(float par1) {}
	//*******************************Sound***************************************
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
		this.dropItem(mod_Dqm.Misriru.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Kagaminoisi.shiftedIndex, 1);
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
	case 3:dropItem(mod_Dqm.Metaloubu.shiftedIndex, 1);                break;
	case 4:dropItem(mod_Dqm.Metarukingnoyoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
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

			//écÇËHP10à»â∫ÇÃéû
			if(health<=10){
			if (attackTime == 0)
			{
				field_40152_d++;

				if (field_40152_d == 1)
				{
					//3î≠ÇìfÇ≠Ç‹Ç≈ÇÃéûä‘Åi10Ç≈1ïbÇ≠ÇÁÇ¢Åj
					attackTime = 70;
					func_40150_a(true);
				}
				else if (field_40152_d <= 4)
				{
					//3î≠ìfÇ≠ä‘äu
					attackTime = 70;
				}
				else
				{
					//3î≠ë≈ÇøèIÇÌÇ¡ÇΩÇ†Ç∆éüÇÃ3î≠Çë≈ÇøèoÇ∑Ç‹Ç≈ÇÃéûä‘
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
				}}}


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
	//ì¶Ç∞ÇÈ
	@Override
	public boolean isAIEnabled()
	{
		//HP10-9à»â∫Ç≈ì¶Ç∞ÇÈ
		if(health<=10 && health>=9){
		return true;}
		//HP6-5à»â∫Ç≈ì¶Ç∞ÇÈ
		if(health<=6 && health>=5){
		return true;}
		//HP2-1Ç≈ì¶Ç∞ÇÈ
		if(health<=2 && health>=1){
		return true;}
		return false;
	}
}



