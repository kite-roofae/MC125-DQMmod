package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.World;

public class DqmEntityPigBike extends DqmRidableCreature
{
    /** used to check whether entity is jumping. */
    private boolean isJumping;

    public DqmEntityPigBike(World var1)
    {
        super(var1);
        this.isJumping = false;
        this.texture = "/mob/pig.png";
        this.setSize(0.9F, 0.9F);
        this.walkSpeed = 0.4F;
    }

    /**
     * If Animal, checks if the age timer is negative
     */
    public boolean isChild()
    {
        return this.getSpecial();
    }

    public DqmEntityPigBike(World var1, double var2, double var4, double var6)
    {
        this(var1);
        this.setPosition(var2, var4, var6);
    }

    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    public double getMountedYOffset()
    {
        return this.getSpecial() ? 0.4D : 0.8D;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.pig";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.pig";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.pigdeath";
    }
}
