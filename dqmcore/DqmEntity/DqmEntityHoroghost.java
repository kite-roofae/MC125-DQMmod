package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityHoroghost extends DqmEntityAyasiikage
{
	private static boolean[] canCarryBlocks = new boolean[Block.blocksList.length];

	/** Is the enderman attacking another entity? */
	public boolean isAttacking;

	public DqmEntityHoroghost(World par1World)
	{
		super(par1World);
		//*******************************Texture***************************************
		texture = "/dqm/Horoghost.png";
		//*******************************Size(yoko*tate)***************************************
		setSize(1.0F, 1.5F);
		//*******************************Speed***************************************
		moveSpeed = 0.45F;
		//*******************************ATK***************************************
		attackStrength = 7;
		//*******************************EXP***************************************
		experienceValue = 29;
		//*******************************Fire taisei***************************************
		isImmuneToFire = true;
		isAttacking = false;
		stepHeight = 1.0F;

	}

	//*******************************HP***************************************
	@Override
	public int getMaxHealth()
	{
		return 32;
	}
	//*******************************Armor***************************************
	//public int getTotalArmorValue()    {        return 10;    }
	//*******************************Fall taisei***************************************
	//    protected void fall(float par1) {}
	//*******************************Sound***************************************
	//protected String getLivingSound()    {        return "none";    }
	//protected String getHurtSound()    {        return "mob.irongolem.hit";    }
	//protected String getDeathSound()    {        return "mob.irongolem.death";    }
	//*******************************DROP***************************************
	@Override
	protected void dropFewItems(boolean par1, int par2)
	{
		int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
		for (int var4 = 0; var4 < var3; ++var4)
		{
			//Randam 0-1
			//this.dropItem(mod_Dqm.Kinkai.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Yougansekinokakera.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Midorinokoke.shiftedIndex, 1);
			this.dropItem(mod_Dqm.Subayasanotane.shiftedIndex, 1);
		}
		if (this.isBurning())    {//Fire
			this.dropItem(mod_Dqm.Metaru.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
			//this.dropItem(mod_Dqm.Hikarinoisi.shiftedIndex, 1);
		}
		else        {             //100%
			this.dropItem(mod_Dqm.Seijanohai.shiftedIndex, 1);
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
