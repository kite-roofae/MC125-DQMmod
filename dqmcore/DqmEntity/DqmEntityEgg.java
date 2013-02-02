package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityEgg extends EntityThrowable
{
	public DqmEntityEgg(World par1World)
	{
		super(par1World);
	}

	public DqmEntityEgg(World par1World, EntityLiving par2EntityLiving)
	{
		super(par1World, par2EntityLiving);
	}

	public DqmEntityEgg(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}


	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
	{
		//this.explode();

		if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), 0))
		{
			;
		}

		if (!this.worldObj.isRemote && this.rand.nextInt(8) == 0)
		{
			byte var2 = 1;

			if (this.rand.nextInt(32) == 0)
			{
				var2 = 4;
			}

			for (int var3 = 0; var3 < var2; ++var3)
			{
				DqmpetEntityLittleEsterk var4 = new DqmpetEntityLittleEsterk(this.worldObj);
				//var4.setGrowingAge(-24000);
				var4.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
				this.worldObj.spawnEntityInWorld(var4);
			}
		}

		for (int var5 = 0; var5 < 8; ++var5)
		{
			this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		}

		if (!this.worldObj.isRemote)
		{
			this.setDead();
		}

	}
	/*
    private void explode()
    {
        float var1 = 4.0F;
        this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, var1);
    }*/

}
