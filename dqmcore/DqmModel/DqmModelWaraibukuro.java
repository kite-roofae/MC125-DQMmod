package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelWaraibukuro extends ModelBase
{

	//fields
	ModelRenderer ue1;
	ModelRenderer ue2;
	ModelRenderer himo;
	ModelRenderer himo1;
	ModelRenderer himo2;
	ModelRenderer kao_ue;
	ModelRenderer kao;
	ModelRenderer sita;

	public DqmModelWaraibukuro()
	{
		textureWidth = 64;
		textureHeight = 32;

		ue1 = new ModelRenderer(this, 0, 0);
		ue1.addBox(-3F, -2F, -3F, 6, 1, 6);
		ue1.setRotationPoint(0F, 12F, 0F);
		ue1.setTextureSize(64, 32);
		ue1.mirror = true;
		setRotation(ue1, 0F, 0F, 0F);
		ue2 = new ModelRenderer(this, 4, 2);
		ue2.addBox(-2F, -1F, -2F, 4, 1, 4);
		ue2.setRotationPoint(0F, 12F, 0F);
		ue2.setTextureSize(64, 32);
		ue2.mirror = true;
		setRotation(ue2, 0F, 0F, 0F);
		himo = new ModelRenderer(this, 33, 4);
		himo.addBox(-1F, -1F, -1F, 2, 1, 2);
		himo.setRotationPoint(0F, 13F, 0F);
		himo.setTextureSize(64, 32);
		himo.mirror = true;
		setRotation(himo, 0F, 0F, 0F);
		himo1 = new ModelRenderer(this, 30, 0);
		himo1.addBox(0F, -1F, 0F, 1, 1, 6);
		himo1.setRotationPoint(0F, 13F, 0F);
		himo1.setTextureSize(64, 32);
		himo1.mirror = true;
		setRotation(himo1, -0.2974289F, 0.3846954F, 0F);
		himo2 = new ModelRenderer(this, 30, 0);
		himo2.addBox(-1F, -1F, 1F, 1, 1, 6);
		himo2.setRotationPoint(0F, 13F, 0F);
		himo2.setTextureSize(64, 32);
		himo2.mirror = true;
		setRotation(himo2, 0F, 0.1858931F, 0F);
		kao_ue = new ModelRenderer(this, 0, 11);
		kao_ue.addBox(-2F, -1F, -2F, 4, 1, 4);
		kao_ue.setRotationPoint(0F, 14F, 0F);
		kao_ue.setTextureSize(64, 32);
		kao_ue.mirror = true;
		setRotation(kao_ue, 0F, 0F, 0F);
		kao = new ModelRenderer(this, 0, 16);
		kao.addBox(-4F, 0F, -4F, 8, 8, 8);
		kao.setRotationPoint(0F, 14F, 0F);
		kao.setTextureSize(64, 32);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		sita = new ModelRenderer(this, 0, 9);
		sita.addBox(-3F, 8F, -3F, 6, 1, 6);
		sita.setRotationPoint(0F, 14F, 0F);
		sita.setTextureSize(64, 32);
		sita.mirror = true;
		setRotation(sita, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		ue1.render(f5);
		ue2.render(f5);
		himo.render(f5);
		himo1.render(f5);
		himo2.render(f5);
		kao_ue.render(f5);
		kao.render(f5);
		sita.render(f5);
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

		kao_ue.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		kao.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		sita.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	}

}
