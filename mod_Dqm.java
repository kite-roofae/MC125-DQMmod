package net.minecraft.src;

import java.util.*;

import net.minecraft.client.Minecraft;
import net.minecraft.src.dqmcore.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.dqmcore.Pet.*;
import net.minecraft.src.dqmcore.Seed.*;
import net.minecraft.src.dqmcore.Block.*;

public class mod_Dqm extends BaseMod //implements IMinecraftRegistry
{
    public static final StepSound soundPowderFootstep = new StepSound("stone", 1.0F, 1.0F);
    public static final StepSound soundWoodFootstep = new StepSound("wood", 1.0F, 1.0F);
    public static final StepSound soundGravelFootstep = new StepSound("gravel", 1.0F, 1.0F);
    public static final StepSound soundGrassFootstep = new StepSound("grass", 1.0F, 1.0F);
    public static final StepSound soundStoneFootstep = new StepSound("stone", 1.0F, 1.0F);
    public static final StepSound soundMetalFootstep = new StepSound("stone", 1.0F, 1.5F);
    public static final StepSound soundGlassFootstep = new StepSoundStone("stone", 1.0F, 1.0F);
    public static final StepSound soundClothFootstep = new StepSound("cloth", 1.0F, 1.0F);
    public static final StepSound soundSandFootstep = new StepSoundSand("sand", 1.0F, 1.0F);
	//ブロックIDが上じゃないとエラー

	//テストブロック
	//public static Block TESTBlock;@MLProp(info="TESTBlock BlockID")int TESTBlockID = 245;


	//種ブロック
	public static Block YakusouSeed;@MLProp(info="Min=125 , Max255 : YakusouSeed BlockID")public static int YakusouSeedID = 210;
	public static Block DokukesisouSeed;@MLProp(info="Min=125 , Max255 : DokukesisouSeed BlockID")	public static int DokukesisouSeedID = 211;
	public static Block TikaraSeed;@MLProp(info="Min=125 , Max255 : TikaraSeed BlockID")	public static int TikaraSeedID = 212;
	public static Block MamoriSeed;@MLProp(info="Min=125 , Max255 : MamoriSeed BlockID")	public static int MamoriSeedID = 213;
	public static Block SubayasaSeed;@MLProp(info="Min=125 , Max255 : SubayasaSeed BlockID")public static int SubayasaSeedID = 214;
	public static Block OugonSeed;@MLProp(info="Min=125 , Max255 : OugonSeed BlockID")	public static int OugonSeedID = 215;
	public static Block HonooSeed;@MLProp(info="Min=125 , Max255 : HonooSeed BlockID")	public static int HonooSeedID = 216;
	public static Block IyasiSeed;@MLProp(info="Min=125 , Max255 : IyasiSeed BlockID")	public static int IyasiSeedID = 217;

	public static Block YakusouSeed2;@MLProp(info="Min=125 , Max255 : YakusouSeed2 BlockID")	public static int YakusouSeed2ID = 220;
	public static Block DokukesisouSeed2;@MLProp(info="Min=125 , Max255 : DokukesisouSeed2 BlockID")	public static int DokukesisouSeed2ID = 221;
	public static Block TikaraSeed2;@MLProp(info="Min=125 , Max255 : TikaraSeed2 BlockID")	public static int TikaraSeed2ID = 222;
	public static Block MamoriSeed2;@MLProp(info="Min=125 , Max255 : MamoriSeed2 BlockID")	public static int MamoriSeed2ID = 223;
	public static Block SubayasaSeed2;@MLProp(info="Min=125 , Max255 : SubayasaSeed2 BlockID")	public static int SubayasaSeed2ID = 224;
	public static Block OugonSeed2;@MLProp(info="Min=125 , Max255 : OugonSeed2 BlockID")	public static int OugonSeed2ID = 225;
	public static Block HonooSeed2;@MLProp(info="Min=125 , Max255 : HonooSeed2 BlockID")	public static int HonooSeed2ID = 226;
	public static Block IyasiSeed2;@MLProp(info="Min=125 , Max255 : IyasiSeed2 BlockID")	public static int IyasiSeed2ID = 227;

	public static Block YakusouSeed3;@MLProp(info="Min=125 , Max255 : YakusouSeed3 BlockID")	public static int YakusouSeed3ID = 230;
	public static Block DokukesisouSeed3;@MLProp(info="Min=125 , Max255 : DokukesisouSeed3 BlockID")	public static int DokukesisouSeed3ID = 231;
	public static Block TikaraSeed3;@MLProp(info="Min=125 , Max255 : TikaraSeed3 BlockID")	public static int TikaraSeed3ID = 232;
	public static Block MamoriSeed3;@MLProp(info="Min=125 , Max255 : MamoriSeed3 BlockID")	public static int MamoriSeed3ID = 233;
	public static Block SubayasaSeed3;@MLProp(info="Min=125 , Max255 : SubayasaSeed3 BlockID")	public static int SubayasaSeed3ID = 234;
	public static Block OugonSeed3;@MLProp(info="Min=125 , Max255 : OugonSeed3 BlockID")	public static int OugonSeed3ID = 235;
	public static Block HonooSeed3;@MLProp(info="Min=125 , Max255 : HonooSeed3 BlockID")	public static int HonooSeed3ID = 236;
	public static Block IyasiSeed3;@MLProp(info="Min=125 , Max255 : IyasiSeed3 BlockID")	public static int IyasiSeed3ID = 237;

    public static Block DqmBlockOre;@MLProp(info="Min=125 , Max255 : DqmBlockOre BlockID")	public static int DqmBlockOreID = 240;
	public static Block DqmBlockHako;@MLProp(info="DqmBlockHako BlockID")public static int DqmBlockHakoID = 241;
	public static Block DqmBlockGenkotu;@MLProp(info="DqmBlockGenkotu BlockID")public static int DqmBlockGenkotuID = 242;

	//種アイテム
	public static Item ItemYakusouSeed;@MLProp(info="ItemYakusouSeed ID")	public static int ItemYakusouSeedID = 7001- 256;
	public static Item ItemDokukesisouSeed;@MLProp(info="ItemDokukesisouSeed ID")	public static int ItemDokukesisouSeedID = 7002- 256;
	public static Item ItemTikaraSeed;@MLProp(info="ItemTikaraSeed ID")	public static int ItemTikaraSeedID = 7003- 256;
	public static Item ItemMamoriSeed;@MLProp(info="ItemMamoriSeed ID")	public static int ItemMamoriSeedID = 7004- 256;
	public static Item ItemSubayasaSeed;@MLProp(info="ItemSubayasaSeed ID")	public static int ItemSubayasaSeedID = 7005- 256;
	public static Item ItemOugonSeed;@MLProp(info="ItemOugonSeed ID")	public static int ItemOugonSeedID = 7006- 256;
	public static Item ItemHonooSeed;@MLProp(info="ItemHonooSeed ID")	public static int ItemHonooSeedID = 7007- 256;
	public static Item ItemIyasiSeed;@MLProp(info="ItemIyasiSeed ID")	public static int ItemIyasiSeedID = 7008- 256;

	public static Item ItemYakusouSeed2;@MLProp(info="ItemYakusouSeed2 ID")	public static int ItemYakusouSeed2ID = 7011- 256;
	public static Item ItemDokukesisouSeed2;@MLProp(info="ItemDokukesisouSeed2 ID")	public static int ItemDokukesisouSeed2ID = 7012- 256;
	public static Item ItemTikaraSeed2;@MLProp(info="ItemTikaraSeed2 ID")	public static int ItemTikaraSeed2ID = 7013- 256;
	public static Item ItemMamoriSeed2;@MLProp(info="ItemMamoriSeed2 ID")	public static int ItemMamoriSeed2ID = 7014- 256;
	public static Item ItemSubayasaSeed2;@MLProp(info="ItemSubayasaSeed2 ID")	public static int ItemSubayasaSeed2ID = 7015- 256;
	public static Item ItemOugonSeed2;@MLProp(info="ItemOugonSeed2 ID")	public static int ItemOugonSeed2ID = 7016- 256;
	public static Item ItemHonooSeed2;@MLProp(info="ItemHonooSeed2 ID")	public static int ItemHonooSeed2ID = 7017- 256;
	public static Item ItemIyasiSeed2;@MLProp(info="ItemIyasiSeed2 ID")	public static int ItemIyasiSeed2ID = 7018- 256;

	public static Item ItemYakusouSeed3;@MLProp(info="ItemYakusouSeed3 ID")	public static int ItemYakusouSeed3ID = 7021- 256;
	public static Item ItemDokukesisouSeed3;@MLProp(info="ItemDokukesisouSeed3 ID")	public static int ItemDokukesisouSeed3ID = 7022- 256;
	public static Item ItemTikaraSeed3;@MLProp(info="ItemTikaraSeed3 ID")	public static int ItemTikaraSeed3ID = 7023- 256;
	public static Item ItemMamoriSeed3;@MLProp(info="ItemMamoriSeed3 ID")	public static int ItemMamoriSeed3ID = 7024- 256;
	public static Item ItemSubayasaSeed3;@MLProp(info="ItemSubayasaSeed3 ID")	public static int ItemSubayasaSeed3ID = 7025- 256;
	public static Item ItemOugonSeed3;@MLProp(info="ItemOugonSeed3 ID")	public static int ItemOugonSeed3ID = 7026- 256;
	public static Item ItemHonooSeed3;@MLProp(info="ItemHonooSeed3 ID")	public static int ItemHonooSeed3ID = 7027- 256;
	public static Item ItemIyasiSeed3;@MLProp(info="ItemIyasiSeed3 ID")	public static int ItemIyasiSeed3ID = 7028- 256;

