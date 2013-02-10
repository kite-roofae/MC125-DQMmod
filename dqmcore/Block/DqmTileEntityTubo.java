package net.minecraft.src.dqmcore.Block;

import net.minecraft.src.*;

public class DqmTileEntityTubo extends TileEntity
{
    private boolean isEmpty;
    private ItemStack osonaeItemStack;


    public String getInvName()
    {
        return "jizo";
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        short var2 = var1.getShort("itemID");
        short var3 = var1.getShort("damage");
        short var4 = var1.getShort("stackSize");

        if (var4 > 0)
        {
            this.osonaeItemStack = new ItemStack(var2, var3, var4);
            this.isEmpty = false;
        }
        else
        {
            this.osonaeItemStack = null;
        }
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);

        if (this.osonaeItemStack == null)
        {
            var1.setShort("itemID", (short)0);
            var1.setShort("damage", (short)0);
            var1.setShort("stackSize", (short)0);
        }
        else
        {
            var1.setShort("itemID", (short)this.osonaeItemStack.itemID);
            var1.setShort("damage", (short)this.osonaeItemStack.getItemDamage());
            var1.setShort("stackSize", (short)this.osonaeItemStack.stackSize);
        }
    }


}
