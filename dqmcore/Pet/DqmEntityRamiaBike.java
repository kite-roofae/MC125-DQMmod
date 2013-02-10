package net.minecraft.src.dqmcore.Pet;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class DqmEntityRamiaBike extends DqmRidableCreature
{
    int prevX;
    int prevZ;


    public DqmEntityRamiaBike(World var1)
    {
        super(var1);
        this.prevX = 0;
        this.prevZ = 0;
        this.texture = "/dqm/Ramia.png";
        this.setSize(4.0F, 4.0F);
        this.stepHeight = 0.0F;
        //this.walkSpeed = 3.38F;
        this.canFly = true;
    }

    public DqmEntityRamiaBike(World var1, double var2, double var4, double var6)
    {
        this(var1);
        this.setPosition(var2, var4, var6);
    }

	private static int getRandom(int max, int min) {
		int ret = (int)Math.floor(Math.random()*(max-min+1))+min;

		return ret;
	}
    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    public double getMountedYOffset()
    {
    	
        return 2.3D;
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
     * Returns if this entity is sneaking.
     */
    public boolean isSneaking()
    
    {	
        return !this.onGround ? false : super.isSneaking();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */

    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.posZ);
        boolean var3 = this.prevZ != var2 || this.prevX != var1;
        var3 = this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && var3 && !this.onGround;

        if (var3)
        {
            for (int var4 = 0; var4 < 2; ++var4)
            {
                double var5 = 2.0D;
                double var7 = this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width;
                double var9 = this.posY + this.rand.nextDouble() / 5.0D - 0.2D;
                double var11 = this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width;
                var7 -= this.motionX * var5;
                var9 -= this.motionY * var5;
                var11 -= this.motionZ * var5;
                double var13 = (this.rand.nextDouble() - 0.5D) * 2.0D;
                double var15 = -this.rand.nextDouble();
                double var17 = (this.rand.nextDouble() - 0.5D) * 2.0D;
                ModLoader.getMinecraftInstance().effectRenderer.addEffect(new DqmEntityRainbowFX(this.worldObj, var7, var9, var11, var13, var15, var17));
            }
            int x = 0;
            int x3 = x+getRandom(50, -50);
            if(x3==0){
            this.worldObj.playSoundAtEntity(this, "DQM_Sound.Ramia", 1.0F, 1.0F);}
            this.prevX = var1;
            this.prevZ = var2;
        }
    }
}
