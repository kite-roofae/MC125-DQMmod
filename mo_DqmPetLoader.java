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
	/*
    @ConfigProp
    public static boolean DisableCow = false;
    @ConfigProp
    public static int CowId = 159;
    @ConfigProp
    public static boolean DisableSpider = false;
    @ConfigProp
    public static int SpiderId = 160;
    @ConfigProp
    public static boolean DisablePig = false;
    @ConfigProp
    public static int PigId = 161;
    @ConfigProp
    public static boolean DisableSheep = false;
    @ConfigProp
    public static int SheepId = 162;
    @ConfigProp
    public static boolean DisableChicken = false;
    @ConfigProp
    public static int ChickenId = 163;
    @ConfigProp
    public static boolean DisableWolf = false;
    @ConfigProp
    public static int WolfId = 164;
    @ConfigProp
    public static boolean DisableSquid = false;
    @ConfigProp
    public static int SquidId = 165;
    @ConfigProp
    public static boolean DisableCreeper = false;
    @ConfigProp
    public static int CreeperId = 166;
    @ConfigProp
    public static boolean DisablePony = false;
    @ConfigProp
    public static int PonyId = 167;
    @ConfigProp
    public static boolean DisableEnder = false;
    @ConfigProp
    public static int EnderId = 168;
    @ConfigProp
    public static boolean DisableDragon = false;
    @ConfigProp
    public static int DragonId = 169;
    @ConfigProp
    public static boolean DisableNotch = false;
    @ConfigProp
    public static int NotchId = 170;
    @ConfigProp
    public static boolean DisableReindeer = false;
    @ConfigProp
    public static int ReindeerId = 171;
    @ConfigProp
    public static boolean DisableSnowgolem = false;
    @ConfigProp
    public static int SnowGollemId = 172;
    @ConfigProp
    public static boolean DisableGhast = false;
    @ConfigProp
    public static int GhastId = 173;
    @ConfigProp
    public static boolean DisableIrongolem = false;
    @ConfigProp
    public static int IronGolemId = 174;
    @ConfigProp
    public static boolean DisableBunny = false;
    @ConfigProp
    public static int BunnyId = 175;
    @ConfigProp
    public static boolean DisableDino = false;
    @ConfigProp
    public static int DinoId = 176;
    @ConfigProp
    public static int Dino2Id = 177;
    @ConfigProp
    public static int Dino3Id = 178;
    @ConfigProp
    public static int Dino4Id = 179;*/
    @ConfigProp
    public static boolean DisableKirapan = false;
    @ConfigProp
    public static int KirapanId = 162;


    @ConfigProp(
            info = "Prevents creeper and bunny explosions from damaging terrain and prevent dragon fire terrain burning"
    )
    public static boolean PreventTerrainDamage = true;
    @ConfigProp(
            info = "Set to true if you want to all Ghasts to spawn in your normal world"
    )
    public static boolean GhastSpawnInNormalWorld = false;
    @ConfigProp(
            info = "Set to false to disable pony and dragon flying"
    )
    public static boolean FlyingEnabled = true;
    @ConfigProp
    public static boolean DisableSaddleRecipe = false;
    @ConfigProp(
            info = "All damage the bike gets is transfered to the bike when set to true"
    )
    public static boolean BikeSharesDamageWithRider = false;
    private ConfigLoader configLoader;
    public static BaseMod modInstance;
    private static DqmPetListener listener;
    HashSet nearby = new HashSet();

    public mo_DqmPetLoader()
    {
        File var1 = new File(ModLoader.getMinecraftInstance().mcDataDir, "config");
        this.configLoader = new ConfigLoader(this.getClass(), var1, "AnimalBikes");
        this.configLoader.loadConfig();
    }

    public void load(BaseMod var1)
    {
        modInstance = var1;

        if (var1 instanceof DqmPetListener)
        {
            listener = (DqmPetListener)var1;
        }

       /* this.loadBunny();
        this.loadChicken();
        this.loadCow();
        this.loadCreeper();
        this.loadDino();
        this.loadDragon();
        this.loadEnder();
        this.loadGhast();
        this.loadIrongolem();
        this.loadNotch();
        this.loadPig();
        this.loadPony();
        this.loadReindeer();
        this.loadSaddle();
        this.loadSheep();
        this.loadSnowgolem();
        this.loadSpider();
        this.loadSquid();
        this.loadWolf();*/
        //this.loadKirapan();
    }
