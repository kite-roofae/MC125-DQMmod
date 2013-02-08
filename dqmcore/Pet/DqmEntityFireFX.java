package net.minecraft.src.dqmcore.Pet;

import java.util.Iterator;
import java.util.List;
import net.minecraft.src.mo_DqmPetLoader;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityFX;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

public class DqmEntityFireFX extends EntityFX
{
    /** the scale of the flame FX */
    private float flameScale;
    private DqmEntityDragonBike entityDragonBike;

    public DqmEntityFireFX(World var1, double var2, double var4, double var6, double var8, double var10, double var12, DqmEntityDragonBike var14)
    {
        super(var1, var2, var4, var6, var8, var10, var12);
        this.entityDragonBike = var14;
        this.motionX = this.motionX * 0.009999999776482582D + var8;
        this.motionY = this.motionY * 0.009999999776482582D + var10;
        this.motionZ = this.motionZ * 0.009999999776482582D + var12;
        double var10000 = var2 + (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F);
        var10000 = var4 + (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F);
        var10000 = var6 + (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F);
        this.particleScale *= 6.0F;
        this.flameScale = this.particleScale;
        this.particleRed = this.particleGreen = this.particleBlue = 1.0F;
        this.particleMaxAge = (int)(12.0D / (Math.random() * 0.8D + 0.2D)) + 5;
        this.noClip = true;
        this.setParticleTextureIndex(48);
    }

    public void renderParticle(Tessellator var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        float var8 = ((float)this.particleAge + var2) / (float)this.particleMaxAge;
        this.particleScale = this.flameScale * (1.0F - var8 * var8 * 0.5F);
        super.renderParticle(var1, var2, var3, var4, var5, var6, var7);
    }

    public int getBrightnessForRender(float var1)
    {
        float var2 = ((float)this.particleAge + var1) / (float)this.particleMaxAge;

        if (var2 < 0.0F)
        {
            var2 = 0.0F;
        }

        if (var2 > 1.0F)
        {
            var2 = 1.0F;
        }

        int var3 = super.getBrightnessForRender(var1);
        int var4 = var3 & 255;
        int var5 = var3 >> 16 & 255;
        var4 += (int)(var2 * 15.0F * 16.0F);

        if (var4 > 240)
        {
            var4 = 240;
        }

        return var4 | var5 << 16;
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float var1)
    {
        float var2 = ((float)this.particleAge + var1) / (float)this.particleMaxAge;

        if (var2 < 0.0F)
        {
            var2 = 0.0F;
        }

        if (var2 > 1.0F)
        {
            var2 = 1.0F;
        }

        float var3 = super.getBrightness(var1);
        return var3 * var2 + (1.0F - var2);
    }

    /**
     * Called to update the entity's position/logic.
     */

    public void onUpdate()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.posY);
        int var3 = MathHelper.floor_double(this.posZ);

        //if (!mo_DqmPetLoader.PreventTerrainDamage && mo_DqmPetLoader.isMultiplayer(this.worldObj) && !this.worldObj.isAirBlock(var1, var2, var3) && this.worldObj.rand.nextInt(3) == 1)
        if (!mo_DqmPetLoader.PreventTerrainDamage && !this.worldObj.isAirBlock(var1, var2, var3) && this.worldObj.rand.nextInt(3) == 1)
        {
            if (this.worldObj.isAirBlock(var1, var2 + 1, var3) && this.worldObj.rand.nextBoolean())
            {
                this.worldObj.setBlockWithNotify(var1, var2 + 1, var3, Block.fire.blockID);
            }

            if (this.worldObj.isAirBlock(var1 + 1, var2, var3) && this.worldObj.rand.nextBoolean())
            {
                this.worldObj.setBlockWithNotify(var1 + 1, var2, var3, Block.fire.blockID);
            }

            if (this.worldObj.isAirBlock(var1 - 1, var2, var3) && this.worldObj.rand.nextBoolean())
            {
                this.worldObj.setBlockWithNotify(var1 - 1, var2, var3, Block.fire.blockID);
            }

            if (this.worldObj.isAirBlock(var1, var2, var3 - 1) && this.worldObj.rand.nextBoolean())
            {
                this.worldObj.setBlockWithNotify(var1, var2, var3 - 1, Block.fire.blockID);
            }

            if (this.worldObj.isAirBlock(var1, var2, var3 + 1) && this.worldObj.rand.nextBoolean())
            {
                this.worldObj.setBlockWithNotify(var1, var2, var3 + 1, Block.fire.blockID);
            }
        }

        Block var4 = Block.blocksList[this.worldObj.getBlockId(var1, var2, var3)];

        if (this.particleAge++ < this.particleMaxAge && (var4 == null || !var4.renderAsNormalBlock() || var4.isOpaqueCube()))
        {
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.9599999785423279D;
            this.motionY *= 0.9599999785423279D;
            this.motionZ *= 0.9599999785423279D;

            if (this.onGround)
            {
                this.motionX *= 0.699999988079071D;
                this.motionZ *= 0.699999988079071D;
            }

            List var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(1.0D, 1.0D, 1.0D));
            Entity var6 = null;
            Iterator var7 = var5.iterator();

            while (var7.hasNext())
            {
                Object var8 = var7.next();
                Entity var9 = (Entity)var8;

                if (var9.entityId != this.entityDragonBike.entityId && var9.ridingEntity != this.entityDragonBike && this.worldObj.rand.nextInt(4) == 1)
                {
                    var6 = var9;
                }
            }

            if (var6 != null)
            {
                mo_DqmPetLoader.setEntityOnFire(var6);
            }
        }
        else
        {
            this.setDead();
        }
    }

    /**
     * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
     */
    public boolean isBurning()
    {
        return true;
    }
}
