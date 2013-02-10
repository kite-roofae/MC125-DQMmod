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

public class DqmBlock extends Block implements ITextureProvider
{
    public DqmBlock(int var1, int var2)
    {
        super(var1, var2, Material.iron);
    }

    public String getTextureFile()
    {
        return "/dqm/DqmTerrain.png";
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return var1 == 0 ? mod_Dqm.DqmBlock.blockID : (var1 == 1 ? mod_Dqm.Yougansekinokakera.shiftedIndex : (var1 == 2 ? mod_Dqm.Kagaminoisi.shiftedIndex : (var1 == 3 ? mod_Dqm.Misriru.shiftedIndex : (var1 == 4 ? mod_Dqm.Puratina.shiftedIndex : (var1 == 5 ? mod_Dqm.Metaru.shiftedIndex:  mod_Dqm.DqmBlock.blockID)))));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1 > 5 ? var1 : 0;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        switch (var2)
        {
            case 0:
                return 0;

            case 1:
                return 1;

            case 2:
                return 2;

            case 3:
                return 3;

            case 4:
                return 4;

            case 5:
                return 5;

            case 6:
                return 17;

            case 7:
                return 18;

            case 8:
                return 19;

            default:
                return 20;
        }
    }
}
