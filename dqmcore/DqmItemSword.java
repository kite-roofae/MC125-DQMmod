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
	private static int getRandom(int max, int min) {
		int ret = (int)Math.floor(Math.random()*(max-min+1))+min;

		return ret;
	}
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		EntityPlayerSP ep = ModLoader.getMinecraftInstance().thePlayer;
		if(world.isRemote)
		{
			return;
		}
		if( ep != null)
		{
			if(ep.getCurrentEquippedItem()== null)
			{
				return;
			}
			if(ep.getCurrentEquippedItem().itemID == this.shiftedIndex)
			{
				int x = MathHelper.floor_double(ep.posX);
				int y = MathHelper.floor_double(ep.boundingBox.minY) - 1;
				int z = MathHelper.floor_double(ep.posZ);

				if(model == "Inferunosword")
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
				if(model == "Koorinoyaiba")
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
				if(model == "Uminarinotue")
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
		if(model =="Kisekinoturugi" && ((EntityLiving) par1Entity).getHealth() > 0)
		{
			heel = 1;
		}
		if(model == "Hayabusanoturugi")
		{
			par1Entity.heartsLife = 0;
		}
		if(model == "Doragonkira" && (par1Entity.getClass() == DqmpetEntityDqmdragon.class || par1Entity.getClass() == DqmEntityDqmdragon.class))
		{
			return this.weaponDamage * 2;
		}
		return this.weaponDamage;
	}
}