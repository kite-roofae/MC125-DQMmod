package net.minecraft.src.dqmcore;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.forge.EnumHelper;

public class DqmEnumToolMaterial
{
	//攻撃力の引数に+4が剣
	//+3が斧
	//+2がツルハシ
	//+1がシャベル
	//+0が鍬
	/*
    WOOD(0, 59, 2.0F, 0, 15),
    STONE(1, 131, 4.0F, 1, 5),
    IRON(2, 250, 6.0F, 2, 14),
    EMERALD(3, 1561, 8.0F, 3, 10),
    GOLD(0, 32, 12.0F, 0, 22);*/

	//盾
	public static EnumToolMaterial OLD = EnumHelper.addToolMaterial("OLD", 0, 10, 12.0F, 1, 5);

	//槍
	public static EnumToolMaterial TORAI = EnumHelper.addToolMaterial("TORAI", 3, 600, 12.0F, 4, 25);

	//短剣
	public static EnumToolMaterial SEINARU = EnumHelper.addToolMaterial("SEINARU", 3, 200, 12.0F, 0, 25);

	//剣
	public static EnumToolMaterial OUJA = EnumHelper.addToolMaterial("OUJA", 3, 2000, 12.0F, 14, 30);
	public static EnumToolMaterial PAPASU = EnumHelper.addToolMaterial("PAPASU", 3, 1000, 12.0F, 7, 15);
	public static EnumToolMaterial PAPASUNEW = EnumHelper.addToolMaterial("PAPASUNEW", 3, 1250, 12.0F, 9, 15);
	public static EnumToolMaterial KOORI = EnumHelper.addToolMaterial("KOORI", 1, 200, 12.0F, 3, 15);
	public static EnumToolMaterial INFERUNO = EnumHelper.addToolMaterial("INFERUNO", 2, 700, 12.0F, 5, 20);
	public static EnumToolMaterial HEISHI = EnumHelper.addToolMaterial("HEISHI", 2, 250, 12.0F, 2, 10);
	public static EnumToolMaterial HAYABUSA = EnumHelper.addToolMaterial("HAYABUSA", 2, 700, 12.0F, -1, 25);
	public static EnumToolMaterial KISEKI = EnumHelper.addToolMaterial("KISEKI", 3, 1200, 12.0F, 8, 20);
	public static EnumToolMaterial HAGANE = EnumHelper.addToolMaterial("HAGANE", 2, 500, 12.0F, 4, 20);
	public static EnumToolMaterial DRAGON = EnumHelper.addToolMaterial("DRAGON", 3, 800, 12.0F, 6, 15);
	public static EnumToolMaterial GINGA = EnumHelper.addToolMaterial("GINGA", 3, 3500, 12.0F, 16, 35);
	public static EnumToolMaterial ROTO = EnumHelper.addToolMaterial("ROTO", 3, 2500, 12.0F, 10, 40);
	public static EnumToolMaterial METAL = EnumHelper.addToolMaterial("METAL", 3, 3000, 12.0F, 12, 25);

	//ブーメラン
	public static EnumToolMaterial YAIBA = EnumHelper.addToolMaterial("YAIBA", 3, 200, 12.0F, -1, 10);

	//杖
	public static EnumToolMaterial UMINARI = EnumHelper.addToolMaterial("UMINARI", 1, 200, 12.0F, -2, 30);
	public static EnumToolMaterial IKAZUTI = EnumHelper.addToolMaterial("IKAZUTI", 3, 200, 12.0F, -2, 25);
	public static EnumToolMaterial DRAGONROD = EnumHelper.addToolMaterial("DRAGONROD", 3, 200, 12.0F, -1, 30);
	public static EnumToolMaterial SABAKI = EnumHelper.addToolMaterial("SABAKI", 3, 200, 12.0F, -2, 25);
	public static EnumToolMaterial HIKARI = EnumHelper.addToolMaterial("HIKARI", 1, 200, 12.0F, -2, 30);

	//特殊
	public static EnumToolMaterial MAJIN = EnumHelper.addToolMaterial("MAJIN", 3, 800, 12.0F, 9, 5);
	public static EnumToolMaterial DOKUBARI = EnumHelper.addToolMaterial("DOKUBARI", 3, 100, 12.0F, -3, 5);

	//シャベル
	public static EnumToolMaterial MAJUU = EnumHelper.addToolMaterial("MAJUU", 1, 300, 4.0F, 1, 15);
	public static EnumToolMaterial AKUMA = EnumHelper.addToolMaterial("AKUMA", 2, 350, 6.0F, 2, 15);

	//オノ
	public static EnumToolMaterial HAGANENOONO = EnumHelper.addToolMaterial("HAGANENOONO", 1, 300, 4.0F, 3, 10);
	public static EnumToolMaterial HAOU = EnumHelper.addToolMaterial("HAOU", 2, 500, 6.0F, 6, 20);
	public static EnumToolMaterial GUREITO = EnumHelper.addToolMaterial("GUREITO", 3, 600, 8.0F, 8, 10);

	//クワ
	public static EnumToolMaterial HAGANENOKON = EnumHelper.addToolMaterial("HAGANENOKON", 1, 300, 4.0F, 2, 10);
	public static EnumToolMaterial ORIHARUKON = EnumHelper.addToolMaterial("ORIHARUKON", 3, 700, 8.0F, 6, 25);

	//ピッケル
	public static EnumToolMaterial KONBOU = EnumHelper.addToolMaterial("KONBOU", 1, 200, 4.0F, -1, 5);
	public static EnumToolMaterial WOO = EnumHelper.addToolMaterial("WOO", 2, 400, 6.0F, 3, 10);
	public static EnumToolMaterial OO = EnumHelper.addToolMaterial("OO", 3, 500, 8.0F, 4, 5);
	public static EnumToolMaterial ONI = EnumHelper.addToolMaterial("ONI", 3, 700, 10.0F, 5, 10);
	public static EnumToolMaterial ATORASU = EnumHelper.addToolMaterial("ATORASU", 3, 700, 12.0F, 7, 10);

	//デバッグ
	public static EnumToolMaterial DEBUG = EnumHelper.addToolMaterial("DEBUB", 3, 10000, 100.0F, 100, 100);
}
