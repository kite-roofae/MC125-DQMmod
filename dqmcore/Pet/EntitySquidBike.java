package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.mo_DqmPetLoader;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class EntitySquidBike extends RidableCreature
{
    public float field_21089_a;
    public float field_21088_b;
    public float field_21087_c;
    public float field_21086_f;
    public float field_21085_g;
    public float field_21084_h;
    public float tentacleAngle;
    public float lastTentacleAngle;
    private float field_21080_l;
    private float field_21079_m;
    private float randomMotionSpeed;
    private float randomMotionVecX;
    private float randomMotionVecY;
    private float randomMotionVecZ;

    public EntitySquidBike(World var1)
    {
        super(var1);
        this.yOffset = 0.8F;
        this.walkSpeed = 0.02F;
        this.field_21089_a = 0.0F;
        this.field_21088_b = 0.0F;
        this.field_21087_c = 0.0F;
        this.field_21086_f = 0.0F;
        this.field_21085_g = 0.0F;
        this.field_21084_h = 0.0F;
        this.tentacleAngle = 0.0F;
        this.lastTentacleAngle = 0.0F;
        this.field_21080_l = 0.0F;
        this.field_21079_m = 0.0F;
        this.randomMotionSpeed = 0.0F;
        this.field_21080_l = 0.0F;
        this.field_21079_m = 0.0F;
        this.randomMotionVecX = 0.0F;
        this.randomMotionVecY = 0.0F;
        this.randomMotionVecZ = 0.0F;
        this.texture = "/mob/squid.png";
        this.setSize(0.95F, 0.95F);
        this.field_21080_l = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
    }

    public EntitySquidBike(World var1, double var2, double var4, double var6)
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
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    public boolean canBreatheUnderwater()
    {
        return true;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.isInWater())
        {
            this.yOffset = 0.0F;
        }
        else
        {
            this.yOffset = 0.8F;
        }

        if (this.riddenByEntity == null && this.isInWater())
        {
            this.onNotRidenLivingUpdate();
        }
        else
        {
            this.onRidenLivingUpdate();
        }
    }

    /**
     * Get number of ticks, at least during which the living entity will be silent.
     */
    public int getTalkInterval()
    {
        return 120;
    }

    public void onRidenLivingUpdate()
    {
        if (!mo_DqmPetLoader.isMultiplayer(this.worldObj))
        {
            if (!this.isInWater())
            {
                super.onLivingUpdate();
            }
        }
        else
        {
            super.onLivingUpdate();
        }

        this.field_21088_b = this.field_21089_a;
        this.field_21086_f = this.field_21087_c;
        this.field_21084_h = this.field_21085_g;
        this.lastTentacleAngle = this.tentacleAngle;
        this.field_21085_g += this.field_21080_l;

        if (this.field_21085_g > ((float)Math.PI * 2F))
        {
            this.field_21085_g -= ((float)Math.PI * 2F);

            if (this.rand.nextInt(10) == 0)
            {
                this.field_21080_l = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
            }
        }

        this.tentacleAngle = MathHelper.abs(MathHelper.sin(this.field_21085_g)) * (float)Math.PI * 0.25F;
        this.field_21089_a = (float)((double)this.field_21089_a + (double)(-90.0F - this.field_21089_a) * 0.02D);

        if (!this.isInWater())
        {
            this.field_21089_a = (float)((double)this.field_21089_a + (double)(90.0F - this.field_21089_a) * 0.02D);
        }
    }

    public void onNotRidenLivingUpdate()
    {
        this.field_21088_b = this.field_21089_a;
        this.field_21086_f = this.field_21087_c;
        this.field_21084_h = this.field_21085_g;
        this.lastTentacleAngle = this.tentacleAngle;
        this.field_21085_g += this.field_21080_l;

        if (this.field_21085_g > ((float)Math.PI * 2F))
        {
            this.field_21085_g -= ((float)Math.PI * 2F);

            if (this.rand.nextInt(10) == 0)
            {
                this.field_21080_l = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
            }
        }

        if (this.isInWater())
        {
            float var1;

            if (this.field_21085_g < (float)Math.PI)
            {
                var1 = this.field_21085_g / (float)Math.PI;
                this.tentacleAngle = MathHelper.sin(var1 * var1 * (float)Math.PI) * (float)Math.PI * 0.25F;

                if ((double)var1 > 0.75D)
                {
                    this.randomMotionSpeed = 1.0F;
                    this.field_21079_m = 1.0F;
                }
                else
                {
                    this.field_21079_m *= 0.8F;
                }
            }
            else
            {
                this.tentacleAngle = 0.0F;
                this.randomMotionSpeed *= 0.9F;
                this.field_21079_m *= 0.99F;
            }

            if (!this.worldObj.isRemote)
            {
                this.motionX = (double)(this.randomMotionVecX * this.randomMotionSpeed);
                this.motionY = (double)(this.randomMotionVecY * this.randomMotionSpeed);
                this.motionZ = (double)(this.randomMotionVecZ * this.randomMotionSpeed);
            }

            var1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.renderYawOffset += (-((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI - this.renderYawOffset) * 0.1F;
            this.rotationYaw = this.renderYawOffset;
            this.field_21087_c += (float)Math.PI * this.field_21079_m * 1.5F;
            this.field_21089_a += (-((float)Math.atan2((double)var1, this.motionY)) * 180.0F / (float)Math.PI - this.field_21089_a) * 0.1F;
        }
        else
        {
            this.tentacleAngle = MathHelper.abs(MathHelper.sin(this.field_21085_g)) * (float)Math.PI * 0.25F;

            if (!this.worldObj.isRemote)
            {
                this.motionX = 0.0D;
                this.motionY -= 0.08D;
                this.motionY *= 0.9800000190734863D;
                this.motionZ = 0.0D;
            }

            this.field_21089_a = (float)((double)this.field_21089_a + (double)(-90.0F - this.field_21089_a) * 0.02D);
        }
    }

    public void updateEntityActionState()
    {
        if (this.riddenByEntity == null && this.isInWater())
        {
            if (this.rand.nextInt(50) == 0 || !this.inWater || this.randomMotionVecX == 0.0F && this.randomMotionVecY == 0.0F && this.randomMotionVecZ == 0.0F)
            {
                float var1 = this.rand.nextFloat() * (float)Math.PI * 2.0F;
                this.randomMotionVecX = MathHelper.cos(var1) * 0.2F;
                this.randomMotionVecY = -0.1F + this.rand.nextFloat() * 0.2F;
                this.randomMotionVecZ = MathHelper.sin(var1) * 0.2F;
            }

            this.despawnEntity();
        }
        else
        {
            super.updateEntityActionState();
        }
    }
}
