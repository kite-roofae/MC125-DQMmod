package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelBigCrow extends ModelBase
{
	//fields
	ModelRenderer Skel;
	ModelRenderer Body;
	ModelRenderer RightAshi;
	ModelRenderer LeftAshi;
	ModelRenderer Obane;
	ModelRenderer Atama;
	ModelRenderer RightHane;
	ModelRenderer LeftHane;
	ModelRenderer Kutibashi;

	public DqmModelBigCrow()
	{
		textureWidth = 64;
		textureHeight = 64;

		Skel = new ModelRenderer(this, 0, 0);
		Skel.addBox(0F, 0F, 0F, 10, 8, 10);
		Skel.setRotationPoint(-5F, 16F, -5F);
		Skel.setTextureSize(64, 64);
		Skel.mirror = true;
		setRotation(Skel, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 32, 19);
		Body.addBox(-4F, 0F, -4F, 8, 11, 8);
		Body.setRotationPoint(0F, 4F, 1F);
		Body.setTextureSize(64, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		RightAshi = new ModelRenderer(this, 54, 4);
		RightAshi.addBox(0F, 0F, 0F, 2, 1, 3);
		RightAshi.setRotationPoint(-4F, 15F, -5F);
		RightAshi.setTextureSize(64, 64);
		RightAshi.mirror = true;
		setRotation(RightAshi, 0F, 0F, 0F);
		LeftAshi = new ModelRenderer(this, 54, 0);
		LeftAshi.addBox(0F, 0F, 0F, 2, 1, 3);
		LeftAshi.setRotationPoint(2F, 15F, -5F);
		LeftAshi.setTextureSize(64, 64);
		LeftAshi.mirror = true;
		setRotation(LeftAshi, 0F, 0F, 0F);
		Obane = new ModelRenderer(this, 42, 8);
		Obane.addBox(-3F, 0F, 0F, 6, 1, 5);
		Obane.setRotationPoint(0F, 14F, 5F);
		Obane.setTextureSize(64, 64);
		Obane.mirror = true;
		setRotation(Obane, -0.2792527F, 0F, 0F);
		Atama = new ModelRenderer(this, 0, 19);
		Atama.addBox(-4F, -6F, -4F, 8, 6, 8);
		Atama.setRotationPoint(0F, 4F, 1F);
		Atama.setTextureSize(64, 64);
		Atama.mirror = true;
		setRotation(Atama, 0F, 0F, 0F);
		RightHane = new ModelRenderer(this, 18, 38);
		RightHane.addBox(0F, 0F, -4F, 1, 11, 8);
		RightHane.setRotationPoint(-5F, 4F, 1F);
		RightHane.setTextureSize(64, 64);
		RightHane.mirror = true;
		setRotation(RightHane, 0.3490659F, 0F, 0F);
		LeftHane = new ModelRenderer(this, 0, 38);
		LeftHane.addBox(0F, 0F, -4F, 1, 11, 8);
		LeftHane.setRotationPoint(4F, 4F, 1F);
		LeftHane.setTextureSize(64, 64);
		LeftHane.mirror = true;
		setRotation(LeftHane, 0.3490659F, 0F, 0F);
		Kutibashi = new ModelRenderer(this, 48, 14);
		Kutibashi.addBox(-2F, -2F, -8F, 4, 1, 4);
		Kutibashi.setRotationPoint(0F, 4F, 1F);
		Kutibashi.setTextureSize(128, 64);
		Kutibashi.mirror = true;
		setRotation(Kutibashi, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Skel.render(f5);
		Body.render(f5);
		RightAshi.render(f5);
		LeftAshi.render(f5);
		Obane.render(f5);
		Atama.render(f5);
		RightHane.render(f5);
		LeftHane.render(f5);
		Kutibashi.render(f5);
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
		Atama.rotateAngleY = par4 / (180F / (float)Math.PI);
		Atama.rotateAngleX = par5 / (180F / (float)Math.PI);
		Kutibashi.rotateAngleY = par4 / (180F / (float)Math.PI);
		Kutibashi.rotateAngleX = par5 / (180F / (float)Math.PI);

		LeftHane.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.4F * par2;
		Obane.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		RightHane.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.4F * par2;
		//RightHane.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		/*
      ude2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      te1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      te2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;*/
	}

}
