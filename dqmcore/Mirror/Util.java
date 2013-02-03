package net.minecraft.src.dqmcore.Mirror;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.InventoryLargeChest;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.TileEntity;
import net.minecraft.src.Vec3D;
import net.minecraft.src.World;

public class Util
{
    private static Logger logger = null;

    public static void log(String var0)
    {
        if (logger == null)
        {
            logger = ModLoader.getLogger();
        }

        logger.fine("util: \"" + var0 + "\"");
        System.out.println("util: " + var0);
    }

    public static void PrintStackTrace()
    {
        Throwable var0 = new Throwable();
        StackTraceElement[] var1 = var0.getStackTrace();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3)
        {
            StackTraceElement var4 = var1[var3];
            log("at " + var4.getClassName() + "." + var4.getMethodName() + "(" + var4.getFileName() + ":" + var4.getLineNumber() + ")");
        }
    }

    private static int getAvailableSlot(IInventory var0, ItemStack var1)
    {
        int var2 = Math.min(var0.getInventoryStackLimit(), Item.itemsList[var1.itemID].getItemStackLimit());

        for (int var3 = 0; var3 < var0.getSizeInventory(); ++var3)
        {
            ItemStack var4 = var0.getStackInSlot(var3);

            if (var4 == null)
            {
                return var3;
            }

            if (var4.itemID == var1.itemID && var4.getItemDamage() == var1.getItemDamage() && var4.stackSize < var2)
            {
                return var3;
            }
        }

        return -1;
    }

    public static List findChests(World var0, int var1, int var2, int var3)
    {
        LinkedList var4 = new LinkedList();
        Coordinate var5 = new Coordinate(var1, var2, var3);
        Iterator var6 = var5.getAdjacent(true).iterator();

        while (var6.hasNext())
        {
            Coordinate var7 = (Coordinate)var6.next();
            TileEntity var8 = var0.getBlockTileEntity(var7.getPosX(), var7.getPosY(), var7.getPosZ());

            if (var8 != null && var8 instanceof IInventory)
            {
                var4.add(checkForLargeChest(var0, var8, var7));
            }
        }

        return var4;
    }

    public static List chckChest(World var0, int var1, int var2, int var3)
    {
        LinkedList var4 = new LinkedList();
        TileEntity var5 = var0.getBlockTileEntity(var1, var2, var3);

        if (var5 != null && var5 instanceof IInventory)
        {
            var4.add(checkForLargeChest(var0, var5, new Coordinate(var1, var2, var3)));
        }

        return var4;
    }

    private static IInventory checkForLargeChest(World var0, TileEntity var1, Coordinate var2)
    {
        if (var0.getBlockId(var2.getPosX(), var2.getPosY(), var2.getPosZ()) == Block.chest.blockID)
        {
            Iterator var3 = var2.getAdjacent(false).iterator();

            while (var3.hasNext())
            {
                Coordinate var4 = (Coordinate)var3.next();

                if (var0.getBlockId(var4.getPosX(), var4.getPosY(), var4.getPosZ()) == Block.chest.blockID)
                {
                    return new InventoryLargeChest("Large Chest", (IInventory)var1, (IInventory)var0.getBlockTileEntity(var4.getPosX(), var4.getPosY(), var4.getPosZ()));
                }
            }
        }

        return (IInventory)var1;
    }

    public static int mergeInventoryItemStack(IInventory var0, ItemStack var1)
    {
        int var2 = 0;
        ItemStack var3;

        if (var1.isStackable())
        {
            for (; var1.stackSize > 0 && var2 < var0.getSizeInventory(); ++var2)
            {
                var3 = var0.getStackInSlot(var2);

                if (var3 != null && var3.itemID == var1.itemID && (!var1.getHasSubtypes() || var1.getItemDamage() == var3.getItemDamage()) && ItemStack.func_46154_a(var1, var3))
                {
                    int var4 = var3.stackSize + var1.stackSize;

                    if (var4 <= var1.getMaxStackSize())
                    {
                        var1.stackSize = 0;
                        var3.stackSize = var4;
                    }
                    else if (var3.stackSize < var1.getMaxStackSize())
                    {
                        var1.stackSize -= var1.getMaxStackSize() - var3.stackSize;
                        var3.stackSize = var1.getMaxStackSize();
                    }
                }
            }
        }

        if (var1.stackSize > 0)
        {
            for (var2 = 0; var2 < var0.getSizeInventory(); ++var2)
            {
                var3 = var0.getStackInSlot(var2);

                if (var3 == null)
                {
                    ItemStack var5 = var1.copy();
                    var5.stackSize = var1.stackSize;
                    var0.setInventorySlotContents(var2, var5);
                    var1.stackSize = 0;
                    break;
                }
            }
        }

        return var1.stackSize;
    }

    public static MovingObjectPosition getPointedBlock(World var0, EntityPlayer var1, double var2)
    {
        Object var4 = null;
        Vec3D var7 = var1.getPosition(1.0F);
        Vec3D var8 = var1.getLook(1.0F);
        Vec3D var9 = var7.addVector(var8.xCoord * var2, var8.yCoord * var2, var8.zCoord * var2);
        MovingObjectPosition var10 = var0.rayTraceBlocks_do_do(var7, var9, false, true);
        return var10 == null ? null : var10;
    }

    public static Entity getPointedEntity(World var0, EntityPlayer var1, double var2)
    {
        Entity var4 = null;
        Vec3D var7 = var1.getPosition(1.0F);
        Vec3D var8 = var1.getLook(1.0F);
        Vec3D var9 = var7.addVector(var8.xCoord * var2, var8.yCoord * var2, var8.zCoord * var2);
        float var10 = 1.0F;
        List var11 = var0.getEntitiesWithinAABBExcludingEntity(var1, var1.boundingBox.addCoord(var8.xCoord * var2, var8.yCoord * var2, var8.zCoord * var2).expand((double)var10, (double)var10, (double)var10));
        double var12 = 0.0D;

        for (int var14 = 0; var14 < var11.size(); ++var14)
        {
            Entity var15 = (Entity)var11.get(var14);

            if (var15.canBeCollidedWith())
            {
                float var16 = var15.getCollisionBorderSize();
                AxisAlignedBB var17 = var15.boundingBox.expand((double)var16, (double)var16, (double)var16);
                MovingObjectPosition var18 = var17.calculateIntercept(var7, var9);

                if (var17.isVecInside(var7))
                {
                    if (0.0D < var12 || var12 == 0.0D)
                    {
                        var4 = var15;
                        var12 = 0.0D;
                    }
                }
                else if (var18 != null)
                {
                    double var19 = var7.distanceTo(var18.hitVec);

                    if (var19 < var12 || var12 == 0.0D)
                    {
                        var4 = var15;
                        var12 = var19;
                    }
                }
            }
        }

        return var4;
    }
}
