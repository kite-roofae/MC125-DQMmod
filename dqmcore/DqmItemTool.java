package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityArumiraji;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityAtorasu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityAyasiikage;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityBakudaniwa;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityBehoimisuraimu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityBehoimusuraimu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityBigCrow;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityBubsura;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityBuraddihando;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityDasudragon;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityDesufuratta;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityDoraki;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityDorakima;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityDqmdragon;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityEsterk;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityFurosutogizumo;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGaikotukensi;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGamegon;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGamegonload;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGamegonrejendo;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGhost;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGigantesu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGizumo;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGoldman;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGoremu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGorudensuraimu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityGorudentotemu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityHagumeta;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityHerughost;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityHiitogizumo;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityHitokuibako;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityHoimisura;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityHoroghost;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityIkkakuusagi;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKagenokisi;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKimera;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKingsura;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKiramasin;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKirapan;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKirikabuobake;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKisudragon;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityKuinsuraimu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMadohando;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMaounokage;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMegazarurokku;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMeijikimera;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMeragosuto;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetaking;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetaruburazazu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetaruhanta;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetaruhantaken;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetaruraida;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetasura;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMetoroghost;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityMimikku;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityPandorabox;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityPuratinaking;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityRiripat;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySamayoutamasii;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySibirekurage;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySiryounokisi;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityStarkimera;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityStonman;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySumairurokku;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySura;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySuraimubehomazun;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySuraimubesu;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySuraimumadyura;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySuraimunaito;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySuraimutawa;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntitySyado;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityTahodoraki;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityWaraibukuro;
import net.minecraft.src.dqmcore.DqmEntity.DqmEntityZoma;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityBakudaniwa;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityDorakima;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityDqmdragon;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityGaikotukensi;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityGhost;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityGigantesu;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityGoremu;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityHagumeta;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityHitokuibako;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityIkkakuusagi;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityKimera;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityKingsura;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityKiramasin;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityKirapan;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityKirikabuobake;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityKuinsuraimu;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityLittleEsterk;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntityMetoroghost;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntitySura;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntitySuraimunaito;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntitySuraimutawa;
import net.minecraft.src.dqmcore.DqmEntity.DqmpetEntitySyado;
import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemTool extends ItemTool implements ITextureProvider {
	private int weaponDamage;
	private String model;
	private Block[] blocksEffectiveAgainst;
	private int tool = 0; // ツール種別設定
	protected String Texture = "/dqm/DqmItems.png"; // テクスチャマップパス用変数
	private int rColor1 = 0xFFFFFF;
	private int rColor2 = 0xFFFFFF;
	private int iconIndex2 = -1; // 後面に表示されるテクスチャ設定
	// ツール適性アイテム設定
	static Block[] pickaxe = new Block[] { Block.cobblestone,
		Block.stairDouble, Block.stairSingle, Block.stone, Block.sandStone,
		Block.cobblestoneMossy, Block.oreIron, Block.blockSteel,
		Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond,
		Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis,
		Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing,
		Block.rail, Block.railDetector, Block.railPowered };
	static Block[] axe = new Block[] { Block.planks, Block.bookShelf,
		Block.wood, Block.chest, Block.stairDouble, Block.stairSingle,
		Block.pumpkin, Block.pumpkinLantern };
	static Block[] spade = new Block[] { Block.grass, Block.dirt, Block.sand,
		Block.gravel, Block.snow, Block.blockSnow, Block.blockClay,
		Block.tilledField, Block.slowSand, Block.mycelium };
	static Block[] hoe = new Block[] { Block.bedrock };// ダミーのブロック破壊適正＆鍬の適正セット

	public DqmItemTool(int id, int toolfalg,
			EnumToolMaterial par3EnumToolMaterial) {
		super(id, toolfalg, par3EnumToolMaterial, hoe);
		tool = toolfalg;
		if (toolfalg == 0) {
			this.blocksEffectiveAgainst = hoe;
		}
		if (toolfalg == 1) {
			this.blocksEffectiveAgainst = spade;
		}
		if (toolfalg == 2) {
			this.blocksEffectiveAgainst = pickaxe;
		}
		if (toolfalg == 3) {
			this.blocksEffectiveAgainst = axe;
		}
		//　攻撃力補正1未満になった場合最低値として1をセット
		//　それ以外は通常計算式で処理
		if(1 > toolfalg + par3EnumToolMaterial.getDamageVsEntity())
        this.damageVsEntity = 1;
	}

    public DqmItemTool setdamageVsEntity(int par1)
    {
        this.damageVsEntity = par1;
        return this;
    }
    public DqmItemTool setIconCoord(int par1, int par2)
    {
        this.iconIndex = par1 + par2 * 16;
        return this;
    }

    public DqmItemTool setIconCoord2(int par1, int par2)
    {
        this.iconIndex2 = par1 + par2 * 16;
        return this;
    }

	@Override
	public DqmItemTool setIconIndex(int par1)
	{
		this.iconIndex = par1;
		return this;
	}
	public DqmItemTool setIconIndex2(int par1)
	{
		this.iconIndex2 = par1;
		return this;
	}
	public DqmItemTool setColor(int par1)
	{
		this.rColor1 = par1;
		return this;
	}
	public DqmItemTool setColor2(int par1)
	{
		this.rColor2 = par1;
		return this;
	}
	public DqmItemTool setTexture(String par1)
	{
		this.Texture = par1;
		return this;
	}

	//テクスチャの合成の発動キー
	@Override
	public boolean requiresMultipleRenderPasses() {
		if(iconIndex2 > 0) {//iconIndex2に何か入ってたら合成発動キーに真を返す
			return true;
		}
		return false;
	}
	//合成するテクスチャの番号を返す
	//ブロックのテクスチャと同じ様に番号がふられているので、それを返す
	@Override
	public int func_46057_a(int tex1, int tex2)
	{
			return tex2 > 0 ? iconIndex:iconIndex2;
	}

	// 色の乗算
	@Override
	public int getColorFromDamage(int par1, int par2) {
		if (par2 > 0) {
			// 上に描写されるテクスチャの色乗算
			return rColor1;
		} else {
			// 下地のテクスチャの色乗算
			return rColor2;
		}
	}

	@Override
	public String getTextureFile() {
		// フォージ用使用テクスチャぱす
		return Texture;
	}
	public static void addRecipe(Item item1, Item item2, Item item3,
			Object obj) {
		ModLoader.addRecipe(new ItemStack(item1, 1), new Object[] { "x", "y",
			"y", 'x', obj, 'y', Item.stick });
		ModLoader.addRecipe(new ItemStack(item2, 1), new Object[] { "xxx",
			" y ", " y ", 'x', obj, 'y', Item.stick });
		ModLoader.addRecipe(new ItemStack(item3, 1), new Object[] { "xx ",
			"xy ", " y ", 'x', obj, 'y', Item.stick });
	}

	@Override
	public boolean canHarvestBlock(Block par1Block) // シャベル用判定
	{
		if (tool == 1) {
			return par1Block == Block.snow ? true
					: par1Block == Block.blockSnow;
		} else if (tool == 2) {
			return par1Block == Block.obsidian ? this.toolMaterial
					.getHarvestLevel() == 3
					: (par1Block != Block.blockDiamond
					&& par1Block != Block.oreDiamond ? (par1Block != Block.blockGold
					&& par1Block != Block.oreGold ? (par1Block != Block.blockSteel
					&& par1Block != Block.oreIron ? (par1Block != Block.blockLapis
					&& par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone
					&& par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true
							: par1Block.blockMaterial == Material.iron)
							: this.toolMaterial.getHarvestLevel() >= 2)
							: this.toolMaterial.getHarvestLevel() >= 1)
							: this.toolMaterial.getHarvestLevel() >= 1)
							: this.toolMaterial.getHarvestLevel() >= 2)
							: this.toolMaterial.getHarvestLevel() >= 2);
		}
		return false;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		if (tool == 2) {
			return par2Block != null
					&& (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial
							: super.getStrVsBlock(par1ItemStack, par2Block);
		} else if (tool == 3) {
			return par2Block != null
					&& par2Block.blockMaterial == Material.wood ? this.efficiencyOnProperMaterial
							: super.getStrVsBlock(par1ItemStack, par2Block);
		} else if (tool == 1) {
			for (int var3 = 0; var3 < this.blocksEffectiveAgainst.length; ++var3) {
				if (this.blocksEffectiveAgainst[var3] == par2Block) {
					return this.efficiencyOnProperMaterial;
				}
			}
		}

		return 1.0F;
	}
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
    {
    	if(tool == 0) {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
        {
            return false;
        }
        else
        {
            if (ForgeHooks.onUseHoe(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6))
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }
            int var8 = par3World.getBlockId(par4, par5, par6);
            int var9 = par3World.getBlockId(par4, par5 + 1, par6);

            if ((par7 == 0 || var9 != 0 || var8 != Block.grass.blockID) && var8 != Block.dirt.blockID)
            {
                return false;
            }
            else
            {
                Block var10 = Block.tilledField;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var10.stepSound.getStepSound(), (var10.stepSound.getVolume() + 1.0F) / 2.0F, var10.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    par3World.setBlockWithNotify(par4, par5, par6, var10.blockID);
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            }
        }
        }
    	else return false;
    }

	@Override
	public boolean isItemTool(ItemStack par1ItemStack)
	{
		return this.getItemStackLimit() == 1 && this.isDamageable();
		//		return par1ItemStack.stackSize == 1;
	}

	@Override
	public float getStrVsBlock(ItemStack stack, Block block, int meta) {
		if (ForgeHooks.isToolEffective(stack, block, meta)) {
			return efficiencyOnProperMaterial;
		}
		return getStrVsBlock(stack, block);
	}
	private static int getRandom(int max, int min) {
		int ret = (int)Math.floor(Math.random()*(max-min+1))+min;

		return ret;
	}
	@Override
	public int getDamageVsEntity(Entity par1Entity)
	{
		World w = ModLoader.getMinecraftInstance().theWorld;

				if(model == "Akumanotume" && (
				par1Entity.getClass() == DqmEntityDoraki.class ||
				par1Entity.getClass() == DqmEntityDorakima.class ||
				par1Entity.getClass() == DqmEntityRiripat.class ||
				par1Entity.getClass() == DqmEntityTahodoraki.class ||
				par1Entity.getClass() == DqmEntityAtorasu.class ||
				par1Entity.getClass() == DqmEntityGigantesu.class ||
				par1Entity.getClass() == DqmpetEntityDorakima.class ||
				par1Entity.getClass() == DqmpetEntityGigantesu.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Gureitoakusu" && (
				par1Entity.getClass() == DqmEntityBigCrow.class ||
				par1Entity.getClass() == DqmEntityKirikabuobake.class ||
				par1Entity.getClass() == DqmEntityKimera.class ||
				par1Entity.getClass() == DqmEntityDesufuratta.class ||
				par1Entity.getClass() == DqmpetEntityKirikabuobake.class ||
				par1Entity.getClass() == DqmpetEntityKimera.class||
				par1Entity.getClass() == DqmEntityMeijikimera.class ||
				par1Entity.getClass() == DqmEntityStarkimera.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Oninokanabou" && (
				par1Entity.getClass() == DqmEntitySura.class ||
				//par1Entity.getClass() == DqmEntityMetasura.class ||
				par1Entity.getClass() == DqmEntitySuraimubesu.class ||
				par1Entity.getClass() == DqmEntityBubsura.class ||
				//par1Entity.getClass() == DqmEntityHagumeta.class ||
				par1Entity.getClass() == DqmEntityHoimisura.class ||
				par1Entity.getClass() == DqmEntitySuraimutawa.class ||
				par1Entity.getClass() == DqmEntitySuraimunaito.class ||
				par1Entity.getClass() == DqmEntityKingsura.class ||
				//par1Entity.getClass() == DqmEntityMetaking.class ||
				par1Entity.getClass() == DqmEntitySuraimubehomazun.class ||
				par1Entity.getClass() == DqmEntityMetaruraida.class ||
				par1Entity.getClass() == DqmEntityKuinsuraimu.class ||
				par1Entity.getClass() == DqmpetEntitySura.class ||
				//par1Entity.getClass() == DqmpetEntityHagumeta.class ||
				par1Entity.getClass() == DqmpetEntitySuraimutawa.class ||
				par1Entity.getClass() == DqmpetEntitySuraimunaito.class ||
				par1Entity.getClass() == DqmpetEntityKingsura.class ||
				par1Entity.getClass() == DqmpetEntityKuinsuraimu.class||
				//par1Entity.getClass() == DqmEntityMetaruburazazu.class ||
				par1Entity.getClass() == DqmEntitySibirekurage.class ||
				par1Entity.getClass() == DqmEntityBehoimisuraimu.class ||
				//par1Entity.getClass() == DqmEntityPuratinaking.class ||
				par1Entity.getClass() == DqmEntityBehoimusuraimu.class ||
				par1Entity.getClass() == DqmEntityGorudentotemu.class ||
				par1Entity.getClass() == DqmEntityGorudensuraimu.class ||
				par1Entity.getClass() == DqmEntitySuraimumadyura.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Metarukingnoturugi" && (

				par1Entity.getClass() == DqmEntityMetasura.class ||
				par1Entity.getClass() == DqmEntityHagumeta.class ||
				par1Entity.getClass() == DqmEntityMetaking.class ||
				par1Entity.getClass() == DqmpetEntityHagumeta.class ||
				par1Entity.getClass() == DqmEntityMetaruburazazu.class ||
				par1Entity.getClass() == DqmEntityPuratinaking.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Seinarunaifu" && (
				par1Entity.getClass() == DqmEntityGhost.class ||
				par1Entity.getClass() == DqmEntityMetoroghost.class ||
				par1Entity.getClass() == DqmEntityHerughost.class ||
				par1Entity.getClass() == DqmEntityGaikotukensi.class ||
				par1Entity.getClass() == DqmpetEntityGhost.class ||
				par1Entity.getClass() == DqmpetEntityMetoroghost.class ||
				par1Entity.getClass() == DqmpetEntityGaikotukensi.class||
				par1Entity.getClass() == DqmEntityMeragosuto.class ||
				par1Entity.getClass() == DqmEntitySamayoutamasii.class ||
				par1Entity.getClass() == DqmEntitySiryounokisi.class ||
				par1Entity.getClass() == DqmEntityKagenokisi.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 3;
				}
				if(model == "Rotonoturugi" && (
				par1Entity.getClass() == DqmEntityEsterk.class ||
				par1Entity.getClass() == DqmpetEntityLittleEsterk.class ||
				par1Entity.getClass() == DqmEntityZoma.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Doragonkira" && (
				par1Entity.getClass() == DqmEntityDqmdragon.class ||
				par1Entity.getClass() == DqmpetEntityDqmdragon.class||
				par1Entity.getClass() == DqmEntityGamegon.class ||
				par1Entity.getClass() == DqmEntityKisudragon.class ||
				par1Entity.getClass() == DqmEntityGamegonload.class ||
				par1Entity.getClass() == DqmEntityDasudragon.class ||
				par1Entity.getClass() == DqmEntityGamegonrejendo.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Atorasunokanaduti" && (
				par1Entity.getClass() == DqmEntityGizumo.class ||
				par1Entity.getClass() == DqmEntityAyasiikage.class ||
				par1Entity.getClass() == DqmEntityWaraibukuro.class ||
				par1Entity.getClass() == DqmEntityBakudaniwa.class ||
				par1Entity.getClass() == DqmEntitySyado.class ||
				par1Entity.getClass() == DqmEntityHiitogizumo.class ||
				par1Entity.getClass() == DqmEntityFurosutogizumo.class ||
				par1Entity.getClass() == DqmEntityHoroghost.class ||
				par1Entity.getClass() == DqmEntityMadohando.class ||
				par1Entity.getClass() == DqmEntityMaounokage.class ||
				par1Entity.getClass() == DqmEntityBuraddihando.class ||
				par1Entity.getClass() == DqmEntityHitokuibako.class ||
				par1Entity.getClass() == DqmEntityMetaruhanta.class ||
				par1Entity.getClass() == DqmEntityMetaruhantaken.class ||
				par1Entity.getClass() == DqmEntityKiramasin.class ||
				par1Entity.getClass() == DqmEntityGoremu.class ||
				par1Entity.getClass() == DqmEntityMimikku.class ||
				par1Entity.getClass() == DqmEntityPandorabox.class ||
				par1Entity.getClass() == DqmpetEntityBakudaniwa.class ||
				par1Entity.getClass() == DqmpetEntitySyado.class ||
				par1Entity.getClass() == DqmpetEntityHitokuibako.class ||
				par1Entity.getClass() == DqmpetEntityKiramasin.class ||
				par1Entity.getClass() == DqmpetEntityGoremu.class||
				par1Entity.getClass() == DqmEntitySumairurokku.class ||
				par1Entity.getClass() == DqmEntityMegazarurokku.class ||
				par1Entity.getClass() == DqmEntityGoldman.class ||
				par1Entity.getClass() == DqmEntityStonman.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Majuunotume" && (
				par1Entity.getClass() == DqmEntityIkkakuusagi.class ||
				par1Entity.getClass() == DqmEntityArumiraji.class ||
				par1Entity.getClass() == DqmEntityKirapan.class ||
				par1Entity.getClass() == DqmpetEntityIkkakuusagi.class ||
				par1Entity.getClass() == DqmpetEntityKirapan.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}

				int x = 0;
				int x3 = x+getRandom(100, -100);

				if(model == "Ookanaduti" )
				{
					if(x3>= -70 && x3<= 80)
					{
						return this.weaponDamage * 1;
					}
					if(x3>= 81)
					{
					w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
					return this.weaponDamage * 4;
					}
					if(x3<= -71)
					{
					w.playSoundAtEntity(par1Entity, "DQM_Sound.Miss", 0.9F, 0.9F);
					return this.weaponDamage * 0;
					}
				}

				if(model == "Majinnokanaduti" )
				{
					if(x3>= 50)
					{
						w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
						return this.weaponDamage * 5;
					}
					if(x3<= 49)
					{
					w.playSoundAtEntity(par1Entity, "DQM_Sound.Miss", 0.9F, 0.9F);
					return this.weaponDamage * 0;
					}
				}
				if(model == "Dokubari" )
				{
					if(x3>= 95)
					{
						w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
						return this.weaponDamage * 200;
					}
					if(x3<= 94)
					{
					//w.playSoundAtEntity(par1Entity, "DQM_Sound.Miss", 0.9F, 0.9F);
					return this.weaponDamage * 1;
					}
				}

		return this.weaponDamage;
	}

}