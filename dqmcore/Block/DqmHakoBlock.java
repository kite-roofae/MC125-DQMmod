package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmHakoBlock extends Block implements ITextureProvider
{ //クラス本体。Blockクラスを継承する

   public DqmHakoBlock(int i, int j) //ブロックの基本設定
   {
      super(i, j, Material.wood); //材質を土に
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

   public int idDropped(int i, Random random, int j)
   {
	    int x = 0;
		int x3 = x+getRandom(300, -300);

		if(x3>=97&&x3<=100){j=mod_Dqm.Littlemedal.shiftedIndex;}
		if(x3>=95&&x3<=96){j=mod_Dqm.Dokubari.shiftedIndex;}
		if(x3>=92&&x3<=94){j=mod_Dqm.Metaru.shiftedIndex;}

		if(x3==90){j=mod_Dqm.Majinnokanaduti.shiftedIndex;}

		if(x3==88){j=mod_Dqm.Sinkanohiseki.shiftedIndex;}
		if(x3==87){j=mod_Dqm.Rubinogenseki.shiftedIndex;}
		if(x3==86){j=mod_Dqm.Moon.shiftedIndex;}
		if(x3>=80&&x3<=82){j=mod_Dqm.Urokonoyoroi.shiftedIndex;}
		if(x3==79){j=mod_Dqm.Sabitayoroi.shiftedIndex;}
		if(x3==78){j=mod_Dqm.Sabitakote.shiftedIndex;}
		if(x3==77){j=mod_Dqm.Sabitakabuto.shiftedIndex;}
		if(x3==76){j=mod_Dqm.Sabitakutu.shiftedIndex;}
		if(x3>=70&&x3<=73){j=mod_Dqm.Seinarunaifu.shiftedIndex;}
		if(x3>=66&&x3<=69){j=mod_Dqm.Kawanoyoroi.shiftedIndex;}
		if(x3>=63&&x3<=65){j=mod_Dqm.Kawanobousi.shiftedIndex;}
		if(x3>=60&&x3<=62){j=mod_Dqm.Kawanokote.shiftedIndex;}
		if(x3>=57&&x3<=59){j=mod_Dqm.Kawanokutu.shiftedIndex;}

		if(x3>=1&&x3<=10){j=mod_Dqm.Konbou.shiftedIndex;}
		if(x3>=-20&&x3<=0){j=mod_Dqm.Yakusou.shiftedIndex;}
		if(x3>=-40&&x3<=-21){j=mod_Dqm.Dokukesisou.shiftedIndex;}
		if(x3>=-60&&x3<=-41){j=mod_Dqm.Tikaranotane.shiftedIndex;}
		if(x3>=-80&&x3<=-61){j=mod_Dqm.Subayasanotane.shiftedIndex;}
		if(x3>=-100&&x3<=-81){j=mod_Dqm.Mamorinotane.shiftedIndex;}
           return j;


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