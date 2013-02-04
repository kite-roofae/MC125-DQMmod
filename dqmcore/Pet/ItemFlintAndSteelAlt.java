package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemFlintAndSteel;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;


public class ItemFlintAndSteelAlt extends ItemFlintAndSteel
{
    public ItemFlintAndSteelAlt(int var1)
    {
        super(var1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (var2.isRemote)
        {
            return var1;
        }
        else if (!(var3.ridingEntity instanceof EntityDragonBike))
        {
            return var1;
        }
        else
        {
            boolean var4 = ModLoader.getMinecraftInstance().playerController.isInCreativeMode();

            if (var4 || var1.getMaxDamage() > var1.getItemDamage())
            {
                ((EntityDragonBike)var3.ridingEntity).breathFire = System.currentTimeMillis();

                if (!var4)
                {
                    var1.damageItem(1, var3);
                }
            }

            return var1;
        }
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS !
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7)
    {
        return var2.ridingEntity instanceof EntityDragonBike ? false : super.onItemUse(var1, var2, var3, var4, var5, var6, var7);
    }
}
