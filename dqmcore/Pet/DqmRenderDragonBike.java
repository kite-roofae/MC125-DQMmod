package net.minecraft.src.dqmcore.Pet;

import java.util.Random;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.MathHelper;
import net.minecraft.src.OpenGlHelper;
import net.minecraft.src.RenderHelper;
import net.minecraft.src.RenderLiving;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;

public class DqmRenderDragonBike extends RenderLiving
{
    /**
     * The entity instance of the dragon. Note: This is a static field in RenderDragon because there is only supposed to
     * be one dragon
     */
    public static DqmEntityDragonBike entityDragon;
    private static int field_40284_d = 0;

    /** An instance of the dragon model in RenderDragon */
    protected DqmModelDragonBike modelDragon;

    public DqmRenderDragonBike()
    {
        super(new DqmModelDragonBike(0.0F), 0.5F);
        this.modelDragon = (DqmModelDragonBike)this.mainModel;
        this.setRenderPassModel(this.mainModel);
    }

    /**
     * Used to rotate the dragon as a whole in RenderDragon. It's called in the rotateCorpse method.
     */
    protected void rotateDragonBody(DqmEntityDragonBike var1, float var2, float var3, float var4)
    {
        float var5 = (float)var1.func_40160_a(7, var4)[0];
        float var6 = (float)(var1.func_40160_a(5, var4)[1] - var1.func_40160_a(10, var4)[1]);
        GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(var6 * 10.0F, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 1.0F);

        if (var1.deathTime > 0)
        {
            float var7 = ((float)var1.deathTime + var4 - 1.0F) / 20.0F * 1.6F;
            var7 = MathHelper.sqrt_float(var7);

            if (var7 > 1.0F)
            {
                var7 = 1.0F;
            }

            GL11.glRotatef(var7 * this.getDeathMaxRotation(var1), 0.0F, 0.0F, 1.0F);
        }
    }

    protected void func_40280_a(DqmEntityDragonBike var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        if (var1.field_40178_aA > 0)
        {
            float var8 = (float)var1.field_40178_aA / 200.0F;
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glAlphaFunc(GL11.GL_GREATER, var8);
            this.loadDownloadableImageTexture(var1.skinUrl, "/mob/enderdragon/shuffle.png");
            this.mainModel.render(var1, var2, var3, var4, var5, var6, var7);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
            GL11.glDepthFunc(GL11.GL_EQUAL);
        }

        this.loadDownloadableImageTexture(var1.skinUrl, var1.getTexture());
        this.mainModel.render(var1, var2, var3, var4, var5, var6, var7);

        if (var1.hurtTime > 0)
        {
            GL11.glDepthFunc(GL11.GL_EQUAL);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
            this.mainModel.render(var1, var2, var3, var4, var5, var6, var7);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
        }
    }

    /**
     * Renders the dragon, along with its dying animation
     */
    public void renderDragon(DqmEntityDragonBike var1, double var2, double var4, double var6, float var8, float var9)
    {
        var1.ticks = var9;
        entityDragon = var1;

        if (field_40284_d != 4)
        {
            this.mainModel = new DqmModelDragonBike(0.0F);
            field_40284_d = 4;
        }

        float var10 = 1.0F;
        int var11 = var1.getFleeceColor();
        GL11.glColor3f(var1.getRBGColor(var11, 0), var1.getRBGColor(var11, 1), var1.getRBGColor(var11, 2));
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    /**
     * Renders the animation for when an enderdragon dies
     */
    protected void renderDragonDying(DqmEntityDragonBike var1, float var2)
    {
        super.renderEquippedItems(var1, var2);
        Tessellator var3 = Tessellator.instance;

        if (var1.field_40178_aA > 0)
        {
            RenderHelper.disableStandardItemLighting();
            float var4 = ((float)var1.field_40178_aA + var2) / 200.0F;
            float var5 = 0.0F;

            if (var4 > 0.8F)
            {
                var5 = (var4 - 0.8F) / 0.2F;
            }

            Random var6 = new Random(432L);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glShadeModel(GL11.GL_SMOOTH);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_CULL_FACE);
            GL11.glDepthMask(false);
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, -1.0F, -2.0F);

            for (int var7 = 0; (float)var7 < (var4 + var4 * var4) / 2.0F * 60.0F; ++var7)
            {
                GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(var6.nextFloat() * 360.0F + var4 * 90.0F, 0.0F, 0.0F, 1.0F);
                var3.startDrawing(6);
                float var8 = var6.nextFloat() * 20.0F + 5.0F + var5 * 10.0F;
                float var9 = var6.nextFloat() * 2.0F + 1.0F + var5 * 2.0F;
                var3.setColorRGBA_I(16777215, (int)(255.0F * (1.0F - var5)));
                var3.addVertex(0.0D, 0.0D, 0.0D);
                var3.setColorRGBA_I(16711935, 0);
                var3.addVertex(-0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
                var3.addVertex(0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
                var3.addVertex(0.0D, (double)var8, (double)(1.0F * var9));
                var3.addVertex(-0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
                var3.draw();
            }

            GL11.glPopMatrix();
            GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glShadeModel(GL11.GL_FLAT);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            RenderHelper.enableStandardItemLighting();
        }
    }

    protected int func_40283_a(DqmEntityDragonBike var1, int var2, float var3)
    {
        if (var2 == 1)
        {
            GL11.glDepthFunc(GL11.GL_LEQUAL);
        }

        if (var2 != 0)
        {
            return -1;
        }
        else
        {
            this.loadTexture("/mob/enderdragon/ender_eyes.png");
            float var4 = 1.0F;
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDepthFunc(GL11.GL_EQUAL);
            char var5 = 61680;
            int var6 = var5 % 65536;
            int var7 = var5 / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var6 / 1.0F, (float)var7 / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
            return 1;
        }
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving var1, float var2)
    {
        GL11.glScalef(0.4F, 0.4F, 0.4F);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLiving var1, int var2, float var3)
    {
        return this.func_40283_a((DqmEntityDragonBike)var1, var2, var3);
    }

    protected void renderEquippedItems(EntityLiving var1, float var2)
    {
        this.renderDragonDying((DqmEntityDragonBike)var1, var2);
    }

    protected void rotateCorpse(EntityLiving var1, float var2, float var3, float var4)
    {
        this.rotateDragonBody((DqmEntityDragonBike)var1, var2, var3, var4);
    }

    /**
     * Renders the model in RenderLiving
     */
    protected void renderModel(EntityLiving var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        this.func_40280_a((DqmEntityDragonBike)var1, var2, var3, var4, var5, var6, var7);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderDragon((DqmEntityDragonBike)var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderDragon((DqmEntityDragonBike)var1, var2, var4, var6, var8, var9);
    }
}
