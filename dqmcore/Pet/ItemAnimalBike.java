package net.minecraft.src.dqmcore.Pet;
import java.util.HashMap;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import net.minecraft.src.dqmcore.DqmItemSword;
import java.util.Random;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.forge.ITextureProvider;

public abstract class ItemAnimalBike extends Item
{
	public static SoundPoolEntry onPlayStreaming;

    public static HashMap bikes = new HashMap();
    private String model;

    public ItemAnimalBike(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(64);
    }
	public ItemAnimalBike setmodel(String m)
	{
		model = m;
		return this;
	}
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS !
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7)
    {

        if (!this.isDisabled() && !var3.isRemote)
        {
            if (var2.ridingEntity != null && var2.ridingEntity instanceof RidableCreature)
            {
                var2.ridingEntity.interact(var2);
                return false;
            }
            else
            {
                RidableCreature var8 = (RidableCreature)bikes.get(var2.username);

                if (var8 != null && !var8.isDead)
                {
                    if (var8.setDeadBike())
                    {
                        bikes.remove(var2.username);
                    }

                    return true;
                }
                else
                {

    				if(model == "Ramia"){var3.playSoundAtEntity(var2, "DQM_Sound.Ramia", 0.9F, 0.9F);}
    				if(model == "Papasunokatami"){var3.playSoundAtEntity(var2, "DQM_Sound.Kirapansa", 0.9F, 0.9F);}
                    RidableCreature var9 = this.getBike(var2);

                    if (var9 == null)
                    {
                        return false;
                    }
                    else
                    {
                        var9.setLocationAndAngles((double)((float)var4 + 0.5F), (double)((float)var5 + 1.0F), (double)((float)var6 + 0.5F), var2.rotationYaw, var2.rotationPitch);
                        var9.setOwner(var2.username);
                        var3.spawnEntityInWorld(var9);
                        bikes.put(var2.username, var9);
                        return true;
                    }
                }
            }
        }
        else
        {
            return true;
        }
    }

    private void onPlayStreaming(EntityPlayer var2, String string, float f,
			float g, float h) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}
	public abstract RidableCreature getBike(EntityPlayer var1);

    public abstract boolean isDisabled();
}
