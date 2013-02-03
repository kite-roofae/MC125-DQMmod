package net.minecraft.src;



//import forge.Configuration;
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
import net.minecraft.src.dqmcore.Mirror.*;
import net.minecraft.src.forge.*;
public class mod_LightHelmet extends BaseMod
{
    private Configuration configuration;
    public static String MOD_NAME = "mod_LightHelmet";
    public static String itemTexture = "/dqm/DqmItems.png";
    public static String armorTexture = "/mod/lighthelmet/armor.png";
    public static int itemID;
    public static Item itemLightHelmet;
    public static int lightRange;
    public static int targetLightValue;
    public static int headLightValue;
    public static int lightInterval;
    public static int tickCount;
    private int prevXTile = 99999;
    private int prevYTile = 99999;
    private int prevZTile = 99999;
    private static Logger logger = null;

    public String getVersion()
    {
        return "0.1.2";
    }

    private void configrationProperties()
    {
        this.configuration = new Configuration(new File(Minecraft.getMinecraftDir(), "config/LightHelmet.cfg"));
        this.configuration.load();
        itemID = Integer.parseInt(this.configuration.getOrCreateIntProperty("LightHelmet", "item", 20002).value);
        lightRange = Integer.parseInt(this.configuration.getOrCreateIntProperty("Range", "config", 20).value);
        targetLightValue = Integer.parseInt(this.configuration.getOrCreateIntProperty("TargetLight", "config", 15).value);
        headLightValue = Integer.parseInt(this.configuration.getOrCreateIntProperty("HeadLight", "config", 8).value);
        lightInterval = Integer.parseInt(this.configuration.getOrCreateIntProperty("LightInterval", "config", 5).value);
        lightRange = lightRange > 40 ? 40 : (lightRange < 0 ? 0 : lightRange);
        targetLightValue = targetLightValue > 15 ? 15 : (targetLightValue < 0 ? 0 : targetLightValue);
        headLightValue = headLightValue > 15 ? 15 : (headLightValue < 0 ? 0 : headLightValue);
        this.configuration.save();
    }

    public void load()
    {
    	MinecraftForgeClient.preloadTexture("/dqm/DqmItems.png");
        this.configrationProperties();
        itemLightHelmet = new ItemLightHelmet(itemID - 256, EnumArmorMaterial.IRON, -1, 0);
        itemLightHelmet.setIconCoord(14, 3);
        itemLightHelmet.setItemName("Light Helmet");
        ModLoader.addName(new ItemStack(itemLightHelmet), "Light Helmet");
		ModLoader.addName(itemLightHelmet, "ja_JP", "ミラーアーマー");
        ModLoader.setInGameHook(this, true, true);
        ModLoader.addRecipe(new ItemStack(itemLightHelmet, 1), new Object[] {"HLG", 'H', Item.helmetSteel, 'L', Item.lightStoneDust, 'G', Block.thinGlass});
        tickCount = 0;
        ModLoader.setInGameHook(this, true, true);
    }

    public boolean onTickInGame(float var1, Minecraft var2)
    {
        ++tickCount;

        if (tickCount >= lightInterval)
        {
            tickCount = 0;
            World var3 = var2.theWorld;
            EntityPlayerSP var4 = var2.thePlayer;
            InventoryPlayer var5 = var4.inventory;
            ItemStack var6 = var5.armorItemInSlot(3);

            if (var6 != null && var6.itemID == itemID)
            {
                ((ItemLightHelmet)itemLightHelmet).lightTarget(var3, var4, lightRange, headLightValue, targetLightValue);
            }
            else
            {
                ((ItemLightHelmet)itemLightHelmet).removeLight(var3, var4);
            }
        }

        return true;
    }

    public static void log(String var0)
    {
        if (logger == null)
        {
            logger = ModLoader.getLogger();
        }

        logger.fine("mod_LightHelmet: \"" + var0 + "\"");
        System.out.println("mod_LightHelmet: " + var0);
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
}
