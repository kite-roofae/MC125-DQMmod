package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntitySyado extends DqmEntityAyasiikage
{
	private static boolean[] canCarryBlocks = new boolean[Block.blocksList.length];

	/** Is the enderman attacking another entity? */
	public boolean isAttacking;

	public DqmEntitySyado(World par1World)
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
		isAttacking = false;
		stepHeight = 1.0F;

	}

	//*******************************HP***************************************
	@Override
	public int getMaxHealth()    {        return 27;    }
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

	static
	{
		canCarryBlocks[Block.grass.blockID] = false;
        canCarryBlocks[Block.dirt.blockID] = false;
        canCarryBlocks[Block.sand.blockID] = false;
        canCarryBlocks[Block.gravel.blockID] = false;
        canCarryBlocks[Block.plantYellow.blockID] = false;
        canCarryBlocks[Block.plantRed.blockID] = false;
        canCarryBlocks[Block.mushroomBrown.blockID] = false;
        canCarryBlocks[Block.mushroomRed.blockID] = false;
        canCarryBlocks[Block.tnt.blockID] = false;
        canCarryBlocks[Block.cactus.blockID] = false;
        canCarryBlocks[Block.blockClay.blockID] = false;
        canCarryBlocks[Block.pumpkin.blockID] = false;
		canCarryBlocks[Block.melon.blockID] = true;
		canCarryBlocks[Block.mycelium.blockID] = false;
	}
}
