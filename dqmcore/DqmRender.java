package net.minecraft.src.dqmcore;

import net.minecraft.src.*;

public class DqmRender extends RenderLiving
{
	public DqmRender(ModelBase par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
	}

	public void DqmpetRender(EntityLiving par1DqmpetEntityBakudaniwa, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRenderLiving(par1DqmpetEntityBakudaniwa, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		DqmpetRender(par1EntityLiving, par2, par4, par6, par8, par9);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		DqmpetRender((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
	}
}
