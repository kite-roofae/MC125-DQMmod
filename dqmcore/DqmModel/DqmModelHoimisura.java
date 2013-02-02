package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelHoimisura extends ModelBase
{
	//fields
	ModelRenderer top;
	ModelRenderer naka;
	ModelRenderer kao;
	ModelRenderer asi1;
	ModelRenderer asi2;
	ModelRenderer asi3;
	ModelRenderer asi4;
	ModelRenderer asi5;
	ModelRenderer asi6;
	ModelRenderer asi7;
	ModelRenderer asi8;
	ModelRenderer asi9;

	public DqmModelHoimisura()
	{
		textureWidth = 64;
		textureHeight = 32;

		top = new ModelRenderer(this, 24, 10);
		top.addBox(-1.966667F, 0F, -2.033333F, 4, 1, 4);
		top.setRotationPoint(0F, 7F, 0F);
		top.setTextureSize(64, 32);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
		naka = new ModelRenderer(this, 0, 10);
		naka.addBox(-3F, 0F, -3F, 6, 2, 6);
		naka.setRotationPoint(0F, 8F, 0F);
		naka.setTextureSize(64, 32);
		naka.mirror = true;
		setRotation(naka, 0F, 0F, 0F);
		kao = new ModelRenderer(this, 0, 18);
		kao.addBox(-4.5F, -6F, -4F, 9, 6, 8);
		kao.setRotationPoint(0F, 16F, 0F);
		kao.setTextureSize(64, 32);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		asi1 = new ModelRenderer(this, 4, 0);
		asi1.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi1.setRotationPoint(2F, 16F, 2F);
		asi1.setTextureSize(64, 32);
		asi1.mirror = true;
		setRotation(asi1, 0.1858931F, 0F, -0.2974289F);
		asi2 = new ModelRenderer(this, 8, 0);
		asi2.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi2.setRotationPoint(2F, 16F, 0F);
		asi2.setTextureSize(64, 32);
		asi2.mirror = true;
		setRotation(asi2, 0F, 0F, -0.2974289F);
		asi3 = new ModelRenderer(this, 12, 0);
		asi3.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi3.setRotationPoint(-2F, 16F, 0F);
		asi3.setTextureSize(64, 32);
		asi3.mirror = true;
		setRotation(asi3, 0.0371786F, 0F, 0.1858931F);
		asi4 = new ModelRenderer(this, 16, 0);
		asi4.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi4.setRotationPoint(0F, 16F, 0F);
		asi4.setTextureSize(64, 32);
		asi4.mirror = true;
		setRotation(asi4, 0F, 0F, 0F);
		asi5 = new ModelRenderer(this, 20, 0);
		asi5.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi5.setRotationPoint(2F, 16F, -2F);
		asi5.setTextureSize(64, 32);
		asi5.mirror = true;
		setRotation(asi5, -0.1487144F, 0F, -0.1858931F);
		asi6 = new ModelRenderer(this, 24, 0);
		asi6.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi6.setRotationPoint(0F, 16F, -2F);
		asi6.setTextureSize(64, 32);
		asi6.mirror = true;
		setRotation(asi6, -0.2602503F, 0F, 0F);
		asi7 = new ModelRenderer(this, 28, 0);
		asi7.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi7.setRotationPoint(-2F, 16F, -2F);
		asi7.setTextureSize(64, 32);
		asi7.mirror = true;
		setRotation(asi7, -0.2974289F, 0F, 0.3346075F);
		asi8 = new ModelRenderer(this, 32, 0);
		asi8.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi8.setRotationPoint(-2F, 16F, 2F);
		asi8.setTextureSize(64, 32);
		asi8.mirror = true;
		setRotation(asi8, 0.4833219F, 0F, 0.2230717F);
		asi9 = new ModelRenderer(this, 0, 0);
		asi9.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
		asi9.setRotationPoint(0F, 16F, 2F);
		asi9.setTextureSize(64, 32);
		asi9.mirror = true;
		setRotation(asi9, 0.2602503F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);


		top.render(f5);
		naka.render(f5);
		kao.render(f5);
		asi1.render(f5);
		asi2.render(f5);
		asi3.render(f5);
		asi4.render(f5);
		asi5.render(f5);
		asi6.render(f5);
		asi7.render(f5);
		asi8.render(f5);
		asi9.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
	{
		asi1.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi3.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi4.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi5.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi6.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi7.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi8.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi9.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		/*
    asi1.rotateAngleX = -MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    asi2.rotateAngleX = -MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    asi3.rotateAngleX = -MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    asi4.rotateAngleX = -MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    asi5.rotateAngleX =  MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    asi6.rotateAngleX =  MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    asi7.rotateAngleX =  MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    asi8.rotateAngleX =  MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    asi9.rotateAngleX =  MathHelper.cos(f * 0.6662F) * 1.4F * f1;*/


	}




	//public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	//{
	//  super.setRotationAngles(f, f1, f2, f3, f4, f5);
	//}

}
