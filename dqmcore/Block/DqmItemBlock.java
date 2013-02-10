package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import java.util.*;
import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.DqmModel.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.dqmcore.Pet.*;
import net.minecraft.src.*;
public class DqmItemBlock extends ItemBlock
{
    public DqmItemBlock(int var1)
    {
        super(var1);
        this.setHasSubtypes(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int var1)
    {
        return var1;
    }

    public String getTextureFile()
    {
        return "/dqm/DqmTerrain.png";
    }

    public String getItemNameIS(ItemStack var1)
    {
        int var2 = var1.getItemDamage();
        String var3 = "";

        switch (var2)
        {
            case 0:
                var3 = "MetaBlock1";
                break;

            case 1:
                var3 = "MetaBlock2";
                break;

            case 2:
                var3 = "MetaBlock3";
                break;

            case 3:
                var3 = "MetaBlock4";
                break;

            case 4:
                var3 = "MetaBlock5";
                break;

            case 5:
                var3 = "MetaBlock6";
                break;

            case 6:
                var3 = "MetaBlock7";
                break;

            case 7:
                var3 = "MetaBlock8";
                break;

            case 8:
                var3 = "MetaBlock9";
                break;

            case 9:
                var3 = "MetaBlock0";
                break;

            default:
                var3 = "MetaBlock1";
        }

        return this.getItemName() + "." + var3;
    }
}
