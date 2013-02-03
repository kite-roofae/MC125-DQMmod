package net.minecraft.src.dqmcore;

public enum DqmEnumToolMaterial
{
	WOOD(0, 59, 2.0F, 0, 15),
	STONE(1, 131, 4.0F, 1, 5),
	IRON(2, 250, 6.0F, 2, 14),
	EMERALD(3, 1561, 8.0F, 3, 10),
	GOLD(0, 32, 12.0F, 0, 22),
	GINGA(3, 10000, 12.0F, 16, 35),
	ROTO(3, 3000, 12.0F, 10, 40),
	METAL(3, 5000, 12.0F, 12, 25),
	OLD(0, 10, 12.0F, 1, 5),
	HAGANE(2, 800, 12.0F, 4, 20),
	DRAGON(3, 1100, 12.0F, 6, 15),
	UMINARI(1, 300, 12.0F, -2, 30),
	KOORI(1, 300, 12.0F, 3, 15),
	INFERUNO(2, 900, 12.0F, 5, 20),
	HEISHI(2, 250, 12.0F, 2, 10),
	HAYABUSA(2, 1500, 12.0F, -1, 25),
	KISEKI(3, 1500, 12.0F, 8, 20),
	SEFIRAMU(3, 2000, 12.0F, 7, 35),
	YUUWAKU(3, 2000, 12.0F, 7, 35),
	TORAI(3, 700, 12.0F, 4, 25),
	OUJA(3, 7000, 12.0F, 14, 30),
	PAPASU(3, 2000, 12.0F, 7, 15),
	PAPASUNEW(3, 2500, 12.0F, 9, 15),
	DEBUG(3, 10000, 100F, 100, 100);
	//ツール適正、耐久力、採掘速度、攻撃力、エンチャント
	/*    GINGA(3, 10000, 8F, 16, 20),
	 *
	 *         toolMaterial = par2EnumToolMaterial;
        maxStackSize = 1;
        weaponDamage = w;//攻撃力　本来の計算式は　攻撃力＝4+攻撃ベース値
        harvestLevel = h;//ツール適正　0＝木製　1＝石製　2＝鉄製　3＝ダイヤ製
        setMaxDamage(t);//耐久力
        //maxUses = t; //taikyuu
        efficiencyOnProperMaterial = s;//採掘速度
        damageVsEntity = d; //攻撃力ベース値　結果死にデータ
        enchantability = e; //エンチャント指数
	Ginganoturugi = new DqmItemSwordEX(GinganoturugiID,DqmEnumToolMaterial.GINGA,20,3,10000,8F,3,50).setIconCoord(0, 0).setItemName("Ginganoturugi");
	Inferunosword = new DqmItemSwordEXInferunosword(InferunoswordID,DqmEnumToolMaterial.IRON,6,3,500,8F,3,15).setIconCoord(3, 0).setItemName("Inferunosword");
	Kazekirinoyumi = new DqmItemKazeBow(KazekirinoyumiID).setIconCoord(10, 0).setItemName("Kazekirinoyumi");
	Koorinoyaiba = new DqmItemSwordEXKoorinoyaiba(KoorinoyaibaID,DqmEnumToolMaterial.IRON,6,3,500,8F,3,15).setIconCoord(4, 0).setItemName("Koorinoyaiba");
	Metarukingnoturugi = new DqmItemSwordEX(MetarukingnoturugiID,DqmEnumToolMaterial.METAL,15,3,8000,8F,3,15).setIconCoord(1, 0).setItemName("Metarukingnoturugi");
	Rotonotate = new DqmItemSwordEX(RotonotateID,DqmEnumToolMaterial.ROTO,1,3,3000,8F,3,15).setIconCoord(4, 3).setItemName("Rotonotate");
	Rotonoturugi = new DqmItemSwordEX(RotonoturugiID,DqmEnumToolMaterial.ROTO,12,3,6000,8F,3,40).setIconCoord(2, 0).setItemName("Rotonoturugi");
	Sabitatate = new DqmItemSwordEX(SabitatateID,DqmEnumToolMaterial.OLD,0,3,10,8F,3,15).setItemName("Sabitatate").setIconCoord(4, 4);
	Uminarinotue = new DqmItemSwordEXUminarinotue(UminarinotueID,DqmEnumToolMaterial.GOLD,3,3,500,8F,3,15).setIconCoord(5, 0).setItemName("Uminarinotue");

	Doragonkira = new DqmItemSwordEX(DoragonkiraID,DqmEnumToolMaterial.DRAGON,10,3,1000,8F,3,40).setIconCoord(6, 0).setItemName("Doragonkira");
	Haganenoturugi = new DqmItemSwordEX(HaganenoturugiID,DqmEnumToolMaterial.HAGANE,8,3,700,8F,3,25).setIconCoord(7, 0).setItemName("Haganenoturugi");
	Heisinoken = new DqmItemSword(HeisinokenID,DqmEnumToolMaterial.IRON,6,3,300,8F,3,15).setIconCoord(8, 0).setItemName("Heisinoken");*/
	;
	//private int weaponDamage;
	/**
	 * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
	 */
	private final int harvestLevel;

	/**
	 * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
	 */
	private final int maxUses;

	/**
	 * The strength of this tool material against blocks which it is effective against.
	 */
	private final float efficiencyOnProperMaterial;

	/** Damage versus entities. */
	private final int damageVsEntity;

	/** Defines the natural enchantability factor of the material. */
	private final int enchantability;

	private DqmEnumToolMaterial(int par3, int par4, float par5, int par6, int par7)
	{
		this.harvestLevel = par3;
		this.maxUses = par4;
		this.efficiencyOnProperMaterial = par5;
		this.damageVsEntity = par6;
		this.enchantability = par7;
	}
	/*
    public int getDamageVsEntity(Entity par1Entity)
    {
        return this.weaponDamage;
    }*/
	/**
	 * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
	 */
	public int getMaxUses()
	{
		return this.maxUses;
	}

	/**
	 * The strength of this tool material against blocks which it is effective against.
	 */
	public float getEfficiencyOnProperMaterial()
	{
		return this.efficiencyOnProperMaterial;
	}

	/**
	 * Damage versus entities.
	 */
	public int getDamageVsEntity()
	{
		return this.damageVsEntity;
	}

	/**
	 * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
	 */
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}

	/**
	 * Return the natural enchantability factor of the material.
	 */
	public int getEnchantability()
	{
		return this.enchantability;
	}
}
