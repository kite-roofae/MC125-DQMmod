package net.minecraft.src.dqmcore.Block;

import java.util.ArrayList;
import java.util.Random;
import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemSign;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.mod_Dqm;

public class DqmBlockTubo extends BlockContainer
{
    private Class DqmTuboEntityClass;

    public DqmBlockTubo(int var1, Class var2)
    {
        super(var1, Material.cloth);
        this.DqmTuboEntityClass = var2;
    }

    /**
     * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
     * block.
     */
    public boolean blockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        Random var6 = new Random();
        var1.playSoundEffect((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "mob.pig", 1.0F + var6.nextFloat(), var6.nextFloat() * 0.7F + 0.3F);
        return true;
    }

    /**
     * Adds to the supplied array any colliding bounding boxes with the passed in bounding box. Args: world, x, y, z,
     * axisAlignedBB, arrayList
     */
    public void getCollidingBoundingBoxes(World var1, int var2, int var3, int var4, AxisAlignedBB var5, ArrayList var6)
    {
        int var7 = var1.getBlockMetadata(var2, var3, var4);
        float var8 = 0.0F;
        float var9 = 0.0F;
        float var10 = 0.0F;
        float var11 = 1.0F;
        float var12 = 1.0F;
        float var13 = 1.0F;

        if (var7 == 0)
        {
            var8 = 0.2F;
            var9 = 0.2F;
            var10 = 0.45F;
            var11 = 0.8F;
            var12 = 0.8F;
            var13 = 1.0F;
            this.setBlockBounds(var8, var9, var10, var11, var12, var13);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }

        if (var7 == 1)
        {
            var8 = 0.0F;
            var9 = 0.2F;
            var10 = 0.2F;
            var11 = 0.55F;
            var12 = 0.8F;
            var13 = 0.8F;
            this.setBlockBounds(var8, var9, var10, var11, var12, var13);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }

        if (var7 == 2)
        {
            var8 = 0.2F;
            var9 = 0.2F;
            var10 = 0.0F;
            var11 = 0.8F;
            var12 = 0.8F;
            var13 = 0.55F;
            this.setBlockBounds(var8, var9, var10, var11, var12, var13);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }

        if (var7 == 3)
        {
            var8 = 0.45F;
            var9 = 0.2F;
            var10 = 0.2F;
            var11 = 1.0F;
            var12 = 0.8F;
            var13 = 0.8F;
            this.setBlockBounds(var8, var9, var10, var11, var12, var13);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        float var6 = 0.0F;
        float var7 = 0.0F;
        float var8 = 0.0F;
        float var9 = 1.0F;
        float var10 = 1.0F;
        float var11 = 1.0F;

        if (var5 == 0)
        {
            var6 = 0.2F;
            var7 = 0.2F;
            var8 = 0.45F;
            var9 = 0.8F;
            var10 = 0.8F;
            var11 = 1.0F;
        }

        if (var5 == 1)
        {
            var6 = 0.0F;
            var7 = 0.2F;
            var8 = 0.2F;
            var9 = 0.55F;
            var10 = 0.8F;
            var11 = 0.8F;
        }

        if (var5 == 2)
        {
            var6 = 0.2F;
            var7 = 0.2F;
            var8 = 0.0F;
            var9 = 0.8F;
            var10 = 0.8F;
            var11 = 0.55F;
        }

        if (var5 == 3)
        {
            var6 = 0.45F;
            var7 = 0.2F;
            var8 = 0.2F;
            var9 = 1.0F;
            var10 = 0.8F;
            var11 = 0.8F;
        }

        this.setBlockBounds(var6, var7, var8, var9, var10, var11);
    }

    /**
     * Returns the TileEntity used by this block.
     */
    public TileEntity getBlockEntity()
    {
        try
        {
            return (TileEntity)this.DqmTuboEntityClass.newInstance();
        }
        catch (Exception var2)
        {
            throw new RuntimeException(var2);
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = (MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
        var1.setBlockMetadataWithNotify(var2, var3, var4, var6);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return mod_Dqm.Yougansekinokakera.shiftedIndex;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 1;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return -1;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }
}

