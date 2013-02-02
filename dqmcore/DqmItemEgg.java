package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityEgg;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemEgg extends Item implements ITextureProvider
{
	public DqmItemEgg(int par1)
	{
		super(par1);
		this.maxStackSize = 64;
	}
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
	}
	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par3EntityPlayer.capabilities.isCreativeMode)
		{
			--par1ItemStack.stackSize;
		}

		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if (!par2World.isRemote)
		{
			par2World.spawnEntityInWorld(new DqmEntityEgg(par2World, par3EntityPlayer));
		}

		return par1ItemStack;
	}
}
