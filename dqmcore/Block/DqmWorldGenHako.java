package net.minecraft.src.dqmcore.Block;

import java.util.*;
import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.DqmModel.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.dqmcore.Pet.*;
import net.minecraft.src.*;

public class DqmWorldGenHako extends WorldGenerator {

	private boolean flag = false;
/*
 * this.flagは変数名を意味します。
 * this.flag = private boolean flag = false;の部分
 * flag = 引数のboolean flag
 */

	public DqmWorldGenHako(boolean flag){
		this.flag = flag;
	}

	@Override
	public boolean generate(World par1World, Random rand, int par2, int par3,int par4)
	{

		par1World.setBlock(par2, par3, par4, mod_Dqm.DqmBlockHako.blockID);
		//par1World.setBlock(par2, par3, par4, mod_Dqm.DqmBlockGenkotu.blockID);

		return flag;
	}

}