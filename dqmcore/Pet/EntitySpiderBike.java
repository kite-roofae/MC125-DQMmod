package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.World;

public class EntitySpiderBike extends RidableCreature
{
    public EntitySpiderBike(World var1)
    {
        super(var1);
        this.texture = "/mob/spider.png";
        this.setSize(1.2F, 0.8F);
        this.walkSpeed = 0.15F;
    }

    public EntitySpiderBike(World var1, double var2, double var4, double var6)
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
        return "mob.spider";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.spider";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.spiderdeath";
    }

    public float spiderScaleAmount()
    {
        return 1.0F;
    }

    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    public boolean isOnLadder()
    {
        return this.isCollidedHorizontally;
    }
}