	//実
	@MLProp(info="Yakusou ID")
	public static int YakusouID = 7101- 256;
	public static Item Yakusou;
	@MLProp(info="Dokukesisou ID")
	public static int DokukesisouID = 7102- 256;
	public static Item Dokukesisou;
	@MLProp(info="Tikaranotane ID")
	public static int TikaranotaneID = 7103- 256;
	public static Item Tikaranotane;
	@MLProp(info="Mamorinotane ID")
	public static int MamorinotaneID = 7104- 256;
	public static Item Mamorinotane;
	@MLProp(info="Subayasanotane ID")
	public static int SubayasanotaneID = 7105- 256;
	public static Item Subayasanotane;
	@MLProp(info="Ougon ID")
	public static int OugonID = 7106- 256;
	public static Item Ougon;
	@MLProp(info="Honoonomi ID")
	public static int HonoonomiID = 7107- 256;
	public static Item Honoonomi;
	@MLProp(info="Iyasinomi ID")
	public static int IyasinomiID = 7108- 256;
	public static Item Iyasinomi;

	@MLProp(info="Yakusou2 ID")
	public static int Yakusou2ID = 7111- 256;
	public static Item Yakusou2;
	@MLProp(info="Dokukesisou2 ID")
	public static int Dokukesisou2ID = 7112- 256;
	public static Item Dokukesisou2;
	@MLProp(info="Tikaranotane2 ID")
	public static int Tikaranotane2ID = 7113- 256;
	public static Item Tikaranotane2;
	@MLProp(info="Mamorinotane2 ID")
	public static int Mamorinotane2ID = 7114- 256;
	public static Item Mamorinotane2;
	@MLProp(info="Subayasanotane2 ID")
	public static int Subayasanotane2ID = 7115- 256;
	public static Item Subayasanotane2;
	@MLProp(info="Ougon2 ID")
	public static int Ougon2ID = 7116- 256;
	public static Item Ougon2;
	@MLProp(info="Honoonomi2 ID")
	public static int Honoonomi2ID = 7117- 256;
	public static Item Honoonomi2;
	@MLProp(info="Iyasinomi2 ID")
	public static int Iyasinomi2ID = 7118- 256;
	public static Item Iyasinomi2;

	@MLProp(info="Yakusou3 ID")
	public static int Yakusou3ID = 7121- 256;
	public static Item Yakusou3;
	@MLProp(info="Dokukesisou3 ID")
	public static int Dokukesisou3ID = 7122- 256;
	public static Item Dokukesisou3;
	@MLProp(info="Tikaranotane3 ID")
	public static int Tikaranotane3ID = 7123- 256;
	public static Item Tikaranotane3;
	@MLProp(info="Mamorinotane3 ID")
	public static int Mamorinotane3ID = 7124- 256;
	public static Item Mamorinotane3;
	@MLProp(info="Subayasanotane3 ID")
	public static int Subayasanotane3ID = 7125- 256;
	public static Item Subayasanotane3;
	@MLProp(info="Ougon3 ID")
	public static int Ougon3ID = 7126- 256;
	public static Item Ougon3;
	@MLProp(info="Honoonomi3 ID")
	public static int Honoonomi3ID = 7127- 256;
	public static Item Honoonomi3;
	@MLProp(info="Iyasinomi3 ID")
	public static int Iyasinomi3ID = 7128- 256;
	public static Item Iyasinomi3;


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

	@MLProp(info="Ayakasisou ID")
	public static int AyakasisouID = 5540- 256;
	public static Item Ayakasisou;
	@MLProp(info="Usinofun ID")
	public static int UsinofunID = 5541- 256;
	public static Item Usinofun;
	@MLProp(info="Umanofun ID")
	public static int UmanofunID = 5542- 256;
	public static Item Umanofun;
	@MLProp(info="Gamanoabura ID")
	public static int GamanoaburaID = 5543- 256;
	public static Item Gamanoabura;
	@MLProp(info="Tukinomegumi ID")
	public static int TukinomegumiID = 5544- 256;
	public static Item Tukinomegumi;
	@MLProp(info="Tukemonoisi ID")
	public static int TukemonoisiID = 5545- 256;
	public static Item Tukemonoisi;
	@MLProp(info="Tetunokugi ID")
	public static int TetunokugiID = 5546- 256;
	public static Item Tetunokugi;
	@MLProp(info="Toukonekisu ID")
	public static int ToukonekisuID = 5547- 256;
	public static Item Toukonekisu;
	@MLProp(info="Dokuganokona ID")
	public static int DokuganokonaID = 5548- 256;
	public static Item Dokuganokona;
	@MLProp(info="Dokudokuhedoro ID")
	public static int DokudokuhedoroID = 5549- 256;
	public static Item Dokudokuhedoro;
	@MLProp(info="Nekozuna ID")
	public static int NekozunaID = 5550- 256;
	public static Item Nekozuna;
	@MLProp(info="Budouekisu ID")
	public static int BudouekisuID = 5551- 256;
	public static Item Budouekisu;
	@MLProp(info="Hebinonukegara ID")
	public static int HebinonukegaraID = 5552- 256;
	public static Item Hebinonukegara;
	@MLProp(info="Maryokunotuti ID")
	public static int MaryokunotutiID = 5553- 256;
	public static Item Maryokunotuti;
	@MLProp(info="Meijikimeranohane ID")
	public static int MeijikimeranohaneID = 5554- 256;
	public static Item Meijikimeranohane;
	@MLProp(info="Yorunotobari ID")
	public static int YorunotobariID = 5555- 256;
	public static Item Yorunotobari;
	@MLProp(info="Hananomitu ID")
	public static int HananomituID = 5556- 256;
	public static Item Hananomitu;
	@MLProp(info="Akaisango ID")
	public static int AkaisangoID = 5557- 256;
	public static Item Akaisango;
	@MLProp(info="Tensinosoma ID")
	public static int TensinosomaID = 5558- 256;
	public static Item Tensinosoma;
	@MLProp(info="Tensinohane ID")
	public static int TensinohaneID = 5559- 256;
	public static Item Tensinohane;
	@MLProp(info="Siroikaigara ID")
	public static int SiroikaigaraID = 5560- 256;
	public static Item Siroikaigara;
	@MLProp(info="Ryuunohizake ID")
	public static int RyuunohizakeID = 5561- 256;
	public static Item Ryuunohizake;
	@MLProp(info="Furubitaring ID")
	public static int FurubitaringID = 5562- 256;
	public static Item Furubitaring;
	@MLProp(info="Kingdaiya ID")
	public static int KingdaiyaID = 5563- 256;
	public static Item Kingdaiya;
	@MLProp(info="Genmaseki ID")
	public static int GenmasekiID = 5564- 256;
	public static Item Genmaseki;

	@MLProp(info="Ayasiikobin ID")
	public static int AyasiikobinID = 5565- 256;
	public static Item Ayasiikobin;
	@MLProp(info="Uraminohouju ID")
	public static int UraminohoujuID = 5566- 256;
	public static Item Uraminohouju;
	@MLProp(info="Kiyomenomizu ID")
	public static int KiyomenomizuID = 5567- 256;
	public static Item Kiyomenomizu;
	@MLProp(info="Saezurinomitu ID")
	public static int SaezurinomituID = 5568- 256;
	public static Item Saezurinomitu;
	@MLProp(info="Suraimuosyarebana ID")
	public static int SuraimuosyarebanaID = 5569- 256;
	public static Item Suraimuosyarebana;
	@MLProp(info="Seisui ID")
	public static int SeisuiID = 5570- 256;
	public static Item Seisui;
	@MLProp(info="Seinarusizuku ID")
	public static int SeinarusizukuID = 5571- 256;
	public static Item Seinarusizuku;
	@MLProp(info="Doragonnonamida ID")
	public static int DoragonnonamidaID = 5572- 256;
	public static Item Doragonnonamida;
	@MLProp(info="Nijiirononunokire ID")
	public static int NijiirononunokireID = 5573- 256;
	public static Item Nijiirononunokire;
	@MLProp(info="Nebanebazeri ID")
	public static int NebanebazeriID = 5574- 256;
	public static Item Nebanebazeri;
	@MLProp(info="Haganenoobane ID")
	public static int HaganenoobaneID = 5575- 256;
	public static Item Haganenoobane;
	@MLProp(info="Bekkou ID")
	public static int BekkouID = 5576- 256;
	public static Item Bekkou;
	@MLProp(info="Hepaitosunohidane ID")
	public static int HepaitosunohidaneID = 5577- 256;
	public static Item Hepaitosunohidane;
	@MLProp(info="Risaikurusuton ID")
	public static int RisaikurusutonID = 5578- 256;
	public static Item Risaikurusuton;
	@MLProp(info="Kyodaihigetokage ID")
	public static int KyodaihigetokageID = 5579- 256;
	public static Item Kyodaihigetokage;
	@MLProp(info="Juryokunomoto ID")
	public static int JuryokunomotoID = 5580- 256;
	public static Item Juryokunomoto;
	@MLProp(info="Hyoutyounohane ID")
	public static int HyoutyounohaneID = 5581- 256;
	public static Item Hyoutyounohane;

