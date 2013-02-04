package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.mo_DqmPetLoader;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.*;


public class ItemDragonBike extends ItemAnimalBike implements ITextureProvider
{
    public ItemDragonBike(int var1)
    {
        super(var1);
    }

    public RidableCreature getBike(EntityPlayer var1)
    {
        return new EntityDragonBike(var1.worldObj);
    }

    public boolean isDisabled()
    {
        return mo_DqmPetLoader.DisableDragon;
    }
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
	}
}