/*
    public void loadSaddle()
    {
        if (!DisableSaddleRecipe)
        {
            Item var1 = (new ItemLeather(26759)).setItemName("leathers");
            ModLoader.addName(var1, "Rawhide");
            ModLoader.addRecipe(new ItemStack(var1, 1), new Object[] {"XXX", "XXX", "XXX", 'X', Item.leather});
            ModLoader.addSmelting(Item.rottenFlesh.shiftedIndex, new ItemStack(Item.leather));
            ModLoader.addRecipe(new ItemStack(Item.saddle, 1), new Object[] {"XXX", " Y ", " Z ", 'X', var1, 'Y', Item.silk, 'Z', Item.ingotIron});
            Item.saddle.maxStackSize = 8;
        }
    }
*/
/*
    public void loadKirapan()
    {
		MinecraftForgeClient.preloadTexture("/dqm/DqmItems.png");
        if (!DisableKirapan)
        {
            this.registerBike(DqmEntityKirapanBike.class, "DqmEntityKirapanBike", KirapanId);
            Item var1 = (new DqmItemKirapanBike(26778)).setItemName("Kirapanbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/sheep.png");
            ModLoader.addName(var1, "Kirapan Bike");
            //ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Block.cloth, 'Z', Item.saddle});
        }
    }*/
