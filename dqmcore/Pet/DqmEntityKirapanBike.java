package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.EntitySnowball;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class DqmEntityKirapanBike extends DqmRidableCreature
{

	/*
    public boolean field_753_a;
    public float field_752_b;
    public float destPos;
    public float field_757_d;
    public float field_756_e;
    public float field_755_h;*/
    public DqmEntityKirapanBike(World var1)
    {
        super(var1);
        this.texture = "/dqm/Kirapan.png";
        this.setSize(1.0F, 1.3F);
        this.walkSpeed = 0.38F;

    }

    public DqmEntityKirapanBike(World var1, double var2, double var4, double var6)
    {
        this(var1);
        this.setPosition(var2, var4, var6);
    }

    /**
     * If Animal, checks if the age timer is negative
     */
    public boolean isChild()
    {
        return this.getSpecial();
    }

    public void jump()
    {
    	this.worldObj.playSoundAtEntity(this, "DQM_Sound.Kirapansanakigoe", 1.0F, 1.0F);

    	if (this.onGround)
    	{
    	this.motionY = 1.0;
    	}
    }

    //プレイヤーポジション
    public double getMountedYOffset()
    {
        return this.getSpecial() ? 0.4D : 0.8D;
    }

    //落下ダメージ
    protected void fall(float var1) {}

    //落下速度
    /*
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.field_756_e = this.field_752_b;
        this.field_757_d = this.destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);

        if (this.destPos < 0.0F)
        {
            this.destPos = 0.0F;
        }

        if (this.destPos > 1.0F)
        {
            this.destPos = 1.0F;
        }

        if (!this.onGround && this.field_755_h < 1.0F)
        {
            this.field_755_h = 1.0F;
        }

        this.field_755_h = (float)((double)this.field_755_h * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        this.field_752_b += this.field_755_h * 2.0F;
    }*/




}
