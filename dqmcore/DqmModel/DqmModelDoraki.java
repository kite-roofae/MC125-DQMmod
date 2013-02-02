package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelDoraki extends ModelBase
{
	//fields
	ModelRenderer Karada;
	ModelRenderer Migitsubasa;
	ModelRenderer Hidaritsubasa;
	ModelRenderer Migishokkaku;
	ModelRenderer Hidarishokkaku;
	ModelRenderer Migiashi1;
	ModelRenderer Migiashi2;
	ModelRenderer Hidariashi1;
	ModelRenderer Hidariashi2;
	ModelRenderer Shape1;

	public DqmModelDoraki()
	{
		textureWidth = 64;
		textureHeight = 32;

		Karada = new ModelRenderer(this, 0, 20);
		Karada.addBox(-3F, 0F, -3F, 6, 6, 6);
		Karada.setRotationPoint(0F, 0F, 0F);
		Karada.setTextureSize(64, 32);
		Karada.mirror = true;
		setRotation(Karada, 0F, 0F, 0F);
		Migitsubasa = new ModelRenderer(this, 0, 15);
		Migitsubasa.addBox(-6F, -3F, 0F, 6, 5, 0);
		Migitsubasa.setRotationPoint(-3F, 3F, 0F);
		Migitsubasa.setTextureSize(64, 32);
		Migitsubasa.mirror = true;
		setRotation(Migitsubasa, 0F, 0F, 0F);
		//Hidaritsubasa.mirror = true;
		Hidaritsubasa = new ModelRenderer(this, 0, 15);
		Hidaritsubasa.addBox(0F, -3F, 0F, 6, 5, 0);
		Hidaritsubasa.setRotationPoint(3F, 3F, 0F);
		Hidaritsubasa.setTextureSize(64, 32);
		Hidaritsubasa.mirror = true;
		setRotation(Hidaritsubasa, 0F, 0F, 0F);
		//Hidaritsubasa.mirror = false;
		//Migishokkaku.mirror = true;
		Migishokkaku = new ModelRenderer(this, 0, 11);
		Migishokkaku.addBox(-1F, -3F, -1F, 1, 3, 1);
		Migishokkaku.setRotationPoint(-1F, 0F, -2F);
		Migishokkaku.setTextureSize(64, 32);
		Migishokkaku.mirror = true;
		setRotation(Migishokkaku, 0.5235988F, 0.3490659F, 0F);
		//Migishokkaku.mirror = false;
		Hidarishokkaku = new ModelRenderer(this, 0, 11);
		Hidarishokkaku.addBox(0F, -3F, -1F, 1, 3, 1);
		Hidarishokkaku.setRotationPoint(1F, 0F, -2F);
		Hidarishokkaku.setTextureSize(64, 32);
		Hidarishokkaku.mirror = true;
		setRotation(Hidarishokkaku, 0.5235988F, -0.3490659F, 0F);
		Migiashi1 = new ModelRenderer(this, 12, 17);
		Migiashi1.addBox(-1F, 0F, -1F, 1, 2, 1);
		Migiashi1.setRotationPoint(-1F, 6F, -2F);
		Migiashi1.setTextureSize(64, 32);
		Migiashi1.mirror = true;
		setRotation(Migiashi1, -0.5235988F, 0.3490659F, 0F);
		Migiashi2 = new ModelRenderer(this, 16, 17);
		Migiashi2.addBox(-2F, 1F, -2F, 2, 1, 2);
		Migiashi2.setRotationPoint(-1F, 6F, -2F);
		Migiashi2.setTextureSize(64, 32);
		Migiashi2.mirror = true;
		setRotation(Migiashi2, -0.5235988F, 0.3490659F, 0F);
		Hidariashi1 = new ModelRenderer(this, 12, 17);
		Hidariashi1.addBox(0F, 0F, -1F, 1, 2, 1);
		Hidariashi1.setRotationPoint(1F, 6F, -2F);
		Hidariashi1.setTextureSize(64, 32);
		Hidariashi1.mirror = true;
		setRotation(Hidariashi1, -0.5235988F, -0.3490659F, 0F);
		Hidariashi2 = new ModelRenderer(this, 16, 17);
		Hidariashi2.addBox(0F, 1F, -2F, 2, 1, 2);
		Hidariashi2.setRotationPoint(1F, 6F, -2F);
		Hidariashi2.setTextureSize(64, 32);
		Hidariashi2.mirror = true;
		setRotation(Hidariashi2, -0.5235988F, -0.3490659F, 0F);
		Shape1 = new ModelRenderer(this, 19, 21);
		Shape1.addBox(-0.5F, 0F, 0F, 1, 4, 1);
		Shape1.setRotationPoint(0F, 5F, 2F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0.6981317F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Karada.render(f5);
		Migitsubasa.render(f5);
		Hidaritsubasa.render(f5);
		Migishokkaku.render(f5);
		Hidarishokkaku.render(f5);
		Migiashi1.render(f5);
		Migiashi2.render(f5);
		Hidariashi1.render(f5);
		Hidariashi2.render(f5);
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
		/*
      kao.rotateAngleY = par4 / (180F / (float)Math.PI);
      kao.rotateAngleX = par5 / (180F / (float)Math.PI);
      zukin1.rotateAngleY = par4 / (180F / (float)Math.PI);
      zukin1.rotateAngleX = par5 / (180F / (float)Math.PI);
      zukin2.rotateAngleY = par4 / (180F / (float)Math.PI);
      zukin2.rotateAngleX = par5 / (180F / (float)Math.PI);*/
		Shape1.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		Hidaritsubasa.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.4F * par2;
		Migitsubasa.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 2.4F * par2;
		//Migitsubasa.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.4F * par2;
		//Migitsubasa.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		Migiashi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		Migiashi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		Hidariashi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		Hidariashi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		/*
      bow1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      bow4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;*/
	}

}
