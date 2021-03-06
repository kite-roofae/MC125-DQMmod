package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelGizumo extends ModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;

	public DqmModelGizumo()
	{
		textureWidth = 64;
		textureHeight = 48;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-4F, -4F, -4F, 10, 10, 10);
		Shape1.setRotationPoint(-2F, 3F, 0F);
		Shape1.setTextureSize(64, 48);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 20);
		Shape2.addBox(6F, -3F, -3F, 1, 8, 8);
		Shape2.setRotationPoint(-2F, 3F, 0F);
		Shape2.setTextureSize(64, 48);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 20);
		Shape3.addBox(-5F, -3F, -3F, 1, 8, 8);
		Shape3.setRotationPoint(-2F, 3F, 0F);
		Shape3.setTextureSize(64, 48);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 32, 28);
		Shape4.addBox(-3F, -5F, -3F, 8, 1, 8);
		Shape4.setRotationPoint(-2F, 3F, 0F);
		Shape4.setTextureSize(64, 48);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 32, 28);
		Shape5.addBox(-3F, 6F, -3F, 8, 1, 8);
		Shape5.setRotationPoint(-2F, 3F, 0F);
		Shape5.setTextureSize(64, 48);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 46, 0);
		Shape6.addBox(-3F, -3F, 6F, 8, 8, 1);
		Shape6.setRotationPoint(-2F, 3F, 0F);
		Shape6.setTextureSize(64, 48);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 41, 10);
		Shape7.addBox(-4F, -5F, -5F, 4, 2, 1);
		Shape7.setRotationPoint(-2F, 3F, 0F);
		Shape7.setTextureSize(64, 48);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 41, 15);
		Shape8.addBox(-4F, -3F, -5F, 1, 1, 1);
		Shape8.setRotationPoint(-2F, 3F, 0F);
		Shape8.setTextureSize(64, 48);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 41, 10);
		Shape9.addBox(2F, 5F, -5F, 4, 2, 1);
		Shape9.setRotationPoint(-2F, 3F, 0F);
		Shape9.setTextureSize(64, 48);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 54, 10);
		Shape10.addBox(-5F, 2F, -5F, 2, 4, 1);
		Shape10.setRotationPoint(-2F, 3F, 0F);
		Shape10.setTextureSize(64, 48);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 51, 10);
		Shape11.addBox(5F, -4F, -5F, 2, 4, 1);
		Shape11.setRotationPoint(-2F, 3F, 0F);
		Shape11.setTextureSize(64, 48);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 41, 15);
		Shape12.addBox(-3F, 9F, -5F, 1, 1, 1);
		Shape12.setRotationPoint(-2F, -1F, 0F);
		Shape12.setTextureSize(64, 48);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 41, 15);
		Shape13.addBox(4F, 0F, -5F, 1, 1, 1);
		Shape13.setRotationPoint(-2F, -1F, 0F);
		Shape13.setTextureSize(64, 48);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 41, 15);
		Shape14.addBox(5F, 4F, -5F, 1, 1, 1);
		Shape14.setRotationPoint(-2F, 3F, 0F);
		Shape14.setTextureSize(64, 48);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
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
		Shape1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape3.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape4.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape5.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape6.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;

		Shape1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape5.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
		Shape6.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2;
	}
}
