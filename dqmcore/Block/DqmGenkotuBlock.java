package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
import java.util.ArrayList;

public class DqmGenkotuBlock extends BlockFlower implements ITextureProvider
{ //クラス本体。Blockクラスを継承する

   public DqmGenkotuBlock(int i, int j) //ブロックの基本設定
   {
      super(i, j, Material.grass); //材質を土に
   }

	private static int getRandom(int max, int min)
	{
		int ret = (int)Math.floor(Math.random()*(max-min+1))+min;

		return ret;
	}
	/*
   public int idDropped(int i, int j,Random random)
   {
	    int x = 0;
		int x3 = x+getRandom(100, -100);


		if(x3==0){j=mod_Dqm.Littlemedal.shiftedIndex;}
		if(x3>=1){j=mod_Dqm.Yakusou.shiftedIndex;}
		if(x3<=-1){j=mod_Dqm.Dokukesisou.shiftedIndex;}
		//if(x3==0){i=mod_Dqm.Littlemedal.shiftedIndex;}
		//if(x3==0){i=mod_Dqm.Littlemedal.shiftedIndex;}
		//if(x3==0){i=mod_Dqm.Littlemedal.shiftedIndex;}



      return wood.blockID;
   }*/
    public int getRenderType()
    {
        return 1;
    }
   public int idDropped(int i, Random random, int j)
   {

           return this.blockID;


   }
   public int quantityDropped(Random random)
   {
      return 1; //idDropedでドロップする数を設定
   }
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmOre.png";
	}
}