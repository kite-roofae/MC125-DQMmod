package net.minecraft.src;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.Pet.*;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.DqmModel.*;
import net.minecraft.src.forge.*;


public class mo_DqmPetLoader
{

    public static boolean DisableDragon = false;
    @DqmConfigProp
    public static int DragonId = 169;
    @DqmConfigProp
    public static boolean DisableKirapan = false;
    @DqmConfigProp
    public static int KirapanId = 162;
    @DqmConfigProp
    public static boolean DisableRamia = false;
    @DqmConfigProp
    public static int RamiaId = 163;


    @DqmConfigProp(
            info = "Prevents creeper and bunny explosions from damaging terrain and prevent dragon fire terrain burning"
    )
    public static boolean PreventTerrainDamage = true;
    @DqmConfigProp(
            info = "Set to true if you want to all Ghasts to spawn in your normal world"
    )
    public static boolean GhastSpawnInNormalWorld = false;
    @DqmConfigProp(
            info = "Set to false to disable pony and dragon flying"
    )
    public static boolean FlyingEnabled = true;
    @DqmConfigProp
    public static boolean DisableSaddleRecipe = false;
    @DqmConfigProp(
            info = "All damage the bike gets is transfered to the bike when set to true"
    )
    public static boolean BikeSharesDamageWithRider = false;
    private DqmConfigLoader DqmConfigLoader;
    public static BaseMod modInstance;
    private static DqmPetListener listener;
    HashSet nearby = new HashSet();

    public mo_DqmPetLoader()
    {
        File var1 = new File(ModLoader.getMinecraftInstance().mcDataDir, "config");
        this.DqmConfigLoader = new DqmConfigLoader(this.getClass(), var1, "AnimalBikes");
        this.DqmConfigLoader.loadConfig();
    }

    public void load(BaseMod var1)
    {
        modInstance = var1;

        if (var1 instanceof DqmPetListener)
        {
            listener = (DqmPetListener)var1;
        }


    }


    public void registerBike(Class var1, String var2, int var3)
    {
        ModLoader.registerEntityID(var1, var2, var3);

        if (listener != null)
        {
            listener.registerBike(var1, var2, var3);
        }
    }

    public static boolean isSpacebarPressed()
    {
        return ModLoader.getMinecraftInstance().gameSettings.keyBindJump.pressed;
    }

    public static boolean isShiftbarPressed()
    {
        return ModLoader.getMinecraftInstance().gameSettings.keyBindSneak.pressed;
    }

/*
    public static boolean isMultiplayer(World var0)
    {
        return !var0.isRemote;
    }*/

    public static boolean isJumping(EntityPlayer var0)
    {
        return var0.isJumping;
    }

    public static float getMoveStrafing(EntityPlayer var0)
    {
        return var0.moveStrafing;
    }

    public static float getMoveForward(EntityPlayer var0)
    {
        return var0.moveForward;
    }

    public static boolean isPvpEnabled(EntityPlayer var0)
    {
        return var0.isPVPEnabled();
    }

    public static void setEntityOnFire(Entity var0)
    {/*
        if (isMultiplayer(var0.worldObj))
        {
            var0.dealFireDamage(3);
            var0.setFire(5);
        }*/
    }

    public String getVersion()
    {
        return "DQM 1.2.5";
    }

    public static void sendBikeData(EntityPlayerSP var0, DqmRidableCreature var1)
    {
        if (listener != null)
        {
            listener.sendBikeData(var0, var1);
        }
    }

    public void onTickInGame(float var1, Minecraft var2)
    {
        HashSet var3 = new HashSet();
        EntityPlayerSP var4 = var2.thePlayer;

        if (var4.isClientWorld())
        {
            List var5 = var4.worldObj.getEntitiesWithinAABB(EntityPlayer.class, var4.boundingBox.expand(64.0D, 20.0D, 64.0D));
            Iterator var6 = var5.iterator();

            while (var6.hasNext())
            {
                EntityPlayer var7 = (EntityPlayer)var6.next();

                if (!var4.equals(var7))
                {
                    if (!this.nearby.contains(Integer.valueOf(var7.entityId)) && var7.ridingEntity == null)
                    {
                        listener.updatePlayer(var7);
                    }

                    var3.add(Integer.valueOf(var7.entityId));
                }
            }

            this.nearby = var3;
        }
    }
}
