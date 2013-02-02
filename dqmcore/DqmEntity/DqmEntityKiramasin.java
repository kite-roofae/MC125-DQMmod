package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityKiramasin extends DqmEntityMob
{
	/** The ItemStack that any Riripat holds (a bow). */
	//private static final ItemStack defaultHeldItem;

	public DqmEntityKiramasin(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Kiramasin.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 1.8F);
		//*******************************Speed***************************************
		moveSpeed = 0.70F;
		//*******************************ATK***************************************
		attackStrength = 10;
		//*******************************EXP***************************************
		experienceValue = 60;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;
		//*******************************Koudo***************************************
		//heightOffset = 0.5F;



		tasks.addTask(1, new EntityAISwimming(this));
		//tasks.addTask(2, new EntityAIRestrictSun(this));
		//tasks.addTask(3, new EntityAIFleeSun(this, moveSpeed));
		tasks.addTask(4, new EntityAIArrowAttack(this, moveSpeed, 1, 50));
		//tasks.addTask(5, new EntityAIWander(this, moveSpeed));
		tasks.addTask(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 65;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	//protected void fall(float par1) {}
	//*******************************Sound***************************************
	//protected String getLivingSound()    {        return "none";    }
	//protected String getHurtSound()    {        return "mob.slime";    }
	//protected String getDeathSound()    {        return "mob.slime";    }
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)    {        int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
	for (int var4 = 0; var4 < var3; ++var4)        {
		//Randam 0-1
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		this.dropItem(mod_Dqm.Koorinokessyou.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Metaru.shiftedIndex, 1);
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
	//case 2:dropItem(mod_Dqm.Sabitakabuto.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}

	//‹|‚©Œ•
	@Override
	public boolean isAIEnabled()
	{

		if(health<=65 && health>=50){
		return true;}

		if(health<=40 && health>=30){
		return true;}

		if(health<=20 && health>=10){
		return true;}
		return false;
	}


	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}



}
