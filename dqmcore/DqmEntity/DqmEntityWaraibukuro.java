package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityWaraibukuro extends DqmEntityAyasiikage
{
	private static boolean[] canCarryBlocks = new boolean[Block.blocksList.length];

	/** Is the enderman attacking another entity? */
	public boolean isAttacking;

	public DqmEntityWaraibukuro(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Waraibukuro.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(0.8F, 0.8F);
		//*******************************Speed***************************************
		moveSpeed = 0.25F;
		//*******************************ATK***************************************
		attackStrength = 5;
		//*******************************EXP***************************************
		experienceValue = 17;
		//*******************************Fire taisei***************************************
		//isImmuneToFire = true;
		//*******************************Koudo***************************************
		//heightOffset = 0.5F;
		isAttacking = false;
		stepHeight = 1.0F;

	}
	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 24;    }
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 20;    }
	//*******************************Fall taisei***************************************
	@Override
	protected void fall(float par1) {}
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
		this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Taiyounoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
	}
	if (this.isBurning())    {//Fire
		this.dropItem(mod_Dqm.Taiyounoisi.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.??.shiftedIndex, 1);
	}
	else        {             //100%
		this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
		//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
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
	//case 2:dropItem(mod_Dqm.Sabitayoroi.shiftedIndex, 1);                break;
	//case 2:dropItem(mod_Dqm.Sabitakote.shiftedIndex, 1);                break;
	case 2:dropItem(mod_Dqm.Sabitakutu.shiftedIndex, 1);                break;
	}}
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