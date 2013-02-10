package net.minecraft.src;

import java.util.*;

import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.dqmcore.Pet.*;

public class mod_Dqm extends BaseMod //implements IMinecraftRegistry
{

	//アイテムID

	@MLProp(info="Redoubu ID")
	public static int RedoubuID = 5501- 256;
	public static Item Redoubu;
	@MLProp(info="Hosinokakera ID")
	public static int HosinokakeraID = 5502- 256;
	public static Item Hosinokakera;
	@MLProp(info="Kazekirinohane ID")
	public static int KazekirinohaneID = 5503- 256;
	public static Item Kazekirinohane;
	@MLProp(info="Kenjanoseisui ID")
	public static int KenjanoseisuiID = 5504- 256;
	public static Item Kenjanoseisui;
	@MLProp(info="Amatuyunoito ID")
	public static int AmatuyunoitoID = 5505- 256;
	public static Item Amatuyunoito;
	@MLProp(info="Goldburesuretto ID")
	public static int GoldburesurettoID = 5506- 256;
	public static Item Goldburesuretto;
	@MLProp(info="Goldring ID")
	public static int GoldringID = 5507- 256;
	public static Item Goldring;
	@MLProp(info="Hikarinoisi ID")
	public static int HikarinoisiID = 5508- 256;
	public static Item Hikarinoisi;
	@MLProp(info="Koorinokessyou ID")
	public static int KoorinokessyouID = 5509- 256;
	public static Item Koorinokessyou;
	@MLProp(info="Madarakumonoito ID")
	public static int MadarakumonoitoID = 5510- 256;
	public static Item Madarakumonoito;
	@MLProp(info="Majuunotuno ID")
	public static int MajuunotunoID = 5511- 256;
	public static Item Majuunotuno;
	@MLProp(info="Metaloubu ID")
	public static int MetaloubuID = 5512- 256;
	public static Item Metaloubu;
	@MLProp(info="Migakizuna ID")
	public static int MigakizunaID = 5513- 256;
	public static Item Migakizuna;
	@MLProp(info="Tokinosuisyou ID")
	public static int TokinosuisyouID = 5514- 256;
	public static Item Tokinosuisyou;
	@MLProp(info="Bakudanisi ID")
	public static int BakudanisiID = 5515- 256;
	public static Item Bakudanisi;
	@MLProp(info="Seijanohai ID")
	public static int SeijanohaiID = 5516- 256;
	public static Item Seijanohai;
	@MLProp(info="Seireiseki ID")
	public static int SeireisekiID = 5517- 256;
	public static Item Seireiseki;
	@MLProp(info="Sinkanohiseki ID")
	public static int SinkanohisekiID = 5518- 256;
	public static Item Sinkanohiseki;
	@MLProp(info="Suraimunokanmuri ID")
	public static int SuraimunokanmuriID = 5519- 256;
	public static Item Suraimunokanmuri;
	@MLProp(info="Suraimuzeri ID")
	public static int SuraimuzeriID = 5520- 256;
	public static Item Suraimuzeri;
	@MLProp(info="Yougansekinokakera ID")
	public static int YougansekinokakeraID = 5521- 256;
	public static Item Yougansekinokakera;
	@MLProp(info="Majuunokawa ID")
	public static int MajuunokawaID = 5522- 256;
	public static Item Majuunokawa;
	@MLProp(info="Yawarakauru ID")
	public static int YawarakauruID = 5523- 256;
	public static Item Yawarakauru;
	@MLProp(info="Uruwasikinoko ID")
	public static int UruwasikinokoID = 5524- 256;
	public static Item Uruwasikinoko;
	@MLProp(info="Tyounohane ID")
	public static int TyounohaneID = 5525- 256;
	public static Item Tyounohane;
	@MLProp(info="Midorinokoke ID")
	public static int MidorinokokeID = 5526- 256;
	public static Item Midorinokoke;
	@MLProp(info="Yogoretahoutai ID")
	public static int YogoretahoutaiID = 5527- 256;
	public static Item Yogoretahoutai;
	@MLProp(info="Usaginosippo ID")
	public static int UsaginosippoID = 5528- 256;
	public static Item Usaginosippo;
	@MLProp(info="Koumorinohane ID")
	public static int KoumorinohaneID = 5529- 256;
	public static Item Koumorinohane;
	@MLProp(info="Togetogenokiba ID")
	public static int TogetogenokibaID = 5530- 256;
	public static Item Togetogenokiba;
	@MLProp(info="Kyodainakiba ID")
	public static int KyodainakibaID = 5531- 256;
	public static Item Kyodainakiba;
	@MLProp(info="Rengokunohane ID")
	public static int RengokunohaneID = 5532- 256;
	public static Item Rengokunohane;
	@MLProp(info="Honehone ID")
	public static int HonehoneID = 5533- 256;
	public static Item Honehone;
	@MLProp(info="Kenjanoisi ID")
	public static int KenjanoisiID = 5534- 256;
	public static Item Kenjanoisi;
	@MLProp(info="Moon ID")
	public static int MoonID = 5535- 256;
	public static Item Moon;
	@MLProp(info="Buruoubu ID")
	public static int BuruoubuID = 5536- 256;
	public static Item Buruoubu;
	@MLProp(info="Ierooubu ID")
	public static int IerooubuID = 5537- 256;
	public static Item Ierooubu;
	@MLProp(info="Gurinoubu ID")
	public static int GurinoubuID = 5538- 256;
	public static Item Gurinoubu;
	@MLProp(info="Paapuruoubu ID")
	public static int PaapuruoubuID = 5539- 256;
	public static Item Paapuruoubu;


	//種・薬草
	@MLProp(info="Yakusou ID")
	public static int YakusouID = 5580- 256;
	public static Item Yakusou;
	@MLProp(info="Bannouyaku ID")
	public static int BannouyakuID = 5581- 256;
	public static Item Bannouyaku;
	@MLProp(info="Tikaranotane ID")
	public static int TikaranotaneID = 5582- 256;
	public static Item Tikaranotane;
	@MLProp(info="Mamorinotane ID")
	public static int MamorinotaneID = 5583- 256;
	public static Item Mamorinotane;
	@MLProp(info="Subayasanotane ID")
	public static int SubayasanotaneID = 5584- 256;
	public static Item Subayasanotane;
	@MLProp(info="Jouyakusou ID")
	public static int JouyakusouID = 5585- 256;
	public static Item Jouyakusou;
	@MLProp(info="Tokuyakusou ID")
	public static int TokuyakusouID = 5586- 256;
	public static Item Tokuyakusou;
	@MLProp(info="Sekaijunoha ID")
	public static int SekaijunohaID = 5587- 256;
	public static Item Sekaijunoha;
	@MLProp(info="Dokukesisou ID")
	public static int DokukesisouID = 5588- 256;
	public static Item Dokukesisou;


