package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmItemBow extends Item implements ITextureProvider
{
	private String model;

	public DqmItemBow(int par1)
	{
		super(par1);
		maxStackSize = 1;
		setMaxDamage(384);
	}
	public DqmItemBow setmodel(String m)
	{
		model = m;
		return this;
	}

	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmEquipment.png";
	}
	/**
	 * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	 */
	@Override


	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{
		boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

		if (flag || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
		{
			if(model == "Kazekirinoyumi")
			{

				int i = getMaxItemUseDuration(par1ItemStack) - par4;
				float f = i / 20F;
				f = (f * f + f * 2.0F) / 3F;
				//if ((double)f < 0.10000000000000001D)
				//0.1以上溜めると矢が出る
				if (f < 0.1D)
				{
					return;
				}
				//0.1以上溜めた場合の飛距離
				if (f > 0.1F)
				{
					//飛距離
					f = 2.5F;
				}

				EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 0.5F);

				if (f == 1.0F)
				{
					entityarrow.arrowCritical = true;
				}

				int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (j > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + j * 0.5D + 0.5D);
				}

				EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				/*if (k > 0)
            {
                entityarrow.func_46023_b(k);
            }*/

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (!flag)
				{
					par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.shiftedIndex);
				}
				else
				{
					entityarrow.doesArrowBelongToPlayer = false;
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}par2World.playSoundAtEntity(par3EntityPlayer, "DQM_Sound.Kazekiri", 0.9F, 0.9F);}
			if(model == "Sefiramunoyumi")
			{

				int i = getMaxItemUseDuration(par1ItemStack) - par4;
				float f = i / 20F;
				f = (f * f + f * 2.0F) / 3F;
				//0.1以上溜めると矢が出る
				if (f < 2.5D)
				{
					return;
				}
				//0.1以上溜めた場合の飛距離
				if (f > 1.5F)
				{
					//飛距離
					f = 0.5F;
				}


				EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 7.0F);

				if (f == 1.0F)
				{
					entityarrow.arrowCritical = true;
				}

				int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (j > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + j * 0.5D + 0.5D);
				}

				EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				/*if (k > 0)
            {
                entityarrow.func_46023_b(k);
            }*/

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (!flag)
				{
					par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.shiftedIndex);
				}
				else
				{
					entityarrow.doesArrowBelongToPlayer = false;
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}par2World.playSoundAtEntity(par3EntityPlayer, "DQM_Sound.Mira", 0.9F, 0.9F);}
			if(model == "Yuuwakunoyumi")
			{

				int i = getMaxItemUseDuration(par1ItemStack) - par4;
				float f = i / 20F;
				f = (f * f + f * 2.0F) / 3F;
				//0.1以上溜めると矢が出る
				if (f < 1.0D)
				{
					return;
				}
				//0.1以上溜めた場合の飛距離
				if (f > 1.0F)
				{
					//飛距離
					f = 0.5F;
				}

				EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 3.0F);

				if (f == 1.0F)
				{
					entityarrow.arrowCritical = true;
				}

				int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (j > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + j * 0.5D + 0.5D);
				}

				EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				/*if (k > 0)
            {
                entityarrow.func_46023_b(k);
            }*/

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (!flag)
				{
					par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.shiftedIndex);
				}
				else
				{
					entityarrow.doesArrowBelongToPlayer = false;
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}par2World.playSoundAtEntity(par3EntityPlayer, "DQM_Sound.Warp", 0.9F, 0.9F);}
		}
	}

	@Override
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{

		return 0x11940;
	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
		{
			par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	@Override
	public int getItemEnchantability()
	{
		return 1;
	}
}