	@MLProp(info="Bannouyaku ID")
	public static int BannouyakuID = 5582- 256;
	public static Item Bannouyaku;
	@MLProp(info="Jouyakusou ID")
	public static int JouyakusouID = 5583- 256;
	public static Item Jouyakusou;
	@MLProp(info="Tokuyakusou ID")
	public static int TokuyakusouID = 5584- 256;
	public static Item Tokuyakusou;
	@MLProp(info="Sekaijunoha ID")
	public static int SekaijunohaID = 5585- 256;
	public static Item Sekaijunoha;


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

	@MLProp(info="Oriharukonbou ID")
	public static int OriharukonbouID = 5831- 256;
	public static Item Oriharukonbou;
	@MLProp(info="Konbou ID")
	public static int KonbouID = 5832- 256;
	public static Item Konbou;
	@MLProp(info="Haounoono ID")
	public static int HaounoonoID = 5833- 256;
	public static Item Haounoono;
	@MLProp(info="Haganenoono ID")
	public static int HaganenoonoID = 5834- 256;
	public static Item Haganenoono;
	@MLProp(info="Haganenokon ID")
	public static int HaganenokonID = 5835- 256;
	public static Item Haganenokon;
	@MLProp(info="Wohanma ID")
	public static int WohanmaID = 5836- 256;
	public static Item Wohanma;

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
	@MLProp(info="Ginnoyubiwa ID")
	public static int GinnoyubiwaID = 5907- 256;
	public static Item Ginnoyubiwa;
	@MLProp(info="Inotinoyubiwa ID")
	public static int InotinoyubiwaID = 5908- 256;
	public static Item Inotinoyubiwa;

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
	private int ccount = 0;



