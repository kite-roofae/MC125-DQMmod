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

public class DqmBlockOre extends Block implements ITextureProvider
{
    public DqmBlockOre(int var1, int var2)
    {
        super(var1, var2, Material.iron);
    }

    public String getTextureFile()
    {
        return "/dqm/DqmOre.png";
    }
    /*
    public static int getBlockFromDye(int par0)
    {
        return ~par0 & 15;
    }*/
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return var1 == 0 ? mod_Dqm.DqmBlockOre.blockID : (var1 == 1 ? mod_Dqm.Yougansekinokakera.shiftedIndex : (var1 == 2 ? mod_Dqm.Kagaminoisi.shiftedIndex :
        	(var1 == 3 ? mod_Dqm.Misriru.shiftedIndex : (var1 == 4 ? mod_Dqm.Puratina.shiftedIndex : (var1 == 5 ? mod_Dqm.Metaru.shiftedIndex:
        		(var1 == 6 ? mod_Dqm.Rubinogenseki.shiftedIndex : (var1 == 7 ? mod_Dqm.Moon.shiftedIndex : (var1 == 8 ? mod_Dqm.Hikarinoisi.shiftedIndex:
        			(var1 == 9 ? mod_Dqm.Tokinosuisyou.shiftedIndex : (var1 == 10 ? mod_Dqm.Littlemedal.shiftedIndex:(var1 == 11 ? mod_Dqm.Taiyounoisi.shiftedIndex :
        				(var1 == 12 ? mod_Dqm.Bakudanisi.shiftedIndex:(var1 == 13 ? mod_Dqm.Hosinokakera.shiftedIndex : (var1 == 14 ? mod_Dqm.Migakizuna.shiftedIndex :
        					(var1 == 15 ? mod_Dqm.Koorinokessyou.shiftedIndex:(var1 == 16 ? mod_Dqm.Inotinoisi.shiftedIndex:
        		mod_Dqm.DqmBlockOre.blockID))))))))))))))));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1 > 16 ? var1 : 0;
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
            return 6;

        case 7:
            return 7;

        case 8:
            return 8;

        case 9:
            return 9;

        case 10:
            return 10;

        case 11:
            return 11;

        case 12:
            return 12;

        case 13:
            return 16;

        case 14:
            return 17;

        case 15:
            return 18;

        case 16:
            return 19;

            default:
                return 20;
        }
    }
}
