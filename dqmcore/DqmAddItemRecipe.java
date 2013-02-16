package net.minecraft.src.dqmcore;
import net.minecraft.src.*;
import net.minecraft.src.dqmcore.Block.DqmBlockOre;



public class DqmAddItemRecipe extends mod_Dqm
{


	public static void addRecipe()
	{
		//不定形レシピ
		ModLoader.addShapelessRecipe(new ItemStack(Tensinohane ,1),new Object[]{
			new ItemStack(Seijanohai, 1),new ItemStack(Meijikimeranohane, 1)});
				ModLoader.addShapelessRecipe(new ItemStack(Kiyomenomizu ,1),new Object[]{
					new ItemStack(Item.bucketWater, 1),new ItemStack(Seijanohai, 1)});


		ModLoader.addShapelessRecipe(new ItemStack(Iyasinomi ,1),new Object[]{
			new ItemStack(Yakusou2, 3),new ItemStack(Dokukesisou2, 3),new ItemStack(Tikaranotane2, 3)});
		ModLoader.addShapelessRecipe(new ItemStack(Honoonomi ,1),new Object[]{
			new ItemStack(Mamorinotane2, 3),new ItemStack(Dokukesisou2, 3),new ItemStack(Subayasanotane2, 3)});
		ModLoader.addShapelessRecipe(new ItemStack(Ougon ,1),new Object[]{
			new ItemStack(Yakusou3, 2),new ItemStack(Dokukesisou3, 1),new ItemStack(Tikaranotane3, 2),new ItemStack(Mamorinotane3, 2),new ItemStack(Subayasanotane3, 2)});


		ModLoader.addShapelessRecipe(new ItemStack(Bannouyaku ,1),new Object[]{
			new ItemStack(Yakusou, 1), new ItemStack(Dokukesisou, 1)});


		ModLoader.addShapelessRecipe(new ItemStack(Kimeranotubasa ,1),new Object[]{
			new ItemStack(Kazekirinohane, 1),new ItemStack(Koumorinohane, 1),new ItemStack(Tyounohane, 1)});

		//固定レシピ

		ModLoader.addRecipe(new ItemStack(Ginnoyubiwa ,1),new Object[]{
			" Y ",
			"YZY",
			" Y ",
			Character.valueOf('Y'),Migakizuna,Character.valueOf('Z'),Goldring});
			ModLoader.addRecipe(new ItemStack(Inotinoyubiwa ,1),new Object[]{
			" Y ",
			"YZY",
			" Y ",
			Character.valueOf('Y'),Inotinoisi,Character.valueOf('Z'),Ginnoyubiwa});
			ModLoader.addRecipe(new ItemStack(Ayasiikobin ,1),new Object[]{
			" Z ",
			"ZYZ",
			" Z ",
			Character.valueOf('Y'),Seisui,Character.valueOf('Z'),Ayakasisou});
			ModLoader.addRecipe(new ItemStack(Seisui ,1),new Object[]{
			" Y ",
			"YZY",
			" Y ",
			Character.valueOf('Y'),Yakusou,Character.valueOf('Z'),Kiyomenomizu});
			ModLoader.addRecipe(new ItemStack(Yuuwakunoyumi ,1),new Object[]{
			"XYY",
			"Y Z",
			"YZZ",
			Character.valueOf('X'),Ayakasisou,Character.valueOf('Y'),Ayasiikobin,Character.valueOf('Z'),Amatuyunoito});
			ModLoader.addRecipe(new ItemStack(Haganenoono ,1),new Object[]{
			"XYY",
			" ZY",
			" Z ",
			Character.valueOf('X'),Tukemonoisi,Character.valueOf('Y'),Tekkouseki,Character.valueOf('Z'),Item.stick});
			ModLoader.addRecipe(new ItemStack(Haganenokon ,1),new Object[]{
			" YY",
			" ZY",
			"Z  ",
			Character.valueOf('Y'),Tekkouseki,Character.valueOf('Z'),Item.stick});
			ModLoader.addRecipe(new ItemStack(Konbou ,1),new Object[]{
			"  Y",
			" Z ",
			"Z  ",
			Character.valueOf('Y'),Tekkouseki,Character.valueOf('Z'),Item.stick});
			ModLoader.addRecipe(new ItemStack(Dokubari ,1),new Object[]{
			" YY",
			"ZXY",
			"XZ ",
			Character.valueOf('X'),Tetunokugi,Character.valueOf('Y'),Dokudokuhedoro,Character.valueOf('Z'),Dokuganokona});
			ModLoader.addRecipe(new ItemStack(Oriharukonbou ,1),new Object[]{
			" YY",
			" YY",
			"Z  ",
			Character.valueOf('Y'),Oriharukon,Character.valueOf('Z'),Tekkouseki});
			ModLoader.addRecipe(new ItemStack(Wohanma ,1),new Object[]{
			" ZZ",
			" ZZ",
			"Z",
			Character.valueOf('Z'),Tekkouseki});
			ModLoader.addRecipe(new ItemStack(Sinpinoyoroi ,1),new Object[]{
			"VWV",
			"AXA",
			"YZY",
			Character.valueOf('V'),Doragonnonamida,Character.valueOf('W'),Tensinosoma,Character.valueOf('A'),Iyasinomi3,Character.valueOf('X'),Inotinoyubiwa,Character.valueOf('Y'),Hyoutyounohane,Character.valueOf('Z'),Seinarusizuku});
			ModLoader.addRecipe(new ItemStack(Tensinosoma ,1),new Object[]{
			" Y ",
			"YZY",
			" Y ",
			Character.valueOf('Y'),Tensinohane,Character.valueOf('Z'),Hananomitu});
			ModLoader.addRecipe(new ItemStack(Hyoutyounohane ,1),new Object[]{
			" Z ",
			"ZYZ",
			" Z ",
			Character.valueOf('Y'),Haganenoobane,Character.valueOf('Z'),Koorinokessyou});
			ModLoader.addRecipe(new ItemStack(Haounoono ,1),new Object[]{
			"YZY",
			"ZXZ",
			"YZY",
			Character.valueOf('X'),Haganenoono,Character.valueOf('Y'),Bekkou,Character.valueOf('Z'),Yorunotobari});
			ModLoader.addRecipe(new ItemStack(Urokonoyoroi ,1),new Object[]{
			"YZY",
			"XXX",
			"XXX",
			Character.valueOf('X'),Majuunokawa,Character.valueOf('Y'),Dokudokuhedoro,Character.valueOf('Z'),Dokuganokona});
			ModLoader.addRecipe(new ItemStack(Majinnokanaduti ,1),new Object[]{
			" ZZ",
			"XZZ",
			"YX ",
			Character.valueOf('X'),Toukonekisu,Character.valueOf('Y'),Misriru,Character.valueOf('Z'),Uraminohouju});
			ModLoader.addRecipe(new ItemStack(Dragonrod ,1),new Object[]{
			" YX",
			"ZYA",
			"YZ ",
			Character.valueOf('A'),Majuunotuno,Character.valueOf('X'),Kyodaihigetokage,Character.valueOf('Y'),Bekkou,Character.valueOf('Z'),Midorinokoke});
			ModLoader.addRecipe(new ItemStack(Uraminohouju ,1),new Object[]{
			" X ",
			"XZX",
			"YXY",
			Character.valueOf('X'),Juryokunomoto,Character.valueOf('Y'),Maryokunotuti,Character.valueOf('Z'),Ryuunonamida});
			ModLoader.addRecipe(new ItemStack(Seinarusizuku ,1),new Object[]{
			" X ",
			"XYX",
			"ZZZ",
			Character.valueOf('X'),Seisui,Character.valueOf('Y'),Doragonnonamida,Character.valueOf('Z'),Gamanoabura});
			ModLoader.addRecipe(new ItemStack(Ryuunohizake ,1),new Object[]{
			" X ",
			"YZY",
			" Y ",
			Character.valueOf('X'),Tikaranotane3,Character.valueOf('Y'),Kiyomenomizu,Character.valueOf('Z'),Honoonomi3});
			ModLoader.addRecipe(new ItemStack(Toukonekisu ,1),new Object[]{
			"YXY",
			"YZY",
			"YXY",
			Character.valueOf('X'),Saezurinomitu,Character.valueOf('Y'),DqmBlockGenkotu,Character.valueOf('Z'),Budouekisu});
			ModLoader.addRecipe(new ItemStack(Saezurinomitu ,1),new Object[]{
			"ZYZ",
			"YXY",
			"ZYZ",
			Character.valueOf('X'),Hananomitu,Character.valueOf('Y'),Umanofun,Character.valueOf('Z'),Usinofun});



		ModLoader.addRecipe(new ItemStack(Ougon3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Ougon2,Character.valueOf('W'),Dokukesisou3});
		ModLoader.addRecipe(new ItemStack(Ougon2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Ougon,Character.valueOf('W'),Dokukesisou3});
		ModLoader.addRecipe(new ItemStack(Iyasinomi3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Iyasinomi2,Character.valueOf('W'),Dokukesisou3});
		ModLoader.addRecipe(new ItemStack(Iyasinomi2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Iyasinomi,Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Honoonomi3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Honoonomi2,Character.valueOf('W'),Dokukesisou3});
		ModLoader.addRecipe(new ItemStack(Honoonomi2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Honoonomi,Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Yakusou3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Yakusou2,Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Dokukesisou3,1),new Object[]{
			"WWW",
			"WWW",
			"WWW",
			Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Tikaranotane3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Tikaranotane2,Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Mamorinotane3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Mamorinotane2,Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Subayasanotane3,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Subayasanotane2,Character.valueOf('W'),Dokukesisou2});

		ModLoader.addRecipe(new ItemStack(Yakusou2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Yakusou2,Character.valueOf('W'),Dokukesisou2});
		ModLoader.addRecipe(new ItemStack(Dokukesisou2,1),new Object[]{
			"WWW",
			"WWW",
			"WWW",
			Character.valueOf('W'),Dokukesisou});
		ModLoader.addRecipe(new ItemStack(Tikaranotane2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Tikaranotane,Character.valueOf('W'),Dokukesisou});
		ModLoader.addRecipe(new ItemStack(Mamorinotane2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Mamorinotane,Character.valueOf('W'),Dokukesisou});
		ModLoader.addRecipe(new ItemStack(Subayasanotane2,1),new Object[]{
			"VVV",
			"WWW",
			"VVV",
			Character.valueOf('V'),Subayasanotane,Character.valueOf('W'),Dokukesisou});


		ModLoader.addRecipe(new ItemStack(Buruoubu,1),new Object[]{
			"VVV",
			"VWV",
			"VVV",
			Character.valueOf('V'),Amatuyunoito,Character.valueOf('W'),Metaloubu});
		ModLoader.addRecipe(new ItemStack(Ierooubu,1),new Object[]{
			"VVV",
			"VWV",
			"VVV",
			Character.valueOf('V'),Moon,Character.valueOf('W'),Metaloubu});
		ModLoader.addRecipe(new ItemStack(Gurinoubu,1),new Object[]{
			"VVV",
			"VWV",
			"VVV",
			Character.valueOf('V'),Ikazutinotama,Character.valueOf('W'),Metaloubu});
		ModLoader.addRecipe(new ItemStack(Paapuruoubu,1),new Object[]{
			"VVV",
			"VWV",
			"VVV",
			Character.valueOf('V'),Inotinoisi,Character.valueOf('W'),Metaloubu});

		ModLoader.addRecipe(new ItemStack(Ramia ,1),new Object[]{
			"STU",
			"ZYZ",
			"VWX",
			Character.valueOf('S'),Redoubu,Character.valueOf('T'),Buruoubu,Character.valueOf('U'),Ierooubu,Character.valueOf('V'),Gurinoubu,
			Character.valueOf('W'),Paapuruoubu, Character.valueOf('X'),Metaloubu, Character.valueOf('Y'),Hikarinoisi, Character.valueOf('Z'),Rengokunohane,});
		ModLoader.addRecipe(new ItemStack(Majuunotume ,1),new Object[]{
			" VV",
			"WWV",
			"WW ",
			Character.valueOf('V'),Majuunotuno,Character.valueOf('W'),Majuunokawa});
		ModLoader.addRecipe(new ItemStack(Akumanotume ,1),new Object[]{
			" VV",
			"WWV",
			"WW ",
			Character.valueOf('V'),Kyodainakiba,Character.valueOf('W'),Yawarakauru});
		ModLoader.addRecipe(new ItemStack(Ookanaduti ,1),new Object[]{
			" VV",
			"WVV",
			"XW ",
			Character.valueOf('V'),Metaru,Character.valueOf('W'),Bakudanisi, Character.valueOf('X'),Kyodainakiba});
		ModLoader.addRecipe(new ItemStack(Oninokanabou ,1),new Object[]{
			"WWW",
			"WVW",
			"WWW",
			Character.valueOf('V'),Ookanaduti,Character.valueOf('W'),Togetogenokiba});
		ModLoader.addRecipe(new ItemStack(Hikarinotue ,1),new Object[]{
			" WV",
			" VW",
			"X  ",
			Character.valueOf('V'),Moon,Character.valueOf('W'),Taiyounoisi, Character.valueOf('X'),Kyodainakiba});
		ModLoader.addRecipe(new ItemStack(Sabakinotue ,1),new Object[]{
			"VWX",
			" VW",
			"Y V",
			Character.valueOf('V'),Hosinokakera,Character.valueOf('W'),Kazekirinohane, Character.valueOf('X'),Moon, Character.valueOf('Y'),Kyodainakiba});
		ModLoader.addRecipe(new ItemStack(Ikazutinotue ,1),new Object[]{
			"WVV",
			" VV",
			"X W",
			Character.valueOf('V'),Ikazutinotama,Character.valueOf('W'),Moon, Character.valueOf('X'),Kyodainakiba});
		ModLoader.addRecipe(new ItemStack(Seinarunaifu ,1),new Object[]{
			" VW",
			"VWV",
			"XV",
			Character.valueOf('V'),Seijanohai,Character.valueOf('W'),Tekkouseki, Character.valueOf('X'),Inotinoisi});
		ModLoader.addRecipe(new ItemStack(Yaibanobumeran ,1),new Object[]{
			"WVV",
			"V  ",
			"V  ",
			Character.valueOf('V'),Togetogenokiba,Character.valueOf('W'),Misriru});


		ModLoader.addRecipe(new ItemStack(Rakkipendanto ,1),new Object[]{
			"WXZ",
			"XYX",
			"VXW",
			Character.valueOf('V'),Littlemedal,Character.valueOf('W'),Hikarinoisi, Character.valueOf('X'),Amatuyunoito, Character.valueOf('Y'),Seireiseki, Character.valueOf('Z'),Buruoubu,});
		ModLoader.addRecipe(new ItemStack(Mamorinorubi ,1),new Object[]{
			"WXA",
			"ZVZ",
			"YXW",
			Character.valueOf('A'),Paapuruoubu,Character.valueOf('V'),Rubinogenseki,Character.valueOf('W'),Kinkai, Character.valueOf('X'),Mamorinotane3, Character.valueOf('Y'),Hikarinoisi, Character.valueOf('Z'),Taiyounoisi,});
		ModLoader.addRecipe(new ItemStack(Gouketunoudewa ,1),new Object[]{
			"WYW",
			"AXZ",
			"WBW",
			Character.valueOf('W'),Tikaranorubi, Character.valueOf('X'),Goldburesuretto, Character.valueOf('Y'),Ierooubu, Character.valueOf('Z'),Gurinoubu, Character.valueOf('A'),Buruoubu, Character.valueOf('B'),Paapuruoubu});
		ModLoader.addRecipe(new ItemStack(Tikaranorubi ,1),new Object[]{
			"UZW",
			"XVZ",
			"YXU",
			Character.valueOf('U'),Taiyounoisi,Character.valueOf('V'),Rubinogenseki,Character.valueOf('W'),Redoubu, Character.valueOf('X'),Tikaranotane3, Character.valueOf('Y'),Hikarinoisi, Character.valueOf('Z'),Toukonekisu,});


		ModLoader.addRecipe(new ItemStack(Honoonoyoroi ,1),new Object[]{
			"WXW",
			"ZYZ",
			"WXW",
			Character.valueOf('W'),Taiyounoisi, Character.valueOf('X'),Yougansekinokakera, Character.valueOf('Y'),Redoubu, Character.valueOf('Z'),Rengokunohane,});
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
			Character.valueOf('W'),Oriharukon, Character.valueOf('X'),Redoubu, Character.valueOf('Y'),Ryuunonamida, Character.valueOf('Z'),Amatuyunoito,});
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
			Character.valueOf('Y'),Redoubu,
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
		ModLoader.addRecipe(new ItemStack(Redoubu ,1),
				new Object[]{ "XXX","XYX","XXX",
			Character.valueOf('X'),Taiyounoisi,
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
				new Object[]{ "ZWZ","YXY","VWV",
			Character.valueOf('V'),Subayasanotane3,
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
				new Object[]{ "ZWZ","YXY","VWV",
			Character.valueOf('V'),Subayasanotane2,
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
			Character.valueOf('Y'),Seireiseki,
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
		ModLoader.addSmelting(Papasunoturugi.shiftedIndex, new ItemStack(Papasunokatami ,1));
		ModLoader.addSmelting(DqmBlockOre.blockID, new ItemStack(Tekkouseki ,1));

		ModLoader.addSmelting(Yakusou.shiftedIndex, new ItemStack(ItemYakusouSeed ,2));
		ModLoader.addSmelting(Yakusou2.shiftedIndex, new ItemStack(ItemYakusouSeed2 ,2));
		ModLoader.addSmelting(Yakusou3.shiftedIndex, new ItemStack(ItemYakusouSeed3 ,2));
		ModLoader.addSmelting(Dokukesisou.shiftedIndex, new ItemStack(ItemDokukesisouSeed ,2));
		ModLoader.addSmelting(Dokukesisou2.shiftedIndex, new ItemStack(ItemDokukesisouSeed2 ,2));
		ModLoader.addSmelting(Dokukesisou3.shiftedIndex, new ItemStack(ItemDokukesisouSeed3 ,2));
		ModLoader.addSmelting(Mamorinotane.shiftedIndex, new ItemStack(ItemMamoriSeed ,2));
		ModLoader.addSmelting(Mamorinotane2.shiftedIndex, new ItemStack(ItemMamoriSeed2 ,2));
		ModLoader.addSmelting(Mamorinotane3.shiftedIndex, new ItemStack(ItemMamoriSeed3 ,2));
		ModLoader.addSmelting(Tikaranotane.shiftedIndex, new ItemStack(ItemTikaraSeed ,2));
		ModLoader.addSmelting(Tikaranotane2.shiftedIndex, new ItemStack(ItemTikaraSeed2 ,2));
		ModLoader.addSmelting(Tikaranotane3.shiftedIndex, new ItemStack(ItemTikaraSeed3 ,2));
		ModLoader.addSmelting(Subayasanotane.shiftedIndex, new ItemStack(ItemSubayasaSeed ,2));
		ModLoader.addSmelting(Subayasanotane2.shiftedIndex, new ItemStack(ItemSubayasaSeed2 ,2));
		ModLoader.addSmelting(Subayasanotane3.shiftedIndex, new ItemStack(ItemSubayasaSeed3 ,2));
		ModLoader.addSmelting(Ougon.shiftedIndex, new ItemStack(ItemOugonSeed ,2));
		ModLoader.addSmelting(Ougon2.shiftedIndex, new ItemStack(ItemOugonSeed2 ,2));
		ModLoader.addSmelting(Ougon3.shiftedIndex, new ItemStack(ItemOugonSeed3 ,2));
		ModLoader.addSmelting(Honoonomi.shiftedIndex, new ItemStack(ItemHonooSeed ,2));
		ModLoader.addSmelting(Honoonomi2.shiftedIndex, new ItemStack(ItemHonooSeed2 ,2));
		ModLoader.addSmelting(Honoonomi3.shiftedIndex, new ItemStack(ItemHonooSeed3 ,2));
		ModLoader.addSmelting(Iyasinomi.shiftedIndex, new ItemStack(ItemIyasiSeed ,2));
		ModLoader.addSmelting(Iyasinomi2.shiftedIndex, new ItemStack(ItemIyasiSeed2 ,2));
		ModLoader.addSmelting(Iyasinomi3.shiftedIndex, new ItemStack(ItemIyasiSeed3 ,2));

	}
}