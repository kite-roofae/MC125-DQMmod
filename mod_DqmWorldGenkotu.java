package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.dqmcore.Block.*;

public class mod_DqmWorldGenkotu extends BaseMod {

	@Override
	public String getVersion() {
		return "1.2.5";
	}

	@Override
	public void load() {

	}

	/*
	 * (非 Javadoc)
	 * @see net.minecraft.src.BaseMod#generateSurface(net.minecraft.src.World, java.util.Random, int, int)
	 * ここの変数名や引数名は自分にあった使い方に変更してもいいです。
	 */

	@Override
	public void generateSurface(World par1World,Random rand,int par2,int par3){

		//DqmWorldGenHako var1 = new DqmWorldGenHako(true);
		DqmWorldGenGenkotu var2 = new DqmWorldGenGenkotu(true);
		//var1.setScale(1, 1, 1);
		var2.setScale(1, 1, 1);

		int xPos = par2 + rand.nextInt(700);
		int zPos = par3 + rand.nextInt(700);
		int yPos = par1World.getHeightValue(xPos, zPos);

		//var1.generate(par1World, rand, xPos, yPos, zPos);
		var2.generate(par1World, rand, xPos, yPos, zPos);

	}

}