	//鉱石
	@MLProp(info="Littlemedal ID")
	public static int LittlemedalID = 5601- 256;
	public static Item Littlemedal;
	@MLProp(info="Kinkai ID")
	public static int KinkaiID = 5602- 256;
	public static Item Kinkai;
	@MLProp(info="Misriru ID")
	public static int MisriruID = 5603- 256;
	public static Item Misriru;
	@MLProp(info="Oriharukon ID")
	public static int OriharukonID = 5604- 256;
	public static Item Oriharukon;
	@MLProp(info="Metaru ID")
	public static int MetaruID = 5605- 256;
	public static Item Metaru;
	@MLProp(info="Puratina ID")
	public static int PuratinaID = 5606- 256;
	public static Item Puratina;
	@MLProp(info="Tekkouseki ID")
	public static int TekkousekiID = 5607- 256;
	public static Item Tekkouseki;
	@MLProp(info="Ikazutinotama ID")
	public static int IkazutinotamaID = 5608- 256;
	public static Item Ikazutinotama;
	@MLProp(info="Ryuunonamida ID")
	public static int RyuunonamidaID = 5609- 256;
	public static Item Ryuunonamida;
	@MLProp(info="Taiyounoisi ID")
	public static int TaiyounoisiID = 5610- 256;
	public static Item Taiyounoisi;
	@MLProp(info="Inotinoisi ID")
	public static int InotinoisiID = 5611- 256;
	public static Item Inotinoisi;
	@MLProp(info="Kagaminoisi ID")
	public static int KagaminoisiID = 5612- 256;
	public static Item Kagaminoisi;
	@MLProp(info="Rubinogenseki ID")
	public static int RubinogensekiID = 5613- 256;
	public static Item Rubinogenseki;


	//特殊
	@MLProp(info="MysteryEgg ID")
	public static int MysteryEggID = 6201- 256;
	public static Item MysteryEgg;
	@MLProp(info="Kimeranotubasa ID")
	public static int KimeranotubasaID = 6202- 256;
	public static Item Kimeranotubasa;
	@MLProp(info="Papasunokatami ID")
	public static int PapasunokatamiID = 6203- 256;
	public static Item Papasunokatami;
	@MLProp(info="Ramia ID")
	public static int RamiaID = 6204- 256;
	public static Item Ramia;
	@MLProp(info="Dragonwing ID")
	public static int DragonwingID = 6205- 256;
	public static Item Dragonwing;


	//鍵
	@MLProp(info="Hokoranokagi ID")
	public static int HokoranokagiID = 6301- 256;
	public static Item Hokoranokagi;
	@MLProp(info="Touzokunokagi ID")
	public static int TouzokunokagiID = 6302- 256;
	public static Item Touzokunokagi;
	@MLProp(info="Mahounokagi ID")
	public static int MahounokagiID = 6303- 256;
	public static Item Mahounokagi;
	@MLProp(info="Saigonokagi ID")
	public static int SaigonokagiID = 6304- 256;
	public static Item Saigonokagi;



	//剣部品
	@MLProp(info="Rotonoha ID")
	public static int RotonohaID = 5701- 256;
	public static Item Rotonoha;
	@MLProp(info="Rotonotuka ID")
	public static int RotonotukaID = 5702- 256;
	public static Item Rotonotuka;
	@MLProp(info="Metarukingnoha ID")
	public static int MetarukingnohaID = 5703- 256;
	public static Item Metarukingnoha;
	@MLProp(info="Metarukingnotuka ID")
	public static int MetarukingnotukaID = 5704- 256;
	public static Item Metarukingnotuka;
	@MLProp(info="Inferunoswordnoha ID")
	public static int InferunoswordnohaID = 5705- 256;
	public static Item Inferunoswordnoha;
	@MLProp(info="Inferunoswordnotuka ID")
	public static int InferunoswordnotukaID = 5706- 256;
	public static Item Inferunoswordnotuka;



	//剣
	@MLProp(info="Rotonoturugi ID")
	public static int RotonoturugiID = 5801- 256;
	public static Item Rotonoturugi;
	@MLProp(info="Metarukingnoturugi ID")
	public static int MetarukingnoturugiID = 5802- 256;
	public static Item Metarukingnoturugi;
	@MLProp(info="Ginganoturugi ID")
	public static int GinganoturugiID = 5803- 256;
	public static Item Ginganoturugi;
	@MLProp(info="Inferunosword ID")
	public static int InferunoswordID = 5804- 256;
	public static Item Inferunosword;
	@MLProp(info="Koorinoyaiba ID")
	public static int KoorinoyaibaID = 5805- 256;
	public static Item Koorinoyaiba;
	@MLProp(info="Uminarinotue ID")
	public static int UminarinotueID = 5806- 256;
	public static Item Uminarinotue;
	@MLProp(info="Doragonkira ID")
	public static int DoragonkiraID = 5807- 256;
	public static Item Doragonkira;
	@MLProp(info="Haganenoturugi ID")
	public static int HaganenoturugiID = 5808- 256;
	public static Item Haganenoturugi;
	@MLProp(info="Heisinoken ID")
	public static int HeisinokenID = 5809- 256;
	public static Item Heisinoken;
	@MLProp(info="Hayabusanoturugi ID")
	public static int HayabusanoturugiID = 5810- 256;
	public static Item Hayabusanoturugi;
	@MLProp(info="Kisekinoturugi ID")
	public static int KisekinoturugiID = 5811- 256;
	public static Item Kisekinoturugi;
	@MLProp(info="Toraidento ID")
	public static int ToraidentoID = 5812- 256;
	public static Item Toraidento;
	@MLProp(info="Debugsword ID")
	public static int DebugswordID = 5813- 256;
	public static Item Debugsword;
	@MLProp(info="Oujanoturugi ID")
	public static int OujanoturugiID = 5814- 256;
	public static Item Oujanoturugi;
	@MLProp(info="Papasunoturugi ID")
	public static int PapasunoturugiID = 5815- 256;
	public static Item Papasunoturugi;
	@MLProp(info="Papasunoturuginew ID")
	public static int PapasunoturuginewID = 5816- 256;
	public static Item Papasunoturuginew;
	@MLProp(info="Sabakinotue ID")
	public static int SabakinotueID = 5817- 256;
	public static Item Sabakinotue;
	@MLProp(info="Dragonrod ID")
	public static int DragonrodID = 5818- 256;
	public static Item Dragonrod;
	@MLProp(info="Ikazutinotue ID")
	public static int IkazutinotueID = 5819- 256;
	public static Item Ikazutinotue;
	@MLProp(info="Akumanotume ID")
	public static int AkumanotumeID = 5820- 256;
	public static Item Akumanotume;
	@MLProp(info="Majuunotume ID")
	public static int MajuunotumeID = 5821- 256;
	public static Item Majuunotume;
	@MLProp(info="Seinarunaifu ID")
	public static int SeinarunaifuID = 5822- 256;
	public static Item Seinarunaifu;
	@MLProp(info="Yaibanobumeran ID")
	public static int YaibanobumeranID = 5823- 256;
	public static Item Yaibanobumeran;
	@MLProp(info="Majinnokanaduti ID")
	public static int MajinnokanadutiID = 5824- 256;
	public static Item Majinnokanaduti;
	@MLProp(info="Ookanaduti ID")
	public static int OokanadutiID = 5825- 256;
	public static Item Ookanaduti;
	@MLProp(info="Atorasunokanaduti ID")
	public static int AtorasunokanadutiID = 5826- 256;
	public static Item Atorasunokanaduti;
	@MLProp(info="Gureitoakusu ID")
	public static int GureitoakusuID = 5827- 256;
	public static Item Gureitoakusu;
	@MLProp(info="Oninokanabou ID")
	public static int OninokanabouID = 5828- 256;
	public static Item Oninokanabou;
	@MLProp(info="Hikarinotue ID")
	public static int HikarinotueID = 5829- 256;
	public static Item Hikarinotue;
	@MLProp(info="Dokubari ID")
	public static int DokubariID = 5830- 256;
	public static Item Dokubari;

