package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelMimikku extends ModelBase
{
	//fields
	ModelRenderer karada;
	ModelRenderer futa1;
	ModelRenderer futa2;
	ModelRenderer futa3;
	ModelRenderer bero;
	ModelRenderer sitamae;
	ModelRenderer sitahidari;
	ModelRenderer sitamigi;
	ModelRenderer uemae;
	ModelRenderer uehidari;
	ModelRenderer uemigi;

	public DqmModelMimikku()
	{
		textureWidth = 128;
		textureHeight = 64;

		karada = new ModelRenderer(this, 0, 0);
		karada.addBox(-10F, 0F, -7F, 20, 8, 14);
		karada.setRotationPoint(0F, 16F, 0F);
		karada.setTextureSize(128, 64);
		karada.mirror = true;
		setRotation(karada, 0F, 0F, 0F);
		futa1 = new ModelRenderer(this, 0, 22);
		futa1.addBox(-10F, -2F, -14F, 20, 2, 14);
		futa1.setRotationPoint(0F, 16F, 7F);
		futa1.setTextureSize(128, 64);
		futa1.mirror = true;
		setRotation(futa1, -0.6981317F, 0F, 0F);
		futa2 = new ModelRenderer(this, 0, 38);
		futa2.addBox(-10F, -4F, -13F, 20, 2, 12);
		futa2.setRotationPoint(0F, 16F, 7F);
		futa2.setTextureSize(128, 64);
		futa2.mirror = true;
		setRotation(futa2, -0.6981317F, 0F, 0F);
		futa3 = new ModelRenderer(this, 68, 0);
		futa3.addBox(-10F, -6F, -12F, 20, 2, 10);
		futa3.setRotationPoint(0F, 16F, 7F);
		futa3.setTextureSize(128, 64);
		futa3.mirror = true;
		setRotation(futa3, -0.6981317F, 0F, 0F);
		bero = new ModelRenderer(this, 68, 12);
		bero.addBox(-3F, 0F, -2F, 6, 9, 2);
		bero.setRotationPoint(0F, 16F, -7F);
		bero.setTextureSize(128, 64);
		bero.mirror = true;
		setRotation(bero, -0.8179294F, 0F, 0F);
		sitamae = new ModelRenderer(this, 0, 52);
		sitamae.addBox(-9F, -2F, -6F, 18, 2, 0);
		sitamae.setRotationPoint(0F, 16F, 0F);
		sitamae.setTextureSize(128, 64);
		sitamae.mirror = true;
		setRotation(sitamae, 0F, 0F, 0F);
		sitahidari = new ModelRenderer(this, 0, 42);
		sitahidari.addBox(9F, -2F, -6F, 0, 2, 12);
		sitahidari.setRotationPoint(0F, 16F, 0F);
		sitahidari.setTextureSize(128, 64);
		sitahidari.mirror = true;
		setRotation(sitahidari, 0F, 0F, 0F);
		sitamigi = new ModelRenderer(this, 0, 42);
		sitamigi.addBox(-9F, -2F, -6F, 0, 2, 12);
		sitamigi.setRotationPoint(0F, 16F, 0F);
		sitamigi.setTextureSize(128, 64);
		sitamigi.mirror = true;
		setRotation(sitamigi, 0F, 0F, 0F);
		uemae = new ModelRenderer(this, 0, 56);
		uemae.addBox(-9F, 0F, -13F, 18, 2, 0);
		uemae.setRotationPoint(0F, 16F, 7F);
		uemae.setTextureSize(128, 64);
		uemae.mirror = true;
		setRotation(uemae, -0.6981317F, 0F, 0F);
		uehidari = new ModelRenderer(this, 0, 46);
		uehidari.addBox(9F, 0F, -13F, 0, 2, 12);
		uehidari.setRotationPoint(0F, 16F, 7F);
		uehidari.setTextureSize(128, 64);
		uehidari.mirror = true;
		setRotation(uehidari, -0.6981317F, 0F, 0F);
		uemigi = new ModelRenderer(this, 0, 46);
		uemigi.addBox(-9F, 0F, -13F, 0, 2, 12);
		uemigi.setRotationPoint(0F, 16F, 7F);
		uemigi.setTextureSize(128, 64);
		uemigi.mirror = true;
		setRotation(uemigi, -0.6981317F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		karada.render(f5);
		futa1.render(f5);
		futa2.render(f5);
		futa3.render(f5);
		bero.render(f5);
		sitamae.render(f5);
		sitahidari.render(f5);
		sitamigi.render(f5);
		uemae.render(f5);
		uehidari.render(f5);
		uemigi.render(f5);
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


		//shoulder_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		futa1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		futa2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		futa3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		uemae.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		uehidari.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		uemigi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		bero.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;


	}

}
