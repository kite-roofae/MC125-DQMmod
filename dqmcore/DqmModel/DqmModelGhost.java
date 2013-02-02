package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelGhost extends ModelBase
{
	//fields
	ModelRenderer Doutai;
	ModelRenderer Shippo1;
	ModelRenderer Shippo2;
	ModelRenderer Boushi1;
	ModelRenderer Boushi2;
	ModelRenderer Boushi3;
	ModelRenderer Migiude;
	ModelRenderer Hidariude;
	ModelRenderer Bero;

	public DqmModelGhost()
	{
		textureWidth = 64;
		textureHeight = 32;

		Doutai = new ModelRenderer(this, 0, 19);
		Doutai.addBox(-2.5F, 0F, -2.5F, 5, 8, 5);
		Doutai.setRotationPoint(0F, 1F, 0F);
		Doutai.setTextureSize(64, 32);
		Doutai.mirror = true;
		setRotation(Doutai, 0F, 0F, 0F);
		Shippo1 = new ModelRenderer(this, 20, 26);
		Shippo1.addBox(-1F, -1F, 0F, 2, 2, 4);
		Shippo1.setRotationPoint(0F, 8F, 2F);
		Shippo1.setTextureSize(64, 32);
		Shippo1.mirror = true;
		setRotation(Shippo1, -0.6108652F, 0F, 0F);
		Shippo2 = new ModelRenderer(this, 20, 22);
		Shippo2.addBox(-0.5F, 1F, 3F, 1, 1, 3);
		Shippo2.setRotationPoint(0F, 8F, 2F);
		Shippo2.setTextureSize(64, 32);
		Shippo2.mirror = true;
		setRotation(Shippo2, -0.1745329F, 0F, 0F);
		Boushi1 = new ModelRenderer(this, 0, 0);
		Boushi1.addBox(-5F, 0F, -5F, 10, 1, 10);
		Boushi1.setRotationPoint(0F, 0F, 0F);
		Boushi1.setTextureSize(64, 32);
		Boushi1.mirror = true;
		setRotation(Boushi1, 0F, 0F, 0F);
		Boushi2 = new ModelRenderer(this, 40, 0);
		Boushi2.addBox(-2F, -4F, -2F, 4, 4, 4);
		Boushi2.setRotationPoint(0F, 0F, 0F);
		Boushi2.setTextureSize(64, 32);
		Boushi2.mirror = true;
		setRotation(Boushi2, 0F, 0F, 0F);
		Boushi3 = new ModelRenderer(this, 56, 0);
		Boushi3.addBox(-1F, -7F, -1F, 2, 4, 2);
		Boushi3.setRotationPoint(0F, 0F, 0F);
		Boushi3.setTextureSize(64, 32);
		Boushi3.mirror = true;
		setRotation(Boushi3, -0.3316126F, 0F, 0F);
		Migiude = new ModelRenderer(this, 28, 22);
		Migiude.addBox(-1.5F, 0F, -0.5F, 1, 3, 1);
		Migiude.setRotationPoint(-2F, 4F, 0F);
		Migiude.setTextureSize(64, 32);
		Migiude.mirror = true;
		setRotation(Migiude, -0.7853982F, 0F, 0.6108652F);
		Hidariude = new ModelRenderer(this, 28, 22);
		Hidariude.addBox(0.5F, 0F, -0.5F, 1, 3, 1);
		Hidariude.setRotationPoint(2F, 4F, 0F);
		Hidariude.setTextureSize(64, 32);
		Hidariude.mirror = true;
		setRotation(Hidariude, -0.7853982F, 0F, -0.6108652F);
		Bero = new ModelRenderer(this, 0, 0);
		Bero.addBox(-1F, 0F, -1F, 2, 3, 1);
		Bero.setRotationPoint(0F, 6F, -2F);
		Bero.setTextureSize(64, 32);
		Bero.mirror = true;
		setRotation(Bero, -0.4363323F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Doutai.render(f5);
		Shippo1.render(f5);
		Shippo2.render(f5);
		Boushi1.render(f5);
		Boushi2.render(f5);
		Boushi3.render(f5);
		Migiude.render(f5);
		Hidariude.render(f5);
		Bero.render(f5);
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

		Shippo1.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		Shippo2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		Bero.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.4F * par2;
		Migiude.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//Hidariude.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		Hidariude.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		/*bow1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;*/
	}

}
