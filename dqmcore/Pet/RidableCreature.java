package net.minecraft.src.dqmcore.Pet;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.src.mo_DqmPetLoader;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockCloth;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityCreature;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.ItemDye;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;
//import noppes.animalbikes.items.ItemAnimalBike;

public class RidableCreature extends EntityCreature
{
    public float walkSpeed = 0.2F;
    public boolean canFly = false;
    public boolean canLand = true;
    public String owner = "";
    public boolean canColor = true;
    private boolean spacebarPressed = false;
    private float prevMoveForward = 0.0F;
    private long lastOnLadder = 0L;
    private float[][] fleeceColorTable = new float[][] {{1.0F, 1.0F, 1.0F}, {0.95F, 0.7F, 0.2F}, {0.9F, 0.5F, 0.85F}, {0.6F, 0.7F, 0.95F}, {0.9F, 0.9F, 0.2F}, {0.5F, 0.8F, 0.1F}, {0.95F, 0.7F, 0.8F}, {0.3F, 0.3F, 0.3F}, {0.6F, 0.6F, 0.6F}, {0.3F, 0.6F, 0.7F}, {0.7F, 0.4F, 0.9F}, {0.2F, 0.4F, 0.8F}, {0.5F, 0.4F, 0.3F}, {0.4F, 0.5F, 0.2F}, {0.8F, 0.3F, 0.3F}, {0.1F, 0.1F, 0.1F}};

    public RidableCreature(World var1)
    {
        super(var1);

        if (mo_DqmPetLoader.isMultiplayer(var1))
        {
            this.setFleeceColor(this.getRandomFleeceColor());
            this.setSpecial(var1.rand.nextInt(5) == 1);
        }
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
        this.dataWatcher.addObject(17, Byte.valueOf((byte)0));
        this.dataWatcher.addObject(18, Integer.valueOf(0));
        this.dataWatcher.addObject(19, Integer.valueOf(0));
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setString("Owner", this.owner);
        var1.setInteger("Color", this.getFleeceColor());
        var1.setBoolean("Special", this.getSpecial());
        var1.setInteger("18", this.getRCFlag(18));
        var1.setInteger("19", this.getRCFlag(19));
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.setOwner(var1.getString("Owner"));
        this.setFleeceColor(var1.getInteger("Color"));
        this.setSpecial(var1.getBoolean("Special"));
        this.setRCFlag(18, var1.getInteger("18"));
        this.setRCFlag(19, var1.getInteger("19"));
    }

