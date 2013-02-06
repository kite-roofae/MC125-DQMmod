package net.minecraft.src.dqmcore;

import java.util.*;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.DqmModel.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.dqmcore.Pet.*;



public class DqmItemHoe extends ItemHoe implements ITextureProvider
{
	private final DqmEnumToolMaterial toolMaterial;
    public DqmItemHoe(int par1, DqmEnumToolMaterial par2EnumToolMaterial)
    {
    	super(par1,EnumToolMaterial.EMERALD);
        this.toolMaterial = par2EnumToolMaterial;
    }

    public String getTextureFile()
    {
        return "/dqm/DqmItems.png";
    }
}
