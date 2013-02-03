package net.minecraft.src.dqmcore.Mirror;

//import forge.IArmorTextureProvider;
//import forge.ITextureProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
//import lighthelmet.util.Coordinate;
//import net.minecraft.src.lighthelmet.util.*;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumSkyBlock;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;
import net.minecraft.src.mod_LightHelmet;
import java.io.File;
import java.util.logging.Logger;
//import net.minecraft.src.lighthelmet.ItemLightHelmet;
import net.minecraft.client.Minecraft;
import java.util.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.DqmModel.*;
import net.minecraft.src.forge.*;

public class ItemLightHelmet extends ItemArmor implements ITextureProvider, IArmorTextureProvider
{
    public ItemLightHelmet(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return mod_LightHelmet.armorTexture;
    }

    public String getTextureFile()
    {
        return mod_LightHelmet.itemTexture;
    }

    public Coordinate[] readFromNBT(EntityPlayer var1)
    {
        NBTTagCompound var2 = var1.getEntityData();
        Coordinate[] var3 = new Coordinate[2];

        try
        {
            int var4 = var2.getInteger(mod_LightHelmet.MOD_NAME + ".LightUp");

            if ((var4 & 2) != 0)
            {
                var3[1] = new Coordinate();
                var3[1].setPosX(var2.getInteger(mod_LightHelmet.MOD_NAME + ".prevXTileHead"));
                var3[1].setPosY(var2.getInteger(mod_LightHelmet.MOD_NAME + ".prevYTileHead"));
                var3[1].setPosZ(var2.getInteger(mod_LightHelmet.MOD_NAME + ".prevZTileHead"));

                if ((var4 & 1) != 0)
                {
                    var3[0] = new Coordinate();
                    var3[0].setPosX(var2.getInteger(mod_LightHelmet.MOD_NAME + ".prevXTileTarget"));
                    var3[0].setPosY(var2.getInteger(mod_LightHelmet.MOD_NAME + ".prevYTileTarget"));
                    var3[0].setPosZ(var2.getInteger(mod_LightHelmet.MOD_NAME + ".prevZTileTarget"));
                }
                else
                {
                    var3[0] = null;
                }

                return var3;
            }
            else
            {
                var3[0] = null;
                var3[1] = null;
                return var3;
            }
        }
        catch (ClassCastException var5)
        {
            var3[0] = null;
            var3[1] = null;
            return var3;
        }
    }

    public void writeToNBT(EntityPlayer var1, Coordinate[] var2)
    {
        NBTTagCompound var3 = var1.getEntityData();
        int var4 = 0;

        if (var2[0] != null)
        {
            var4 |= 1;
            var3.setInteger(mod_LightHelmet.MOD_NAME + ".prevXTileTarget", var2[0].getPosX());
            var3.setInteger(mod_LightHelmet.MOD_NAME + ".prevYTileTarget", var2[0].getPosY());
            var3.setInteger(mod_LightHelmet.MOD_NAME + ".prevZTileTarget", var2[0].getPosZ());
        }

        if (var2[1] != null)
        {
            var4 |= 2;
            var3.setInteger(mod_LightHelmet.MOD_NAME + ".prevXTileHead", var2[1].getPosX());
            var3.setInteger(mod_LightHelmet.MOD_NAME + ".prevYTileHead", var2[1].getPosY());
            var3.setInteger(mod_LightHelmet.MOD_NAME + ".prevZTileHead", var2[1].getPosZ());
        }

        var3.setInteger(mod_LightHelmet.MOD_NAME + ".LightUp", var4);
    }

    public void removeNBT(EntityPlayer var1)
    {
        NBTTagCompound var2 = var1.getEntityData();
        var2.setInteger(mod_LightHelmet.MOD_NAME + ".LightUp", 0);
    }

