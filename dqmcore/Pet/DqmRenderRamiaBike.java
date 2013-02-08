package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.RenderLiving;

import org.lwjgl.opengl.GL11;

public class DqmRenderRamiaBike extends RenderLiving
{
    public DqmRenderRamiaBike()
    {
        super(new DqmModelRamiaBike(), 0.0F);
        this.setRenderPassModel(new DqmModelRamiaBike());
    }

    /*
    protected int renderSaddledPig(DqmEntityRamiaBike var1, int var2, float var3)
    {
        this.loadTexture("/dqm/Ramia");
        float var4 = 1.0F;
        int var5 = var1.getFleeceColor();
        GL11.glColor3f(var4 * var1.getRBGColor(var5, 0), var4 * var1.getRBGColor(var5, 1), var4 * var1.getRBGColor(var5, 2));
        return var2 != 0 ? -1 : 1;
    }*/


    /**
     * Queries whether should render the specified pass or not.
     */
    /*
    protected int shouldRenderPass(EntityLiving var1, int var2, float var3)
    {
        return this.renderSaddledPig((DqmEntityRamiaBike)var1, var2, var3);
    }*/

    public void renderBike(DqmRidableCreature var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderBike((DqmRidableCreature)var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderBike((DqmRidableCreature)var1, var2, var4, var6, var8, var9);
    }
}
