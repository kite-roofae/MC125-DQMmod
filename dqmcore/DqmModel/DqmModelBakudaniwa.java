package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelBakudaniwa extends ModelBase
{
	//fields
	ModelRenderer hontai;
	ModelRenderer m11;
	ModelRenderer m12;
	ModelRenderer m21;
	ModelRenderer m22;
	ModelRenderer m13;
	ModelRenderer m14;
	ModelRenderer m23;
	ModelRenderer m24;
	ModelRenderer m15;
	ModelRenderer m16;
	ModelRenderer m25;
	ModelRenderer m26;

	public DqmModelBakudaniwa()
	{
		textureWidth = 128;
		textureHeight = 64;

		hontai = new ModelRenderer(this, 0, 36);
		hontai.addBox(-7F, -7F, -7F, 14, 14, 14);
		hontai.setRotationPoint(0F, 15F, 0F);
		hontai.setTextureSize(128, 64);
		hontai.mirror = true;
		setRotation(hontai, 0F, 0F, 0F);
		m11 = new ModelRenderer(this, 0, 23);
		m11.addBox(-6F, -6F, -1F, 12, 12, 1);
		m11.setRotationPoint(0F, 15F, 8F);
		m11.setTextureSize(128, 64);
		m11.mirror = true;
		setRotation(m11, 0F, 0F, 0F);
		m12 = new ModelRenderer(this, 26, 23);
		m12.addBox(-6F, -6F, -1F, 12, 12, 1);
		m12.setRotationPoint(0F, 15F, -7F);
		m12.setTextureSize(128, 64);
		m12.mirror = true;
		setRotation(m12, 0F, 0F, 0F);
		m21 = new ModelRenderer(this, 0, 12);
		m21.addBox(-5F, -5F, 0F, 10, 10, 1);
		m21.setRotationPoint(0F, 15F, 8F);
		m21.setTextureSize(128, 64);
		m21.mirror = true;
		setRotation(m21, 0F, 0F, 0F);
		m22 = new ModelRenderer(this, 0, 0);
		m22.addBox(-5F, -5F, 0F, 10, 10, 1);
		m22.setRotationPoint(0F, 15F, -9F);
		m22.setTextureSize(128, 64);
		m22.mirror = true;
		setRotation(m22, 0F, 0F, 0F);
		m13 = new ModelRenderer(this, 56, 25);
		m13.addBox(-6F, -1F, -6F, 12, 1, 12);
		m13.setRotationPoint(0F, 23F, 0F);
		m13.setTextureSize(128, 64);
		m13.mirror = true;
		setRotation(m13, 0F, 0F, 0F);
		m14 = new ModelRenderer(this, 56, 12);
		m14.addBox(-6F, 0F, -6F, 12, 1, 12);
		m14.setRotationPoint(0F, 7F, 0F);
		m14.setTextureSize(128, 64);
		m14.mirror = true;
		setRotation(m14, 0F, 0F, 0F);
		m23 = new ModelRenderer(this, 66, 0);
		m23.addBox(-5F, 0F, -5F, 10, 1, 10);
		m23.setRotationPoint(0F, 23F, 0F);
		m23.setTextureSize(128, 64);
		m23.mirror = true;
		setRotation(m23, 0F, 0F, 0F);
		m24 = new ModelRenderer(this, 25, 0);
		m24.addBox(-5F, 0F, -5F, 10, 1, 10);
		m24.setRotationPoint(0F, 6F, 0F);
		m24.setTextureSize(128, 64);
		m24.mirror = true;
		setRotation(m24, 0F, 0F, 0F);
		m15 = new ModelRenderer(this, 56, 40);
		m15.addBox(0F, -6F, -6F, 1, 12, 12);
		m15.setRotationPoint(7F, 15F, 0F);
		m15.setTextureSize(128, 64);
		m15.mirror = true;
		setRotation(m15, 0F, 0F, 0F);
		m16 = new ModelRenderer(this, 82, 40);
		m16.addBox(0F, -6F, -6F, 1, 12, 12);
		m16.setRotationPoint(-8F, 15F, 0F);
		m16.setTextureSize(128, 64);
		m16.mirror = true;
		setRotation(m16, 0F, 0F, 0F);
		m25 = new ModelRenderer(this, 106, 0);
		m25.addBox(0F, -5F, -5F, 1, 10, 10);
		m25.setRotationPoint(8F, 15F, 0F);
		m25.setTextureSize(128, 64);
		m25.mirror = true;
		setRotation(m25, 0F, 0F, 0F);
		m26 = new ModelRenderer(this, 106, 20);
		m26.addBox(0F, -5F, -5F, 1, 10, 10);
		m26.setRotationPoint(-9F, 15F, 0F);
		m26.setTextureSize(128, 64);
		m26.mirror = true;
		setRotation(m26, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		hontai.render(f5);
		m11.render(f5);
		m12.render(f5);
		m21.render(f5);
		m22.render(f5);
		m13.render(f5);
		m14.render(f5);
		m23.render(f5);
		m24.render(f5);
		m15.render(f5);
		m16.render(f5);
		m25.render(f5);
		m26.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