    public Coordinate getLightTarget(World var1, EntityPlayer var2, int var3)
    {
        Entity var4 = Util.getPointedEntity(var1, var2, (double)var3);
        Coordinate var5 = null;

        if (var4 != null)
        {
            var5 = new Coordinate((int)var4.posX, (int)var4.posY, (int)var4.posZ);
        }
        else
        {
            MovingObjectPosition var6 = Util.getPointedBlock(var1, var2, (double)var3);

            if (var6 != null)
            {
                int var7 = var6.blockX;
                int var8 = var6.blockY;
                int var9 = var6.blockZ;

                switch (var6.sideHit)
                {
                    case 0:
                        --var8;
                        break;

                    case 1:
                        ++var8;
                        break;

                    case 2:
                        --var9;
                        break;

                    case 3:
                        ++var9;
                        break;

                    case 4:
                        --var7;
                        break;

                    case 5:
                        ++var7;
                }

                var5 = new Coordinate(var7, var8, var9);
            }
        }

        return var5;
    }

    public void setLightValue(World var1, Coordinate var2, int var3)
    {
        int var4 = var2.getPosX();
        int var5 = var2.getPosY();
        int var6 = var2.getPosZ();
        int var7 = var1.getSavedLightValue(EnumSkyBlock.Block, var4, var5, var6);

        if (var7 != var3 || var3 == 0)
        {
            var1.setLightValue(EnumSkyBlock.Block, var4, var5, var6, var3);
            var1.updateAllLightTypes(var4 - 1, var5, var6);
            var1.updateAllLightTypes(var4 + 1, var5, var6);
            var1.updateAllLightTypes(var4, var5 - 1, var6);
            var1.updateAllLightTypes(var4, var5 + 1, var6);
            var1.updateAllLightTypes(var4, var5, var6 - 1);
            var1.updateAllLightTypes(var4, var5, var6 + 1);
        }
    }

    public void removeLight(World var1, EntityPlayer var2)
    {
        Coordinate[] var3 = this.readFromNBT(var2);
        boolean var4 = false;

        if (var3[0] != null)
        {
            this.setLightValue(var1, var3[0], 0);
            var4 = true;
        }

        if (var3[1] != null)
        {
            this.setLightValue(var1, var3[1], 0);
            var4 = true;
        }

        if (var4)
        {
            this.removeNBT(var2);
        }
    }

    public boolean lightTarget(World var1, EntityPlayer var2, int var3, int var4, int var5)
    {
        Coordinate[] var6 = this.readFromNBT(var2);
        Coordinate[] var7 = new Coordinate[] {this.getLightTarget(var1, var2, var3), null};
        int var8 = (int)var2.posX;
        int var9 = (int)(var2.posY + (double)var2.getEyeHeight());
        int var10 = (int)var2.posZ;
        var7[1] = new Coordinate(var8, var9, var10);
        HashMap var11 = new HashMap();

        if (var6[0] != null && var6[0] != var7[0])
        {
            var11.put(var6[0], Integer.valueOf(0));
        }

        if (var6[1] != null && var6[1] != var7[1])
        {
            var11.put(var6[1], Integer.valueOf(0));
        }

        if (var7[0] != null && (var6[0] == null || var6[0] != var7[0]))
        {
            var11.put(var7[0], Integer.valueOf(var5));
        }

        if (var11.containsKey(var7[1]))
        {
            if (((Integer)var11.get(var7[1])).intValue() < var4)
            {
                var11.put(var7[1], Integer.valueOf(var4));
            }
        }
        else if (var6[1] == null || var6[1] != var7[1])
        {
            var11.put(var7[1], Integer.valueOf(var4));
        }

        ArrayList var12 = new ArrayList(var11.entrySet());
        Collections.sort(var12, new Comparator()
        {
            public int compare(Entry var1, Entry var2)
            {
                return ((Integer)var1.getValue()).compareTo((Integer)var2.getValue());
            }
            public int compare(Object var1, Object var2)
            {
                return this.compare((Entry)var1, (Entry)var2);
            }
        });
        Iterator var13 = var12.iterator();

        while (var13.hasNext())
        {
            Entry var14 = (Entry)var13.next();
            this.setLightValue(var1, (Coordinate)var14.getKey(), ((Integer)var14.getValue()).intValue());
        }

        this.writeToNBT(var2, var7);
        return true;
    }
}
