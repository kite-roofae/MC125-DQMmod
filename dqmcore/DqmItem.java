package net.minecraft.src.dqmcore;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItem extends Item implements ITextureProvider
{
	mod_Dqm Dqm;
	Minecraft mc;
	private boolean Teleport = false;
	private double TeleportPos[];
	protected Random rand;

	public DqmItem(int par1)
	{
		super(par1);
	}
	public DqmItem(int id, int damage)
	{
		this(id);
		setMaxDamage(damage);
	}
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		int ID = itemstack.itemID;
		EntityLiving ep = (EntityLiving) entity;
		if(world.isRemote)
		{
			return;
		}
		//ポーション効果：0で+3、1で+6、2で+12・・・・多分3=24,4=48,5=96？
		if(ID == Dqm.Gouketunoudewa.shiftedIndex && !ep.isPotionActive(Potion.damageBoost)){ep.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 1));}
		if(ID == Dqm.Tikaranorubi.shiftedIndex && !ep.isPotionActive(Potion.damageBoost)){ep.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 0));}
		if(ID == Dqm.Hosifuru.shiftedIndex && !ep.isPotionActive(Potion.moveSpeed)){ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 4));}
		if(ID == Dqm.Hayatenoring.shiftedIndex && !ep.isPotionActive(Potion.moveSpeed)){ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));}
		if((ID == Dqm.Hosifuru.shiftedIndex || ID == Dqm.Hayatenoring.shiftedIndex) && !ep.isPotionActive(Potion.jump)){ep.addPotionEffect(new PotionEffect(Potion.jump.id, 1, 1));}
		if(ID == Dqm.Mamorinorubi.shiftedIndex && !ep.isPotionActive(Potion.resistance)){ep.addPotionEffect(new PotionEffect(Potion.resistance.id, 1, 0));}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer par3EntityPlayer)
	{
		WorldInfo w = world.getWorldInfo();
		EntityPlayer ep = par3EntityPlayer;
		int ID =par1ItemStack.itemID;
		if(ID == Dqm.Kenjanoisi.shiftedIndex && ep.getHealth() < ep.getMaxHealth())
		{
			ep.setEntityHealth(ep.getHealth()+10);
			world.playSoundAtEntity(ep, "DQM_Sound.Kenja", 0.9F, 0.9F);
			if(itemRand.nextInt(10) <= 1)
			{
				par1ItemStack.damageItem(2, ep);
			}
		}
		if(ep.getHealth() > ep.getMaxHealth()){ep.setEntityHealth(ep.getMaxHealth());}
		if(ID == Dqm.Kimeranotubasa.shiftedIndex)
		{
			if(ep.isSneaking())
			{
				TeleportPos =new double[]{ep.posX,ep.posY,ep.posZ,w.getDimension()};
				Teleport = true;
			}
			if(!ep.isSneaking()){
				if(Teleport && TeleportPos[3] == w.getDimension())
				{
					par1ItemStack.damageItem(2, ep);

					//        		par1ItemStack.stackSize--;
					ep.setPosition(TeleportPos[0], TeleportPos[1]+.67f, TeleportPos[2]);
					//w.playSoundAtEntity(ep, "DQM_Sound.Rura", 1.0F, 1.2F / (itemRand.nextFloat() * 0.2F + 0.9F));
					world.playSoundAtEntity(ep, "DQM_Sound.Rura", 0.9F, 0.9F);
				}
			}}
		return par1ItemStack;
	}

	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
	}
}
