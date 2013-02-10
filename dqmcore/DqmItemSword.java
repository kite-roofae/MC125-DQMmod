package net.minecraft.src.dqmcore;

import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;
public class DqmItemSword extends ItemSword implements ITextureProvider
{
	private int weaponDamage;
	private final EnumToolMaterial toolMaterial;
	private String model;
	private int attack;
	private int heel;
	private Block[] blocksEffectiveAgainst;
	private int tool = 0; // ツール種別設定
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
    public float efficiencyOnProperMaterial = 4.0F;

	public DqmItemSword(int par1, int toolfalg, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1,par2EnumToolMaterial);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.weaponDamage = toolfalg + par2EnumToolMaterial.getDamageVsEntity();
        this.efficiencyOnProperMaterial = par2EnumToolMaterial.getEfficiencyOnProperMaterial();
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
		if(1 > weaponDamage) {
			weaponDamage = 1;
		}
	}

	public DqmItemSword setmodel(String m)
	{
		model = m;
		return this;
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

    public float getStrVsBlockTool(ItemStack par1ItemStack, Block par2Block)
    {
        for (int var3 = 0; var3 < this.blocksEffectiveAgainst.length; ++var3)
        {
            if (this.blocksEffectiveAgainst[var3] == par2Block)
            {
                return this.efficiencyOnProperMaterial;
            }
        }

        return 1.0F;
    }
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		if (tool == 2) {
			return par2Block != null
					&& (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? efficiencyOnProperMaterial
							: getStrVsBlockTool(par1ItemStack, par2Block);
		}
		else if (tool == 3) {
			return par2Block != null
					&& par2Block.blockMaterial == Material.wood ? efficiencyOnProperMaterial
							: getStrVsBlockTool(par1ItemStack, par2Block);
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

	public float getStrVsBlock(ItemStack stack, Block block, int meta) {
		if (ForgeHooks.isToolEffective(stack, block, meta)) {
			return efficiencyOnProperMaterial;
		}
		return getStrVsBlock(stack, block);
	}

	public DqmItemSword setWeaponDamage(int par1)//Etity par1Entity)
	{/*
			int x = 0;
			World w = ModLoader.getMinecraftInstance().theWorld;

				if(par1Entity.getClass() == DqmEntityMetasura.class ||	par1Entity.getClass() == DqmEntityHagumeta.class ||	par1Entity.getClass() == DqmEntityMetaking.class ||	par1Entity.getClass() == DqmpetEntityHagumeta.class	)
				{
					int x3 = x+getRandom(100, -100);
					if(x3>= 1)
					{
						w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
						this.weaponDamage = 1;
					}
					if(x3<= 0)
					{
						w.playSoundAtEntity(par1Entity, "DQM_Sound.Miss", 0.9F, 0.9F);
					this.weaponDamage = 0;
					}

				}
				else
				{*/
				this.weaponDamage = par1;
				//
				return this;
	}
	private static int getRandom(int max, int min) {
		int ret = (int)Math.floor(Math.random()*(max-min+1))+min;

		return ret;
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		EntityPlayer ep = (EntityPlayer) entity;
		if(world.isRemote)
		{
			return;
		}
			if(ep.getCurrentEquippedItem()== null)
			{
				return;
			}
				int x = MathHelper.floor_double(ep.posX);
				int y = MathHelper.floor_double(ep.boundingBox.minY) - 1;
				int z = MathHelper.floor_double(ep.posZ);
				if(ep.getCurrentEquippedItem().itemID == mod_Dqm.Rotonotate.shiftedIndex && !ep.isPotionActive(Potion.resistance))
				{
					ep.addPotionEffect(new PotionEffect(Potion.resistance.id, 1, 2));
				}
				if(ep.getCurrentEquippedItem().itemID == mod_Dqm.Sabitatate.shiftedIndex && !ep.isPotionActive(Potion.resistance))
				{
					ep.addPotionEffect(new PotionEffect(Potion.resistance.id, 1, 0));
				}
				if(ep.getCurrentEquippedItem().itemID == mod_Dqm.Inferunosword.shiftedIndex)
				{
					if(world.getBlockMaterial(x, y, z) == Material.lava || world.getBlockMaterial(x, y, z) == Material.water ||world.getBlockId(x, y, z) ==Block.ice.blockID)
					{
						for(i = 0; i <= 20; i++)
						{
							int x2 = x+getRandom(3, -3);
							int z2 = z+getRandom(3, -3);
							if(world.getBlockId(x2, y, z2) ==Block.ice.blockID)
							{
								world.setBlockWithNotify(x2,y,z2,Block.waterMoving.blockID);
							}
							if(world.getBlockMaterial(x2, y, z2) == Material.water )
							{
								world.setBlockWithNotify(x2,y,z2,Block.lavaMoving.blockID);
							}
							if(world.getBlockMaterial(x2, y, z2) == Material.lava)
							{
								world.setBlockWithNotify(x2,y,z2,Block.obsidian.blockID);
							}
							if(world.getBlockId(x2, y, z2) == Block.obsidian.blockID )
							{
								world.setBlockWithNotify(x2,y,z2,Block.lavaMoving.blockID);
							}
							world.setBlockWithNotify(x,y,z,Block.obsidian.blockID);
						}
					}
				}
				if(ep.getCurrentEquippedItem().itemID == mod_Dqm.Koorinoyaiba.shiftedIndex)
				{
					if(world.getBlockMaterial(x, y, z) == Material.water || world.getBlockMaterial(x, y, z) == Material.lava)
					{
						for(i = 0; i<= 35; i++)
						{
							int x3 = x+getRandom(3, -3);
							int z3 = z+getRandom(3, -3);
							if(world.getBlockMaterial(x3, y, z3) == Material.water)
							{
								world.setBlockWithNotify(x3,y,z3,Block.ice.blockID);
							}
							if(world.getBlockMaterial(x3, y, z3) == Material.lava)
							{
								world.setBlockWithNotify(x3,y,z3,Block.waterMoving.blockID);
							}
						}
						world.setBlockWithNotify(x,y,z,Block.ice.blockID);
					}
				}
				if(ep.getCurrentEquippedItem().itemID == mod_Dqm.Uminarinotue.shiftedIndex)
				{
					for(i = 0; i <= 70; i++)
					{
						int x4 = x+getRandom(5, -5);
						int z4 = z+getRandom(5, -5);
						if(world.getBlockMaterial(x4 , y, z4) == Material.lava ||  world.getBlockId(x4, y, z4) ==Block.ice.blockID||  world.getBlockId(x4, y, z4) ==Block.obsidian.blockID )
						{
							world.setBlockWithNotify(x4,y,z4,Block.waterMoving.blockID);
						}
					}
				}
			}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
	{
		if (par7 == 0){--par5;}
		if (par7 == 1){++par5;}
		if (par7 == 2){--par6;}
		if (par7 == 3){++par6;}
		if (par7 == 4){--par4;}
		if (par7 == 5){++par4;}
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
		{
			return false;
		}
		else
		{
			World w = ModLoader.getMinecraftInstance().theWorld;
			int var8 = par3World.getBlockId(par4, par5, par6);

			if (var8 == 0 && model == "Inferunosword")
			{
				par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				par3World.setBlockWithNotify(par4, par5, par6, Block.fire.blockID);
			}
			if (var8 == 0 && model == "Koorinoyaiba")
			{
				//par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				par3World.setBlockWithNotify(par4, par5, par6, Block.ice.blockID);
			}
			if (var8 == 0 && model == "Uminarinotue")
			{
				//par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				par3World.setBlockWithNotify(par4, par5, par6, Block.waterStill.blockID);
			}
			long var9;
			if (var8 == 0 && model == "Hikarinotue")
			{
				//0で朝、5000で昼、12000で夕焼け、17000で月が真上、23000で朝日、24000周期
				var9 = par3World.getWorldInfo().getWorldTime();
				if(15000 < var9 || var9 < 5000)
				{
				par3World.getWorldInfo().setWorldTime(5000);
				}
				else if(15000 > var9)
				{
					par3World.getWorldInfo().setWorldTime(15000);
				}
				par3World.playSoundAtEntity(par2EntityPlayer, "DQM_Sound.Kiseki", 0.9F, 0.9F);
			}
			par1ItemStack.damageItem(1, par2EntityPlayer);
		}
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
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		ItemStack par1 = par1ItemStack;
		EntityLiving par2 = par2EntityLiving;
		EntityLiving par3 = par3EntityLiving;
		World w = ModLoader.getMinecraftInstance().theWorld;

		if(attack==0) {
			par1.damageItem(1, par3);
		}
//		if(model == "Hikarinotue")
//		{
//			w.getWorldInfo().setWorldTime(17000);
//			w.playSoundAtEntity(par2, "DQM_Sound.Kiseki", 0.9F, 0.9F);
//		}
		if(model == "Inferunosword")
		{
			par2.setFire(+5);
		}
		if(model == "Hayabusanoturugi" && attack == 0)
		{
			attack = 1;
			((EntityPlayer)par3).attackTargetEntityWithCurrentItem(par2);
			w.playSoundAtEntity(par2, "DQM_Sound.Hayabusa", 0.9F, 0.9F);
		}
		else if(attack == 1){attack=0;}
		else w.playSoundAtEntity(par2, "DQM_Sound.Hit", 0.9F, 0.9F);
		 if(heel >= 1 && par3.getHealth() < par3.getMaxHealth() && itemRand.nextInt(4) <= 1)
		  {
		   par3.setEntityHealth(par3.getHealth()+heel);
		   w.playSoundAtEntity(par3, "DQM_Sound.Kiseki", 0.9F, 0.9F);
		   heel = 0;
		  }
		return true;
	}

	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
	}

	@Override
	public int getItemEnchantability()
	{
		return toolMaterial.getEnchantability();
	}
	@Override
	public int getDamageVsEntity(Entity par1Entity)
	{
		World w = ModLoader.getMinecraftInstance().theWorld;
				if(model =="Kisekinoturugi" && ((EntityLiving) par1Entity).getHealth() > 0)
				{
				heel = 1;
				}
				if(model == "Hayabusanoturugi")
				{
				par1Entity.heartsLife = 0;
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
	@Override
	public boolean isItemTool(ItemStack par1ItemStack)
	{
		return true;
		//		return par1ItemStack.stackSize == 1;
	}


}


