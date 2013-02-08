package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.*;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class DqmEntityDragonBike extends DqmRidableCreature
{
    public double[][] field_40162_d;
    public int field_40164_e;
    public float field_40173_aw;
    public float field_40172_ax;
    public int field_40178_aA;
    public long breathFire;
    public boolean isFlying;
    public float ticks;

    public DqmEntityDragonBike(World var1)
    {
        super(var1);
        this.breathFire = 0L;
        this.isFlying = false;
        this.ticks = 0.0F;
        this.field_40162_d = new double[64][3];
        this.field_40164_e = -1;
        this.field_40173_aw = 0.0F;
        this.field_40172_ax = 0.0F;
        this.field_40178_aA = 0;
        this.canFly = true;
        this.texture = "/mob/enderdragon/ender.png";
        this.setSize(1.8F, 1.4F);
        this.isImmuneToFire = true;
    }

    public DqmEntityDragonBike(World var1, double var2, double var4, double var6)
    {
        this(var1);
        this.setPosition(var2, var4, var6);
    }

    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    public double getMountedYOffset()
    {
        return 0.6D;
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */

    public boolean interact(EntityPlayer var1)
    {/*
        if (!mo_DqmPetLoader.isMultiplayer(this.worldObj))
        {
            return false;
        }*/
        //else
        //{
            ItemStack var2 = var1.inventory.getCurrentItem();
            return var2 != null && var2.getItem() == Item.flintAndSteel && this.riddenByEntity != null ? false : super.interact(var1);
        //}
    }

    public double[] func_40160_a(int var1, float var2)
    {
        var2 = 1.0F - var2;
        int var3 = this.field_40164_e - var1 * 1 & 63;
        int var4 = this.field_40164_e - var1 * 1 - 1 & 63;
        double[] var5 = new double[3];
        double var6 = this.field_40162_d[var3][0];
        double var8;

        for (var8 = this.field_40162_d[var4][0] - var6; var8 < -180.0D; var8 += 360.0D)
        {
            ;
        }

        while (var8 >= 180.0D)
        {
            var8 -= 360.0D;
        }

        var5[0] = var6 + var8 * (double)var2;
        var6 = this.field_40162_d[var3][1];
        var8 = this.field_40162_d[var4][1] - var6;
        var5[1] = var6 + var8 * (double)var2;
        var5[2] = this.field_40162_d[var3][2] + (this.field_40162_d[var4][2] - this.field_40162_d[var3][2]) * (double)var2;
        return var5;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */

    public void onLivingUpdate()
    {

        //if (this.breathFire + 300L > System.currentTimeMillis() && mo_DqmPetLoader.isMultiplayer(this.worldObj))
    	if (this.breathFire + 300L > System.currentTimeMillis() )
        {
            double var1 = this.posX;
            double var3 = this.posY;
            double var5 = this.posZ;
            double var7 = this.rand.nextDouble() * 0.8D + 0.5D;
            double var9 = -this.rand.nextDouble();

            if (var9 > -0.5D)
            {
                var9 = -0.5D;
            }

            double var11 = this.rand.nextDouble() * 0.8D + 0.5D;

            if (this.onGround)
            {
                var9 = 0.0D;
            }

            double var13 = (double)(-MathHelper.sin((float)((double)(this.rotationYaw / 180.0F) * Math.PI)) * MathHelper.cos((float)((double)(this.rotationPitch / 180.0F) * Math.PI)));
            double var15 = (double)(MathHelper.cos((float)((double)(this.rotationYaw / 180.0F) * Math.PI)) * MathHelper.cos((float)((double)(this.rotationPitch / 180.0F) * Math.PI)));
            ModLoader.getMinecraftInstance().effectRenderer.addEffect(new DqmEntityFireFX(this.worldObj, var1 + var13 * 2.2D, var3 + 0.5D, var5 + var15 * 2.2D, var13 * var7, var9, var15 * var11, this));
        }

        this.field_40173_aw = this.field_40172_ax;
        float var17;

        if (this.health <= 0)
        {
            var17 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            float var18 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            float var19 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            this.worldObj.spawnParticle("largeexplode", this.posX + (double)var17, this.posY + 2.0D + (double)var18, this.posZ + (double)var19, 0.0D, 0.0D, 0.0D);
        }
        else
        {
            var17 = 0.2F / (MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 10.0F + 1.0F);
            var17 = 0.045F;
            var17 *= (float)Math.pow(2.0D, this.motionY);

            for (this.field_40172_ax += var17 * 0.5F; this.rotationYaw >= 180.0F; this.rotationYaw -= 360.0F)
            {
                ;
            }

            while (this.rotationYaw < -180.0F)
            {
                this.rotationYaw += 360.0F;
            }

            if (this.field_40164_e < 0)
            {
                for (int var2 = 0; var2 < this.field_40162_d.length; ++var2)
                {
                    this.field_40162_d[var2][0] = (double)(this.rotationYaw + 180.0F);
                    this.field_40162_d[var2][1] = this.posY;
                }
            }

            if (++this.field_40164_e == this.field_40162_d.length)
            {
                this.field_40164_e = 0;
            }

            this.field_40162_d[this.field_40164_e][0] = (double)(this.rotationYaw + 180.0F);
            this.field_40162_d[this.field_40164_e][1] = this.posY;
            this.renderYawOffset = this.rotationYaw + 180.0F;

            if (this.riddenByEntity != null)
            {
                super.onLivingUpdate();
            }
        }
    }

    public void updateRiderPosition()
    {
        if (this.riddenByEntity == null)
        {
            super.updateRiderPosition();
        }
        else
        {
            float var1 = this.field_40173_aw + (this.field_40172_ax - this.field_40173_aw) * this.ticks;
            float var2 = (float)(Math.sin((double)(var1 * (float)Math.PI * 2.0F - 1.0F)) + 1.0D);
            this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset() - (double)(var2 / 12.0F), this.posZ);
        }
    }

    public int getMaxHealth()
    {
        return 20;
    }
}
