package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class DqmSixBlock extends Block implements ITextureProvider
{
/*
親クラスを初期化する必要があるため定義
*/
public DqmSixBlock(int i, int j)
{
/*
Material.rock：石と同じ処理をさせる定義をしているだけです。
*/
	super(i, j, Material.rock);
}



public int getBlockTextureFromSideAndMetadata(int i, int j)
{
	if (i == 0)//底面
	{
		return 4;
	}
    if (i == 1)//上面
    {
        return 1;
    }
    if (i == 2)//東面
    {
        return 2;
    }
    if (i == 3)//西面
    {
        return 3;
    }
    if (i == 4)//北面
    {
        return 160;
    }
    if (i == 5)//南面
    {
        return 161;
    }
else
{
    return 5;
}

}

    /*
ブロックが破壊された時にドロップするものを設定
returnでthis.blockIDなので同じ物をドロップさせています
*/
public int idDropped(int i, int j,Random random)
    {
        return this.blockID;
    }
    /*
上記破壊時のドロップアイテムの個数を指定
returnで1個ドロップするように指定しています。
*/
public int quantityDropped(Random random)
    {
        return 1;
    }
@Override
public String getTextureFile()
{
	return "/dqm/DqmTerrain.png";
}
}