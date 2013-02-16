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

public class DqmWorldGenGenkotu extends WorldGenerator {

	private boolean flag = false;
/*
 * this.flag‚Í•Ï”–¼‚ğˆÓ–¡‚µ‚Ü‚·B
 * this.flag = private boolean flag = false;‚Ì•”•ª
 * flag = ˆø”‚Ìboolean flag
 */

	public DqmWorldGenGenkotu(boolean flag){
		this.flag = flag;
	}

	@Override
	public boolean generate(World par1World, Random rand, int par2, int par3,int par4)
	{

		//par1World.setBlock(par2, par3, par4, mod_Dqm.DqmBlockHako.blockID);
		par1World.setBlock(par2, par3, par4, mod_Dqm.DqmBlockGenkotu.blockID);

		return flag;
	}

}