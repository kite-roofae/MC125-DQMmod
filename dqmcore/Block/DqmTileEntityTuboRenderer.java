package net.minecraft.src.dqmcore.Block;

import net.minecraft.src.*;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class DqmTileEntityTuboRenderer extends TileEntitySpecialRenderer
{
    //private DqmModelTubo ModelTubo = new DqmModelTubo();

    public void renderDqmTileEntityTuboAt(DqmTileEntityTubo var1, double var2, double var4, double var6, float var8)
    {
        int var9;

        if (var1.worldObj == null)
        {
            var9 = 0;
        }
        else
        {
            Block var10 = var1.getBlockType();
            var9 = var1.getBlockMetadata();
        }

        this.bindTextureByName("/ricefarm/texture/ModelTubo.png");
        GL11.glPushMatrix();
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        short var11 = 0;

        if (var9 == 2)
        {
            var11 = 180;
        }

        if (var9 == 3)
        {
            var11 = 0;
        }

        if (var9 == 4)
        {
            var11 = 90;
        }

        if (var9 == 5)
        {
            var11 = -90;
        }

        GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        //this.ModelTubo.renderAll();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderDqmTileEntityTuboAt((DqmTileEntityTubo)var1, var2, var4, var6, var8);
    }
}
