package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityTntEgg;
import net.minecraft.src.forge.*;

public class DqmItemTntEgg extends ItemEgg implements ITextureProvider
{
	public DqmItemTntEgg(int par1)
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
			par2World.spawnEntityInWorld(new DqmEntityTntEgg(par2World, par3EntityPlayer));
		}

		return par1ItemStack;
	}
}
