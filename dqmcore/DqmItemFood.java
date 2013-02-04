package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemFood extends ItemFood implements ITextureProvider
{
	mod_Dqm Dqm;
	public DqmItemFood(int par1, int par2, float par3, boolean par4,int par5)
	{
		super(par1, par2, par3, par4);
		this.maxStackSize = par5;
	}

	@Override
	public int getItemStackLimit()
	{
		return this.maxStackSize;
	}

	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	super.onFoodEaten(par1ItemStack,par2World,par3EntityPlayer);
		int ID =par1ItemStack.itemID;
		EntityPlayer ep = par3EntityPlayer;
		if(ID == Dqm.Yakusou.shiftedIndex){ep.setEntityHealth(ep.getHealth()+5);}
		if(ID == Dqm.Jouyakusou.shiftedIndex){ep.setEntityHealth(ep.getHealth()+10);}
		if(ID == Dqm.Tokuyakusou.shiftedIndex){ep.setEntityHealth(ep.getHealth()+20);}
		if(ep.getHealth() > ep.getMaxHealth()){ep.setEntityHealth(ep.getMaxHealth());}
		if(ID == Dqm.Sinkanohiseki.shiftedIndex){
			ep.addPotionEffect(new PotionEffect(Potion.jump.id, 200 * 20, 2));
			ep.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200 * 20, 2));
			ep.addPotionEffect(new PotionEffect(Potion.resistance.id, 200 * 20, 2));
			ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200 * 20, 2));
			}
		if(ID == Dqm.Dokukesisou.shiftedIndex){ep.removePotionEffect(Potion.poison.id);}
		if(ID == Dqm.Bannouyaku.shiftedIndex){ep.clearActivePotions();}
        return par1ItemStack;
    }

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}
}
