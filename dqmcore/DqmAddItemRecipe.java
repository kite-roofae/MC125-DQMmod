package net.minecraft.src.dqmcore;
import cpw.mods.fml.common.registry.FMLRegistry;
import net.minecraft.src.*;



public class DqmAddItemRecipe extends mod_Dqm
{


	public static void addRecipe()
	{
		//不定形レシピ
    	ModLoader.addShapelessRecipe(new ItemStack(Bannouyaku ,1),new Object[]{
    		new ItemStack(Yakusou, 1), new ItemStack(Dokukesisou, 1)});
    	ModLoader.addShapelessRecipe(new ItemStack(Jouyakusou ,2),new Object[]{
    		new ItemStack(Yakusou, 1),new ItemStack(Yakusou, 1),new ItemStack(Yakusou, 1)});
    	ModLoader.addShapelessRecipe(new ItemStack(Tokuyakusou ,2),new Object[]{
    		new ItemStack(Jouyakusou, 1),new ItemStack(Jouyakusou, 1),new ItemStack(Jouyakusou, 1)});
    	ModLoader.addShapelessRecipe(new ItemStack(Kimeranotubasa ,1),new Object[]{
    		new ItemStack(Kazekirinohane, 1),new ItemStack(Koumorinohane, 1),new ItemStack(Tyounohane, 1)});

		//固定レシピ
		ModLoader.addRecipe(new ItemStack(Rakkipendanto ,1),new Object[]{
			"WXZ",
			"XYX",
			"VXW",
			Character.valueOf('V'),Littlemedal,Character.valueOf('W'),Hikarinoisi, Character.valueOf('X'),Amatuyunoito, Character.valueOf('Y'),Seireiseki, Character.valueOf('Z'),Metaloubu,});
		ModLoader.addRecipe(new ItemStack(Mamorinorubi ,1),new Object[]{
			"WXY",
			"ZVZ",
			"YXW",
			Character.valueOf('V'),Rubinogenseki,Character.valueOf('W'),Kinkai, Character.valueOf('X'),Mamorinotane, Character.valueOf('Y'),Hikarinoisi, Character.valueOf('Z'),Taiyounoisi,});
		ModLoader.addRecipe(new ItemStack(Gouketunoudewa ,1),new Object[]{
			"WYW",
			"YXY",
			"WYW",
			Character.valueOf('W'),Tikaranorubi, Character.valueOf('X'),Goldburesuretto, Character.valueOf('Y'),Metaloubu});
		ModLoader.addRecipe(new ItemStack(Tikaranorubi ,1),new Object[]{
			"UZW",
			"XVZ",
			"YXU",
			Character.valueOf('U'),Hosinokakera,Character.valueOf('V'),Rubinogenseki,Character.valueOf('W'),Kinkai, Character.valueOf('X'),Tikaranotane, Character.valueOf('Y'),Hikarinoisi, Character.valueOf('Z'),Taiyounoisi,});


		ModLoader.addRecipe(new ItemStack(Honoonoyoroi ,1),new Object[]{
			"WXW",
			"ZYZ",
			"WXW",
			Character.valueOf('W'),Taiyounoisi, Character.valueOf('X'),Yougansekinokakera, Character.valueOf('Y'),Akaitama, Character.valueOf('Z'),Rengokunohane,});
		ModLoader.addRecipe(new ItemStack(Mirayoroi ,1),new Object[]{
			"WXW",
			"XYX",
			"WXW",
			Character.valueOf('W'),Kagaminoisi, Character.valueOf('X'),Oriharukon, Character.valueOf('Y'),Metaloubu,});
		ModLoader.addRecipe(new ItemStack(Doragonmeiru ,1),new Object[]{
			"WXW",
			"YVY",
			"ZXZ",
			Character.valueOf('V'),Ryuunonamida,Character.valueOf('W'),Togetogenokiba, Character.valueOf('X'),Midorinokoke, Character.valueOf('Y'),Majuunokawa, Character.valueOf('Z'),Honehone,});
		ModLoader.addRecipe(new ItemStack(Yaibanoyoroi ,1),new Object[]{
			"WXW",
			"YZY",
			"VYV",
			Character.valueOf('V'),Majuunotuno,Character.valueOf('W'),Kyodainakiba, Character.valueOf('X'),Majuunokawa, Character.valueOf('Y'),Togetogenokiba, Character.valueOf('Z'),Ikazutinotama,});
		ModLoader.addRecipe(new ItemStack(Kisekinoturugi ,1),new Object[]{
			"WXX",
			"XYX",
			"ZXW",
			Character.valueOf('W'),Taiyounoisi, Character.valueOf('X'),Inotinoisi, Character.valueOf('Y'),Kenjanoisi, Character.valueOf('Z'),Metarukingnotuka,});
		ModLoader.addRecipe(new ItemStack(Papasunoturuginew ,1),new Object[]{
			"XZX",
			"ZYZ",
			"WZX",
			Character.valueOf('W'),Papasunoturugi, Character.valueOf('X'),Migakizuna, Character.valueOf('Y'),Hikarinoisi, Character.valueOf('Z'),Kagaminoisi,});
		ModLoader.addRecipe(new ItemStack(Oujanoturugi ,1),new Object[]{
			"VWZ",
			"WXW",
			"YWV",
			Character.valueOf('V'),Kinkai,Character.valueOf('W'),Oriharukon, Character.valueOf('X'),Taiyounoisi, Character.valueOf('Y'),Seireiseki, Character.valueOf('Z'),Metarukingnoha,});
		ModLoader.addRecipe(new ItemStack(Toraidento ,1),new Object[]{
			" WX",
			"ZYW",
			"ZZ ",
			Character.valueOf('W'),Majuunotuno, Character.valueOf('X'),Kyodainakiba, Character.valueOf('Y'),Kenjanoseisui, Character.valueOf('Z'),Misriru,});
		ModLoader.addRecipe(new ItemStack(Hayabusanoturugi ,1),new Object[]{
			"WXW",
			"YZX",
			"WYW",
			Character.valueOf('W'),Littlemedal, Character.valueOf('X'),Hayatenoring, Character.valueOf('Y'),Kinkai, Character.valueOf('Z'),Haganenoturugi,});
		ModLoader.addRecipe(new ItemStack(Sefiramunoyumi ,1),new Object[]{
			"WWX",
			"WYZ",
			"XZZ",
			Character.valueOf('W'),Oriharukon, Character.valueOf('X'),Akaitama, Character.valueOf('Y'),Ryuunonamida, Character.valueOf('Z'),Amatuyunoito,});
		ModLoader.addRecipe(new ItemStack(Kenjanoisi ,1),new Object[]{
			" WW",
			" WW",
			"X  ",
			Character.valueOf('W'),Inotinoisi, Character.valueOf('X'),Kinkai, });
		ModLoader.addRecipe(new ItemStack(Kawanobousi ,1),new Object[]{
			"WWW",
			"W W",
			//"W W",
			Character.valueOf('W'),Majuunokawa,});
		ModLoader.addRecipe(new ItemStack(Kawanoyoroi ,1),new Object[]{
			"W W",
			"WWW",
			"WWW",
			Character.valueOf('W'),Majuunokawa,});
		ModLoader.addRecipe(new ItemStack(Kawanokote ,1),new Object[]{
			"WWW",
			"W W",
			"W W",
			Character.valueOf('W'),Majuunokawa,});
		ModLoader.addRecipe(new ItemStack(Kawanokutu ,1),new Object[]{
			"W W",
			"W W",
			//"W W",
			Character.valueOf('W'),Majuunokawa,});
		ModLoader.addRecipe(new ItemStack(Suraimunofuku ,1),new Object[]{
			"WWW",
			"WXW",
			"WWW",
			Character.valueOf('W'),Suraimuzeri,Character.valueOf('X'),Majuunokawa,  });









		//Swoed
		ModLoader.addRecipe(new ItemStack(Rotonoturugi ,1),new Object[]{
			" WX",
			"WYW",
			"ZW ",
			Character.valueOf('W'),Hikarinoisi, Character.valueOf('X'),Rotonoha, Character.valueOf('Y'),Kenjanoseisui, Character.valueOf('Z'),Rotonotuka,});
		ModLoader.addRecipe(new ItemStack(Rotonotuka ,1),
				new Object[]{ "X  ","ZY ","XZX",
			Character.valueOf('X'),Kinkai,
			Character.valueOf('Y'),Akaitama,
			Character.valueOf('Z'),Tokinosuisyou,
		});
		ModLoader.addRecipe(new ItemStack(Rotonoha ,1),
				new Object[]{ " YX","YXY","XY ",
			Character.valueOf('X'),Misriru,
			Character.valueOf('Y'),Oriharukon,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnotuka ,1),
				new Object[]{ "X  ","ZY ","XZX",
			Character.valueOf('X'),Metaru,
			Character.valueOf('Y'),Metaloubu,
			Character.valueOf('Z'),Littlemedal,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnoha ,1),
				new Object[]{ " YX","YXY","XY ",
			Character.valueOf('X'),Metaru,
			Character.valueOf('Y'),Misriru,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnoturugi ,1),
				new Object[]{ " WX","WYW","ZW ",
			Character.valueOf('W'),Littlemedal,
			Character.valueOf('X'),Metarukingnoha,
			Character.valueOf('Y'),Kenjanoseisui,
			Character.valueOf('Z'),Metarukingnotuka,
		});
		ModLoader.addRecipe(new ItemStack(Ginganoturugi ,1),
				new Object[]{ "YYX","YWY","ZYY",
			Character.valueOf('X'),Metarukingnoturugi,
			Character.valueOf('Y'),Hikarinoisi,
			Character.valueOf('Z'),Rotonoturugi,
			Character.valueOf('W'),Sinkanohiseki,
		});
		ModLoader.addRecipe(new ItemStack(Koorinoyaiba ,1),
				new Object[]{ "XZX","ZXZ","YZX",
			Character.valueOf('X'),Koorinokessyou,
			Character.valueOf('Y'),Tokinosuisyou,
			Character.valueOf('Z'),Majuunotuno,
		});
		ModLoader.addRecipe(new ItemStack(Inferunoswordnoha ,1),
				new Object[]{ " XY","XYX","YX ",
			Character.valueOf('X'),Yougansekinokakera,
			Character.valueOf('Y'),Oriharukon,
		});
		ModLoader.addRecipe(new ItemStack(Inferunoswordnotuka ,1),
				new Object[]{ "XX ","XYX","WXX",
			Character.valueOf('W'),Kinkai,
			Character.valueOf('X'),Yougansekinokakera,
			Character.valueOf('Y'),Oriharukon,
			Character.valueOf('Y'),Seireiseki,
		});
		ModLoader.addRecipe(new ItemStack(Inferunosword ,1),
				new Object[]{ " WX","WZW","YW ",
			Character.valueOf('W'),Yougansekinokakera,
			Character.valueOf('X'),Inferunoswordnoha,
			Character.valueOf('Y'),Inferunoswordnotuka,
			Character.valueOf('Z'),Kenjanoseisui,
		});
		ModLoader.addRecipe(new ItemStack(Uminarinotue ,1),
				new Object[]{ " ZX"," YZ","Y  ",
			Character.valueOf('X'),Seireiseki,
			Character.valueOf('Y'),Tokinosuisyou,
			Character.valueOf('Z'),Koorinokessyou,
		});

		ModLoader.addRecipe(new ItemStack(Doragonkira ,1),
				new Object[]{ "ZXW","YWX","XYZ",
			Character.valueOf('W'),Majuunotuno,
			Character.valueOf('X'),Majuunokawa,
			Character.valueOf('Y'),Koumorinohane,
			Character.valueOf('Z'),Midorinokoke,
		});
		ModLoader.addRecipe(new ItemStack(Haganenoturugi ,1),
				new Object[]{ "  X","YX ","ZY ",
			Character.valueOf('X'),Tekkouseki,
			Character.valueOf('Y'),Item.ingotIron,
			Character.valueOf('Z'),Kinkai,
		});
		ModLoader.addRecipe(new ItemStack(Heisinoken ,1),
				new Object[]{ "  X"," X ","Y  ",
			Character.valueOf('X'),Tekkouseki,
			Character.valueOf('Y'),Item.stick,
		});

		//item
		ModLoader.addRecipe(new ItemStack(Akaitama ,1),
				new Object[]{ " X ","XYX"," X ",
			Character.valueOf('X'),Yougansekinokakera,
			Character.valueOf('Y'),Metaloubu,
		});
		ModLoader.addRecipe(new ItemStack(Kinkai ,1),
				new Object[]{ " X ","XXX",
			Character.valueOf('X'),Item.ingotGold,
		});
		ModLoader.addRecipe(new ItemStack(Kenjanoseisui ,1),
				new Object[]{ "XXX","YZY","YYY",
			Character.valueOf('X'),Suraimuzeri,
			Character.valueOf('Y'),Block.glass,
			Character.valueOf('Z'),Item.bucketWater,
		});
		ModLoader.addRecipe(new ItemStack(Suraimunokanmuri ,1),
				new Object[]{ "XXX","X X","XXX",
			Character.valueOf('X'),Littlemedal,
		});
		ModLoader.addRecipe(new ItemStack(Sabitatate ,1),
				new Object[]{ "XXX","XXX","XXX",
			Character.valueOf('X'),Littlemedal,
		});
		ModLoader.addRecipe(new ItemStack(Amatuyunoito ,1),
				new Object[]{ "ZXZ","XYX","ZXZ",
			Character.valueOf('X'),Madarakumonoito,
			Character.valueOf('Y'),Tokinosuisyou,
			Character.valueOf('Z'),Suraimuzeri,
		});


		//bow
		ModLoader.addRecipe(new ItemStack(Kazekirinoyumi ,1),
				new Object[]{ "ZXX","XWY","XYY",
			Character.valueOf('X'),Kazekirinohane,
			Character.valueOf('Y'),Amatuyunoito,
			Character.valueOf('Z'),Seireiseki,
			Character.valueOf('W'),Item.bow,
		});
		ModLoader.addRecipe(new ItemStack(Item.arrow ,16),
				new Object[]{ "  Z"," Y ","X  ",
			Character.valueOf('X'),Kazekirinohane,
			Character.valueOf('Y'),Item.stick,
			Character.valueOf('Z'),Item.flint,
		});

		//akuse
		ModLoader.addRecipe(new ItemStack(Goldburesuretto ,1),
				new Object[]{ "XXX","X X","XXX",
			Character.valueOf('X'),Kinkai,
		});
		ModLoader.addRecipe(new ItemStack(Goldring ,1),
				new Object[]{ " X ","X X"," X ",
			Character.valueOf('X'),Kinkai,
		});
		ModLoader.addRecipe(new ItemStack(Hosifuru ,1),
				new Object[]{ "ZWZ","YXY","ZWZ",
			Character.valueOf('W'),Seireiseki,
			Character.valueOf('X'),Goldburesuretto,
			Character.valueOf('Y'),Kazekirinohane,
			Character.valueOf('Z'),Hosinokakera,
		});
		ModLoader.addRecipe(new ItemStack(Seireiseki ,1),
				new Object[]{ " X ","YZY"," X ",
			Character.valueOf('X'),Koorinokessyou,
			Character.valueOf('Y'),Yougansekinokakera,
			Character.valueOf('Z'),Puratina,
		});
		ModLoader.addRecipe(new ItemStack(Hayatenoring ,1),
				new Object[]{ "ZWZ","YXY","ZWZ",
			Character.valueOf('W'),Tokinosuisyou,
			Character.valueOf('X'),Goldring,
			Character.valueOf('Y'),Metaru,
			Character.valueOf('Z'),Kazekirinohane,
		});

		//Armor item

		ModLoader.addRecipe(new ItemStack(Migakizuna ,1),
				new Object[]{ "XXX","XYX","XXX",
			Character.valueOf('X'),Block.sand,
			Character.valueOf('Y'),Seijanohai,
		});
		ModLoader.addRecipe(new ItemStack(Hikarinoisi ,1),
				new Object[]{ " X ","XYX"," X ",
			Character.valueOf('X'),Tokinosuisyou,
			Character.valueOf('Y'),Sinkanohiseki,
		});
		ModLoader.addRecipe(new ItemStack(Sinkanohiseki ,1),
				new Object[]{ "YYY","YXY","YYY",
			Character.valueOf('X'),Seireiseki,
			Character.valueOf('Y'),Yougansekinokakera,
		});
		ModLoader.addRecipe(new ItemStack(Tekkouseki ,1),
				new Object[]{ "YYY","XXX","YYY",
			Character.valueOf('X'),Item.ingotIron,
			Character.valueOf('Y'),Yougansekinokakera,
		});
		ModLoader.addRecipe(new ItemStack(Metaloubu ,1),
				new Object[]{ "XXX","XYX","XXX",
			Character.valueOf('X'),Metaru,
			Character.valueOf('Y'),Hikarinoisi,
		});


		//Armor


		ModLoader.addRecipe(new ItemStack(Rotonokabuto ,1),
				new Object[]{ "ZYZ","ZXZ","ZYZ",
			Character.valueOf('X'),Sabitakabuto,
			Character.valueOf('Y'),Hikarinoisi,
			Character.valueOf('Z'),Migakizuna,
		});
		ModLoader.addRecipe(new ItemStack(Rotonoyoroi ,1),
				new Object[]{ "ZYZ","ZXZ","ZYZ",
			Character.valueOf('X'),Sabitayoroi,
			Character.valueOf('Y'),Hikarinoisi,
			Character.valueOf('Z'),Migakizuna,
		});
		ModLoader.addRecipe(new ItemStack(Rotonokote ,1),
				new Object[]{ "ZYZ","ZXZ","ZYZ",
			Character.valueOf('X'),Sabitakote,
			Character.valueOf('Y'),Hikarinoisi,
			Character.valueOf('Z'),Migakizuna,
		});
		ModLoader.addRecipe(new ItemStack(Rotonokutu ,1),
				new Object[]{ "ZYZ","ZXZ","ZYZ",
			Character.valueOf('X'),Sabitakutu,
			Character.valueOf('Y'),Hikarinoisi,
			Character.valueOf('Z'),Migakizuna,
		});
		ModLoader.addRecipe(new ItemStack(Rotonotate ,1),
				new Object[]{ "ZYZ","ZXZ","ZYZ",
			Character.valueOf('X'),Sabitatate,
			Character.valueOf('Y'),Hikarinoisi,
			Character.valueOf('Z'),Migakizuna,
		});
		ModLoader.addRecipe(new ItemStack(Haganenokabuto ,1),
				new Object[]{ "YZY","XXX","XWX",
			Character.valueOf('W'),Kinkai,
			Character.valueOf('X'),Tekkouseki,
			Character.valueOf('Y'),Item.redstone,
			Character.valueOf('Z'),Kazekirinohane,
		});
		ModLoader.addRecipe(new ItemStack(Haganenoyoroi ,1),
				new Object[]{ "XYX","XXX","XYX",
			Character.valueOf('X'),Tekkouseki,
			Character.valueOf('Y'),Kinkai,
		});
		ModLoader.addRecipe(new ItemStack(Haganenokote ,1),
				new Object[]{ "XYX","XYX","XYX",
			Character.valueOf('X'),Tekkouseki,
			Character.valueOf('Y'),Kinkai,
		});
		ModLoader.addRecipe(new ItemStack(Haganenokutu ,1),
				new Object[]{ "XYX","X X","Y Y",
			Character.valueOf('X'),Tekkouseki,
			Character.valueOf('Y'),Kinkai,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnokabuto ,1),
				new Object[]{ "XZX","XYX","XYX",
			Character.valueOf('X'),Metaloubu,
			Character.valueOf('Y'),Oriharukon,
			Character.valueOf('Z'),Suraimunokanmuri,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnoyoroi ,1),
				new Object[]{ "XYX","XZX","XYX",
			Character.valueOf('X'),Metaloubu,
			Character.valueOf('Y'),Oriharukon,
			Character.valueOf('Z'),Suraimunokanmuri,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnokote ,1),
				new Object[]{ "XZX","YXY","YXY",
			Character.valueOf('X'),Metaloubu,
			Character.valueOf('Y'),Oriharukon,
			Character.valueOf('Z'),Suraimunokanmuri,
		});
		ModLoader.addRecipe(new ItemStack(Metarukingnokutu ,1),
				new Object[]{ "XYX","XZX","Y Y",
			Character.valueOf('X'),Metaloubu,
			Character.valueOf('Y'),Oriharukon,
			Character.valueOf('Z'),Suraimunokanmuri,
		});



		//精錬アイテム
		ModLoader.addSmelting(Littlemedal.shiftedIndex, new ItemStack(Oriharukon ,1));
		ModLoader.addSmelting(Block.obsidian.blockID, new ItemStack(Yougansekinokakera ,1));
		ModLoader.addSmelting(Yougansekinokakera.shiftedIndex, new ItemStack(Seijanohai ,1));
		ModLoader.addSmelting(Kazekirinohane.shiftedIndex, new ItemStack(Rengokunohane ,1));
		ModLoader.addSmelting(Inotinoisi.shiftedIndex, new ItemStack(Taiyounoisi ,1));
		ModLoader.addSmelting(Oriharukon.shiftedIndex, new ItemStack(Inotinoisi ,1));
	}
}