	@Override
	public void load()
	{
		MinecraftForgeClient.preloadTexture("/dqm/DqmItems.png");
        MinecraftForgeClient.preloadTexture("/dqm/DqmSeeds.png");
        MinecraftForgeClient.preloadTexture("/dqm/DqmOre.png");
        MinecraftForgeClient.preloadTexture("/dqm/DqmEquipment");

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
		Debugsword = new DqmItemTool(DebugswordID, 0, DqmEnumToolMaterial.DEBUG).setmodel("Debugsword").setIconCoord(6, 1).setItemName("Debugsword");
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

		//クワ系武器
		Haganenokon = new DqmItemTool(HaganenokonID, 0,DqmEnumToolMaterial.HAGANENOKON).setmodel("Haganenokon").setIconCoord(1, 1).setItemName("Haganenokon");
		Oriharukonbou = new DqmItemTool(OriharukonbouID, 0,DqmEnumToolMaterial.ORIHARUKON).setmodel("Oriharukonbou").setIconCoord(1, 2).setItemName("Oriharukonbou");

		//シャベル系武器
		Majuunotume = new DqmItemSword(MajuunotumeID,1,DqmEnumToolMaterial.MAJUU).setmodel("Majuunotume").setIconCoord(7, 2).setItemName("Majuunotume");
		Akumanotume = new DqmItemSword(AkumanotumeID, 1,DqmEnumToolMaterial.AKUMA).setmodel("Akumanotume").setIconCoord(6, 2).setItemName("Akumanotume");

		//ツルハシ系武器
		Ookanaduti = new DqmItemSword(OokanadutiID, 2, DqmEnumToolMaterial.OO).setmodel("Ookanaduti").setIconCoord(12, 2).setItemName("Ookanaduti");
		Atorasunokanaduti = new DqmItemSword(AtorasunokanadutiID, 2,DqmEnumToolMaterial.ATORASU).setmodel("Atorasunokanaduti").setIconCoord(12, 1).setItemName("Atorasunokanaduti");
		Oninokanabou = new DqmItemSword(OninokanabouID, 2,DqmEnumToolMaterial.ONI).setmodel("Oninokanabou").setIconCoord(13, 2).setItemName("Oninokanabou");
		Wohanma = new DqmItemSword(WohanmaID, 2,DqmEnumToolMaterial.WOO).setmodel("Wohanma").setIconCoord(0, 2).setItemName("Wohanma");
		Konbou = new DqmItemSword(KonbouID, 2,DqmEnumToolMaterial.KONBOU).setmodel("Konbou").setIconCoord(0, 1).setItemName("Konbou");

		//アックス系武器
		Gureitoakusu = new DqmItemTool(GureitoakusuID, 3,DqmEnumToolMaterial.GUREITO).setmodel("Gureitoakusu").setIconCoord(13, 1).setItemName("Gureitoakusu");
		Haganenoono = new DqmItemTool(HaganenoonoID, 3,DqmEnumToolMaterial.HAGANENOONO).setmodel("Haganenoono").setIconCoord(2, 1).setItemName("Haganenoono");
		Haounoono = new DqmItemTool(HaounoonoID, 3,DqmEnumToolMaterial.HAOU).setmodel("Haounoono").setIconCoord(2, 2).setItemName("Haounoono");

		//弓系武器
		Kazekirinoyumi = new DqmItemBow(KazekirinoyumiID).setmodel("Kazekirinoyumi").setIconCoord(14, 0).setItemName("Kazekirinoyumi");
		Sefiramunoyumi = new DqmItemBow(SefiramunoyumiID).setmodel("Sefiramunoyumi").setIconCoord(14, 1).setItemName("Sefiramunoyumi");
		Yuuwakunoyumi = new DqmItemBow(YuuwakunoyumiID).setmodel("Yuuwakunoyumi").setIconCoord(14, 2).setItemName("Yuuwakunoyumi");


		//鎧**************************************************************************************************************************************************************************

		if (ItemIDROTO > 0) {			int index = ModLoader.addArmor("ROTO");

		Rotonokabuto = new DqmItemArmor(ItemIDROTO - 256 + 0, DqmEnumArmorMaterial.ROTO, index, 0,40).setItemName("Rotonokabuto").setIconCoord(0, 3);
		Rotonoyoroi	= new DqmItemArmor(ItemIDROTO - 256 + 1, DqmEnumArmorMaterial.ROTO, index, 1,40).setItemName("Rotonoyoroi").setIconCoord(1, 3);
		Rotonokote	= new DqmItemArmor(ItemIDROTO - 256 + 2, DqmEnumArmorMaterial.ROTO, index, 2,40).setItemName("Rotonokote").setIconCoord(2, 3);
		Rotonokutu	= new DqmItemArmor(ItemIDROTO - 256 + 3, DqmEnumArmorMaterial.ROTO, index, 3,40).setItemName("Rotonokutu").setIconCoord(3, 3);
		}
		if (ItemIDMETAL > 0) {			int index = ModLoader.addArmor("METAL");
		Metarukingnokabuto	= new DqmItemArmor(ItemIDMETAL - 256 + 0, DqmEnumArmorMaterial.METAL, index, 0,50).setItemName("Metarukingnokabuto").setIconCoord(6, 3);
		Metarukingnoyoroi	= new DqmItemArmor(ItemIDMETAL - 256 + 1, DqmEnumArmorMaterial.METAL, index, 1,50).setItemName("chestMetarukingnoyoroi").setIconCoord(7, 3);
		Metarukingnokote	= new DqmItemArmor(ItemIDMETAL - 256 + 2, DqmEnumArmorMaterial.METAL, index, 2,50).setItemName("leggingsMetal").setIconCoord(8, 3);
		Metarukingnokutu	= new DqmItemArmor(ItemIDMETAL - 256 + 3, DqmEnumArmorMaterial.METAL, index, 3,50).setItemName("Metarukingnokutu").setIconCoord(9, 3);
		}
		if (ItemIDOLD > 0) {			int index = ModLoader.addArmor("OLD");
		Sabitakabuto	= new DqmItemArmor(ItemIDOLD - 256 + 0, DqmEnumArmorMaterial.OLD, index, 0,1).setItemName("Sabitakabuto").setIconCoord(0, 4);
		Sabitayoroi	= new DqmItemArmor(ItemIDOLD - 256 + 1, DqmEnumArmorMaterial.OLD, index, 1,1).setItemName("chestSabitayoroi").setIconCoord(1, 4);
		Sabitakote	= new DqmItemArmor(ItemIDOLD - 256 + 2, DqmEnumArmorMaterial.OLD, index, 2,1).setItemName("leggingsOld").setIconCoord(2, 4);
		Sabitakutu	= new DqmItemArmor(ItemIDOLD - 256 + 3, DqmEnumArmorMaterial.OLD, index, 3,1).setItemName("Sabitakutu").setIconCoord(3, 4);
		}
		if (ItemIDHAGANE > 0) {			int index = ModLoader.addArmor("HAGANE");
		Haganenokabuto = new DqmItemArmor(ItemIDHAGANE - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,20).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Haganenoyoroi	= new DqmItemArmor(ItemIDHAGANE - 256 + 1, DqmEnumArmorMaterial.HAGANE, index, 1,20).setItemName("Haganenoyoroi").setIconCoord(7, 4);
		Haganenokote	= new DqmItemArmor(ItemIDHAGANE - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,20).setItemName("leggingsHagane").setIconCoord(8, 4);
		Haganenokutu	= new DqmItemArmor(ItemIDHAGANE - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,20).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDKAWA > 0) {			int index = ModLoader.addArmor("KAWA");
		Kawanobousi	= new DqmItemArmor(ItemIDKAWA - 256 + 0, DqmEnumArmorMaterial.KAWA, index, 0,10).setItemName("Kawanobousi").setIconCoord(6, 5);
		Kawanoyoroi	= new DqmItemArmor(ItemIDKAWA - 256 + 1, DqmEnumArmorMaterial.KAWA, index, 1,10).setItemName("Kawanoyoroi").setIconCoord(7, 5);
		Kawanokote	= new DqmItemArmor(ItemIDKAWA - 256 + 2, DqmEnumArmorMaterial.KAWA, index, 2,10).setItemName("Kawanokote").setIconCoord(8, 5);
		Kawanokutu	= new DqmItemArmor(ItemIDKAWA - 256 + 3, DqmEnumArmorMaterial.KAWA, index, 3,10).setItemName("Kawanokutu").setIconCoord(9, 5);
		}
		if (ItemIDUROKO > 0) {			int index = ModLoader.addArmor("UROKO");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Urokonoyoroi	= new DqmItemArmor(ItemIDUROKO - 256 + 1, DqmEnumArmorMaterial.UROKO, index, 1,15).setItemName("Urokonoyoroi").setIconCoord(11, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDHONOO > 0) {			int index = ModLoader.addArmor("HONOO");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Honoonoyoroi	= new DqmItemArmor(ItemIDHONOO - 256 + 1, DqmEnumArmorMaterial.HONOO, index, 1,30).setItemName("Honoonoyoroi").setIconCoord(12, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDMIRA > 0) {			int index = ModLoader.addArmor("MIRA");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Mirayoroi	= new DqmItemArmor(ItemIDMIRA - 256 + 1, DqmEnumArmorMaterial.MIRA, index, 1,30).setItemName("Mirayoroi").setIconCoord(14, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDYAIBA > 0) {			int index = ModLoader.addArmor("YAIBA");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Yaibanoyoroi	= new DqmItemArmor(ItemIDYAIBA - 256 + 1, DqmEnumArmorMaterial.YAIBA, index, 1,35).setItemName("Yaibanoyoroi").setIconCoord(13, 3);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDSINPI > 0) {			int index = ModLoader.addArmor("SINPI");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Sinpinoyoroi	= new DqmItemArmor(ItemIDSINPI - 256 + 1, DqmEnumArmorMaterial.SINPI, index, 1,35).setItemName("Sinpinoyoroi").setIconCoord(12, 4);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}
		if (ItemIDSURA > 0) {			int index = ModLoader.addArmor("SURA");
		Suraimuhead	= new DqmItemArmor(ItemIDSURA - 256 + 0, DqmEnumArmorMaterial.SURA, index, 0,10).setItemName("Suraimuhead").setIconCoord(11, 5);
		Suraimunofuku	= new DqmItemArmor(ItemIDSURA - 256 + 1, DqmEnumArmorMaterial.SURA, index, 1,10).setItemName("Suraimunofuku").setIconCoord(12, 5);
		//cccc	= new DqmItemArmor(ItemIDAAA - 256 + 2, DqmEnumArmorMaterial.AAA, index, 2,10).setItemName("cccc").setIconCoord(2, 4);
		//dddd	= new DqmItemArmor(ItemIDAAA - 256 + 3, DqmEnumArmorMaterial.AAA, index, 3,10).setItemName("dddd").setIconCoord(3, 4);
		}
		if (ItemIDDRAGON > 0) {			int index = ModLoader.addArmor("DRAGON");
		//Haganenokabuto = new DqmItemArmor(ItemIDHagane - 256 + 0, DqmEnumArmorMaterial.HAGANE, index, 0,3000).setItemName("Haganenokabuto").setIconCoord(6, 4);
		Doragonmeiru	= new DqmItemArmor(ItemIDDRAGON - 256 + 1, DqmEnumArmorMaterial.DRAGON, index, 1,30).setItemName("Doragonmeiru").setIconCoord(11, 4);
		//Haganenokote	= new DqmItemArmor(ItemIDHagane - 256 + 2, DqmEnumArmorMaterial.HAGANE, index, 2,3000).setItemName("leggingsHagane").setIconCoord(8, 4);
		//Haganenokutu	= new DqmItemArmor(ItemIDHagane - 256 + 3, DqmEnumArmorMaterial.HAGANE, index, 3,3000).setItemName("Haganenokutu").setIconCoord(9, 4);
		}



		//アイテム************************************************************************************************************************************************************
		Amatuyunoito = new DqmItemFood(AmatuyunoitoID,0, 0.0F, false,64).setPotionEffect(Potion.moveSlowdown.id, 120, 5, 1.0F).setItemName("Amatuyunoito").setIconCoord(1, 7);
		Bakudanisi = new DqmItemTntEgg(BakudanisiID).setItemName("Bakudanisi").setIconCoord(9, 8);
		Bannouyaku = new DqmItemFood(BannouyakuID,0, 0.0F, false,64).setItemName("Bannouyaku").setIconCoord(1, 11);
		Buruoubu = new DqmItem(BuruoubuID).setItemName("Buruoubu").setIconCoord(0, 10);
		Dragonwing = new DqmItemDragonBike(DragonwingID).setItemName("Dragonwing").setIconCoord(4, 13);
		Goldburesuretto = new DqmItem(GoldburesurettoID).setItemName("Goldburesuretto").setIconCoord(0, 5);
		Goldring = new DqmItem(GoldringID).setItemName("Goldring").setIconCoord(2, 5);
		Gurinoubu = new DqmItem(GurinoubuID).setItemName("Gurinoubu").setIconCoord(2, 10);
		Hikarinoisi = new DqmItem(HikarinoisiID).setItemName("Hikarinoisi").setIconCoord(2, 7);
		Hokoranokagi = new DqmItem(HokoranokagiID).setItemName("Hokoranokagi").setIconCoord(0, 14);
		Honehone = new DqmItemFood(HonehoneID,0, 0.0F, false,64).setPotionEffect(Potion.hunger.id, 90, 5, 1.0F).setItemName("Honehone").setIconCoord(11, 9);
		Hosinokakera = new DqmItemFood(HosinokakeraID,0, 0.0F, false,64).setPotionEffect(Potion.digSpeed.id, 120, 2, 1.0F).setItemName("Hosinokakera").setIconCoord(3, 7);
		Ierooubu = new DqmItem(IerooubuID).setItemName("Ierooubu").setIconCoord(1, 10);
		Ikazutinotama = new DqmItem(IkazutinotamaID).setItemName("Ikazutinotama").setIconCoord(11, 8);
		Inferunoswordnoha = new DqmItem(InferunoswordnohaID).setItemName("Inferunoswordnoha").setIconCoord(6, 5);
		Inferunoswordnotuka = new DqmItem(InferunoswordnotukaID).setItemName("Inferunoswordnotuka").setIconCoord(6, 6);
		Inotinoisi = new DqmItem(InotinoisiID).setItemName("Inotinoisi").setIconCoord(14, 8);
		Jouyakusou = new DqmItemFood(JouyakusouID,1, 0.0F, false,64).setItemName("Jouyakusou").setIconCoord(5, 11);
		Kagaminoisi = new DqmItem(KagaminoisiID).setItemName("Kagaminoisi").setIconCoord(14, 10);
		Kazekirinohane = new DqmItemFood(KazekirinohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 120, 2, 1.0F).setItemName("Kazekirinohane").setIconCoord(4, 7);
		Kenjanoisi = new DqmItem(KenjanoisiID, 1).setItemName("Kenjanoisi").setNoRepair().setIconCoord(10, 8);
		Kenjanoseisui = new DqmItemFood(KenjanoseisuiID,0, 0.0F, false,64).setPotionEffect(Potion.waterBreathing.id, 200, 2, 1.0F).setItemName("Kenjanoseisui").setIconCoord(5, 8);
		Kimeranotubasa = new DqmItem(KimeranotubasaID, 1).setItemName("Kimeranotubasa").setNoRepair().setIconCoord(1, 13);
		Kinkai = new DqmItem(KinkaiID).setItemName("Kinkai").setIconCoord(5, 7);
		Koorinokessyou = new DqmItem(KoorinokessyouID).setItemName("Koorinokessyou").setIconCoord(6, 7);
		Koumorinohane = new DqmItemFood(KoumorinohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 60, 0, 1.0F).setItemName("Koumorinohane").setIconCoord(7, 9);
		Kyodainakiba = new DqmItem(KyodainakibaID).setItemName("Kyodainakiba").setIconCoord(9, 9);
		Littlemedal = new DqmItem(LittlemedalID).setItemName("Littlemedal").setIconCoord(7, 7);
		Madarakumonoito = new DqmItemFood(MadarakumonoitoID,0, 0.0F, false,64).setPotionEffect(Potion.moveSlowdown.id, 120, 2, 1.0F).setItemName("Madarakumonoito").setIconCoord(8, 7);
		Mahounokagi = new DqmItem(MahounokagiID).setItemName("Mahounokagi").setIconCoord(2, 14);
		Majuunokawa = new DqmItem(MajuunokawaID).setItemName("Majuunokawa").setIconCoord(0, 9);
		Majuunotuno = new DqmItem(MajuunotunoID).setItemName("Majuunotuno").setIconCoord(9, 7);
		Metaloubu = new DqmItem(MetaloubuID).setItemName("Metaloubu").setIconCoord(10, 7);
		Metaru = new DqmItem(MetaruID).setItemName("Metaru").setIconCoord(11, 7);
		Metarukingnoha = new DqmItem(MetarukingnohaID).setItemName("Metarukingnoha").setIconCoord(4, 5);
		Metarukingnotuka = new DqmItem(MetarukingnotukaID).setItemName("Metarukingnotuka").setIconCoord(4, 6);
		Midorinokoke = new DqmItemFood(MidorinokokeID,0, 0.0F, false,64).setPotionEffect(Potion.hunger.id, 30, 0, 1.0F).setItemName("Midorinokoke").setIconCoord(4, 9);
		Migakizuna = new DqmItemFood(MigakizunaID,0, 0.0F, false,64).setPotionEffect(Potion.digSpeed.id, 60, 0, 1.0F).setItemName("Migakizuna").setIconCoord(12, 7);
		Misriru = new DqmItem(MisriruID).setItemName("Misriru").setIconCoord(13, 7);
		Moon = new DqmItem(MoonID).setItemName("Moon").setIconCoord(13, 9);
		MysteryEgg = new DqmItemEgg(MysteryEggID).setItemName("MysteryEgg").setIconCoord(0, 13);
		Oriharukon = new DqmItem(OriharukonID).setItemName("Oriharukon").setIconCoord(14, 7);
		Paapuruoubu = new DqmItem(PaapuruoubuID).setItemName("Paapuruoubu").setIconCoord(3, 10);
		Papasunokatami = new DqmItemKirapanBike(PapasunokatamiID).setItemName("Papasunokatami").setIconCoord(2, 13);
		Puratina = new DqmItem(PuratinaID).setItemName("Puratina").setIconCoord(14, 9);
		Ramia = new DqmItemRamiaBike(RamiaID).setItemName("Ramia").setIconCoord(3, 13);
		Redoubu = new DqmItem(RedoubuID).setItemName("Redoubu").setIconCoord(0, 7);
		Rengokunohane = new DqmItemFood(RengokunohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 300, 5, 1.0F).setItemName("Rengokunohane").setIconCoord(10, 9);
		Rotonoha = new DqmItem(RotonohaID).setItemName("Rotonoha").setIconCoord(5, 5);
		Rotonotuka = new DqmItem(RotonotukaID).setItemName("Rotonotuka").setIconCoord(5, 6);
		Rubinogenseki = new DqmItem(RubinogensekiID).setItemName("Rubinogenseki").setIconCoord(12, 9);
		Ryuunonamida = new DqmItem(RyuunonamidaID).setItemName("Ryuunonamida").setIconCoord(12, 8);
		Saigonokagi = new DqmItem(SaigonokagiID).setItemName("Saigonokagi").setIconCoord(3, 14);
		Seijanohai = new DqmItemFood(SeijanohaiID,0, 0.0F, false,64).setPotionEffect(Potion.blindness.id, 30, 0, 1.0F).setItemName("Seijanohai").setIconCoord(0, 8);
		Seireiseki = new DqmItem(SeireisekiID).setItemName("Seireiseki").setIconCoord(1, 8);
		Sekaijunoha = new DqmItemFood(SekaijunohaID,20, 0.0F, false,64).setPotionEffect(Potion.heal.id, 2, 5, 1.0F).setItemName("Sekaijunoha").setIconCoord(7, 11);
		Sinkanohiseki = new DqmItemFood(SinkanohisekiID,0, 0.0F, false,64).setItemName("Sinkanohiseki").setIconCoord(2, 8);
		Suraimunokanmuri = new DqmItem(SuraimunokanmuriID).setItemName("Suraimunokanmuri").setIconCoord(3, 8);
		Suraimuzeri = new DqmItemFood(SuraimuzeriID,4, 0.0F, false,64).setItemName("Suraimuzeri").setIconCoord(4, 8);
		Taiyounoisi = new DqmItem(TaiyounoisiID).setItemName("Taiyounoisi").setIconCoord(13, 8);
		Tekkouseki = new DqmItem(TekkousekiID).setItemName("Tekkouseki").setIconCoord(6, 8);
		Togetogenokiba = new DqmItemFood(TogetogenokibaID,20, 0.0F, false,64).setPotionEffect(Potion.harm.id, 2, 0, 1.0F).setItemName("Togetogenokiba").setIconCoord(8, 9);
		Tokinosuisyou = new DqmItem(TokinosuisyouID).setItemName("Tokinosuisyou").setIconCoord(7, 8);
		Tokuyakusou = new DqmItemFood(TokuyakusouID,1, 0.0F, false,64).setItemName("Tokuyakusou").setIconCoord(6, 11);
		Touzokunokagi = new DqmItem(TouzokunokagiID).setItemName("Touzokunokagi").setIconCoord(1, 14);
		Tyounohane = new DqmItemFood(TyounohaneID,0, 0.0F, false,64).setPotionEffect(Potion.jump.id, 60, 0, 1.0F).setItemName("Tyounohane").setIconCoord(3, 9);
		Uruwasikinoko = new DqmItemFood(UruwasikinokoID,5, 0.0F, false,64).setPotionEffect(Potion.confusion.id, 60, 0, 1.0F).setItemName("Uruwasikinoko").setIconCoord(2, 9);
		Usaginosippo = new DqmItem(UsaginosippoID).setItemName("Usaginosippo").setIconCoord(6, 9);
		Yawarakauru = new DqmItem(YawarakauruID).setItemName("Yawarakauru").setIconCoord(1, 9);
		Yogoretahoutai = new DqmItemFood(YogoretahoutaiID,0, 0.0F, false,64).setPotionEffect(Potion.hunger.id, 90, 5, 1.0F).setItemName("Yogoretahoutai").setIconCoord(5, 9);
		Yougansekinokakera = new DqmItemFood(YougansekinokakeraID,0, 0.0F, false,64).setPotionEffect(Potion.weakness.id, 60, 0, 1.0F).setItemName("Yougansekinokakera").setIconCoord(8, 8);

		Akaisango= new DqmItem(AkaisangoID).setItemName("Akaisango").setIconCoord(6,10);
		Ayakasisou= new DqmItem(AyakasisouID).setItemName("Ayakasisou").setIconCoord(0,12);
		Budouekisu= new DqmItem(BudouekisuID).setItemName("Budouekisu").setIconCoord(11,12);
		Dokudokuhedoro= new DqmItem(DokudokuhedoroID).setItemName("Dokudokuhedoro").setIconCoord(9,12);
		Dokuganokona= new DqmItem(DokuganokonaID).setItemName("Dokuganokona").setIconCoord(8,12);
		Gamanoabura= new DqmItem(GamanoaburaID).setItemName("Gamanoabura").setIconCoord(3,12);
		Hananomitu= new DqmItem(HananomituID).setItemName("Hananomitu").setIconCoord(5,10);
		Hebinonukegara= new DqmItem(HebinonukegaraID).setItemName("Hebinonukegara").setIconCoord(12,12);
		Maryokunotuti= new DqmItem(MaryokunotutiID).setItemName("Maryokunotuti").setIconCoord(13,12);
		Meijikimeranohane= new DqmItem(MeijikimeranohaneID).setItemName("Meijikimeranohane").setIconCoord(14,12);
		Nekozuna= new DqmItem(NekozunaID).setItemName("Nekozuna").setIconCoord(10,12);
		Ryuunohizake= new DqmItemFood(RyuunohizakeID,0, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 30, 3, 1.0F).setItemName("Ryuunohizake").setIconCoord(10,10);
		Siroikaigara= new DqmItem(SiroikaigaraID).setItemName("Siroikaigara").setIconCoord(9,10);
		Tensinohane= new DqmItem(TensinohaneID).setItemName("Tensinohane").setIconCoord(8,10);
		Tensinosoma= new DqmItem(TensinosomaID).setItemName("Tensinosoma").setIconCoord(7,10);
		Tetunokugi= new DqmItem(TetunokugiID).setItemName("Tetunokugi").setIconCoord(6,12);
		Toukonekisu= new DqmItem(ToukonekisuID).setItemName("Toukonekisu").setIconCoord(7,12);
		Tukemonoisi= new DqmItem(TukemonoisiID).setItemName("Tukemonoisi").setIconCoord(5,12);
		Tukinomegumi= new DqmItem(TukinomegumiID).setItemName("Tukinomegumi").setIconCoord(4,12);
		Umanofun= new DqmItem(UmanofunID).setItemName("Umanofun").setIconCoord(2,12);
		Usinofun= new DqmItem(UsinofunID).setItemName("Usinofun").setIconCoord(1,12);
		Yorunotobari= new DqmItem(YorunotobariID).setItemName("Yorunotobari").setIconCoord(4,10);
		Kingdaiya= new DqmItem(KingdaiyaID).setItemName("Kingdaiya").setIconCoord(13,10);
		Genmaseki= new DqmItem(GenmasekiID).setItemName("Genmaseki").setIconCoord(12,10);
		Furubitaring= new DqmItem(FurubitaringID).setItemName("Furubitaring").setIconCoord(7,5);

		Ayasiikobin= new DqmItem(AyasiikobinID).setItemName("Ayasiikobin").setIconCoord(14,6);
		Bekkou= new DqmItem(BekkouID).setItemName("Bekkou").setIconCoord(10,6);
		Doragonnonamida= new DqmItem(DoragonnonamidaID).setItemName("Doragonnonamida").setIconCoord(11,10);
		Haganenoobane= new DqmItem(HaganenoobaneID).setItemName("Haganenoobane").setIconCoord(9,6);
		Hepaitosunohidane= new DqmItem(HepaitosunohidaneID).setItemName("Hepaitosunohidane").setIconCoord(11,6);
		Hyoutyounohane= new DqmItem(HyoutyounohaneID).setItemName("Hyoutyounohane").setIconCoord(13,4);
		Juryokunomoto= new DqmItem(JuryokunomotoID).setItemName("Juryokunomoto").setIconCoord(14,4);
		Kiyomenomizu= new DqmItem(KiyomenomizuID).setItemName("Kiyomenomizu").setIconCoord(13,5);
		Kyodaihigetokage= new DqmItem(KyodaihigetokageID).setItemName("Kyodaihigetokage").setIconCoord(13,6);
		Nebanebazeri= new DqmItem(NebanebazeriID).setItemName("Nebanebazeri").setIconCoord(8,6);
		Nijiirononunokire= new DqmItem(NijiirononunokireID).setItemName("Nijiirononunokire").setIconCoord(8,5);
		Risaikurusuton= new DqmItem(RisaikurusutonID).setItemName("Risaikurusuton").setIconCoord(12,6);
		Saezurinomitu= new DqmItem(SaezurinomituID).setItemName("Saezurinomitu").setIconCoord(12,5);
		Seinarusizuku= new DqmItem(SeinarusizukuID).setItemName("Seinarusizuku").setIconCoord(9,5);
		Seisui= new DqmItem(SeisuiID).setItemName("Seisui").setIconCoord(10,5);
		Suraimuosyarebana= new DqmItem(SuraimuosyarebanaID).setItemName("Suraimuosyarebana").setIconCoord(11,5);
		Uraminohouju= new DqmItem(UraminohoujuID).setItemName("Uraminohouju").setIconCoord(14,5);




		//アクセサリ
		Rakkipendanto = new DqmItem(RakkipendantoID).setMaxStackSize(1).setItemName("Rakkipendanto").setIconCoord(3, 6);
		Mamorinorubi = new DqmItem(MamorinorubiID).setMaxStackSize(1).setItemName("Mamorinorubi").setIconCoord(2, 6);
		Tikaranorubi = new DqmItem(TikaranorubiID).setMaxStackSize(1).setItemName("Tikaranorubi").setIconCoord(0, 6);
		Gouketunoudewa = new DqmItem(GouketunoudewaID).setMaxStackSize(1).setItemName("Gouketunoudewa").setIconCoord(1, 6);
		Hayatenoring = new DqmItem(HayatenoringID).setMaxStackSize(1).setItemName("Hayatenoring").setIconCoord(3, 5);
		Hosifuru = new DqmItem(HosifuruID).setMaxStackSize(1).setItemName("Hosifuru").setIconCoord(1, 5);
		Ginnoyubiwa= new DqmItem(GinnoyubiwaID).setItemName("Ginnoyubiwa").setIconCoord(12,4);
		Inotinoyubiwa= new DqmItem(InotinoyubiwaID, 1).setNoRepair().setItemName("Inotinoyubiwa").setIconCoord(11,4);


		//実アイテム
		Yakusou = new DqmItemFood(YakusouID,4, 0.0F, false,64).setItemName("Yakusou").setIconCoord(0, 11);
		Dokukesisou = new DqmItemFood(DokukesisouID,3, 0.0F, false,64).setItemName("Dokukesisou").setIconCoord(8, 11);
		Tikaranotane = new DqmItemFood(TikaranotaneID,2, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 100, 0, 1.0F).setItemName("Thikaranotane").setIconCoord(2, 11);
		Mamorinotane = new DqmItemFood(MamorinotaneID,2, 0.0F, false,64).setPotionEffect(Potion.resistance.id, 100, 0, 1.0F).setItemName("Mamorinotane").setIconCoord(3, 11);
		Subayasanotane = new DqmItemFood(SubayasanotaneID,2, 0.0F, false,64).setPotionEffect(Potion.moveSpeed.id, 100, 0, 1.0F).setItemName("Subayasanotane").setIconCoord(4, 11);
		Ougon = new DqmItemFood(OugonID,6, 0.0F, false,64).setItemName("Ougon").setIconCoord(9, 11);
		Honoonomi = new DqmItemFood(HonoonomiID,2, 0.0F, false,64).setPotionEffect(Potion.fireResistance.id, 100, 0, 1.0F).setItemName("Honoonomi").setIconCoord(10, 11);
		Iyasinomi = new DqmItemFood(IyasinomiID,2, 0.0F, false,64).setPotionEffect(Potion.regeneration.id, 100, 0, 1.0F).setItemName("Iyasinomi").setIconCoord(11, 11);

		Yakusou2 = new DqmItemFood(Yakusou2ID,5, 0.0F, false,64).setItemName("Yakusou2").setIconCoord(0, 3);
		Dokukesisou2 = new DqmItemFood(Dokukesisou2ID,4, 0.0F, false,64).setItemName("Dokukesisou2").setIconCoord(1, 3);
		Tikaranotane2 = new DqmItemFood(Tikaranotane2ID,3, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 200, 1, 1.0F).setItemName("Tikaranotane2").setIconCoord(2, 3);
		Mamorinotane2 = new DqmItemFood(Mamorinotane2ID,3, 0.0F, false,64).setPotionEffect(Potion.resistance.id, 200, 1, 1.0F).setItemName("Mamorinotane2").setIconCoord(3, 3);
		Subayasanotane2 = new DqmItemFood(Subayasanotane2ID,3, 0.0F, false,64).setPotionEffect(Potion.moveSpeed.id, 200, 1, 1.0F).setItemName("Subayasanotane2").setIconCoord(4, 3);
		Ougon2 = new DqmItemFood(Ougon2ID,8, 0.0F, false,64).setItemName("Ougon2").setIconCoord(5, 3);
		Honoonomi2 = new DqmItemFood(Honoonomi2ID,3, 0.0F, false,64).setPotionEffect(Potion.fireResistance.id, 200, 1, 1.0F).setItemName("Honoonomi2").setIconCoord(6, 3);
		Iyasinomi2 = new DqmItemFood(Iyasinomi2ID,3, 0.0F, false,64).setPotionEffect(Potion.regeneration.id, 200, 1, 1.0F).setItemName("Iyasinomi2").setIconCoord(7, 3);

		Yakusou3 = new DqmItemFood(Yakusou3ID,6, 0.0F, false,64).setItemName("Yakusou3").setIconCoord(0, 4);
		Dokukesisou3 = new DqmItemFood(Dokukesisou3ID,5, 0.0F, false,64).setItemName("Dokukesisou3").setIconCoord(1, 4);
		Tikaranotane3 = new DqmItemFood(Tikaranotane3ID,4, 0.0F, false,64).setPotionEffect(Potion.damageBoost.id, 400, 2, 1.0F).setItemName("Tikaranotane3").setIconCoord(2, 4);
		Mamorinotane3 = new DqmItemFood(Mamorinotane3ID,4, 0.0F, false,64).setPotionEffect(Potion.resistance.id, 400, 2, 1.0F).setItemName("Mamorinotane3").setIconCoord(3, 4);
		Subayasanotane3 = new DqmItemFood(Subayasanotane3ID,4, 0.0F, false,64).setPotionEffect(Potion.moveSpeed.id, 400, 2, 1.0F).setItemName("Subayasanotane3").setIconCoord(4, 4);
		Ougon3 = new DqmItemFood(Ougon3ID,10, 0.0F, false,64).setItemName("Ougon3").setIconCoord(5, 4);
		Honoonomi3 = new DqmItemFood(Honoonomi3ID,4, 0.0F, false,64).setPotionEffect(Potion.fireResistance.id, 400, 2, 1.0F).setItemName("Honoonomi3").setIconCoord(6, 4);
		Iyasinomi3 = new DqmItemFood(Iyasinomi3ID,4, 0.0F, false,64).setPotionEffect(Potion.regeneration.id, 400, 2, 1.0F).setItemName("Iyasinomi3").setIconCoord(7, 4);


        //種ブロック
		YakusouSeed = new DqmYakusouSeed(YakusouSeedID,0).setBlockName("YakusouSeed").setHardness(0.1f);
		ModLoader.registerBlock(YakusouSeed);
		DokukesisouSeed = new DqmDokukesisouSeed(DokukesisouSeedID,16).setBlockName("DokukesisouSeed").setHardness(0.1f);
		ModLoader.registerBlock(DokukesisouSeed);
		TikaraSeed = new DqmTikaraSeed(TikaraSeedID,32).setBlockName("TikaraSeed").setHardness(0.1f);
		ModLoader.registerBlock(TikaraSeed);
		MamoriSeed = new DqmMamoriSeed(MamoriSeedID,48).setBlockName("MamoriSeed").setHardness(0.1f);
		ModLoader.registerBlock(MamoriSeed);
		SubayasaSeed = new DqmSubayasaSeed(SubayasaSeedID,64).setBlockName("SubayasaSeed").setHardness(0.1f);
		ModLoader.registerBlock(SubayasaSeed);
		OugonSeed = new DqmOugonSeed(OugonSeedID,80).setBlockName("OugonSeed").setHardness(0.1f);
		ModLoader.registerBlock(OugonSeed);
		HonooSeed = new DqmHonooSeed(HonooSeedID,96).setBlockName("HonooSeed").setHardness(0.1f);
		ModLoader.registerBlock(HonooSeed);
		IyasiSeed = new DqmIyasiSeed(IyasiSeedID,112).setBlockName("IyasiSeed").setHardness(0.1f);
		ModLoader.registerBlock(IyasiSeed);

		YakusouSeed2 = new DqmYakusouSeed2(YakusouSeed2ID,0).setBlockName("YakusouSeed2").setHardness(0.2f);
		ModLoader.registerBlock(YakusouSeed2);
		DokukesisouSeed2 = new DqmDokukesisouSeed2(DokukesisouSeed2ID,16).setBlockName("DokukesisouSeed2").setHardness(0.2f);
		ModLoader.registerBlock(DokukesisouSeed2);
		TikaraSeed2 = new DqmTikaraSeed2(TikaraSeed2ID,32).setBlockName("TikaraSeed2").setHardness(0.2f);
		ModLoader.registerBlock(TikaraSeed2);
		MamoriSeed2 = new DqmMamoriSeed2(MamoriSeed2ID,48).setBlockName("MamoriSeed2").setHardness(0.2f);
		ModLoader.registerBlock(MamoriSeed2);
		SubayasaSeed2 = new DqmSubayasaSeed2(SubayasaSeed2ID,64).setBlockName("SubayasaSeed2").setHardness(0.2f);
		ModLoader.registerBlock(SubayasaSeed2);
		OugonSeed2 = new DqmOugonSeed2(OugonSeed2ID,80).setBlockName("OugonSeed2").setHardness(0.2f);
		ModLoader.registerBlock(OugonSeed2);
		HonooSeed2 = new DqmHonooSeed2(HonooSeed2ID,96).setBlockName("HonooSeed2").setHardness(0.2f);
		ModLoader.registerBlock(HonooSeed2);
		IyasiSeed2 = new DqmIyasiSeed2(IyasiSeed2ID,112).setBlockName("IyasiSeed2").setHardness(0.2f);
		ModLoader.registerBlock(IyasiSeed2);

		YakusouSeed3 = new DqmYakusouSeed3(YakusouSeed3ID,0).setBlockName("YakusouSeed3").setHardness(0.3f);
		ModLoader.registerBlock(YakusouSeed3);
		DokukesisouSeed3 = new DqmDokukesisouSeed3(DokukesisouSeed3ID,16).setBlockName("DokukesisouSeed3").setHardness(0.3f);
		ModLoader.registerBlock(DokukesisouSeed3);
		TikaraSeed3 = new DqmTikaraSeed3(TikaraSeed3ID,32).setBlockName("TikaraSeed3").setHardness(0.3f);
		ModLoader.registerBlock(TikaraSeed3);
		MamoriSeed3 = new DqmMamoriSeed3(MamoriSeed3ID,48).setBlockName("MamoriSeed3").setHardness(0.3f);
		ModLoader.registerBlock(MamoriSeed3);
		SubayasaSeed3 = new DqmSubayasaSeed3(SubayasaSeed3ID,64).setBlockName("SubayasaSeed3").setHardness(0.3f);
		ModLoader.registerBlock(SubayasaSeed3);
		OugonSeed3 = new DqmOugonSeed3(OugonSeed3ID,80).setBlockName("OugonSeed3").setHardness(0.3f);
		ModLoader.registerBlock(OugonSeed3);
		HonooSeed3 = new DqmHonooSeed3(HonooSeed3ID,96).setBlockName("HonooSeed3").setHardness(0.3f);
		ModLoader.registerBlock(HonooSeed3);
		IyasiSeed3 = new DqmIyasiSeed3(IyasiSeed3ID,112).setBlockName("IyasiSeed3").setHardness(0.3f);
		ModLoader.registerBlock(IyasiSeed3);

		//種アイテム
		//Block.slowSand.blockID,Block.tilledField.blockID
		ItemYakusouSeed = new DqmItemSeed(ItemYakusouSeedID, YakusouSeed.blockID, Block.tilledField.blockID).setItemName("YakusouSeed").setIconCoord(0, 0);
		ItemDokukesisouSeed = new DqmItemSeed(ItemDokukesisouSeedID, DokukesisouSeed.blockID, Block.tilledField.blockID).setItemName("DokukesisouSeed").setIconCoord(1, 0);
		ItemTikaraSeed = new DqmItemSeed(ItemTikaraSeedID, TikaraSeed.blockID, Block.tilledField.blockID).setItemName("TikaraSeed").setIconCoord(2, 0);
		ItemMamoriSeed = new DqmItemSeed(ItemMamoriSeedID, MamoriSeed.blockID, Block.tilledField.blockID).setItemName("MamoriSeed").setIconCoord(3, 0);
		ItemSubayasaSeed = new DqmItemSeed(ItemSubayasaSeedID, SubayasaSeed.blockID, Block.tilledField.blockID).setItemName("SubayasaSeed").setIconCoord(4, 0);
		ItemOugonSeed = new DqmItemSeed(ItemOugonSeedID, OugonSeed.blockID, Block.tilledField.blockID).setItemName("OugonSeed").setIconCoord(5, 0);
		ItemHonooSeed = new DqmItemSeed(ItemHonooSeedID, HonooSeed.blockID, Block.tilledField.blockID).setItemName("HonooSeed").setIconCoord(6, 0);
		ItemIyasiSeed = new DqmItemSeed(ItemIyasiSeedID, IyasiSeed.blockID, Block.tilledField.blockID).setItemName("IyasiSeed").setIconCoord(7, 0);

		ItemYakusouSeed2 = new DqmItemSeed(ItemYakusouSeed2ID, YakusouSeed2.blockID, Block.tilledField.blockID).setItemName("YakusouSeed2").setIconCoord(0, 1);
		ItemDokukesisouSeed2 = new DqmItemSeed(ItemDokukesisouSeed2ID, DokukesisouSeed2.blockID, Block.tilledField.blockID).setItemName("DokukesisouSeed2").setIconCoord(1, 1);
		ItemTikaraSeed2 = new DqmItemSeed(ItemTikaraSeed2ID, TikaraSeed2.blockID, Block.tilledField.blockID).setItemName("TikaraSeed2").setIconCoord(2, 1);
		ItemMamoriSeed2 = new DqmItemSeed(ItemMamoriSeed2ID, MamoriSeed2.blockID, Block.tilledField.blockID).setItemName("MamoriSeed2").setIconCoord(3, 1);
		ItemSubayasaSeed2 = new DqmItemSeed(ItemSubayasaSeed2ID, SubayasaSeed2.blockID, Block.tilledField.blockID).setItemName("SubayasaSeed2").setIconCoord(4, 1);
		ItemOugonSeed2 = new DqmItemSeed(ItemOugonSeed2ID, OugonSeed2.blockID, Block.tilledField.blockID).setItemName("OugonSeed2").setIconCoord(5, 1);
		ItemHonooSeed2 = new DqmItemSeed(ItemHonooSeed2ID, HonooSeed2.blockID, Block.tilledField.blockID).setItemName("HonooSeed2").setIconCoord(6, 1);
		ItemIyasiSeed2 = new DqmItemSeed(ItemIyasiSeed2ID, IyasiSeed2.blockID, Block.tilledField.blockID).setItemName("IyasiSeed2").setIconCoord(7, 1);

		ItemYakusouSeed3 = new DqmItemSeed(ItemYakusouSeed3ID, YakusouSeed3.blockID, Block.tilledField.blockID).setItemName("YakusouSeed3").setIconCoord(0, 2);
		ItemDokukesisouSeed3 = new DqmItemSeed(ItemDokukesisouSeed3ID, DokukesisouSeed3.blockID, Block.tilledField.blockID).setItemName("DokukesisouSeed3").setIconCoord(1, 2);
		ItemTikaraSeed3 = new DqmItemSeed(ItemTikaraSeed3ID, TikaraSeed3.blockID, Block.tilledField.blockID).setItemName("TikaraSeed3").setIconCoord(2, 2);
		ItemMamoriSeed3 = new DqmItemSeed(ItemMamoriSeed3ID, MamoriSeed3.blockID, Block.tilledField.blockID).setItemName("MamoriSeed3").setIconCoord(3, 2);
		ItemSubayasaSeed3 = new DqmItemSeed(ItemSubayasaSeed3ID, SubayasaSeed3.blockID, Block.tilledField.blockID).setItemName("SubayasaSeed3").setIconCoord(4, 2);
		ItemOugonSeed3 = new DqmItemSeed(ItemOugonSeed3ID, OugonSeed3.blockID, Block.tilledField.blockID).setItemName("OugonSeed3").setIconCoord(5, 2);
		ItemHonooSeed3 = new DqmItemSeed(ItemHonooSeed3ID, HonooSeed3.blockID, Block.tilledField.blockID).setItemName("HonooSeed3").setIconCoord(6, 2);
		ItemIyasiSeed3 = new DqmItemSeed(ItemIyasiSeed3ID, IyasiSeed3.blockID, Block.tilledField.blockID).setItemName("IyasiSeed3").setIconCoord(7, 2);

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
        //テストブロック
        //BlockクラスのオブジェクトTESTBlockを作る。
        //.setHardness 硬さ(破壊するのにかかる時間)
        //.setResistance　爆発耐久力
        //.setStepSound 踏んだ時の音
        //.setLightValue　明るさ
/*
        TESTBlock = new DqmSixBlock(TESTBlockID,90).setBlockName("TEST Block").setHardness(0.5f);
        //TESTBlock = new DqmOneBlock(TESTBlockID,238).setBlockName("TEST Block").setHardness(0.5f);
        //TESTBlock = new DqmMereBlock(TESTBlockID,90).setBlockName("TEST Block").setHardness(0.5f);
        ModLoader.addName(TESTBlock, "TEST Block");
        ModLoader.addName(TESTBlock, "ja_JP", "テストブロック");
        ModLoader.registerBlock(TESTBlock);
*/
        //木箱
        DqmBlockHako = new DqmHakoBlock(DqmBlockHakoID,128).setBlockName("DqmHakoBlock").setHardness(2.0f).setStepSound(soundWoodFootstep);
        ModLoader.registerBlock(DqmBlockHako);

        DqmBlockGenkotu = new DqmGenkotuBlock(DqmBlockGenkotuID,129).setBlockName("DqmGenkotuBlock").setHardness(0.1f).setStepSound(soundGrassFootstep);
        ModLoader.registerBlock(DqmBlockGenkotu);



		//鉱石
        DqmBlockOre = (new DqmBlockOre(DqmBlockOreID, 0)).setHardness(4.5F).setResistance(1.0F).setBlockName("DqmBlockOre").setRequiresSelfNotify();
        Item.itemsList[this.DqmBlockOreID] = (new DqmItemBlock(this.DqmBlockOreID - 256)).setItemName("DqmBlockOre");

        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 0, "pickaxe", 1);	//鉄鉱の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 1, "pickaxe", 2);	//溶岩の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 2, "pickaxe", 2);	//鏡の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 3, "pickaxe", 3);	//ミスリルの原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 4, "pickaxe", 3);	//プラチナの原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 5, "pickaxe", 3);	//ヘビーメタルの原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 6, "pickaxe", 3);	//ルビーの原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 7, "pickaxe", 3);	//月の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 8, "pickaxe", 3);	//光の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 9, "pickaxe", 3);	//時の結晶の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 10, "pickaxe", 3);	//メダルの原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 11, "pickaxe", 3);	//太陽の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 12, "pickaxe", 1);	//爆弾の原石
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 13, "pickaxe", 1);	//星の砂
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 14, "pickaxe", 1);	//氷の塊
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 15, "pickaxe", 1);	//磨き砂の塊
        MinecraftForge.setBlockHarvestLevel(DqmBlockOre, 16, "pickaxe", 3);	//命の石の原石

