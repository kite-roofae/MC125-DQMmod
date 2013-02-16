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
	 * (”ñ Javadoc)
	 * @see net.minecraft.src.BaseMod#generateSurface(net.minecraft.src.World, java.util.Random, int, int)
	 * ‚±‚±‚Ì•Ï”–¼‚âˆø”–¼‚Í©•ª‚É‚ ‚Á‚½g‚¢•û‚É•ÏX‚µ‚Ä‚à‚¢‚¢‚Å‚·B
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