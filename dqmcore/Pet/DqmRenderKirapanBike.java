package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.EntityLiving;
//import net.minecraft.src.DqmModelKirapanBike;
import net.minecraft.src.RenderLiving;

import org.lwjgl.opengl.GL11;

public class DqmRenderKirapanBike extends RenderLiving
{
	public DqmModelKirapanBike main;

    public DqmRenderKirapanBike(DqmModelKirapanBike var1)
    {
        super(var1, 0.0F);
        this.main = var1;
    }
/*
    protected int setWoolColorAndRender(DqmEntityKirapanBike var1, int var2, float var3)
    {
        if (var2 == 0)
        {
            this.loadTexture("/dqm/Kirapan.png");
            float var4 = 1.0F;
            int var5 = var1.getFleeceColor();
            GL11.glColor3f(var4 * var1.getRBGColor(var5, 0), var4 * var1.getRBGColor(var5, 1), var4 * var1.getRBGColor(var5, 2));
            return 1;
        }
        else
        {
            return -1;
        }
    }


    protected int shouldRenderPass(EntityLiving var1, int var2, float var3)
    {
        return this.setWoolColorAndRender((DqmEntityKirapanBike)var1, var2, var3);
    }*/
}
