package net.minecraft.src;

import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.DqmRender;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.dqmcore.DqmModel.*;
import net.minecraft.src.dqmcore.Pet.DqmModelRamiaBike;

public class mod_DqmAddMobList extends BaseMod // implements IMinecraftRegistry
{
	@Override
	public String getVersion() {
		return "MC1.2.5 DQMmob v12.4";
	}
	// @MLProp(info = "Pet Bakudaniwa Max Limit")
	// public static int Bakudaniwa = 4;
	// @MLProp(info = "Pet Dorakima Max Limit")
	// public static int Dorakima = 4;
	// @MLProp(info = "Pet Dqmdragon Max Limit")
	// public static int Dqmdragon = 4;
	// @MLProp(info = "Pet Gaikotukensi Max Limit")
	// public static int Gaikotukensi = 4;
	// @MLProp(info = "Pet Ghost Max Limit")
	// public static int Ghost = 4;
	// @MLProp(info = "Pet Gigantesu Max Limit")
	// public static int Gigantesu = 4;
	// @MLProp(info = "Pet Goremu Max Limit")
	// public static int Goremu = 4;
	// @MLProp(info = "Pet Hagumeta Max Limit")
	// public static int Hagumeta = 4;
	// @MLProp(info = "Pet Hitokuibako Max Limit")
	// public static int Hitokuibako = 4;
	// @MLProp(info = "Pet Ikkakuusagi Max Limit")
	// public static int Ikkakuusagi = 4;
	// @MLProp(info = "Pet Kimera Max Limit")
	// public static int Kimera = 4;
	// @MLProp(info = "Pet Kingsura Max Limit")
	// public static int Kingsura = 4;
	// @MLProp(info = "Pet Kiramasin Max Limit")
	// public static int Kiramasin = 4;
	// @MLProp(info = "Pet Kirapan Max Limit")
	// public static int Kirapan = 4;
	// @MLProp(info = "Pet Kirikabuobake Max Limit")
	// public static int Kirikabuobake = 4;
	// @MLProp(info = "Pet Kuinsuraimu Max Limit")
	// public static int Kuinsuraimu = 4;
	// @MLProp(info = "Pet LittleEsterk Max Limit")
	// public static int LittleEsterk = 4;
	// @MLProp(info = "Pet Metoroghost Max Limit")
	// public static int Metoroghost = 4;
	// @MLProp(info = "Pet Suraim Max Limit")
	// public static int Sura = 4;
	// @MLProp(info = "Pet Suraimutawa Max Limit")
	// public static int Suraimutawa = 4;
	// @MLProp(info = "Pet Syado Max Limit")
	// public static int Syado = 4;

	@MLProp(info = "Mob Tipe monster Max Limit")
	public static int monster = 80;
	@MLProp(info = "Mob Tipe creature Max Limit")
	public static int creature = 20;
	@MLProp(info = "Mob Tipe waterCreature Max Limit")
	public static int waterCreature = 15;

	private static ModLoader ML;
	private static mo_DqmSpawner cs;
	private static EnumCreatureType Type;
	public static Minecraft mc = ML.getMinecraftInstance();