    public void setOwner(String var1)
    {
        ItemAnimalBike.bikes.put(var1, this);
        this.owner = var1;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1)
    {
        if (!this.canFly)
        {
            super.fall(var1);
        }
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float var1, float var2)
    {
        boolean var3 = !this.worldObj.isAirBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) - 1, MathHelper.floor_double(this.posZ));

        if (this.riddenByEntity != null && mo_DqmPetLoader.FlyingEnabled && this.canFly && (!var3 || !this.canLand || mo_DqmPetLoader.isSpacebarPressed() || mo_DqmPetLoader.isShiftbarPressed()))
        {
            if (this.isInWater())
            {
                this.moveFlying(var1, var2, 0.02F);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= 0.800000011920929D;
                this.motionY *= 0.800000011920929D;
                this.motionZ *= 0.800000011920929D;
            }
            else if (this.handleLavaMovement())
            {
                this.moveFlying(var1, var2, 0.02F);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= 0.5D;
                this.motionY *= 0.5D;
                this.motionZ *= 0.5D;
            }
            else
            {
                EntityPlayerSP var4 = ModLoader.getMinecraftInstance().thePlayer;

                if (var4 == this.riddenByEntity)
                {
                    if (mo_DqmPetLoader.isSpacebarPressed())
                    {
                        this.motionY = 0.4000000059604645D;
                    }

                    if (mo_DqmPetLoader.isShiftbarPressed())
                    {
                        this.motionY = -0.4000000059604645D;
                    }
                }

                float var5 = 0.91F;

                if (this.onGround)
                {
                    var5 = 0.5460001F;
                    int var6 = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ));

                    if (var6 > 0)
                    {
                        var5 = Block.blocksList[var6].slipperiness * 0.91F;
                    }
                }

                float var11 = 0.1627714F / (var5 * var5 * var5);
                this.moveFlying(var1, var2, this.onGround ? 0.1F * var11 : 0.085F);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= (double)var5;
                this.motionY *= (double)var5;
                this.motionZ *= (double)var5;
            }

            this.field_705_Q = this.field_704_R;
            double var9 = this.posX - this.prevPosX;
            double var10 = this.posZ - this.prevPosZ;
            float var8 = MathHelper.sqrt_double(var9 * var9 + var10 * var10) * 4.0F;

            if (var8 > 1.0F)
            {
                var8 = 1.0F;
            }

            this.field_704_R += (var8 - this.field_704_R) * 0.4F;
            this.field_703_S += this.field_704_R;
        }
        else
        {
            super.moveEntityWithHeading(var1, var2);
        }
    }

    public boolean getSpecial()
    {
        return (this.dataWatcher.getWatchableObjectByte(17) & 1) == 1;
    }

    public void setSpecial(boolean var1)
    {
        this.dataWatcher.updateObject(17, Byte.valueOf((byte)(var1 ? 1 : 0)));
    }

    public int getFleeceColor()
    {
        return this.dataWatcher.getWatchableObjectByte(16);
    }

    public int getRCFlag(int var1)
    {
        try
        {
            return this.dataWatcher.getWatchableObjectInt(var1);
        }
        catch (Exception var3)
        {
            return 0;
        }
    }

    public void setRCFlag(int var1, int var2)
    {
        this.dataWatcher.updateObject(var1, Integer.valueOf(var2));
    }

    public void setFleeceColor(int var1)
    {
        this.dataWatcher.updateObject(16, Byte.valueOf((byte)var1));
    }

    public int getRandomFleeceColor()
    {
        int var1 = this.worldObj.rand.nextInt(this.fleeceColorTable.length);
        return var1;
    }

    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    public void moveEntity(double var1, double var3, double var5)
    {
        float var7 = this.width / 2.0F;

        if (this instanceof EntitySpiderBike)
        {
            var7 = this.width / 1.2F;
        }

        float var8 = (float)this.getMountedYOffset() + 1.4F + this.yOffset;
        this.boundingBox.setBounds(this.posX - (double)var7, this.posY - (double)this.yOffset + (double)this.ySize, this.posZ - (double)var7, this.posX + (double)var7, this.posY - (double)this.yOffset + (double)this.ySize + (double)var8, this.posZ + (double)var7);
        super.moveEntity(var1, var3, var5);
        var8 = this.height;
        this.boundingBox.setBounds(this.posX - (double)var7, this.posY - (double)this.yOffset + (double)this.ySize, this.posZ - (double)var7, this.posX + (double)var7, this.posY - (double)this.yOffset + (double)this.ySize + (double)var8, this.posZ + (double)var7);
    }

    public void updateEntityActionState()
    {
        if (this.getEntityToAttack() != null)
        {
            if (this.getEntityToAttack() != this.riddenByEntity)
            {
                super.updateEntityActionState();
                return;
            }

            this.setTarget((Entity)null);
        }

        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer)
        {
            EntityPlayer var1 = (EntityPlayer)this.riddenByEntity;
            this.prevRotationYaw = this.rotationYaw = var1.prevRotationYaw = var1.rotationYaw;
            this.prevRotationPitch = this.rotationPitch = 0.0F;
            float var2 = mo_DqmPetLoader.getMoveForward(var1);
            float var3 = mo_DqmPetLoader.getMoveStrafing(var1);
            this.isJumping = mo_DqmPetLoader.isJumping(var1);

            if (this instanceof EntityPigBike)
            {
                if (var2 != 0.0F)
                {
                    this.moveForward = var2 > 0.0F ? 0.98F : -0.98F;
                    this.prevMoveForward = this.moveForward;
                }
                else
                {
                    this.moveForward = this.prevMoveForward > 0.0F ? 0.5F : -0.5F;
                }
            }
            else
            {
                this.moveForward = var2;
                this.moveStrafing = var3;
            }

            if (this instanceof EntitySquidBike && this.isInWater())
            {
                this.motionY += 0.02D;
                this.motionX += this.riddenByEntity.motionX * 5.0D;
                this.motionZ += this.riddenByEntity.motionZ * 5.0D;
                float var4 = 0.25F;

                if (this.motionX < (double)(-var4))
                {
                    this.motionX = (double)(-var4);
                }

                if (this.motionX > (double)var4)
                {
                    this.motionX = (double)var4;
                }

                if (this.motionZ < (double)(-var4))
                {
                    this.motionZ = (double)(-var4);
                }

                if (this.motionZ > (double)var4)
                {
                    this.motionZ = (double)var4;
                }
            }
        }
        else
        {
            super.updateEntityActionState();
        }
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        this.landMovementFactor = this.walkSpeed;

        if (this.riddenByEntity == null)
        {
            this.landMovementFactor = (float)((double)this.landMovementFactor * 0.3D);
        }

        if (this.isChild())
        {
            this.landMovementFactor = (float)((double)this.landMovementFactor * 0.7D);
        }

        this.jumpMovementFactor = this.landMovementFactor / 5.0F;

        if (this.getEntityToAttack() == null && !mo_DqmPetLoader.isMultiplayer(this.worldObj) && this.riddenByEntity != null)
        {
            if (this.newPosRotationIncrements > 0)
            {
                double var1 = this.posX + (this.newPosX - this.posX) / (double)this.newPosRotationIncrements;
                double var3 = this.posY + (this.newPosY - this.posY) / (double)this.newPosRotationIncrements;
                double var5 = this.posZ + (this.newPosZ - this.posZ) / (double)this.newPosRotationIncrements;
                double var7;

                for (var7 = this.newRotationYaw - (double)this.rotationYaw; var7 < -180.0D; var7 += 360.0D)
                {
                    ;
                }

                while (var7 >= 180.0D)
                {
                    var7 -= 360.0D;
                }

                this.rotationYaw = (float)((double)this.rotationYaw + var7 / (double)this.newPosRotationIncrements);
                this.rotationPitch = (float)((double)this.rotationPitch + (this.newRotationPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
                --this.newPosRotationIncrements;
                this.setPosition(var1, var3, var5);
                this.setRotation(this.rotationYaw, this.rotationPitch);
                List var9 = this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox.contract(0.03125D, 0.0D, 0.03125D));

                if (var9.size() > 0)
                {
                    double var10 = 0.0D;

                    for (int var12 = 0; var12 < var9.size(); ++var12)
                    {
                        AxisAlignedBB var13 = (AxisAlignedBB)var9.get(var12);

                        if (var13.maxY > var10)
                        {
                            var10 = var13.maxY;
                        }
                    }

                    double var20 = var10 - this.boundingBox.minY;

                    if (var20 > 1.0D)
                    {
                        var20 = 0.0D;
                    }

                    var3 += var20;
                    this.setPosition(var1, var3, var5);
                }
            }

            if (this.isMovementBlocked())
            {
                this.isJumping = false;
                this.moveStrafing = 0.0F;
                this.moveForward = 0.0F;
                this.randomYawVelocity = 0.0F;
            }
            else if (!this.worldObj.isRemote)
            {
                this.updateEntityActionState();
            }
            else if (this.riddenByEntity != null)
            {
                this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.prevRotationYaw = this.riddenByEntity.rotationYaw;
                this.prevRotationPitch = this.rotationPitch = 0.0F;
            }

            boolean var14 = this.isInWater();
            boolean var2 = this.handleLavaMovement();

            if (this.isJumping)
            {
                if (var14)
                {
                    this.motionY += 0.03999999910593033D;
                }
                else if (var2)
                {
                    this.motionY += 0.03999999910593033D;
                }
                else if (this.onGround)
                {
                    this.jump();
                }
            }

            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer)
            {
                EntityPlayer var15 = (EntityPlayer)this.riddenByEntity;
                this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.prevRotationYaw = this.riddenByEntity.rotationYaw;
                this.prevRotationPitch = this.rotationPitch = 0.0F;
                float var4 = mo_DqmPetLoader.getMoveForward(var15);
                float var18 = mo_DqmPetLoader.getMoveStrafing(var15);
                this.isJumping = mo_DqmPetLoader.isJumping(var15);

                if (this instanceof EntityPigBike)
                {
                    if (var4 != 0.0F)
                    {
                        this.moveForward = var4 > 0.0F ? 0.98F : -0.98F;
                        this.prevMoveForward = this.moveForward;
                    }
                    else
                    {
                        this.moveForward = this.prevMoveForward > 0.0F ? 0.5F : -0.5F;
                    }
                }
                else
                {
                    this.moveForward = var4;
                    this.moveStrafing = var18;
                }
            }

            float var16 = this.landMovementFactor;
            this.landMovementFactor *= this.getSpeedModifier();
            this.moveEntityWithHeading(this.moveStrafing, this.moveForward);
            this.landMovementFactor = var16;
            List var17 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D));

            if (var17 != null && var17.size() > 0)
            {
                for (int var19 = 0; var19 < var17.size(); ++var19)
                {
                    Entity var6 = (Entity)var17.get(var19);

                    if (var6.canBePushed())
                    {
                        var6.applyEntityCollision(this);
                    }
                }
            }
        }
        else
        {
            super.onLivingUpdate();
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        boolean var1 = mo_DqmPetLoader.isSpacebarPressed();

        if (!this.worldObj.isRemote && var1 != this.spacebarPressed && var1 && this.riddenByEntity != null)
        {
            this.spacebarPressed();
        }

        this.spacebarPressed = var1;
        Minecraft var2 = ModLoader.getMinecraftInstance();

        if (!mo_DqmPetLoader.isMultiplayer(this.worldObj) && ModLoader.isGUIOpen((Class)null) && var2.thePlayer.ridingEntity != null && var2.thePlayer.ridingEntity == this)
        {
            mo_DqmPetLoader.sendBikeData(var2.thePlayer, this);
        }
    }

    public void spacebarPressed() {}

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    public boolean canBePushed()
    {
        return true;
    }

    public float getShadowSize()
    {
        return 0.0F;
    }

    /**
     * Sets the position and rotation. Only difference from the other one is no bounding on the rotation. Args: posX,
     * posY, posZ, yaw, pitch
     */
    public void setPositionAndRotation2(double var1, double var3, double var5, float var7, float var8, int var9)
    {
        super.setPositionAndRotation2(var1, var3, var5, var7, var8, var9 + 4);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        Entity var3 = var1.getEntity();
        return var3 != null && var3 == this.riddenByEntity ? false : (this.riddenByEntity != null && mo_DqmPetLoader.BikeSharesDamageWithRider ? this.riddenByEntity.attackEntityFrom(var1, var2) : super.attackEntityFrom(var1, var2));
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        ItemStack var2 = var1.getCurrentEquippedItem();

        if (var2 != null && var2.getItem() instanceof ItemDye && this.canColor)
        {
            int var3 = BlockCloth.getBlockFromDye(var2.getItemDamage());

            if (this.getFleeceColor() != var3)
            {
                this.setFleeceColor(var3);
                var1.inventory.consumeInventoryItem(var2.itemID);
                return true;
            }
        }

        if (!this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == var1))
        {
            var1.mountEntity(this);
            return true;
        }
        else
        {
            return false;
        }
    }

    public float getRBGColor(int var1, int var2)
    {
        if (var1 >= this.fleeceColorTable.length)
        {
            var1 = 0;
        }

        return this.fleeceColorTable[var1][var2];
    }

    public int getMaxHealth()
    {
        return 15;
    }

    public boolean setDeadBike()
    {
        super.setDead();
        return true;
    }
}
