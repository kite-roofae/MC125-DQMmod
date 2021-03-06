package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityGigantesu extends DqmEntityMob
{
	public DqmEntityGigantesu(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Gigantesu.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(3.0F, 7.0F);
		//*******************************Speed***************************************
		moveSpeed = 0.7F;
		//*******************************ATK***************************************
		attackStrength = 20;
		//*******************************EXP***************************************
		experienceValue = 130;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;
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
	public int getMaxHealth()    {        return 95;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 10;    }
	//*******************************Fall taisei***************************************
	//protected void fall(float par1) {}

	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		//this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Koorinokessyou.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Littlemedal.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Togetogenokiba.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		this.dropItem(mod_Dqm.Budouekisu.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
	}
	else        {             //100%
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Tikaranotane.shiftedIndex, 1);
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
	case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	case 3:dropItem(mod_Dqm.Atorasunokanaduti.shiftedIndex, 1);                break;
	//case 4:dropItem(mod_Dqm.Gureitoakusu.shiftedIndex, 1);                break;
	}}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//001*******************************Jump kougeki***************************************

	@Override
	protected void attackEntity(Entity par1Entity, float par2)
	{        float var3 = this.getBrightness(1.0F);        if (var3 > 0.5F && this.rand.nextInt(100) == 0)
	{            this.entityToAttack = null;        }
	else        {            if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0)            {
		if (this.onGround)                {
			double var4 = par1Entity.posX - this.posX;
			double var6 = par1Entity.posZ - this.posZ;
			float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
			this.motionX = var4 / var8 * 0.5D * 0.800000011920929D + this.motionX * 0.50000000298023224D;
			this.motionZ = var6 / var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.50000000298023224D;
			this.motionY = 0.5000000059604645D;       }            }
	else            {                super.attackEntity(par1Entity, par2);            }}}
	//001*******************************Jump kougeki***************************************

	//*******************************SpawnMax***************************************
	@Override
	public int getMaxSpawnedInChunk()    {        return 1;    }
}









