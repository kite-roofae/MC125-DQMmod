package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelRiripat extends ModelBase
{
	//fields
	ModelRenderer zukin1;
	ModelRenderer kao;
	ModelRenderer kubi;
	ModelRenderer karada_ue;
	ModelRenderer karada_naka;
	ModelRenderer karada_sita;
	ModelRenderer ude1;
	ModelRenderer te1;
	ModelRenderer ude2;
	ModelRenderer asi1;
	ModelRenderer asi2;
	ModelRenderer zukin2;
	ModelRenderer te2;
	ModelRenderer bow1;
	ModelRenderer bow2;
	ModelRenderer bow3;
	ModelRenderer bow4;

	public DqmModelRiripat()
	{
		textureWidth = 128;
		textureHeight = 64;

		zukin1 = new ModelRenderer(this, 41, 0);
		zukin1.addBox(-3F, -10F, -1F, 6, 6, 6);
		zukin1.setRotationPoint(0F, 4F, 0F);
		zukin1.setTextureSize(128, 64);
		zukin1.mirror = true;
		setRotation(zukin1, 0F, 0F, 0F);
		kao = new ModelRenderer(this, 70, 17);
		kao.addBox(-3F, -6F, -3F, 6, 6, 6);
		kao.setRotationPoint(0F, 4F, -2F);
		kao.setTextureSize(128, 64);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		kubi = new ModelRenderer(this, 76, 30);
		kubi.addBox(-1.5F, -3F, -1.5F, 3, 3, 3);
		kubi.setRotationPoint(0F, 6F, 0F);
		kubi.setTextureSize(128, 64);
		kubi.mirror = true;
		setRotation(kubi, 0F, 0F, 0F);
		karada_ue = new ModelRenderer(this, 0, 7);
		karada_ue.addBox(-5F, 0F, -4F, 10, 7, 8);
		karada_ue.setRotationPoint(0F, 5F, 0F);
		karada_ue.setTextureSize(128, 64);
		karada_ue.mirror = true;
		setRotation(karada_ue, 0F, 0F, 0F);
		karada_naka = new ModelRenderer(this, 0, 23);
		karada_naka.addBox(-6F, 0F, -4.5F, 12, 7, 9);
		karada_naka.setRotationPoint(0F, 12F, 0F);
		karada_naka.setTextureSize(128, 64);
		karada_naka.mirror = true;
		setRotation(karada_naka, 0F, 0F, 0F);
		karada_sita = new ModelRenderer(this, 0, 40);
		karada_sita.addBox(-7F, 0F, -5.5F, 14, 4, 11);
		karada_sita.setRotationPoint(0F, 19F, 0F);
		karada_sita.setTextureSize(128, 64);
		karada_sita.mirror = true;
		setRotation(karada_sita, 0F, 0F, 0F);
		ude1 = new ModelRenderer(this, 96, 17);
		ude1.addBox(0F, 0F, -2F, 4, 7, 4);
		ude1.setRotationPoint(5F, 7F, 0F);
		ude1.setTextureSize(128, 64);
		ude1.mirror = true;
		setRotation(ude1, 0F, 0F, 0F);
		te1 = new ModelRenderer(this, 100, 29);
		te1.addBox(1F, 7F, -1F, 2, 2, 2);
		te1.setRotationPoint(5F, 7F, 0F);
		te1.setTextureSize(128, 64);
		te1.mirror = true;
		setRotation(te1, 0F, 0F, 0F);
		ude2 = new ModelRenderer(this, 52, 17);
		ude2.addBox(-4F, 0F, -2F, 4, 7, 4);
		ude2.setRotationPoint(-5F, 7F, 0F);
		ude2.setTextureSize(128, 64);
		ude2.mirror = true;
		setRotation(ude2, 0F, 0F, 0F);
		asi1 = new ModelRenderer(this, 28, 56);
		asi1.addBox(-2F, 0F, -6F, 5, 2, 6);
		asi1.setRotationPoint(3F, 22F, -3F);
		asi1.setTextureSize(128, 64);
		asi1.mirror = true;
		setRotation(asi1, 0F, 0F, 0F);
		asi2 = new ModelRenderer(this, 0, 56);
		asi2.addBox(-2F, 0F, -6F, 5, 2, 6);
		asi2.setRotationPoint(-4F, 22F, -3F);
		asi2.setTextureSize(128, 64);
		asi2.mirror = true;
		setRotation(asi2, 0F, 0F, 0F);
		zukin2 = new ModelRenderer(this, 66, 0);
		zukin2.addBox(-4F, -8F, -4F, 8, 8, 8);
		zukin2.setRotationPoint(0F, 4F, 0F);
		zukin2.setTextureSize(128, 64);
		zukin2.mirror = true;
		setRotation(zukin2, 0F, 0F, 0F);
		te2 = new ModelRenderer(this, 56, 29);
		te2.addBox(-3F, 7F, -1F, 2, 2, 2);
		te2.setRotationPoint(-5F, 7F, 0F);
		te2.setTextureSize(128, 64);
		te2.mirror = true;
		setRotation(te2, 0F, 0F, 0F);
		bow1 = new ModelRenderer(this, 54, 37);
		bow1.addBox(-3F, 7F, -5F, 1, 1, 10);
		bow1.setRotationPoint(-5F, 7F, 0F);
		bow1.setTextureSize(128, 64);
		bow1.mirror = true;
		setRotation(bow1, 0F, 0F, 0F);
		bow2 = new ModelRenderer(this, 54, 48);
		bow2.addBox(-3F, 8F, -4F, 1, 1, 8);
		bow2.setRotationPoint(-5F, 7F, 0F);
		bow2.setTextureSize(128, 64);
		bow2.mirror = true;
		setRotation(bow2, 0F, 0F, 0F);
		bow3 = new ModelRenderer(this, 54, 57);
		bow3.addBox(-3F, 9F, -3F, 1, 1, 6);
		bow3.setRotationPoint(-5F, 7F, 0F);
		bow3.setTextureSize(128, 64);
		bow3.mirror = true;
		setRotation(bow3, 0F, 0F, 0F);
		bow4 = new ModelRenderer(this, 68, 59);
		bow4.addBox(-3F, 10F, -2F, 1, 1, 4);
		bow4.setRotationPoint(-5F, 7F, 0F);
		bow4.setTextureSize(128, 64);
		bow4.mirror = true;
		setRotation(bow4, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		zukin1.render(f5);
		kao.render(f5);
		kubi.render(f5);
		karada_ue.render(f5);
		karada_naka.render(f5);
		karada_sita.render(f5);
		ude1.render(f5);
		te1.render(f5);
		ude2.render(f5);
		asi1.render(f5);
		asi2.render(f5);
		zukin2.render(f5);
		te2.render(f5);
		bow1.render(f5);
		bow2.render(f5);
		bow3.render(f5);
		bow4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}





	/**
	 * Sets the models various rotation angles.
	 */
	 @Override
	 public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
	{
		kao.rotateAngleY = par4 / (180F / (float)Math.PI);
		kao.rotateAngleX = par5 / (180F / (float)Math.PI);
		zukin1.rotateAngleY = par4 / (180F / (float)Math.PI);
		zukin1.rotateAngleX = par5 / (180F / (float)Math.PI);
		zukin2.rotateAngleY = par4 / (180F / (float)Math.PI);
		zukin2.rotateAngleX = par5 / (180F / (float)Math.PI);
		asi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		asi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		ude1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		ude2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		te1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		te2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		bow1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		bow2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		bow3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		bow4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	}


}
