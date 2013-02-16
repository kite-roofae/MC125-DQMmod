package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmOneBlock extends Block implements ITextureProvider
{ //クラス本体。Blockクラスを継承する

   public DqmOneBlock(int i, int j) //ブロックの基本設定
   {
      super(i, j, Material.ground); //材質を土に
   }

   public int idDropped(int i, int j,Random random)
   {
      return this.blockID; //壊したときにこのブロックをドロップする
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