	//盾
	@MLProp(info="Rotonotate ID")
	public static int RotonotateID = 5898- 256;
	public static Item Rotonotate;
	@MLProp(info="Sabitatate ID")
	public static int SabitatateID = 5899- 256;
	public static Item Sabitatate;

	//アクセサリ
	@MLProp(info="Hosifuru ID")
	public static int HosifuruID = 5901- 256;
	public static Item Hosifuru;
	@MLProp(info="Hayatenoring ID")
	public static int HayatenoringID = 5902- 256;
	public static Item Hayatenoring;
	@MLProp(info="Rakkipendanto ID")
	public static int RakkipendantoID = 5903- 256;
	public static Item Rakkipendanto;
	@MLProp(info="Mamorinorubi ID")
	public static int MamorinorubiID = 5904- 256;
	public static Item Mamorinorubi;
	@MLProp(info="Tikaranorubi ID")
	public static int TikaranorubiID = 5905- 256;
	public static Item Tikaranorubi;
	@MLProp(info="Gouketunoudewa ID")
	public static int GouketunoudewaID = 5906- 256;
	public static Item Gouketunoudewa;


	//弓
	@MLProp(info="Kazekirinoyumi ID")
	public static int KazekirinoyumiID = 6001- 256;
	public static Item Kazekirinoyumi;
	@MLProp(info="Sefiramunoyumi ID")
	public static int SefiramunoyumiID = 6002- 256;
	public static Item Sefiramunoyumi;
	@MLProp(info="Yuuwakunoyumi ID")
	public static int YuuwakunoyumiID = 6003- 256;
	public static Item Yuuwakunoyumi;

	//鎧
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDROTO = 6100;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDMETAL = 6104;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDOLD = 6108;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDHAGANE = 6112;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDKAWA = 6116;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDUROKO = 6120;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDHONOO = 6124;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDMIRA = 6128;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDYAIBA = 6132;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDSINPI = 6136;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDSURA = 6140;
	@MLProp(info = "ItemID +0..+3(ShiftIndex = ItemID - 256, 0 is not use.)")
	public static int ItemIDDRAGON = 6144;

	public static Item Rotonokabuto;
	public static Item Rotonoyoroi;
	public static Item Rotonokote;
	public static Item Rotonokutu;
	public static Item Metarukingnokabuto;
	public static Item Metarukingnoyoroi;
	public static Item Metarukingnokote;
	public static Item Metarukingnokutu;
	public static Item Sabitakabuto;
	public static Item Sabitayoroi;
	public static Item Sabitakote;
	public static Item Sabitakutu;
	public static Item Haganenokabuto;
	public static Item Haganenoyoroi;
	public static Item Haganenokote;
	public static Item Haganenokutu;
	public static Item Kawanobousi;
	public static Item Kawanoyoroi;
	public static Item Kawanokote;
	public static Item Kawanokutu;
	public static Item Urokonoyoroi;
	public static Item Honoonoyoroi;
	public static Item Mirayoroi;
	public static Item Yaibanoyoroi;
	public static Item Sinpinoyoroi;
	public static Item Suraimuhead;
	public static Item Suraimunofuku;
	public static Item Doragonmeiru;


	@MLProp(info = "Keep inventory")
	public static boolean Keep = false;
	public DqmInventoryPlayer playersSpecialInventory=null;
	private DqmInventoryPlayer DIP;



