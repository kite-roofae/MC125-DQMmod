package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemTool extends ItemTool implements ITextureProvider {
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
			blocksEffectiveAgainst = hoe;
		}
		if (toolfalg == 1) {
			blocksEffectiveAgainst = spade;
		}
		if (toolfalg == 2) {
			blocksEffectiveAgainst = pickaxe;
		}
		if (toolfalg == 3) {
			blocksEffectiveAgainst = axe;
		}
		//　攻撃力補正1未満になった場合最低値として1をセット
		//　それ以外は通常計算式で処理
		if(1 > toolfalg + par3EnumToolMaterial.getDamageVsEntity()) {
			damageVsEntity = 1;
		}
	}

	public DqmItemTool setmodel(String m)
	{
		model = m;
		return this;
	}
	public DqmItemTool setdamageVsEntity(int par1)
	{
		damageVsEntity = par1;
		return this;
	}
	@Override
	public DqmItemTool setIconCoord(int par1, int par2)
	{
		iconIndex = par1 + par2 * 16;
		return this;
	}

	public DqmItemTool setIconCoord2(int par1, int par2)
	{
		iconIndex2 = par1 + par2 * 16;
		return this;
	}

	@Override
	public DqmItemTool setIconIndex(int par1)
	{
		iconIndex = par1;
		return this;
	}
	public DqmItemTool setIconIndex2(int par1)
	{
		iconIndex2 = par1;
		return this;
	}
	public DqmItemTool setColor(int par1)
	{
		rColor1 = par1;
		return this;
	}
	public DqmItemTool setColor2(int par1)
	{
		rColor2 = par1;
		return this;
	}
	public DqmItemTool setTexture(String par1)
	{
		Texture = par1;
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
		}
		else if (tool == 2) {
			return par1Block == Block.obsidian ? toolMaterial
					.getHarvestLevel() == 3
					: (par1Block != Block.blockDiamond
					&& par1Block != Block.oreDiamond ? (par1Block != Block.blockGold
					&& par1Block != Block.oreGold ? (par1Block != Block.blockSteel
					&& par1Block != Block.oreIron ? (par1Block != Block.blockLapis
					&& par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone
					&& par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true
							: par1Block.blockMaterial == Material.iron)
							: toolMaterial.getHarvestLevel() >= 2)
							: toolMaterial.getHarvestLevel() >= 1)
							: toolMaterial.getHarvestLevel() >= 1)
							: toolMaterial.getHarvestLevel() >= 2)
							: toolMaterial.getHarvestLevel() >= 2);
		}
		else if(tool == 4){
	        return par1Block.blockID == Block.web.blockID;
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
					&& (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? efficiencyOnProperMaterial
							: super.getStrVsBlock(par1ItemStack, par2Block);
		}
		else if (tool == 3) {
			return par2Block != null
					&& par2Block.blockMaterial == Material.wood ? efficiencyOnProperMaterial
							: super.getStrVsBlock(par1ItemStack, par2Block);
		}
		else if (tool == 1) {
			for (int var3 = 0; var3 < blocksEffectiveAgainst.length; ++var3) {
				if (blocksEffectiveAgainst[var3] == par2Block) {
					return efficiencyOnProperMaterial;
				}
			}
		}
		else if(tool == 4) {
	        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
		}

		return 1.0F;
	}
	@Override
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
					par3World.playSoundEffect((par4 + 0.5F), (par5 + 0.5F), (par6 + 0.5F), var10.stepSound.getStepSound(), (var10.stepSound.getVolume() + 1.0F) / 2.0F, var10.stepSound.getPitch() * 0.8F);

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
		} else {
			return false;
		}
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack)
	{
		return getItemStackLimit() == 1 && isDamageable();
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
		int x = 0;
		int x3 = x+getRandom(100, -100);

		if(model == "Majuunotume" && (
				par1Entity.getClass() == DqmEntityIkkakuusagi.class ||
				par1Entity.getClass() == DqmEntityArumiraji.class ||
				par1Entity.getClass() == DqmEntityKirapan.class ||
				par1Entity.getClass() == DqmpetEntityIkkakuusagi.class ||
				par1Entity.getClass() == DqmpetEntityKirapan.class
				))
		{
			w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
			return damageVsEntity * 2;
		}
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
			return damageVsEntity * 2;
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
			return damageVsEntity * 2;
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
			return damageVsEntity * 2;
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
			return damageVsEntity * 2;
		}
		if(model == "Ookanaduti" )
		{
			if(x3>= -70 && x3<= 80)
			{
				return damageVsEntity * 1;
			}
			if(x3>= 81)
			{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return damageVsEntity * 4;
			}
			if(x3<= -71)
			{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Miss", 0.9F, 0.9F);
				return damageVsEntity * 0;
			}
		}
		return damageVsEntity;
	}

	//防御関係
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

}