package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelMadohando extends ModelBase
{
	//fields
	ModelRenderer doutai;
	ModelRenderer te;
	ModelRenderer yubi_1;
	ModelRenderer yubi_2;
	ModelRenderer yubi_3;
	ModelRenderer yubi_4;
	ModelRenderer Shape1;

	public DqmModelMadohando()
	{
		textureWidth = 32;
		textureHeight = 32;

		doutai = new ModelRenderer(this, 12, 23);
		doutai.addBox(-3F, 0F, -3F, 5, 4, 5);
		doutai.setRotationPoint(1F, 20F, 1F);
		doutai.setTextureSize(32, 32);
		doutai.mirror = true;
		setRotation(doutai, 0F, 0F, 0F);
		te = new ModelRenderer(this, 0, 11);
		te.addBox(-5F, 0F, -1F, 9, 9, 3);
		te.setRotationPoint(1F, 11F, 0F);
		te.setTextureSize(32, 32);
		te.mirror = true;
		setRotation(te, 0F, 0F, 0F);
		yubi_1 = new ModelRenderer(this, 0, 0);
		yubi_1.addBox(-1F, -1F, -8F, 2, 2, 8);
		yubi_1.setRotationPoint(-5F, 13F, 1F);
		yubi_1.setTextureSize(32, 32);
		yubi_1.mirror = true;
		setRotation(yubi_1, 0F, 0F, 0F);
		yubi_2 = new ModelRenderer(this, 0, 0);
		yubi_2.addBox(-1F, -1F, -8F, 2, 2, 8);
		yubi_2.setRotationPoint(-2F, 10.58667F, 1F);
		yubi_2.setTextureSize(32, 32);
		yubi_2.mirror = true;
		setRotation(yubi_2, 0F, 0F, 0F);
		yubi_3 = new ModelRenderer(this, 0, 0);
		yubi_3.addBox(-1F, -1F, -8F, 2, 2, 8);
		yubi_3.setRotationPoint(1F, 10F, 1F);
		yubi_3.setTextureSize(32, 32);
		yubi_3.mirror = true;
		setRotation(yubi_3, 0F, 0F, 0F);
		yubi_4 = new ModelRenderer(this, 0, 0);
		yubi_4.addBox(-1F, -1F, -8F, 2, 2, 8);
		yubi_4.setRotationPoint(4F, 10F, 1F);
		yubi_4.setTextureSize(32, 32);
		yubi_4.mirror = true;
		setRotation(yubi_4, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-1F, -1F, -8F, 2, 2, 8);
		Shape1.setRotationPoint(6F, 14F, 1F);
		Shape1.setTextureSize(32, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		doutai.render(f5);
		te.render(f5);
		yubi_1.render(f5);
		yubi_2.render(f5);
		yubi_3.render(f5);
		yubi_4.render(f5);
		Shape1.render(f5);
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

		yubi_1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.7F * par2;
		yubi_2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.7F * par2;
		yubi_3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.7F * par2;
		yubi_4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.7F * par2;
		Shape1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.7F * par2;



	}

}
