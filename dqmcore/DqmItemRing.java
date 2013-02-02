package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import java.util.List;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemRing extends Item implements ITextureProvider
{
	private double slipperiness;

	public DqmItemRing(int par1, double par2) {
		super(par1);
		slipperiness = par2;
		maxStackSize = 1;

	}
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
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
				MathHelper.floor_double(ep.posX);
				MathHelper.floor_double(ep.posZ);
				if(ep.onGround )
				{
					ep.motionX /= slipperiness;
					ep.motionZ /= slipperiness;
					Vec3D vec3d =  Vec3D.createVector(ep.motionX,0,ep.motionZ);
					if(vec3d.lengthVector() < 0.1F  || 1.0F < vec3d.lengthVector())
					{
						ep.motionX *= slipperiness;
						ep.motionZ *= slipperiness;
					}
				}

			}

		}
	}

	@Override
	public void addInformation(ItemStack itemstack, List list)
	{
		//    list.add((new StringBuilder()).append(recordName).toString());
	}

	@Override
	public EnumRarity getRarity(ItemStack itemstack)
	{
		return EnumRarity.rare;
	}
}
