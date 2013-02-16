package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemArmor extends ItemArmor implements ITextureProvider
{
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmEquipment.png";
	}

	public DqmItemArmor(int par1, EnumArmorMaterial cloth, int par3, int par4,int par5)
	{
		super(par1,cloth,par3,par4);
		setMaxDamage(getMaxDamage() + par5);
		maxStackSize = 1;
	}
}