		//ID,0,個数,確立
		ForgeHooks.addGrassSeed(ItemYakusouSeed.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(ItemDokukesisouSeed.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(ItemTikaraSeed.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(ItemMamoriSeed.shiftedIndex,0, 1, 1);
		ForgeHooks.addGrassSeed(ItemSubayasaSeed.shiftedIndex,0, 1, 1);
		ModLoader.setInGUIHook(this, true, false);
		ModLoader.setInGameHook(this, true, false);
		MinecraftForge.registerEntityLivingHandler(new DqmEntityLivingHandler());

		DqmAddName.setName();
		DqmAddItemRecipe.addRecipe();

	}
	/*
	@Override
	public void generateSurface2(World var1,Random var2,int var3,int var4){

		WorldGenSample var1 = new WorldGenSample(true);
		var1.setScale(1, 1, 1);

		int xPos = var3 + var2.nextInt(700);
		int zPos = var4 + var2.nextInt(700);
		int yPos = var1.getHeightValue(xPos, zPos);

		var1.generate(var1, var2, xPos, yPos, zPos);

	}*/
    public void generateSurface(World var1, Random var2, int var3, int var4)
    {
        int var5;
        int var6;
        int var7;
        int var8;

        for (var5 = 0; var5 < 2; ++var5)//鉄鉱の原石
        {
            var6 = var3 + var2.nextInt(25);
            var7 = var2.nextInt(25);
            var8 = var4 + var2.nextInt(25);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 0)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)//溶岩の原石
        {
            var6 = var3 + var2.nextInt(25);
            var7 = var2.nextInt(20);
            var8 = var4 + var2.nextInt(25);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 1)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)//鏡の原石
        {
            var6 = var3 + var2.nextInt(20);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(20);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 2)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)//ミスリルの原石
        {
            var6 = var3 + var2.nextInt(6);
            var7 = var2.nextInt(7);
            var8 = var4 + var2.nextInt(6);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 3)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)//プラチナの原石
        {
            var6 = var3 + var2.nextInt(10);
            var7 = var2.nextInt(8);
            var8 = var4 + var2.nextInt(10);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 4)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 2; ++var5)//ヘビーメタルの原石
        {
            var6 = var3 + var2.nextInt(7);
            var7 = var2.nextInt(6);
            var8 = var4 + var2.nextInt(7);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 5)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//ルビーの原石
        {
            var6 = var3 + var2.nextInt(7);
            var7 = var2.nextInt(5);
            var8 = var4 + var2.nextInt(7);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 6)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//月の原石
        {
            var6 = var3 + var2.nextInt(7);
            var7 = var2.nextInt(5);
            var8 = var4 + var2.nextInt(7);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 7)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//光の原石
        {
            var6 = var3 + var2.nextInt(7);
            var7 = var2.nextInt(3);
            var8 = var4 + var2.nextInt(7);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 8)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//時の結晶の原石
        {
            var6 = var3 + var2.nextInt(15);
            var7 = var2.nextInt(10);
            var8 = var4 + var2.nextInt(15);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 9)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//メダルの原石
        {
            var6 = var3 + var2.nextInt(7);
            var7 = var2.nextInt(3);
            var8 = var4 + var2.nextInt(7);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 10)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//太陽の原石
        {
            var6 = var3 + var2.nextInt(12);
            var7 = var2.nextInt(8);
            var8 = var4 + var2.nextInt(12);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 11)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//爆弾の原石
        {
            var6 = var3 + var2.nextInt(15);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(15);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 12)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//星の砂
        {
            var6 = var3 + var2.nextInt(15);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(15);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 13)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//氷の塊
        {
            var6 = var3 + var2.nextInt(15);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(15);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 14)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//磨き砂の塊
        {
            var6 = var3 + var2.nextInt(15);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(15);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 15)).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 6; ++var5)//命の石の原石
        {
            var6 = var3 + var2.nextInt(10);
            var7 = var2.nextInt(5);
            var8 = var4 + var2.nextInt(10);
            (new DqmWorldGen(DqmBlockOre.blockID, 8, 16)).generate(var1, var2, var6, var7, var8);
        }

    }

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
		if(ccount >= 5)
		{
			if(DIP.EpPositionX != (int)sp.posX || DIP.EpPositionY != (int)sp.posY || DIP.EpPositionZ != (int)sp.posZ)
			{
				DIP.EpPositionX = (int)sp.posX;
				DIP.EpPositionY = (int)sp.posY;
				DIP.EpPositionZ = (int)sp.posZ;
			}
			ccount  = 0;
		}
		else ccount++;
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



	//mob render************************************************************************************************************************************************************
	@Override
	public void addRenderer(Map renderers)
	{
		renderers.put(DqmEntityTntEgg.class, new DqmRenderEgg(Bakudanisi.iconIndex));
		renderers.put(DqmEntityEgg.class, new DqmRenderEgg(MysteryEgg.iconIndex));
		renderers.put(DqmEntityKirapanBike.class, new DqmRenderKirapanBike(new DqmModelKirapanBike()));
		renderers.put(DqmEntityRamiaBike.class, new DqmRenderRamiaBike());
		renderers.put(DqmEntityDragonBike.class, new DqmRenderDragonBike());
		//renderers.put(DqmTileEntityTuboRenderer.class, new DqmTileEntityTuboRenderer());

	}
	@Override
	public String getVersion()
	{
		return "MC1.2.5";
	}
}