	@Override
	public void load()
	{
		MinecraftForgeClient.preloadTexture("/dqm/DqmItems.png");
		/*
        public DqmItemSword(int par1, DqmEnumToolMaterial cloth,int w,int h,int t,float s,int d,int e)
        {
            super(par1,EnumToolMaterial.EMERALD);

            toolMaterial = cloth;
            maxStackSize = 1;
            weaponDamage = w;//kougekiryoku
            harvestLevel = h;//kouyouseki ga torerukadouka 3=DIAMOND
            setMaxDamage(t);//taikyuu
            //maxUses = t; //taikyuu
            efficiencyOnProperMaterial = s;//hori sokudo 8F=DIAMOND
            damageVsEntity = d; //katasa? 3=DIAMOND
            enchantability = e; //enchant
        }
		 */
		//ATK:DIAMOND=7,IRON=6,STORN=5,WOOD=4
		//buki texture para(ATK,3=DIAMOND_foreru mono,8F=DIAMOND_horu sokudo,3=DIAMOND_katasa,enchant)***************************************************************************************
		//IDの後の引数で0が鍬、1がシャベル、2がピッケル、3が斧
		Debugsword = new DqmItemTool(DebugswordID, 0, DqmEnumToolMaterial.DEBUG).setmodel("Majuunotume").setIconCoord(6, 1).setItemName("Debugsword");
		//Debugsword = new DqmItemSword(DebugswordID,DqmEnumToolMaterial.DEBUG).setmodel("d").setIconCoord(6, 1).setItemName("Debugsword");
		 //redPickaxe = (new ItemRedPickaxe(EEBase.props.getInt("ItemRedPickaxe"))).setIconCoord(64, 0).setItemName("redPickaxe");

		Uminarinotue = new DqmItemSword(UminarinotueID, 4,DqmEnumToolMaterial.UMINARI).setmodel("Uminarinotue").setIconCoord(5, 0).setItemName("Uminarinotue");
		Koorinoyaiba = new DqmItemSword(KoorinoyaibaID, 4,DqmEnumToolMaterial.KOORI).setmodel("Koorinoyaiba").setIconCoord(4, 0).setItemName("Koorinoyaiba");
		Inferunosword = new DqmItemSword(InferunoswordID, 4,DqmEnumToolMaterial.INFERUNO).setmodel("Inferunosword").setIconCoord(3, 0).setItemName("Inferunosword");
		Hayabusanoturugi = new DqmItemSword(HayabusanoturugiID, 4,DqmEnumToolMaterial.HAYABUSA).setmodel("Hayabusanoturugi").setIconCoord(9, 0).setItemName("Hayabusanoturugi");
		Kisekinoturugi = new DqmItemSword(KisekinoturugiID, 4,DqmEnumToolMaterial.KISEKI).setmodel("Kisekinoturugi").setIconCoord(10, 0).setItemName("Kisekinoturugi");
		Ginganoturugi = new DqmItemSword(GinganoturugiID, 4,DqmEnumToolMaterial.GINGA).setIconCoord(0, 0).setItemName("Ginganoturugi");
		Metarukingnoturugi = new DqmItemSword(MetarukingnoturugiID, 4,DqmEnumToolMaterial.METAL).setIconCoord(1, 0).setItemName("Metarukingnoturugi");
		Rotonotate = new DqmItemSword(RotonotateID, 4,DqmEnumToolMaterial.ROTO).setIconCoord(4, 3).setItemName("Rotonotate");
		Rotonoturugi = new DqmItemSword(RotonoturugiID, 4,DqmEnumToolMaterial.ROTO).setIconCoord(2, 0).setItemName("Rotonoturugi");
		Sabitatate = new DqmItemSword(SabitatateID, 4,DqmEnumToolMaterial.OLD).setItemName("Sabitatate").setIconCoord(4, 4);
		Doragonkira = new DqmItemSword(DoragonkiraID, 4,DqmEnumToolMaterial.DRAGON).setmodel("Doragonkira").setIconCoord(6, 0).setItemName("Doragonkira");
		Haganenoturugi = new DqmItemSword(HaganenoturugiID, 4,DqmEnumToolMaterial.HAGANE).setIconCoord(7, 0).setItemName("Haganenoturugi");
		Heisinoken = new DqmItemSword(HeisinokenID, 4,DqmEnumToolMaterial.HEISHI).setIconCoord(8, 0).setItemName("Heisinoken");
		Toraidento = new DqmItemSword(ToraidentoID, 4,DqmEnumToolMaterial.TORAI).setIconCoord(13, 0).setItemName("Toraidento");
		Oujanoturugi = new DqmItemSword(OujanoturugiID, 4,DqmEnumToolMaterial.OUJA).setIconCoord(7, 1).setItemName("Oujanoturugi");
		Papasunoturugi = new DqmItemSword(PapasunoturugiID, 4,DqmEnumToolMaterial.PAPASU).setIconCoord(8, 1).setItemName("Papasunoturugi");
		Papasunoturuginew = new DqmItemSword(PapasunoturuginewID, 4,DqmEnumToolMaterial.PAPASUNEW).setIconCoord(9, 1).setItemName("Papasunoturuginew");
		Hikarinotue = new DqmItemSword(HikarinotueID, 4,DqmEnumToolMaterial.HIKARI).setmodel("Hikarinotue").setIconCoord(5, 1).setItemName("Hikarinotue");
		Seinarunaifu = new DqmItemSword(SeinarunaifuID, 4,DqmEnumToolMaterial.SEINARU).setmodel("Seinarunaifu").setIconCoord(8, 2).setItemName("Seinarunaifu");
		Yaibanobumeran = new DqmItemSword(YaibanobumeranID, 4,DqmEnumToolMaterial.YAIBA).setmodel("Yaibanobumeran").setIconCoord(9, 2).setItemName("Yaibanobumeran");
		Majinnokanaduti = new DqmItemSword(MajinnokanadutiID, 4,DqmEnumToolMaterial.MAJIN).setmodel("Majinnokanaduti").setIconCoord(12, 0).setItemName("Majinnokanaduti");
		Ikazutinotue = new DqmItemSword(IkazutinotueID, 4,DqmEnumToolMaterial.IKAZUTI).setmodel("Ikazutinotue").setIconCoord(4, 2).setItemName("Ikazutinotue");
		Dragonrod = new DqmItemSword(DragonrodID, 4,DqmEnumToolMaterial.DRAGONROD).setmodel("Dragonrod").setIconCoord(5, 2).setItemName("Dragonrod");
		Dokubari = new DqmItemSword(DokubariID, 4,DqmEnumToolMaterial.DOKUBARI).setmodel("Dokubari").setIconCoord(10, 2).setItemName("Dokubari");
		Sabakinotue = new DqmItemSword(SabakinotueID, 4,DqmEnumToolMaterial.SABAKI).setIconCoord(4, 1).setItemName("Sabakinotue");

		//シャベル系武器
		Majuunotume = new DqmItemSword(MajuunotumeID,1,DqmEnumToolMaterial.MAJUU).setmodel("Majuunotume").setIconCoord(7, 2).setItemName("Majuunotume");
		Akumanotume = new DqmItemSword(AkumanotumeID, 1,DqmEnumToolMaterial.AKUMA).setmodel("Akumanotume").setIconCoord(6, 2).setItemName("Akumanotume");

		//ツルハシ系武器
		Ookanaduti = new DqmItemSword(OokanadutiID, 2, DqmEnumToolMaterial.OO).setmodel("Ookanaduti").setIconCoord(12, 2).setItemName("Ookanaduti");
		Atorasunokanaduti = new DqmItemSword(AtorasunokanadutiID, 2,DqmEnumToolMaterial.ATORASU).setmodel("Atorasunokanaduti").setIconCoord(12, 1).setItemName("Atorasunokanaduti");
		Oninokanabou = new DqmItemSword(OninokanabouID, 2,DqmEnumToolMaterial.ONI).setmodel("Oninokanabou").setIconCoord(13, 2).setItemName("Oninokanabou");

		//アックス系武器
		Gureitoakusu = new DqmItemTool(GureitoakusuID, 3,DqmEnumToolMaterial.GUREITO).setmodel("Gureitoakusu").setIconCoord(13, 1).setItemName("Gureitoakusu");

		//弓系武器
		Kazekirinoyumi = new DqmItemBow(KazekirinoyumiID).setmodel("Kazekirinoyumi").setIconCoord(15, 0).setItemName("Kazekirinoyumi");
		Sefiramunoyumi = new DqmItemBow(SefiramunoyumiID).setmodel("Sefiramunoyumi").setIconCoord(15, 1).setItemName("Sefiramunoyumi");
		Yuuwakunoyumi = new DqmItemBow(YuuwakunoyumiID).setmodel("Yuuwakunoyumi").setIconCoord(15, 2).setItemName("Yuuwakunoyumi");


		//鎧**************************************************************************************************************************************************************************
		//鎧のマテリアルテクスチャーの順番
		//		if (ItemIDROTO > 0) {			int ROTOindex = ModLoader.addArmor("5");		}
		//		if (ItemIDMETAL > 0) {			int METALindex = ModLoader.addArmor("6");		}
		//		if (ItemIDOLD > 0) {			int OLDindex = ModLoader.addArmor("7");		}
		//		if (ItemIDHAGANE > 0) {			int HAGANEindex = ModLoader.addArmor("8");		}
		//		if (ItemIDKAWA > 0) {			int KAWAindex = ModLoader.addArmor("9");		}
		//		if (ItemIDUROKO > 0) {			int UROKOindex = ModLoader.addArmor("10");		}
		//		if (ItemIDHONOO > 0) {			int HONOOindex = ModLoader.addArmor("11");		}
		//		if (ItemIDMIRA > 0) {			int MIRAindex = ModLoader.addArmor("12");		}
		//		if (ItemIDYAIBA > 0) {			int YAIBAindex = ModLoader.addArmor("13");		}
		//		if (ItemIDSINPI > 0) {			int SINPIindex = ModLoader.addArmor("14");		}
		//		if (ItemIDSURA > 0) {			int SURAindex = ModLoader.addArmor("15");		}
		//if (ItemIDAAA > 0) {			int AAAindex = ModLoader.addArmor("15");		}


		if (ItemIDROTO > 0) {			int index = ModLoader.addArmor("ROTO");

		Rotonokabuto = new DqmItemArmor(ItemIDROTO - 256 + 0, DqmEnumArmorMaterial.ROTO, index, 0,3000).setItemName("Rotonokabuto").setIconCoord(0, 3);
		Rotonoyoroi	= new DqmItemArmor(ItemIDROTO - 256 + 1, DqmEnumArmorMaterial.ROTO, index, 1,3000).setItemName("Rotonoyoroi").setIconCoord(1, 3);
		Rotonokote	= new DqmItemArmor(ItemIDROTO - 256 + 2, DqmEnumArmorMaterial.ROTO, index, 2,3000).setItemName("Rotonokote").setIconCoord(2, 3);
		Rotonokutu	= new DqmItemArmor(ItemIDROTO - 256 + 3, DqmEnumArmorMaterial.ROTO, index, 3,3000).setItemName("Rotonokutu").setIconCoord(3, 3);
		}
		if (ItemIDMETAL > 0) {			int index = ModLoader.addArmor("METAL");
		Metarukingnokabuto	= new DqmItemArmor(ItemIDMETAL - 256 + 0, DqmEnumArmorMaterial.METAL, index, 0,5000).setItemName("Metarukingnokabuto").setIconCoord(6, 3);
		Metarukingnoyoroi	= new DqmItemArmor(ItemIDMETAL - 256 + 1, DqmEnumArmorMaterial.METAL, index, 1,5000).setItemName("chestMetarukingnoyoroi").setIconCoord(7, 3);
		Metarukingnokote	= new DqmItemArmor(ItemIDMETAL - 256 + 2, DqmEnumArmorMaterial.METAL, index, 2,5000).setItemName("leggingsMetal").setIconCoord(8, 3);
		Metarukingnokutu	= new DqmItemArmor(ItemIDMETAL - 256 + 3, DqmEnumArmorMaterial.METAL, index, 3,5000).setItemName("Metarukingnokutu").setIconCoord(9, 3);
		}
		if (ItemIDOLD > 0) {			int index = ModLoader.addArmor("OLD");
		Sabitakabuto	= new DqmItemArmor(ItemIDOLD - 256 + 0, DqmEnumArmorMaterial.OLD, index, 0,100).setItemName("Sabitakabuto").setIconCoord(0, 4);
		Sabitayoroi	= new DqmItemArmor(ItemIDOLD - 256 + 1, DqmEnumArmorMaterial.OLD, index, 1,100).setItemName("chestSabitayoroi").setIconCoord(1, 4);
		Sabitakote	= new DqmItemArmor(ItemIDOLD - 256 + 2, DqmEnumArmorMaterial.OLD, index, 2,100).setItemName("leggingsOld").setIconCoord(2, 4);
		Sabitakutu	= new DqmItemArmor(ItemIDOLD - 256 + 3, DqmEnumArmorMaterial.OLD, index, 3,100).setItemName("Sabitakutu").setIconCoord(3, 4);
		}
		if (ItemIDHAGANE > 0) {			int index = ModLoader.addArmor("HAGANE");
		Haganenokabuto = new DqmItemArmor(ItemIDHAGANE - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,800).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Haganenoyoroi	= new DqmItemArmor(ItemIDHAGANE - 256 + 1, DqmEnumArmorMaterial.HAGANE, index, 1,800).setItemName("Haganenoyoroi").setIconCoord(7, 4);
		Haganenokote	= new DqmItemArmor(ItemIDHAGANE - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,800).setItemName("leggingsHagane").setIconCoord(8, 4);
		Haganenokutu	= new DqmItemArmor(ItemIDHAGANE - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,800).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDKAWA > 0) {			int index = ModLoader.addArmor("KAWA");
		Kawanobousi	= new DqmItemArmor(ItemIDKAWA - 256 + 0, DqmEnumArmorMaterial.KAWA, index, 0,200).setItemName("Kawanobousi").setIconCoord(6, 5);
		Kawanoyoroi	= new DqmItemArmor(ItemIDKAWA - 256 + 1, DqmEnumArmorMaterial.KAWA, index, 1,200).setItemName("Kawanoyoroi").setIconCoord(7, 5);
		Kawanokote	= new DqmItemArmor(ItemIDKAWA - 256 + 2, DqmEnumArmorMaterial.KAWA, index, 2,200).setItemName("Kawanokote").setIconCoord(8, 5);
		Kawanokutu	= new DqmItemArmor(ItemIDKAWA - 256 + 3, DqmEnumArmorMaterial.KAWA, index, 3,200).setItemName("Kawanokutu").setIconCoord(9, 5);
		}
		if (ItemIDUROKO > 0) {			int index = ModLoader.addArmor("UROKO");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Urokonoyoroi	= new DqmItemArmor(ItemIDUROKO - 256 + 1, DqmEnumArmorMaterial.UROKO, index, 1,350).setItemName("Urokonoyoroi").setIconCoord(11, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDHONOO > 0) {			int index = ModLoader.addArmor("HONOO");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Honoonoyoroi	= new DqmItemArmor(ItemIDHONOO - 256 + 1, DqmEnumArmorMaterial.HONOO, index, 1,1300).setItemName("Honoonoyoroi").setIconCoord(12, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDMIRA > 0) {			int index = ModLoader.addArmor("MIRA");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Mirayoroi	= new DqmItemArmor(ItemIDMIRA - 256 + 1, DqmEnumArmorMaterial.MIRA, index, 1,1800).setItemName("Mirayoroi").setIconCoord(14, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDYAIBA > 0) {			int index = ModLoader.addArmor("YAIBA");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Yaibanoyoroi	= new DqmItemArmor(ItemIDYAIBA - 256 + 1, DqmEnumArmorMaterial.YAIBA, index, 1,1500).setItemName("Yaibanoyoroi").setIconCoord(13, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDSINPI > 0) {			int index = ModLoader.addArmor("SINPI");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Sinpinoyoroi	= new DqmItemArmor(ItemIDSINPI - 256 + 1, DqmEnumArmorMaterial.SINPI, index, 1,2000).setItemName("Sinpinoyoroi").setIconCoord(15, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDSURA > 0) {			int index = ModLoader.addArmor("SURA");
		Suraimuhead	= new DqmItemArmor(ItemIDSURA - 256 + 0, DqmEnumArmorMaterial.SURA, index, 0,300).setItemName("Suraimuhead").setIconCoord(11, 5);
		Suraimunofuku	= new DqmItemArmor(ItemIDSURA - 256 + 1, DqmEnumArmorMaterial.SURA, index, 1,10).setItemName("Suraimunofuku").setIconCoord(12, 5);
		//cccc	= new DqmItemArmor(ItemIDAAA - 256 + 2, DqmEnumArmorMaterial.AAA, index, 2,10).setItemName("cccc").setIconCoord(2, 4);
		//dddd	= new DqmItemArmor(ItemIDAAA - 256 + 3, DqmEnumArmorMaterial.AAA, index, 3,10).setItemName("dddd").setIconCoord(3, 4);
		}
		if (ItemIDDRAGON > 0) {			int index = ModLoader.addArmor("DRAGON");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Doragonmeiru	= new DqmItemArmor(ItemIDDRAGON - 256 + 1, DqmEnumArmorMaterial.DRAGON, index, 1,1200).setItemName("Doragonmeiru").setIconCoord(11, 4);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}


		/** Register a new seed to be dropped when breaking tall grass.
		 * @param bid The item ID of the seeds.
		 * @param metadata The metadata of the seeds.
		 * @param quantity The quantity of seeds to drop.
		 * @param probability The relative probability of the seeds, where wheat seeds are
		 * 10.
		 */















		//アイテム************************************************************************************************************************************************************
		Redoubu = new DqmItem(RedoubuID).setItemName("Redoubu").setIconCoord(0, 7);
		Amatuyunoito = new DqmItemFood(AmatuyunoitoID,0, 0.0F, false,64).setPotionEffect(Potion.moveSlowdown.id, 120, 5, 1.0F).setItemName("Amatuyunoito").setIconCoord(1, 7);
		Bakudanisi = new DqmItemTntEgg(BakudanisiID).setItemName("Bakudanisi").setIconCoord(9, 8);
		Bannouyaku = new DqmItemFood(BannouyakuID,0, 0.0F, false,64).setItemName("Bannouyaku").setIconCoord(1, 11);
		Goldburesuretto = new DqmItem(GoldburesurettoID).setItemName("Goldburesuretto").setIconCoord(0, 5);
		Goldring = new DqmItem(GoldringID).setItemName("Goldring").setIconCoord(2, 5);
		Hikarinoisi = new DqmItemFood(HikarinoisiID,0, 0.0F, false,64).setPotionEffect(Potion.regeneration.id, 60, 0, 1.0F).setItemName("Hikarinoisi").setIconCoord(2, 7);
		Hosinokakera = new DqmItemFood(HosinokakeraID,0, 0.0F, false,64).setPotionEffect(Potion.digSpeed.id, 120, 2, 1.0F).setItemName("Hosinokakera").setIconCoord(3, 7);
		Inferunoswordnoha = new DqmItem(InferunoswordnohaID).setItemName("Inferunoswordnoha").setIconCoord(3, 1);
		Inferunoswordnotuka = new DqmItem(InferunoswordnotukaID).setItemName("Inferunoswordnotuka").setIconCoord(3, 2);
		Kazekirinohane = new DqmItemFood(KazekirinohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 120, 2, 1.0F).setItemName("Kazekirinohane").setIconCoord(4, 7);
		Kinkai = new DqmItem(KinkaiID).setItemName("Kinkai").setIconCoord(5, 7);
		Koorinokessyou = new DqmItemFood(KoorinokessyouID,0, 0.0F, false,64).setPotionEffect(Potion.fireResistance.id, 60, 0, 1.0F).setItemName("Koorinokessyou").setIconCoord(6, 7);
		Koumorinohane = new DqmItemFood(KoumorinohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 60, 0, 1.0F).setItemName("Koumorinohane").setIconCoord(7, 9);
		Littlemedal = new DqmItem(LittlemedalID).setItemName("Littlemedal").setIconCoord(7, 7);
		Madarakumonoito = new DqmItemFood(MadarakumonoitoID,0, 0.0F, false,64).setPotionEffect(Potion.moveSlowdown.id, 120, 2, 1.0F).setItemName("Madarakumonoito").setIconCoord(8, 7);
		Majuunokawa = new DqmItem(MajuunokawaID).setItemName("Majuunokawa").setIconCoord(0, 9);
		Majuunotuno = new DqmItemFood(MajuunotunoID,0, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 60, 0, 1.0F).setItemName("Majuunotuno").setIconCoord(9, 7);
		Mamorinotane = new DqmItemFood(MamorinotaneID,1, 0.0F, false,64).setPotionEffect(Potion.resistance.id, 120, 1, 1.0F).setItemName("Mamorinotane").setIconCoord(3, 11);
		Metaloubu = new DqmItem(MetaloubuID).setItemName("Metaloubu").setIconCoord(10, 7);
		Metaru = new DqmItemFood(MetaruID,1, 0.0F, false,64).setPotionEffect(Potion.resistance.id, 300, 2, 1.0F).setItemName("Metaru").setIconCoord(11, 7);
		Metarukingnoha = new DqmItem(MetarukingnohaID).setItemName("Metarukingnoha").setIconCoord(1, 1);
		Metarukingnotuka = new DqmItem(MetarukingnotukaID).setItemName("Metarukingnotuka").setIconCoord(1, 2);
		Midorinokoke = new DqmItemFood(MidorinokokeID,0, 0.0F, false,64).setPotionEffect(Potion.hunger.id, 30, 0, 1.0F).setItemName("Midorinokoke").setIconCoord(4, 9);
		Migakizuna = new DqmItemFood(MigakizunaID,0, 0.0F, false,64).setPotionEffect(Potion.digSpeed.id, 60, 0, 1.0F).setItemName("Migakizuna").setIconCoord(12, 7);
		Misriru = new DqmItem(MisriruID).setItemName("Misriru").setIconCoord(13, 7);
		MysteryEgg = new DqmItemEgg(MysteryEggID).setItemName("MysteryEgg").setIconCoord(0, 13);
		Oriharukon = new DqmItem(OriharukonID).setItemName("Oriharukon").setIconCoord(14, 7);
		Puratina = new DqmItem(PuratinaID).setItemName("Puratina").setIconCoord(15, 7);
		Rotonoha = new DqmItem(RotonohaID).setItemName("Rotonoha").setIconCoord(2, 1);
		Rotonotuka = new DqmItem(RotonotukaID).setItemName("Rotonotuka").setIconCoord(2, 2);
		Seijanohai = new DqmItemFood(SeijanohaiID,0, 0.0F, false,64).setPotionEffect(Potion.blindness.id, 30, 0, 1.0F).setItemName("Seijanohai").setIconCoord(0, 8);
		Seireiseki = new DqmItemFood(SeireisekiID,0, 0.0F, false,64).setPotionEffect(Potion.regeneration.id, 300, 5, 1.0F).setItemName("Seireiseki").setIconCoord(1, 8);
		Sinkanohiseki = new DqmItemFood(SinkanohisekiID,0, 0.0F, false,64).setItemName("Sinkanohiseki").setIconCoord(2, 8);
		Subayasanotane = new DqmItemFood(SubayasanotaneID,1, 0.0F, false,64).setPotionEffect(Potion.moveSpeed.id, 120, 2, 1.0F).setItemName("Subayasanotane").setIconCoord(4, 11);
		Suraimunokanmuri = new DqmItem(SuraimunokanmuriID).setItemName("Suraimunokanmuri").setIconCoord(3, 8);
		Suraimuzeri = new DqmItemFood(SuraimuzeriID,4, 0.0F, false,64).setItemName("Suraimuzeri").setIconCoord(4, 8);
		Kenjanoseisui = new DqmItemFood(KenjanoseisuiID,0, 0.0F, false,64).setPotionEffect(Potion.waterBreathing.id, 200, 2, 1.0F).setItemName("Kenjanoseisui").setIconCoord(5, 8);
		Tekkouseki = new DqmItemFood(TekkousekiID,1, 0.0F, false,64).setPotionEffect(Potion.resistance.id, 60, 0, 1.0F).setItemName("Tekkouseki").setIconCoord(6, 8);
		Tikaranotane = new DqmItemFood(TikaranotaneID,1, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 120, 1, 1.0F).setItemName("Thikaranotane").setIconCoord(2, 11);
		Tokinosuisyou = new DqmItem(TokinosuisyouID).setItemName("Tokinosuisyou").setIconCoord(7, 8);
		Tyounohane = new DqmItemFood(TyounohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 60, 0, 1.0F).setItemName("Tyounohane").setIconCoord(3, 9);
		Uruwasikinoko = new DqmItemFood(UruwasikinokoID,5, 0.0F, false,64).setPotionEffect(Potion.confusion.id, 60, 0, 1.0F).setItemName("Uruwasikinoko").setIconCoord(2, 9);
		Usaginosippo = new DqmItem(UsaginosippoID).setItemName("Usaginosippo").setIconCoord(6, 9);
		Yakusou = new DqmItemFood(YakusouID,1, 0.0F, false,64).setItemName("Yakusou").setIconCoord(0, 11);
		Yawarakauru = new DqmItem(YawarakauruID).setItemName("Yawarakauru").setIconCoord(1, 9);
		Yogoretahoutai = new DqmItemFood(YogoretahoutaiID,0, 0.0F, false,64).setPotionEffect(Potion.hunger.id, 90, 5, 1.0F).setItemName("Yogoretahoutai").setIconCoord(5, 9);
		Yougansekinokakera = new DqmItemFood(YougansekinokakeraID,0, 0.0F, false,64).setPotionEffect(Potion.weakness.id, 60, 0, 1.0F).setItemName("Yougansekinokakera").setIconCoord(8, 8);
		Kagaminoisi = new DqmItem(KagaminoisiID).setItemName("Kagaminoisi").setIconCoord(15, 8);
		Inotinoisi = new DqmItem(InotinoisiID, 1).setNoRepair().setItemName("Inotinoisi").setIconCoord(14, 8);
		Taiyounoisi = new DqmItemFood(TaiyounoisiID,0, 0.0F, false,64).setPotionEffect(Potion.regeneration.id, 150, 2, 1.0F).setItemName("Taiyounoisi").setIconCoord(13, 8);
		Ryuunonamida = new DqmItemFood(RyuunonamidaID,0, 0.0F, false,64).setPotionEffect(Potion.fireResistance.id, 300, 5, 1.0F).setItemName("Ryuunonamida").setIconCoord(12, 8);
		Ikazutinotama = new DqmItem(IkazutinotamaID).setItemName("Ikazutinotama").setIconCoord(11, 8);
		Honehone = new DqmItemFood(HonehoneID,0, 0.0F, false,64).setPotionEffect(Potion.hunger.id, 90, 5, 1.0F).setItemName("Honehone").setIconCoord(11, 9);
		Rengokunohane = new DqmItemFood(RengokunohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 300, 5, 1.0F).setItemName("Rengokunohane").setIconCoord(10, 9);
		Kyodainakiba = new DqmItemFood(KyodainakibaID,0, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 300, 2, 1.0F).setItemName("Kyodainakiba").setIconCoord(9, 9);
		Togetogenokiba = new DqmItemFood(TogetogenokibaID,20, 0.0F, false,64).setPotionEffect(Potion.harm.id, 2, 0, 1.0F).setItemName("Togetogenokiba").setIconCoord(8, 9);
		Jouyakusou = new DqmItemFood(JouyakusouID,1, 0.0F, false,64).setItemName("Jouyakusou").setIconCoord(5, 11);
		Tokuyakusou = new DqmItemFood(TokuyakusouID,1, 0.0F, false,64).setItemName("Tokuyakusou").setIconCoord(6, 11);
		Sekaijunoha = new DqmItemFood(SekaijunohaID,20, 0.0F, false,64).setPotionEffect(Potion.heal.id, 2, 5, 1.0F).setItemName("Sekaijunoha").setIconCoord(7, 11);
		Kimeranotubasa = new DqmItem(KimeranotubasaID, 1).setItemName("Kimeranotubasa").setNoRepair().setIconCoord(1, 13);
		Hokoranokagi = new DqmItem(HokoranokagiID).setItemName("Hokoranokagi").setIconCoord(0, 14);
		Touzokunokagi = new DqmItem(TouzokunokagiID).setItemName("Touzokunokagi").setIconCoord(1, 14);
		Mahounokagi = new DqmItem(MahounokagiID).setItemName("Mahounokagi").setIconCoord(2, 14);
		Saigonokagi = new DqmItem(SaigonokagiID).setItemName("Saigonokagi").setIconCoord(3, 14);
		Kenjanoisi = new DqmItem(KenjanoisiID, 1).setItemName("Kenjanoisi").setNoRepair().setIconCoord(10, 8);
		Dokukesisou = new DqmItemFood(DokukesisouID,1, 0.0F, false,64).setItemName("Dokukesisou").setIconCoord(8, 11);
		Rubinogenseki = new DqmItem(RubinogensekiID).setItemName("Rubinogenseki").setIconCoord(12, 9);
		Papasunokatami = new DqmItemKirapanBike(PapasunokatamiID).setItemName("Papasunokatami").setIconCoord(2, 13);
		Ramia = new DqmItemRamiaBike(RamiaID).setItemName("Ramia").setIconCoord(3, 13);
		Dragonwing = new DqmItemDragonBike(DragonwingID).setItemName("Dragonwing").setIconCoord(4, 13);
		Moon = new DqmItem(MoonID).setItemName("Moon").setIconCoord(13, 9);
		Buruoubu = new DqmItem(BuruoubuID).setItemName("Buruoubu").setIconCoord(0, 10);
		Ierooubu = new DqmItem(IerooubuID).setItemName("Ierooubu").setIconCoord(1, 10);
		Paapuruoubu = new DqmItem(PaapuruoubuID).setItemName("Paapuruoubu").setIconCoord(3, 10);
		Gurinoubu = new DqmItem(GurinoubuID).setItemName("Gurinoubu").setIconCoord(2, 10);


		Rakkipendanto = new DqmItem(RakkipendantoID).setMaxStackSize(1).setItemName("Rakkipendanto").setIconCoord(3, 6);
		Mamorinorubi = new DqmItem(MamorinorubiID).setMaxStackSize(1).setItemName("Mamorinorubi").setIconCoord(2, 6);
		Tikaranorubi = new DqmItem(TikaranorubiID).setMaxStackSize(1).setItemName("Tikaranorubi").setIconCoord(0, 6);
		Gouketunoudewa = new DqmItem(GouketunoudewaID).setMaxStackSize(1).setItemName("Gouketunoudewa").setIconCoord(1, 6);
		Hayatenoring = new DqmItem(HayatenoringID).setMaxStackSize(1).setItemName("Hayatenoring").setIconCoord(3, 5);
		Hosifuru = new DqmItem(HosifuruID).setMaxStackSize(1).setItemName("Hosifuru").setIconCoord(1, 5);
		/*
		moveSpeed	//idou
		moveSlowdown	//idou
		digSpeed	//horu
		digSlowdown	//horu
		damageBoost	//dame-ji
		heal	//kaifuku
		harm	//gai
		jump	//jump
		confusion	//konnran
		regeneration	//rjene
		resistance	//teikou
		fireResistance	//hi taisei
		waterBreathing	//kokyuu
		invisibility	//fukasi
		blindness	//situmei
		nightVision	//yoru siryoku
		hunger	//kuufuku
		weakness	//jakuten
		*/

		//効果名、時間、レベル、確立？
	    //public static final Potion heal = (new PotionHealth(6, false, 16262179)).setPotionName("potion.heal");
	    //public static final Potion harm = (new PotionHealth(7, true, 4393481)).setPotionName("potion.harm");
		/*
	    public ItemFood setPotionEffect(int par1, int par2, int par3, float par4)
	    {
	        this.potionId = par1;
	        this.potionDuration = par2;
	        this.potionAmplifier = par3;
	        this.potionEffectProbability = par4;
	        return this;
	    }
	        public ItemFood setPotionEffect(int par1, int par2, int par3, float par4)
    {
        this.potionId = par1;
        this.potionDuration = par2;
        this.potionAmplifier = par3;
        this.potionEffectProbability = par4;
        return this;
    }
	    *
	    *
	    */
		//ID,0,個数,確立
		ForgeHooks.addGrassSeed(Yakusou.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(Dokukesisou.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(Tikaranotane.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(Mamorinotane.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(Subayasanotane.shiftedIndex,0, 1, 1);
		ModLoader.setInGUIHook(this, true, false);
		ModLoader.setInGameHook(this, true, false);
		MinecraftForge.registerEntityLivingHandler(new DqmEntityLivingHandler());

		DqmAddName.setName();
		DqmAddItemRecipe.addRecipe();

	}
	//Player's special inventory, doesn't drop items, when you die, and a record of it is kept for the Minecraft world;



	//Perform this function, each update tick, that the player is in a menu.
	@Override
	public boolean onTickInGUI(float f,Minecraft minecraft, GuiScreen guiscreen){
		if(minecraft!=null){
			ensureInventoryKept(minecraft);
		}
		return true;
	}

	@Override
	public boolean onTickInGame(float f,Minecraft minecraft)
	{
		EntityPlayerSP sp = ModLoader.getMinecraftInstance().thePlayer;
		DIP.EpPositionX = (int)sp.posX;
		DIP.EpPositionY = (int)sp.posY;
		DIP.EpPositionZ = (int)sp.posZ;
		if(minecraft!=null){
			ensureInventoryKept(minecraft);
		}
		return true;
	}

	ISaveHandler prevSaveHandler=null;
	public void ensureInventoryKept(Minecraft minecraft){
		World world=minecraft.theWorld;
		if(minecraft!=null && world!=null){
			if(world.isRemote) {
				return;
			}
			EntityPlayerSP currentPlayer =minecraft.thePlayer;
			if(minecraft.thePlayer==null){
				return;
			}
			if(currentPlayer.inventory!=null && !(currentPlayer.inventory instanceof DqmInventoryPlayer)){

				if(playersSpecialInventory==null || playersSpecialInventory.saveHandler!=world.saveHandler){
					playersSpecialInventory=new DqmInventoryPlayer(currentPlayer.inventory,world.saveHandler);
				}
				currentPlayer.inventory=playersSpecialInventory;
				currentPlayer.inventorySlots = new ContainerPlayer(currentPlayer.inventory, !world.isRemote);
				currentPlayer.craftingInventory=currentPlayer.inventorySlots;
				playersSpecialInventory.player=currentPlayer;
			}
		}
	}


	/*
moveSpeed	//idou
moveSlowdown	//idou
digSpeed	//horu
digSlowdown	//horu
damageBoost	//dame-ji
heal	//kaifuku
harm	//gai
jump	//jump
confusion	//konnran
regeneration	//rjene
resistance	//teikou
fireResistance	//hi taisei
waterBreathing	//kokyuu
invisibility	//fukasi
blindness	//situmei
nightVision	//yoru siryoku
hunger	//kuufuku
weakness	//jakuten
	 */
	//mob render************************************************************************************************************************************************************
	@Override
	public void addRenderer(Map renderers)
	{
		renderers.put(DqmEntityTntEgg.class, new DqmRenderEgg(Bakudanisi.iconIndex));
		renderers.put(DqmEntityEgg.class, new DqmRenderEgg(MysteryEgg.iconIndex));
		renderers.put(DqmEntityKirapanBike.class, new DqmRenderKirapanBike(new DqmModelKirapanBike()));
		renderers.put(DqmEntityRamiaBike.class, new DqmRenderRamiaBike());
		renderers.put(DqmEntityDragonBike.class, new DqmRenderDragonBike());
	}
	@Override
	public String getVersion()
	{
		return "MC1.2.5 DQMcore v12.3";
	}
}