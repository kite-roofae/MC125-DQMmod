package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

import org.lwjgl.opengl.GL11;

public class ModelDragonBike extends ModelBase
{

    private ModelRenderer wing;
    private ModelRenderer wingTip;
    private float field_40317_s;

    public ModelDragonBike(float var1)
    {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.setTextureOffset("body.body", 0, 0);
        this.setTextureOffset("wing.skin", -56, 88);
        this.setTextureOffset("wingtip.skin", -56, 144);
        this.setTextureOffset("rearleg.main", 0, 0);
        this.setTextureOffset("rearfoot.main", 112, 0);
        this.setTextureOffset("rearlegtip.main", 196, 0);
        this.setTextureOffset("head.upperhead", 112, 30);
        this.setTextureOffset("wing.bone", 112, 88);
        this.setTextureOffset("head.upperlip", 176, 44);
        this.setTextureOffset("jaw.jaw", 176, 65);
        this.setTextureOffset("frontleg.main", 112, 104);
        this.setTextureOffset("wingtip.bone", 112, 136);
        this.setTextureOffset("frontfoot.main", 144, 104);
        this.setTextureOffset("neck.box", 192, 104);
        this.setTextureOffset("frontlegtip.main", 226, 138);
        this.setTextureOffset("body.scale", 220, 53);
        this.setTextureOffset("head.scale", 0, 0);
        this.setTextureOffset("neck.scale", 48, 0);
        this.setTextureOffset("head.nostril", 112, 0);
        float var2 = -16.0F;

        this.wing = new ModelRenderer(this, "wing");
        this.wing.setRotationPoint(-12.0F, 5.0F, 2.0F);
        this.wing.addBox("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
        this.wing.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
        this.wingTip = new ModelRenderer(this, "wingtip");
        this.wingTip.setRotationPoint(-56.0F, 0.0F, 0.0F);
        this.wingTip.addBox("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
        this.wingTip.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
        this.wing.addChild(this.wingTip);

    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLiving var1, float var2, float var3, float var4)
    {
        this.field_40317_s = var4;
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        EntityDragonBike var8 = (EntityDragonBike)var1;
        GL11.glPushMatrix();
        float var9 = var8.field_40173_aw + (var8.field_40172_ax - var8.field_40173_aw) * this.field_40317_s;

        float var10 = (float)(Math.sin((double)(var9 * (float)Math.PI * 2.0F - 1.0F)) + 1.0D);
        var10 = (var10 * var10 * 1.0F + var10 * 2.0F) * 0.05F;
        GL11.glTranslatef(0.0F, var10 - 2.0F, -3.0F);
        GL11.glRotatef(var10 * 2.0F, 1.0F, 0.0F, 0.0F);
        float var11 = -30.0F;
        float var12 = 22.0F;
        float var13 = 0.0F;
        float var14 = 1.5F;
        double[] var15 = var8.func_40160_a(6, this.field_40317_s);
        float var16 = this.updateRotations(var8.func_40160_a(5, this.field_40317_s)[0] - var8.func_40160_a(10, this.field_40317_s)[0]);
        float var17 = this.updateRotations(var8.func_40160_a(5, this.field_40317_s)[0] + (double)(var16 / 2.0F));
        var11 += 2.0F;
        float var18 = 0.0F;
        float var19 = var9 * (float)Math.PI * 2.0F;
        var11 = 20.0F;
        var12 = -12.0F;




        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 1.0F, 0.0F);

        if (var8.onGround)
        {
            GL11.glRotatef(-var16 * var14 * 0.3F, 0.0F, 0.0F, 1.0F);
        }
        else
        {
            GL11.glRotatef(-var16 * var14 * 1.0F, 0.0F, 0.0F, 1.0F);
        }

        GL11.glTranslatef(0.0F, -1.0F, 0.0F);

        int var25;

        if (var8.onGround)
        {
            for (var25 = 0; var25 < 2; ++var25)
            {
                GL11.glEnable(GL11.GL_CULL_FACE);
                this.wing.rotateAngleX = 0.25F;
                this.wing.rotateAngleY = 0.95F;
                this.wing.rotateAngleZ = -0.5F;
                this.wingTip.rotateAngleZ = -0.4F;

                if (var3 > 0.0F && var8.riddenByEntity == null)
                {
                    var3 = 0.0F;
                }


                this.wing.render(var7);
                GL11.glScalef(-1.0F, 1.0F, 1.0F);

                if (var25 == 0)
                {
                    GL11.glCullFace(GL11.GL_FRONT);
                }
            }
        }
        else
        {
            for (var25 = 0; var25 < 2; ++var25)
            {
                GL11.glEnable(GL11.GL_CULL_FACE);
                float var22 = var9 * (float)Math.PI * 2.0F;
                this.wing.rotateAngleX = 0.125F - (float)Math.cos((double)var22) * 0.2F;
                this.wing.rotateAngleY = 0.25F;
                this.wing.rotateAngleZ = (float)(Math.sin((double)var22) + 0.125D) * 0.8F;
                this.wingTip.rotateAngleZ = -((float)(Math.sin((double)(var22 + 2.0F)) + 0.5D)) * 0.75F;

                this.wing.render(var7);

                GL11.glScalef(-1.0F, 1.0F, 1.0F);

                if (var25 == 0)
                {
                    GL11.glCullFace(GL11.GL_FRONT);
                }
            }
        }

        GL11.glPopMatrix();
        GL11.glCullFace(GL11.GL_BACK);
        GL11.glDisable(GL11.GL_CULL_FACE);
        var18 = -((float)Math.sin((double)(var9 * (float)Math.PI * 2.0F))) * 0.0F;
        var19 = var9 * (float)Math.PI * 2.0F;
        var11 = 10.0F;
        var12 = 60.0F;
        var13 = 0.0F;
        var15 = var8.func_40160_a(11, this.field_40317_s);

        for (var25 = 0; var25 < 12; ++var25)
        {
            double[] var24 = var8.func_40160_a(12 + var25, this.field_40317_s);
            var18 = (float)((double)var18 + Math.sin((double)((float)var25 * 0.45F + var19)) * 0.05000000074505806D);


        }

        GL11.glPopMatrix();
    }

    /**
     * Sets the models various rotation angles.
     */
    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        super.setRotationAngles(var1, var2, var3, var4, var5, var6);
    }

    /**
     * Updates the rotations in the parameters for rotations greater than 180 degrees or less than -180 degrees. It adds
     * or subtracts 360 degrees, so that the appearance is the same, although the numbers are then simplified to range
     * -180 to 180
     */
    private float updateRotations(double var1)
    {
        while (var1 >= 180.0D)
        {
            var1 -= 360.0D;
        }

        while (var1 < -180.0D)
        {
            var1 += 360.0D;
        }

        return (float)var1;
    }
}
