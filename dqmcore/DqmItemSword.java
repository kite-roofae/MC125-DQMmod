package net.minecraft.src.dqmcore;

import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.dqmcore.DqmEntity.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmItemSword extends ItemSword implements ITextureProvider
{
	private int weaponDamage;
	private final DqmEnumToolMaterial toolMaterial;
	private String model;
	private int attack;
	private int heel;
	private World world;

	public DqmItemSword(int par1, DqmEnumToolMaterial par2EnumToolMaterial)
	{
		super(par1,EnumToolMaterial.EMERALD);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.weaponDamage = 4 + par2EnumToolMaterial.getDamageVsEntity();
	}

	public DqmItemSword setmodel(String m)
	{
		model = m;
		return this;
	}

	public DqmItemSword setWeaponDamage(int par1)
	{
		this.weaponDamage = par1;
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
					ep.addPotionEffect(new PotionEffect(Potion.resistance.id, 1, 4));
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
			//int var9;
			if (var8 == 0 && model == "Hikarinotue")
			{
				//var9 == WorldTime();
				//0で朝、5000で昼、12000で夕焼け、17000で月が真上、23000で朝日、24000周期
				//var9 = +1;
				//if (var9 == 1){
				par3World.getWorldInfo().setWorldTime(5000);
				par3World.playSoundAtEntity(par2EntityPlayer, "DQM_Sound.Kiseki", 0.9F, 0.9F);
				//var9 = +1;
				/*
				}
				if (var9 <= 2){
				par3World.getWorldInfo().setWorldTime(17000);
				par3World.playSoundAtEntity(par2EntityPlayer, "DQM_Sound.Kiseki", 0.9F, 0.9F);
				var9 = 0;
				}*/
				//var9 = +1;
			}
			par1ItemStack.damageItem(1, par2EntityPlayer);
			return true;
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
		if(model == "Hikarinotue")
		{
			w.getWorldInfo().setWorldTime(17000);
			w.playSoundAtEntity(par2, "DQM_Sound.Kiseki", 0.9F, 0.9F);
		}
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
				par1Entity.getClass() == DqmpetEntityKimera.class
				))
				{
				w.playSoundAtEntity(par1Entity, "DQM_Sound.Dragon", 0.9F, 0.9F);
				return this.weaponDamage * 2;
				}
				if(model == "Oninokanabou" && (
				par1Entity.getClass() == DqmEntitySura.class ||
				par1Entity.getClass() == DqmEntityMetasura.class ||
				par1Entity.getClass() == DqmEntitySuraimubesu.class ||
				par1Entity.getClass() == DqmEntityBubsura.class ||
				par1Entity.getClass() == DqmEntityHagumeta.class ||
				par1Entity.getClass() == DqmEntityHoimisura.class ||
				par1Entity.getClass() == DqmEntitySuraimutawa.class ||
				par1Entity.getClass() == DqmEntitySuraimunaito.class ||
				par1Entity.getClass() == DqmEntityKingsura.class ||
				par1Entity.getClass() == DqmEntityMetaking.class ||
				par1Entity.getClass() == DqmEntitySuraimubehomazun.class ||
				par1Entity.getClass() == DqmEntityMetaruraida.class ||
				par1Entity.getClass() == DqmEntityKuinsuraimu.class ||
				par1Entity.getClass() == DqmpetEntitySura.class ||
				par1Entity.getClass() == DqmpetEntityHagumeta.class ||
				par1Entity.getClass() == DqmpetEntitySuraimutawa.class ||
				par1Entity.getClass() == DqmpetEntitySuraimunaito.class ||
				par1Entity.getClass() == DqmpetEntityKingsura.class ||
				par1Entity.getClass() == DqmpetEntityKuinsuraimu.class
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
				par1Entity.getClass() == DqmpetEntityGaikotukensi.class
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
				par1Entity.getClass() == DqmpetEntityDqmdragon.class
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
				par1Entity.getClass() == DqmpetEntityGoremu.class
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

		return this.weaponDamage;
	}


}