	@Override
	public void load() {
		//(beach),(desert),(desertHills),(extremeHills),(extremeHillsEdge),(forest),(forestHills),
		//(frozenOcean),(frozenRiver),(hell),(iceMountains),(icePlains),(jungle),(jungleHills),(mushroomIsland),
		//(mushroomIslandShore),(ocean),(plains),(river),(sky),(swampland),(taiga),(taigaHills),

		//現世界のみ
		BiomeGenBase[] desert = { BiomeGenBase.desert,BiomeGenBase.desertHills,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] extremeHills = { BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] forest = { BiomeGenBase.forest,BiomeGenBase.forestHills,BiomeGenBase.frozenRiver,BiomeGenBase.beach };
		BiomeGenBase[] hell = { BiomeGenBase.hell,BiomeGenBase.extremeHills,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] iceMountains = { BiomeGenBase.iceMountains,BiomeGenBase.icePlains,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] jungle = { BiomeGenBase.jungle,BiomeGenBase.jungleHills,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] plains = { BiomeGenBase.plains,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] swampland = { BiomeGenBase.swampland,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] taiga = { BiomeGenBase.taiga,BiomeGenBase.taigaHills,BiomeGenBase.river,BiomeGenBase.beach };

		//現世界と地獄
		BiomeGenBase[] desert2 = { BiomeGenBase.desert,BiomeGenBase.desertHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] extremeHills2 = { BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] forest2 = { BiomeGenBase.forest,BiomeGenBase.forestHills,BiomeGenBase.frozenRiver,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] hell2 = { BiomeGenBase.hell,BiomeGenBase.extremeHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] iceMountains2 = { BiomeGenBase.iceMountains,BiomeGenBase.icePlains,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] jungle2 = { BiomeGenBase.jungle,BiomeGenBase.jungleHills,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] plains2 = { BiomeGenBase.plains,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] swampland2 = { BiomeGenBase.swampland,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };
		BiomeGenBase[] taiga2 = { BiomeGenBase.taiga,BiomeGenBase.taigaHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.hell };

		//現世界とエンド
		BiomeGenBase[] desert3 = { BiomeGenBase.desert,BiomeGenBase.desertHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] extremeHills3 = { BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] forest3 = { BiomeGenBase.forest,BiomeGenBase.forestHills,BiomeGenBase.frozenRiver,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] sky3 = { BiomeGenBase.sky,BiomeGenBase.extremeHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] iceMountains3 = { BiomeGenBase.iceMountains,BiomeGenBase.icePlains,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] jungle3 = { BiomeGenBase.jungle,BiomeGenBase.jungleHills,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] plains3 = { BiomeGenBase.plains,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] swampland3 = { BiomeGenBase.swampland,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };
		BiomeGenBase[] taiga3 = { BiomeGenBase.taiga,BiomeGenBase.taigaHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.sky };

		//現世界とキノコ
		BiomeGenBase[] desert4 = { BiomeGenBase.desert,BiomeGenBase.desertHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] extremeHills4 = { BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] forest4 = { BiomeGenBase.forest,BiomeGenBase.forestHills,BiomeGenBase.frozenRiver,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] iceMountains4 = { BiomeGenBase.iceMountains,BiomeGenBase.icePlains,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] jungle4 = { BiomeGenBase.jungle,BiomeGenBase.jungleHills,BiomeGenBase.river,BiomeGenBase.beach };
		BiomeGenBase[] mushroomIsland4 = { BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] plains4 = { BiomeGenBase.plains,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] swampland4 = { BiomeGenBase.swampland,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };
		BiomeGenBase[] taiga4 = { BiomeGenBase.taiga,BiomeGenBase.taigaHills,BiomeGenBase.river,BiomeGenBase.beach, BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore };

		//ボス系
		BiomeGenBase[] Esterk = { BiomeGenBase.desert,BiomeGenBase.hell };
		BiomeGenBase[] Zoma = { BiomeGenBase.iceMountains,BiomeGenBase.icePlains,BiomeGenBase.hell };
		BiomeGenBase[] DarkRamia = { BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,BiomeGenBase.hell,BiomeGenBase.sky};

		cs = new mo_DqmSpawner(); // spawnerインスタンスを初期化します
		cs.setMaxMobs(monster); // カスタムモブの最大数を設定します
		cs.setMaxAnimals(creature); // カスタム動物モブの最大数を設定します
		cs.setMaxAquatic(waterCreature); // カスタム水生モブの最大数を設定します
		ML.setInGameHook(this, true, false); // セットOnTickInGameを使用するためのフック

		// IMinecraftRegistry.registerEntityID(Class <? extends Entity >
		// entityClass, String entityName, int id, int backgroundEggColour, int
		// foregroundEggColour);

		// IMinecraftRegistry.registerEntityID(DqmEntitySura.class, "Dqm.Sura",
		// 130, 2003199, 8388564);}
		// DqmAPI.registerEntity(DqmEntitySura.class, "Dqm.Sura", 2003199,
		// 8388564);}
		/*
		,desert 	砂漠
,extremeHills	extremeHills
,forest	森
,hell	地獄
,iceMountains	iceMountains
,jungle	ジャングル
,mushroomIsland	mushroomIsland
,plains	平野
,swampland	沼沢
,taiga	タイガ*/
		// Monster
		// spawn************************************************************************************************************************************************************
		cs.addCustomSpawn(DqmEntityArumiraji.class, 4, 1, 1, Type.monster,iceMountains);
		cs.addCustomSpawn(DqmEntityAtorasu.class, 5, 1, 1, Type.monster,swampland2);
		cs.addCustomSpawn(DqmEntityAyasiikage.class, 4, 1, 1, Type.monster,plains3);
		cs.addCustomSpawn(DqmEntityBakudaniwa.class, 5, 1, 2, Type.monster,swampland2);
		cs.addCustomSpawn(DqmEntityBatorurex.class, 3, 1, 1, Type.monster,swampland2);
		cs.addCustomSpawn(DqmEntityBehoimisuraimu.class, 3, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityBehoimusuraimu.class, 3, 1, 1, Type.monster,iceMountains);
		cs.addCustomSpawn(DqmEntityBigCrow.class, 5, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityBubsura.class, 5, 1, 3, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityBuraddihando.class, 4, 1, 1, Type.monster,taiga2);
		cs.addCustomSpawn(DqmEntityDasudragon.class, 3, 1, 1, Type.monster,iceMountains2);
		cs.addCustomSpawn(DqmEntityDesufuratta.class, 20, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityDoraki.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDorakima.class, 4, 1, 1, Type.monster,forest2);
		cs.addCustomSpawn(DqmEntityDqmdragon.class, 3, 1, 1, Type.monster,extremeHills);
		cs.addCustomSpawn(DqmEntityFurosutogizumo.class, 4, 1, 1, Type.monster,taiga);
		cs.addCustomSpawn(DqmEntityGaikotukensi.class, 3, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityGamegon.class, 3, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityGamegonload.class, 3, 1, 1, Type.monster,swampland2);
		cs.addCustomSpawn(DqmEntityGamegonrejendo.class, 2, 1, 1, Type.monster,jungle2);
		cs.addCustomSpawn(DqmEntityGhost.class, 5, 1, 1, Type.monster,desert);
		cs.addCustomSpawn(DqmEntityGigantesu.class, 2, 1, 1, Type.monster,iceMountains3);
		cs.addCustomSpawn(DqmEntityGizumo.class, 5, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityGoldman.class, 2, 1, 1, Type.monster,swampland3);
		cs.addCustomSpawn(DqmEntityGoremu.class, 2, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityGorudensuraimu.class, 3, 1, 1, Type.monster,jungle2);
		cs.addCustomSpawn(DqmEntityGorudentotemu.class, 3, 1, 1, Type.monster,jungle2);
		cs.addCustomSpawn(DqmEntityHagumeta.class, 1, 1, 1, Type.monster,desert4);
		cs.addCustomSpawn(DqmEntityHerughost.class, 15, 1, 1, Type.monster,taiga);
		cs.addCustomSpawn(DqmEntityHiitogizumo.class, 4, 1, 1, Type.monster,extremeHills2);
		cs.addCustomSpawn(DqmEntityHitokuibako.class, 4, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityHoimisura.class, 10, 1, 5,Type.waterCreature);
		cs.addCustomSpawn(DqmEntityHoroghost.class, 4, 1, 1, Type.monster,jungle2);
		cs.addCustomSpawn(DqmEntityIkkakuusagi.class, 3, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityKagenokisi.class, 3, 1, 1, Type.monster,jungle3);
		cs.addCustomSpawn(DqmEntityKimera.class, 3, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityKingsura.class, 4, 1, 1, Type.monster,desert);
		cs.addCustomSpawn(DqmEntityKiramasin.class, 4, 1, 1, Type.monster,iceMountains2);
		cs.addCustomSpawn(DqmEntityKirapan.class, 4, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityKirikabuobake.class, 4, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntityKisudragon.class, 3, 1, 1, Type.monster,swampland3);
		cs.addCustomSpawn(DqmEntityKuinsuraimu.class, 10, 1, 1, Type.monster,jungle);
		cs.addCustomSpawn(DqmEntityMadohando.class, 4, 1, 1, Type.monster,swampland);
		cs.addCustomSpawn(DqmEntityMaounokage.class, 15, 1, 1, Type.monster,extremeHills3);
		cs.addCustomSpawn(DqmEntityMarinsuraimu.class, 4, 1, 1, Type.monster,iceMountains);
		cs.addCustomSpawn(DqmEntityMegazarurokku.class, 3, 1, 1, Type.monster,extremeHills);
		cs.addCustomSpawn(DqmEntityMeijikimera.class, 3, 1, 1, Type.monster,swampland2);
		cs.addCustomSpawn(DqmEntityMeragosuto.class, 3, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntityMetaking.class, 2, 1, 1, Type.monster,jungle4);
		cs.addCustomSpawn(DqmEntityMetaruburazazu.class, 2, 1, 1, Type.monster,iceMountains4);
		cs.addCustomSpawn(DqmEntityMetaruhanta.class, 2, 1, 1, Type.monster,swampland4);
		cs.addCustomSpawn(DqmEntityMetaruhantaken.class, 3, 1, 1, Type.monster,swampland4);
		cs.addCustomSpawn(DqmEntityMetaruraida.class, 4, 1, 1, Type.monster,desert4);
		cs.addCustomSpawn(DqmEntityMetasura.class, 3, 1, 2, Type.monster,plains4);
		cs.addCustomSpawn(DqmEntityMetoroghost.class, 4, 1, 1, Type.monster,desert);
		cs.addCustomSpawn(DqmEntityMimikku.class, 4, 1, 1, Type.monster,iceMountains);
		cs.addCustomSpawn(DqmEntityPandorabox.class, 6, 1, 1, Type.monster,extremeHills2);
		cs.addCustomSpawn(DqmEntityPuratinaking.class, 1, 1, 1, Type.monster,jungle4);
		cs.addCustomSpawn(DqmEntityRiripat.class, 5, 1, 2, Type.monster,forest);
		cs.addCustomSpawn(DqmEntitySamayoutamasii.class, 3, 1, 1, Type.monster,iceMountains2);
		cs.addCustomSpawn(DqmEntitySibirekurage.class, 3, 1, 1, Type.monster,taiga);
		cs.addCustomSpawn(DqmEntitySiryounokisi.class, 3, 1, 1, Type.monster,iceMountains2);
		cs.addCustomSpawn(DqmEntityStarkimera.class, 3, 1, 1, Type.monster,desert3);
		cs.addCustomSpawn(DqmEntityStonman.class, 3, 1, 1, Type.monster,desert);
		cs.addCustomSpawn(DqmEntitySumairurokku.class, 3, 1, 1, Type.monster,swampland);
		cs.addCustomSpawn(DqmEntitySura.class, 10, 1, 6, Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimubehomazun.class, 3, 1, 1,Type.monster,extremeHills2);
		cs.addCustomSpawn(DqmEntitySuraimubesu.class, 7, 1, 1, Type.monster,plains2);
		cs.addCustomSpawn(DqmEntitySuraimumadyura.class, 2, 1, 1, Type.monster,extremeHills2);
		cs.addCustomSpawn(DqmEntitySuraimunaito.class, 5, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntitySuraimutawa.class, 4, 1, 1, Type.monster,forest);
		cs.addCustomSpawn(DqmEntitySuraimutumuri.class, 4, 1, 1, Type.monster,plains);
		cs.addCustomSpawn(DqmEntitySyado.class, 4, 1, 1, Type.monster,desert);
		cs.addCustomSpawn(DqmEntityTahodoraki.class, 20, 1, 1, Type.monster,swampland);
		cs.addCustomSpawn(DqmEntityWaraibukuro.class, 3, 1, 1, Type.monster,extremeHills);

		//ボス系
		cs.addCustomSpawn(DqmEntityZoma.class, 1, 1, 1, Type.monster,Zoma);
		cs.addCustomSpawn(DqmEntityDarkRamia.class, 1, 1, 1, Type.monster,DarkRamia);
		cs.addCustomSpawn(DqmEntityEsterk.class, 1, 1, 1, Type.monster,Esterk);

		//ペット
		cs.addCustomSpawn(DqmpetEntityBakudaniwa.class, 3, 1, 1, Type.creature,swampland);
		cs.addCustomSpawn(DqmpetEntityDorakima.class, 3, 1, 1, Type.creature,forest);
		cs.addCustomSpawn(DqmpetEntityDqmdragon.class, 3, 1, 1, Type.creature,extremeHills);
		cs.addCustomSpawn(DqmpetEntityGaikotukensi.class, 3, 1, 1,Type.creature,plains);
		cs.addCustomSpawn(DqmpetEntityGhost.class, 3, 1, 1, Type.creature,desert);
		cs.addCustomSpawn(DqmpetEntityGigantesu.class, 3, 1, 1, Type.creature,iceMountains);
		cs.addCustomSpawn(DqmpetEntityGoremu.class, 3, 1, 1, Type.creature,plains);
		cs.addCustomSpawn(DqmpetEntityHagumeta.class, 3, 1, 1, Type.creature,desert);
		cs.addCustomSpawn(DqmpetEntityHitokuibako.class, 3, 1, 1, Type.creature,plains);
		cs.addCustomSpawn(DqmpetEntityIkkakuusagi.class, 3, 1, 1, Type.creature,forest);
		cs.addCustomSpawn(DqmpetEntityKimera.class, 3, 1, 1, Type.creature,plains);
		cs.addCustomSpawn(DqmpetEntityKingsura.class, 3, 1, 1, Type.creature,desert);
		cs.addCustomSpawn(DqmpetEntityKiramasin.class, 3, 1, 1, Type.creature,iceMountains);
		cs.addCustomSpawn(DqmpetEntityKirapan.class, 3, 1, 1, Type.creature,plains);
		cs.addCustomSpawn(DqmpetEntityKirikabuobake.class, 3, 1, 1,Type.creature,forest);
		cs.addCustomSpawn(DqmpetEntityKuinsuraimu.class, 3, 1, 1,Type.creature,jungle);
		cs.addCustomSpawn(DqmpetEntityMetoroghost.class, 3, 1, 1, Type.creature,desert);
		cs.addCustomSpawn(DqmpetEntitySura.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntitySuraimunaito.class, 3, 1, 1, Type.creature,plains);
		cs.addCustomSpawn(DqmpetEntitySuraimutawa.class, 3, 1, 1, Type.creature,forest);
		cs.addCustomSpawn(DqmpetEntitySyado.class, 3, 1, 1, Type.creature,desert);

/*バイオーム設定無し
		cs.addCustomSpawn(DqmEntityArumiraji.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityAtorasu.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityAyasiikage.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityBakudaniwa.class, 5, 1, 2, Type.monster);
		cs.addCustomSpawn(DqmEntityBatorurex.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityBehoimisuraimu.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityBehoimusuraimu.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityBigCrow.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityBubsura.class, 5, 1, 3, Type.monster);
		cs.addCustomSpawn(DqmEntityBuraddihando.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDarkRamia.class, 1, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDasudragon.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDesufuratta.class, 20, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDoraki.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDorakima.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityDqmdragon.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityEsterk.class, 1, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityFurosutogizumo.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGaikotukensi.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGamegon.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGamegonload.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGamegonrejendo.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGhost.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGigantesu.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGizumo.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGoldman.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGoremu.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGorudensuraimu.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityGorudentotemu.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityHagumeta.class, 1, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityHerughost.class, 15, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityHiitogizumo.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityHitokuibako.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityHoimisura.class, 10, 1, 5,Type.waterCreature);
		cs.addCustomSpawn(DqmEntityHoroghost.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityIkkakuusagi.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKagenokisi.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKimera.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKingsura.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKiramasin.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKirapan.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKirikabuobake.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKisudragon.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityKuinsuraimu.class, 10, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMadohando.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMaounokage.class, 15, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMarinsuraimu.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMegazarurokku.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMeijikimera.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMeragosuto.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMetaking.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMetaruburazazu.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMetaruhanta.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMetaruhantaken.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMetaruraida.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMetasura.class, 3, 1, 2, Type.monster);
		cs.addCustomSpawn(DqmEntityMetoroghost.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityMimikku.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityPandorabox.class, 6, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityPuratinaking.class, 1, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityRiripat.class, 5, 1, 2, Type.monster);
		cs.addCustomSpawn(DqmEntitySamayoutamasii.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySibirekurage.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySiryounokisi.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityStarkimera.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityStonman.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySumairurokku.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySura.class, 10, 1, 6, Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimubehomazun.class, 3, 1, 1,Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimubesu.class, 7, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimumadyura.class, 2, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimunaito.class, 5, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimutawa.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySuraimutumuri.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntitySyado.class, 4, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityTahodoraki.class, 20, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityWaraibukuro.class, 3, 1, 1, Type.monster);
		cs.addCustomSpawn(DqmEntityZoma.class, 1, 1, 1, Type.monster);

		//ペット
		cs.addCustomSpawn(DqmpetEntityKirikabuobake.class, 3, 1, 1,Type.creature);
		cs.addCustomSpawn(DqmpetEntityBakudaniwa.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityDorakima.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityDqmdragon.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityGaikotukensi.class, 3, 1, 1,Type.creature);
		cs.addCustomSpawn(DqmpetEntityGhost.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityGigantesu.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityGoremu.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityHagumeta.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityHitokuibako.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityIkkakuusagi.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityKimera.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityKingsura.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityKiramasin.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityKirapan.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntityKuinsuraimu.class, 3, 1, 1,Type.creature);
		cs.addCustomSpawn(DqmpetEntityLittleEsterk.class, 0, 0, 0,Type.creature);
		cs.addCustomSpawn(DqmpetEntityMetoroghost.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntitySura.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntitySuraimutawa.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntitySyado.class, 3, 1, 1, Type.creature);
		cs.addCustomSpawn(DqmpetEntitySuraimunaito.class, 3, 1, 1, Type.creature);
*/



		ML.registerEntityID(DqmEntityArumiraji.class, "Arumiraji",ML.getUniqueEntityId(),16167425,16167425);
		ML.registerEntityID(DqmEntityAtorasu.class, "Atorasu",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmEntityAyasiikage.class, "Ayasiikage",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityBakudaniwa.class, "Bakudaniwa",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityBigCrow.class, "BigCrow",ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmEntityBubsura.class, "Bubsura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityBuraddihando.class, "Buraddihando",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityDesufuratta.class, "Desufuratta",ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmEntityDoraki.class, "Doraki",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmEntityDorakima.class, "Dorakima",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmEntityDqmdragon.class, "Dqmdragon",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmEntityEsterk.class, "Esterk",ML.getUniqueEntityId(),16382457,16382457);
		ML.registerEntityID(DqmEntityFurosutogizumo.class,"Furosutogizumo", ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityGaikotukensi.class, "Gaikotukensi",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntityGhost.class, "Ghost",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntityGigantesu.class, "Gigantesu",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmEntityGizumo.class, "Gizumo",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityGoremu.class, "Goremu",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityHagumeta.class, "Hagumeta",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityHerughost.class, "Herughost",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntityHiitogizumo.class, "Hiitogizumo",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityHitokuibako.class, "Hitokuibako",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityHoimisura.class, "Hoimisura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityHoroghost.class, "Horoghost",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityIkkakuusagi.class, "Ikkakuusagi",ML.getUniqueEntityId(),16167425,16167425);
		ML.registerEntityID(DqmEntityKimera.class, "Kimera",ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmEntityKingsura.class, "Kingsura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityKiramasin.class, "Kiramasin",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityKirapan.class, "Kirapan",ML.getUniqueEntityId(),16167425,16167425);
		ML.registerEntityID(DqmEntityKirikabuobake.class,"Kirikabuobake", ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmEntityKuinsuraimu.class, "Kuinsuraimu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityMadohando.class, "Madohando",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityMaounokage.class, "Maounokage",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityMetaking.class, "Metaking",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityMetaruhanta.class, "Metaruhanta",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityMetaruhantaken.class,"Metaruhantaken", ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityMetasura.class, "Metasura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityMetoroghost.class, "Metoroghost",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntityMimikku.class, "Mimikku",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityPandorabox.class, "Pandorabox",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityRiripat.class, "Riripat",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmEntitySura.class, "Sura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySuraimubehomazun.class,"Suraimubehomazun", ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySuraimubesu.class, "Suraimubesu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySuraimutawa.class, "Suraimutawa",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySyado.class, "Syado",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityTahodoraki.class, "Tahodoraki",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmEntityWaraibukuro.class, "Waraibukuro",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityZoma.class,"Zoma", ML.getUniqueEntityId(),16382457,16382457);
		ML.registerEntityID(DqmEntityDarkRamia.class,"DarkRamia", ML.getUniqueEntityId(),16382457,16382457);


		ML.registerEntityID(DqmEntitySuraimunaito.class, "Suraimunaito",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityMetaruraida.class, "Metaruraida",ML.getUniqueEntityId(),4349438,4349438);

		ML.registerEntityID(DqmEntityBehoimisuraimu.class, "Behoimisuraimu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityBehoimusuraimu.class, "Behoimusuraimu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityGorudensuraimu.class, "Gorudensuraimu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityGorudentotemu.class, "Gorudentotemu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySuraimumadyura.class, "Suraimumadyura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityPuratinaking.class, "Puratinaking",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySibirekurage.class, "Sibirekurage",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityMetaruburazazu.class, "Metaruburazazu",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntitySuraimutumuri.class, "Suraimutumuri",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmEntityMarinsuraimu.class, "Marinsuraimu",ML.getUniqueEntityId(),4349438,4349438);

		ML.registerEntityID(DqmEntityMeijikimera.class, "Meijikimera",ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmEntityStarkimera.class, "Starkimera",ML.getUniqueEntityId(),2349438,2349438);

		ML.registerEntityID(DqmEntityKagenokisi.class, "Kagenokisi",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntitySiryounokisi.class, "Siryounokisi",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntitySamayoutamasii.class, "Samayoutamasii",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmEntityMeragosuto.class, "Meragosuto",ML.getUniqueEntityId(),11013646,11013646);

		ML.registerEntityID(DqmEntityDasudragon.class, "Dasudragon",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmEntityKisudragon.class, "Kisudragon",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmEntityGamegon.class, "Gamegon",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmEntityGamegonload.class, "Gamegonload",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmEntityGamegonrejendo.class, "Gamegonrejendo",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmEntityBatorurex.class, "Batorurex",ML.getUniqueEntityId(),894731,894731);

		ML.registerEntityID(DqmEntityGoldman.class, "Goldman",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityMegazarurokku.class, "Megazarurokku",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntityStonman.class, "Stonman",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmEntitySumairurokku.class, "Sumairurokku",ML.getUniqueEntityId(),16579584,16579584);


		// Pet No
		// biom************************************************************************************************************************************************************
		ML.registerEntityID(DqmpetEntityBakudaniwa.class,"PetBakudaniwa", ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmpetEntityDorakima.class, "PetDorakima",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmpetEntityDqmdragon.class, "PetDqmdragon",ML.getUniqueEntityId(),894731,894731);
		ML.registerEntityID(DqmpetEntityGaikotukensi.class,"PetGaikotukensi", ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmpetEntityGhost.class, "PetGhost",ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmpetEntityGigantesu.class, "PetGigantesu",ML.getUniqueEntityId(),12720061,12720061);
		ML.registerEntityID(DqmpetEntityGoremu.class, "PetGoremu",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmpetEntityHagumeta.class, "PetHagumeta",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmpetEntityHitokuibako.class,"PetHitokuibako", ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmpetEntityIkkakuusagi.class,"PetIkkakuusagi", ML.getUniqueEntityId(),16167425,16167425);
		ML.registerEntityID(DqmpetEntityKimera.class, "PetKimera",ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmpetEntityKingsura.class, "PetKingsura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmpetEntityKiramasin.class, "PetKiramasin",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmpetEntityKirapan.class, "PetKirapan",ML.getUniqueEntityId(),16167425,16167425);
		ML.registerEntityID(DqmpetEntityKirikabuobake.class,"PetKirikabuobake", ML.getUniqueEntityId(),2349438,2349438);
		ML.registerEntityID(DqmpetEntityKuinsuraimu.class,"PetKuinsuraimu", ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmpetEntityLittleEsterk.class,"PetLittleEsterk", ML.getUniqueEntityId(),16382457,16382457);
		ML.registerEntityID(DqmpetEntityMetoroghost.class,"PetMetoroghost", ML.getUniqueEntityId(),11013646,11013646);
		ML.registerEntityID(DqmpetEntitySura.class, "PetSura",ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmpetEntitySuraimutawa.class,"PetSuraimutawa", ML.getUniqueEntityId(),4349438,4349438);
		ML.registerEntityID(DqmpetEntitySyado.class, "PetSyado",ML.getUniqueEntityId(),16579584,16579584);
		ML.registerEntityID(DqmpetEntitySuraimunaito.class, "PetSuraimunaito",ML.getUniqueEntityId(),4349438,4349438);

	}

	@Override
	public void addRenderer(Map renderers) {
		renderers.put(DqmEntityArumiraji.class, new DqmRender(new DqmModelIkkakuusagi(), 0.5f));
		renderers.put(DqmEntityAtorasu.class, new DqmRender(new DqmModelAtorasu(), 0.5f));
		renderers.put(DqmEntityAyasiikage.class, new DqmRender(new DqmModelAyasiikage(), 0.5f));
		renderers.put(DqmEntityBakudaniwa.class, new DqmRender(new DqmModelBakudaniwa(), 0.5f));
		renderers.put(DqmEntityBigCrow.class, new DqmRender(new DqmModelBigCrow(), 0.5f));
		renderers.put(DqmEntityBubsura.class, new DqmRender(new DqmModelBubsura(), 0.5f));
		renderers.put(DqmEntityBuraddihando.class, new DqmRender(new DqmModelMadohando(), 0.5f));
		renderers.put(DqmEntityDesufuratta.class, new DqmRender(new DqmModelBigCrow(), 0.5f));
		renderers.put(DqmEntityDoraki.class, new DqmRender(new DqmModelDoraki(), 0.5f));
		renderers.put(DqmEntityDorakima.class, new DqmRender(new DqmModelDoraki(), 0.5f));
		renderers.put(DqmEntityDqmdragon.class, new DqmRender(new DqmModelDqmdragon(), 0.5f));
		renderers.put(DqmEntityEsterk.class, new DqmRender(new DqmModelEsterk(), 0.5f));
		renderers.put(DqmEntityFurosutogizumo.class, new DqmRender(new DqmModelGizumo(), 0.5f));
		renderers.put(DqmEntityGaikotukensi.class, new DqmRender(new DqmModelGaikotukensi(), 0.5f));
		renderers.put(DqmEntityGhost.class, new DqmRender(new DqmModelGhost(),0.5f));
		renderers.put(DqmEntityGigantesu.class, new DqmRender(new DqmModelAtorasu(), 0.5f));
		renderers.put(DqmEntityGizumo.class, new DqmRender(new DqmModelGizumo(), 0.5f));
		renderers.put(DqmEntityGoremu.class, new DqmRender(new DqmModelGoremu(), 0.5f));
		renderers.put(DqmEntityHagumeta.class, new DqmRender(new DqmModelBubsura(), 0.5f));
		renderers.put(DqmEntityHerughost.class, new DqmRender(new DqmModelGhost(), 0.5f));
		renderers.put(DqmEntityHiitogizumo.class, new DqmRender(new DqmModelGizumo(), 0.5f));
		renderers.put(DqmEntityHitokuibako.class, new DqmRender(new DqmModelMimikku(), 0.5f));
		renderers.put(DqmEntityHoimisura.class, new DqmRender(new DqmModelHoimisura(), 0.5f));
		renderers.put(DqmEntityHoroghost.class, new DqmRender(new DqmModelAyasiikage(), 0.5f));
		renderers.put(DqmEntityIkkakuusagi.class, new DqmRender(new DqmModelIkkakuusagi(), 0.5f));
		renderers.put(DqmEntityKimera.class, new DqmRender(new DqmModelKimera(), 0.5f));
		renderers.put(DqmEntityKingsura.class, new DqmRender(new DqmModelKingsura(), 0.5f));
		renderers.put(DqmEntityKiramasin.class, new DqmRender(new DqmModelKiramasin(), 0.5f));
		renderers.put(DqmEntityKirapan.class, new DqmRender(new DqmModelKirapan(), 0.5f));
		renderers.put(DqmEntityKirikabuobake.class, new DqmRender(new DqmModelKirikabuobake(), 0.5f));
		renderers.put(DqmEntityKuinsuraimu.class, new DqmRender(new DqmModelKingsura(), 0.5f));
		renderers.put(DqmEntityMadohando.class, new DqmRender(new DqmModelMadohando(), 0.5f));
		renderers.put(DqmEntityMaounokage.class, new DqmRender(new DqmModelAyasiikage(), 0.5f));
		renderers.put(DqmEntityMetaking.class, new DqmRender(new DqmModelKingsura(), 0.5f));
		renderers.put(DqmEntityMetaruhanta.class, new DqmRender(new DqmModelMetaruhanta(), 0.5f));
		renderers.put(DqmEntityMetasura.class, new DqmRender(new DqmModelSura(), 0.5f));
		renderers.put(DqmEntityMetoroghost.class, new DqmRender(new DqmModelGhost(), 0.5f));
		renderers.put(DqmEntityMimikku.class, new DqmRender(new DqmModelMimikku(), 0.5f));
		renderers.put(DqmEntityPandorabox.class, new DqmRender(new DqmModelMimikku(), 0.5f));
		renderers.put(DqmEntityRiripat.class, new DqmRender(new DqmModelRiripat(), 0.5f));
		renderers.put(DqmEntitySura.class, new DqmRender(new DqmModelSura(),0.5f));
		renderers.put(DqmEntitySuraimubehomazun.class, new DqmRender(new DqmModelKingsura(), 0.5f));
		renderers.put(DqmEntitySuraimubesu.class, new DqmRender(new DqmModelSura(), 0.5f));
		renderers.put(DqmEntitySuraimutawa.class, new DqmRender(new DqmModelSuraimutawa(), 0.5f));
		renderers.put(DqmEntitySyado.class, new DqmRender(new DqmModelAyasiikage(), 0.5f));
		renderers.put(DqmEntityTahodoraki.class, new DqmRender(new DqmModelDoraki(), 0.5f));
		renderers.put(DqmEntityWaraibukuro.class, new DqmRender(new DqmModelWaraibukuro(), 0.5f));
		renderers.put(DqmEntityMetaruhantaken.class, new DqmRender(new DqmModelKiramasin(), 0.5f));
		renderers.put(DqmEntityZoma.class, new DqmRender(new DqmModelZoma(), 0.5f));
		renderers.put(DqmEntitySuraimunaito.class, new DqmRender(new DqmModelSuraimunaito(), 0.5f));
		renderers.put(DqmEntityMetaruraida.class, new DqmRender(new DqmModelSuraimunaito(), 0.5f));

		renderers.put(DqmEntityBehoimisuraimu.class, new DqmRender(new DqmModelHoimisura(), 0.5f));
		renderers.put(DqmEntityBehoimusuraimu.class, new DqmRender(new DqmModelHoimisura(), 0.5f));
		renderers.put(DqmEntityDasudragon.class, new DqmRender(new DqmModelDqmdragon(), 0.5f));
		renderers.put(DqmEntityGamegon.class, new DqmRender(new DqmModelGamegon(), 0.5f));
		renderers.put(DqmEntityGamegonload.class, new DqmRender(new DqmModelGamegon(), 0.5f));
		renderers.put(DqmEntityGamegonrejendo.class, new DqmRender(new DqmModelGamegon(), 0.5f));
		renderers.put(DqmEntityBatorurex.class, new DqmRender(new DqmModelBatorurex(), 0.5f));
		renderers.put(DqmEntityDarkRamia.class, new DqmRender(new DqmModelRamiaBike(), 0.5f));
		renderers.put(DqmEntityGoldman.class, new DqmRender(new DqmModelGoremu(), 0.5f));
		renderers.put(DqmEntityGorudensuraimu.class, new DqmRender(new DqmModelPuratinaking(), 0.5f));
		renderers.put(DqmEntityGorudentotemu.class, new DqmRender(new DqmModelSuraimutawa(), 0.5f));
		renderers.put(DqmEntityKagenokisi.class, new DqmRender(new DqmModelGaikotukensi(), 0.5f));
		renderers.put(DqmEntityKisudragon.class, new DqmRender(new DqmModelDqmdragon(), 0.5f));
		renderers.put(DqmEntityMegazarurokku.class, new DqmRender(new DqmModelBakudaniwa(), 0.5f));
		renderers.put(DqmEntityMeijikimera.class, new DqmRender(new DqmModelKimera(), 0.5f));
		renderers.put(DqmEntityMeragosuto.class, new DqmRender(new DqmModelMeragosuto(), 0.5f));
		renderers.put(DqmEntityMetaruburazazu.class, new DqmRender(new DqmModelSuraimutawa(), 0.5f));
		renderers.put(DqmEntityPuratinaking.class, new DqmRender(new DqmModelPuratinaking(), 0.5f));
		renderers.put(DqmEntitySamayoutamasii.class, new DqmRender(new DqmModelMeragosuto(), 0.5f));
		renderers.put(DqmEntitySibirekurage.class, new DqmRender(new DqmModelHoimisura(), 0.5f));
		renderers.put(DqmEntitySiryounokisi.class, new DqmRender(new DqmModelGaikotukensi(), 0.5f));
		renderers.put(DqmEntityStarkimera.class, new DqmRender(new DqmModelKimera(), 0.5f));
		renderers.put(DqmEntityStonman.class, new DqmRender(new DqmModelGoremu(), 0.5f));
		renderers.put(DqmEntitySumairurokku.class, new DqmRender(new DqmModelBakudaniwa(), 0.5f));
		renderers.put(DqmEntitySuraimumadyura.class, new DqmRender(new DqmModelPuratinaking(), 0.5f));

		renderers.put(DqmEntityMarinsuraimu.class, new DqmRender(new DqmModelMarinsuraimu(), 0.5f));
		renderers.put(DqmEntitySuraimutumuri.class, new DqmRender(new DqmModelMarinsuraimu(), 0.5f));


		// Pet************************************************************************************************************************************************************

		renderers.put(DqmpetEntityBakudaniwa.class, new DqmRender(new DqmModelBakudaniwa(), 0.5f));
		renderers.put(DqmpetEntityDorakima.class, new DqmRender(new DqmModelDoraki(), 0.5f));
		renderers.put(DqmpetEntityDqmdragon.class, new DqmRender(new DqmModelDqmdragon(), 0.5f));
		renderers.put(DqmpetEntityGaikotukensi.class, new DqmRender(new DqmModelGaikotukensi(), 0.5f));
		renderers.put(DqmpetEntityGhost.class, new DqmRender(new DqmModelGhost(), 0.5f));
		renderers.put(DqmpetEntityGigantesu.class, new DqmRender(new DqmModelAtorasu(), 0.5f));
		renderers.put(DqmpetEntityGoremu.class, new DqmRender(new DqmModelGoremu(), 0.5f));
		renderers.put(DqmpetEntityHagumeta.class, new DqmRender(new DqmModelBubsura(), 0.5f));
		renderers.put(DqmpetEntityHitokuibako.class, new DqmRender(new DqmModelMimikku(), 0.5f));
		renderers.put(DqmpetEntityIkkakuusagi.class, new DqmRender(new DqmModelIkkakuusagi(), 0.5f));
		renderers.put(DqmpetEntityKimera.class, new DqmRender(new DqmModelKimera(), 0.5f));
		renderers.put(DqmpetEntityKingsura.class, new DqmRender(new DqmModelKingsura(), 0.5f));
		renderers.put(DqmpetEntityKiramasin.class, new DqmRender(new DqmModelKiramasin(), 0.5f));
		renderers.put(DqmpetEntityKirapan.class, new DqmRender(new DqmModelKirapan(), 0.5f));
		renderers.put(DqmpetEntityKirikabuobake.class, new DqmRender(new DqmModelKirikabuobake(), 0.5f));
		renderers.put(DqmpetEntityKuinsuraimu.class, new DqmRender(new DqmModelKingsura(), 0.5f));
		renderers.put(DqmpetEntityLittleEsterk.class, new DqmRender(new DqmpetModelLittleEsterk(), 0.5f));
		renderers.put(DqmpetEntityMetoroghost.class, new DqmRender(new DqmModelGhost(), 0.5f));
		renderers.put(DqmpetEntitySura.class, new DqmRender(new DqmModelSura(),0.5f));
		renderers.put(DqmpetEntitySuraimutawa.class, new DqmRender(new DqmModelSuraimutawa(), 0.5f));
		renderers.put(DqmpetEntitySyado.class, new DqmRender(new DqmModelAyasiikage(), 0.5f));
		renderers.put(DqmpetEntitySuraimunaito.class, new DqmRender(new DqmModelSuraimunaito(), 0.5f));
	}


	@Override
	public boolean onTickInGame(float f, Minecraft minecraft) {
		if (mc.theWorld.worldInfo.getWorldTime() % 100L == 0L) {
			cs.doCustomSpawning(mc.theWorld, mc.gameSettings.difficulty > 0, true);
		}
		if (mc.theWorld.worldInfo.getWorldTime() % 300L == 0L) {
			cs.despawnMob(mc.theWorld, cs.DqmPetMobClassList);
			cs.despawnMob(mc.theWorld, cs.DqmWaterMobClassList);
		}

		//  if (mc.theWorld.worldInfo.getWorldTime() % 1000L == 0L) {
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityBakudaniwa.class, Bakudaniwa);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityDorakima.class, Dorakima);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityDqmdragon.class, Dqmdragon);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityGaikotukensi.class, Gaikotukensi);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityGhost.class, Ghost);
		//  }
		//  if (mc.theWorld.worldInfo.getWorldTime() % 1100L == 0L) {
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityGigantesu.class, Gigantesu);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityGoremu.class, Goremu);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityHagumeta.class, Hagumeta);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityHitokuibako.class, Hitokuibako);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityIkkakuusagi.class, Ikkakuusagi);
		//  }
		//  if (mc.theWorld.worldInfo.getWorldTime() % 1200L == 0L) {
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityKimera.class, Kimera);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityKingsura.class, Kingsura);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityKiramasin.class, Kiramasin);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityKirapan.class, Kirapan);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityKirikabuobake.class, Kirikabuobake);
		//  }
		//  if (mc.theWorld.worldInfo.getWorldTime() % 1300L == 0L) {
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityKuinsuraimu.class, Kuinsuraimu);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityLittleEsterk.class, LittleEsterk);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntityMetoroghost.class, Metoroghost);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntitySura.class, Sura);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntitySuraimutawa.class, Suraimutawa);
		//  cs.despawnMobWithMinimum(mc.theWorld,
		//  DqmpetEntitySyado.class, Syado);
		//  }

		return true;
	}
}