/*
    public void loadCow()
    {
        if (!DisableCow)
        {
            this.registerBike(EntityCowBike.class, "EntityCowBike", CowId);
            Item var1 = (new ItemCowBike(26760)).setItemName("cowbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/cow.png");
            ModLoader.addName(var1, "Cow Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.beefRaw, 'Z', Item.saddle});
        }
    }

    public void loadSpider()
    {
        if (!DisableSpider)
        {
            this.registerBike(EntitySpiderBike.class, "EntitySpiderBike", SpiderId);
            Item var1 = (new ItemSpiderBike(26761)).setItemName("spiderbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/spider.png");
            ModLoader.addName(var1, "Spider Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.spiderEye, 'Z', Item.saddle});
        }
    }

    public void loadPig()
    {
        if (!DisablePig)
        {
            this.registerBike(EntityPigBike.class, "EntityPigBike", PigId);
            Item var1 = (new ItemPigBike(26762)).setItemName("pigbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/pig.png");
            ModLoader.addName(var1, "Pig Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.porkRaw, 'Z', Item.saddle});
        }
    }

    public void loadSheep()
    {
        if (!DisableSheep)
        {
            this.registerBike(EntitySheepBike.class, "EntitySheepBike", SheepId);
            Item var1 = (new ItemSheepBike(26763)).setItemName("sheepbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/sheep.png");
            ModLoader.addName(var1, "Sheep Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Block.cloth, 'Z', Item.saddle});
        }
    }



    public void loadChicken()
    {
        if (!DisableChicken)
        {
            this.registerBike(EntityChickenBike.class, "EntityChickenBike", ChickenId);
            Item var1 = (new ItemChickenBike(26764)).setItemName("chickenbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/chicken.png");
            ModLoader.addName(var1, "Chicken Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.chickenRaw, 'Z', Item.saddle});
        }
    }

    public void loadWolf()
    {
        if (!DisableWolf)
        {
            this.registerBike(EntityWolfBike.class, "EntityWolfBike", WolfId);
            Item var1 = (new ItemWolfBike(26765)).setItemName("wolfbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/wolf.png");
            ModLoader.addName(var1, "Wolf Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "YZY", "WWW", 'X', Item.porkCooked, 'Z', Item.saddle, 'Y', Item.bone, 'W', Item.beefCooked});
        }
    }

    public void loadSquid()
    {
        if (!DisableSquid)
        {
            this.registerBike(EntitySquidBike.class, "EntitySquidBike", SquidId);
            Item var1 = (new ItemSquidBike(26766)).setItemName("squidbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/squid.png");
            ModLoader.addName(var1, "Squid Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', new ItemStack(Item.dyePowder, 1, 0), 'Z', Item.saddle});
        }
    }

    public void loadCreeper()
    {
        if (!DisableCreeper)
        {
            this.registerBike(EntityCreeperBike.class, "EntityCreeperBike", CreeperId);
            Item var1 = (new ItemCreeperBike(26767)).setItemName("creeperbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/creeper.png");
            ModLoader.addName(var1, "Creeper Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Block.tnt, 'Z', Item.saddle});
        }
    }

    public void loadPony()
    {
        if (!DisablePony)
        {
            this.registerBike(EntityPonyBike.class, "EntityPonyBike", PonyId);
            Item var1 = (new ItemPonyBike(26768)).setItemName("ponybike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/pony.png");
            ModLoader.addName(var1, "Pony Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.diamond, 'Z', Item.saddle});
        }
    }

    public void loadEnder()
    {
        if (!DisableEnder)
        {
            this.registerBike(EntityEnderBike.class, "EntityEndermanBike", EnderId);
            Item var1 = (new ItemEnderBike(26769)).setItemName("enderbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/ender.png");
            ModLoader.addName(var1, "Ender Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.enderPearl, 'Z', Item.saddle});
        }
    }

    public void loadDragon()
    {
        if (!DisableDragon)
        {
            Item.flintAndSteel = (new ItemFlintAndSteelAlt(3)).setIconCoord(5, 0).setItemName("flintAndSteel");
            this.registerBike(EntityDragonBike.class, "EntityDragonBike", DragonId);
            Item var1 = (new ItemDragonBike(26770)).setItemName("dragonbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/dragon.png");
            ModLoader.addName(var1, "Dragon Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Block.whiteStone, 'Z', Item.saddle});
        }
    }

    public void loadNotch()
    {
        if (!DisableNotch)
        {
            this.registerBike(EntityNotchBike.class, "EntityNotchBike", NotchId);
            Item var1 = (new ItemNotchBike(26771)).setItemName("notchbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/notch.png");
            ModLoader.addName(var1, "Notch Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.appleGold, 'Z', Item.saddle});
        }
    }

    public void loadReindeer()
    {
        if (!DisableReindeer)
        {
            this.registerBike(EntityReindeerBike.class, "EntityReindeerBike", ReindeerId);
            Item var1 = (new ItemReindeerBike(26772)).setItemName("reindeerbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/reindeer.png");
            ModLoader.addName(var1, "Reindeer Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', new ItemStack(Block.sapling, 1, 1), 'Z', Item.saddle});
        }
    }

    public void loadSnowgolem()
    {
        if (!DisableSnowgolem)
        {
            this.registerBike(EntitySnowgolemBike.class, "EntitySnowmanBike", SnowGollemId);
            Item var1 = (new ItemSnowgolemBike(26773)).setItemName("snowgolembike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/snow.png");
            ModLoader.addName(var1, "Snowgolem Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Block.blockSnow, 'Z', Item.saddle});
        }
    }

    public void loadGhast()
    {
        if (!DisableGhast)
        {
            this.registerBike(EntityGhastBike.class, "EntityGhastBike", GhastId);
            Item var1 = (new ItemGhastBike(26774)).setItemName("ghastbike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/ghast.png");
            ModLoader.addName(var1, "Ghast Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.ghastTear, 'Z', Item.saddle});
        }
    }

    public void loadIrongolem()
    {
        if (!DisableIrongolem)
        {
            this.registerBike(EntityIrongolemBike.class, "EntityIronmanBike", IronGolemId);
            Item var1 = (new ItemIrongolemBike(26775)).setItemName("irongolembike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/irongolem.png");
            ModLoader.addName(var1, "Irongolem Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"WXY", "XZX", "WXW", 'X', Block.blockSteel, 'Z', Item.saddle, 'Y', Block.plantRed, 'W', Block.vine});
        }
    }

    public void loadBunny()
    {
        if (!DisableBunny)
        {
            this.registerBike(EntityBunnyBike.class, "EntityBunnyBike", BunnyId);
            Item var1 = (new ItemBunnyBike(26776)).setItemName("itembunnybike");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/bunny.png");
            ModLoader.addName(new ItemStack(var1), "Bunny Bike");
            ModLoader.addRecipe(new ItemStack(var1), new Object[] {"XXX", "XZX", "XXX", 'X', Item.egg, 'Z', Item.saddle});
        }
    }

    public void loadDino()
    {
        if (!DisableDino)
        {
            this.registerBike(EntityDinoBike.class, "EntityDinoBike", DinoId);
            this.registerBike(EntityDinoBike2.class, "EntityDinoBike2", Dino2Id);
            this.registerBike(EntityDinoBike3.class, "EntityDinoBike3", Dino3Id);
            this.registerBike(EntityDinoBike4.class, "EntityDinoBike4", Dino4Id);
            Item var1 = (new ItemFossil(26758)).setItemName("itemfossil");
            var1.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/fossil.png");
            ModLoader.addName(new ItemStack(var1), "Fossil");
            ModLoader.addShapelessRecipe(new ItemStack(var1), new Object[] {Item.coal, Item.bone});
            Item var2 = (new ItemDinoBike(26777)).setItemName("itemdinobike");
            var2.iconIndex = ModLoader.addOverride("/gui/items.png", "/mob/animalbikes/dino.png");
            ModLoader.addName(new ItemStack(var2), "Dino Bike");
            ModLoader.addRecipe(new ItemStack(var2), new Object[] {"XXX", "XZX", "XXX", 'X', var1, 'Z', Item.saddle});
        }
    }
*/

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

    public void addRenderer(Map var1)
    {
    	/*
        var1.put(EntitySheepBike.class, new RenderSheepBike(new ModelSheepBike2(), new ModelSheepBike1(), 0.7F));
        var1.put(EntityPigBike.class, new RenderPigBike(new ModelPig(), new ModelPig(0.5F), 0.7F));
        var1.put(EntityCowBike.class, new RenderCowBike(new ModelCow(), 0.7F));
        var1.put(EntitySpiderBike.class, new RenderSpiderBike());
        var1.put(EntityChickenBike.class, new RenderChickenBike(new ModelChicken(), 0.7F));
        var1.put(EntityWolfBike.class, new RenderWolfBike(new ModelWolfBike(), 0.5F));
        var1.put(EntitySquidBike.class, new RenderSquidBike(new ModelSquid(), 0.7F));
        var1.put(EntityPonyBike.class, new RenderPonyBike(new ModelPony(), 0.9F));
        var1.put(EntityCreeperBike.class, new RenderCreeperBike(0.7F));
        var1.put(EntityEnderBike.class, new RenderEndermanBike(0.5F));
        var1.put(EntityDragonBike.class, new RenderDragonBike());
        var1.put(EntityDinoBike.class, new RenderDinoBike(new ModelDino()));
        var1.put(EntityDinoBike2.class, new RenderDinoBike2(new ModelDino2()));
        var1.put(EntityDinoBike3.class, new RenderDinoBike3(new ModelDino3()));
        var1.put(EntityDinoBike4.class, new RenderDinoBike4(new ModelDino4()));
        var1.put(EntityNotchBike.class, new RenderNotchBike(new ModelNotch()));
        var1.put(EntityReindeerBike.class, new RenderReindeerBike());
        var1.put(EntitySnowgolemBike.class, new RenderSnowmanBike());
        var1.put(EntityGhastBike.class, new RenderGhastBike());
        var1.put(EntityIrongolemBike.class, new RenderIronmanBike());
        var1.put(EntityBunnyBike.class, new RenderAnimalBike(new ModelBunny(), 0.5F));*/

        var1.put(DqmEntityKirapanBike.class, new DqmRenderKirapanBike(new DqmModelKirapanBike()));
    }

    public static boolean isMultiplayer(World var0)
    {
        return !var0.isRemote;
    }

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
    {
        if (isMultiplayer(var0.worldObj))
        {
            var0.dealFireDamage(3);
            var0.setFire(5);
        }
    }

    public String getVersion()
    {
        return "DQM 1.2.5";
    }

    public static void sendBikeData(EntityPlayerSP var0, RidableCreature var1)
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
