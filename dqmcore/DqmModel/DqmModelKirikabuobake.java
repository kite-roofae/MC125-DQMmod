package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelKirikabuobake extends ModelBase
{
	//fields
	ModelRenderer karada;
	ModelRenderer hana;
	ModelRenderer soumenmigi;
	ModelRenderer syoumenhidari;
	ModelRenderer migimae;
	ModelRenderer migiusiro;
	ModelRenderer hidarimae;
	ModelRenderer hidariusiro;
	ModelRenderer senakamigi;
	ModelRenderer senakahidari;
	ModelRenderer hidarite;
	ModelRenderer migite;

	public DqmModelKirikabuobake()
	{
		textureWidth = 64;
		textureHeight = 64;

		karada = new ModelRenderer(this, 0, 0);
		karada.addBox(-8F, -8F, -8F, 16, 13, 16);
		karada.setRotationPoint(0F, 16F, 0F);
		karada.setTextureSize(64, 64);
		karada.mirror = true;
		setRotation(karada, 0F, 0F, 0F);
		hana = new ModelRenderer(this, 0, 0);
		hana.addBox(-1F, -1F, -6F, 2, 2, 6);
		hana.setRotationPoint(0F, 15F, -8F);
		hana.setTextureSize(64, 64);
		hana.mirror = true;
		setRotation(hana, 0F, 0F, 0F);
		soumenmigi = new ModelRenderer(this, 0, 29);
		soumenmigi.addBox(-1.5F, -2F, -8F, 3, 3, 8);
		soumenmigi.setRotationPoint(-5F, 20F, -7F);
		soumenmigi.setTextureSize(64, 64);
		soumenmigi.mirror = true;
		setRotation(soumenmigi, 0.4363323F, 0F, 0F);
		syoumenhidari = new ModelRenderer(this, 0, 40);
		syoumenhidari.addBox(-1.5F, -2F, -8F, 3, 3, 8);
		syoumenhidari.setRotationPoint(5F, 20F, -7F);
		syoumenhidari.setTextureSize(64, 64);
		syoumenhidari.mirror = true;
		setRotation(syoumenhidari, 0.4363323F, 0F, 0F);
		migimae = new ModelRenderer(this, 22, 29);
		migimae.addBox(-8F, -2F, -1.5F, 8, 3, 3);
		migimae.setRotationPoint(-7F, 20F, -5F);
		migimae.setTextureSize(64, 64);
		migimae.mirror = true;
		setRotation(migimae, 0F, 0F, -0.4363323F);
		migiusiro = new ModelRenderer(this, 22, 35);
		migiusiro.addBox(-8F, -2F, -1.5F, 8, 3, 3);
		migiusiro.setRotationPoint(-7F, 20F, 5F);
		migiusiro.setTextureSize(64, 64);
		migiusiro.mirror = true;
		setRotation(migiusiro, 0F, 0F, -0.4363323F);
		hidarimae = new ModelRenderer(this, 22, 41);
		hidarimae.addBox(0F, -2F, -1.5F, 8, 3, 3);
		hidarimae.setRotationPoint(7F, 20F, -5F);
		hidarimae.setTextureSize(64, 64);
		hidarimae.mirror = true;
		setRotation(hidarimae, 0F, 0F, 0.4363323F);
		hidariusiro = new ModelRenderer(this, 22, 47);
		hidariusiro.addBox(0F, -2F, -1.5F, 8, 3, 3);
		hidariusiro.setRotationPoint(7F, 20F, 5F);
		hidariusiro.setTextureSize(64, 64);
		hidariusiro.mirror = true;
		setRotation(hidariusiro, 0F, 0F, 0.4363323F);
		senakamigi = new ModelRenderer(this, 0, 53);
		senakamigi.addBox(-1.5F, -2F, 0F, 3, 3, 8);
		senakamigi.setRotationPoint(-5F, 20F, 7F);
		senakamigi.setTextureSize(64, 64);
		senakamigi.mirror = true;
		setRotation(senakamigi, -0.4363323F, 0F, 0F);
		senakahidari = new ModelRenderer(this, 22, 53);
		senakahidari.addBox(-1.5F, -2F, 0F, 3, 3, 8);
		senakahidari.setRotationPoint(5F, 20F, 7F);
		senakahidari.setTextureSize(64, 64);
		senakahidari.mirror = true;
		setRotation(senakahidari, -0.4363323F, 0F, 0F);
		hidarite = new ModelRenderer(this, 44, 29);
		hidarite.addBox(0F, -13F, 0F, 10, 16, 0);
		hidarite.setRotationPoint(8F, 10F, -5F);
		hidarite.setTextureSize(64, 64);
		hidarite.mirror = true;
		setRotation(hidarite, 0F, 0F, 0F);
		migite = new ModelRenderer(this, 44, 45);
		migite.addBox(-10F, -13F, 0F, 10, 16, 0);
		migite.setRotationPoint(-8F, 10F, -5F);
		migite.setTextureSize(64, 64);
		migite.mirror = true;
		setRotation(migite, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		karada.render(f5);
		hana.render(f5);
		soumenmigi.render(f5);
		syoumenhidari.render(f5);
		migimae.render(f5);
		migiusiro.render(f5);
		hidarimae.render(f5);
		hidariusiro.render(f5);
		senakamigi.render(f5);
		senakahidari.render(f5);
		hidarite.render(f5);
		migite.render(f5);
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

		soumenmigi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		syoumenhidari.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		migimae.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		migiusiro.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		hidarimae.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		hidariusiro.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		senakamigi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		senakahidari.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		/*
	  soumenmigi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	  syoumenhidari.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	  migimae.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  migiusiro.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  hidarimae.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	  hidariusiro.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	  senakamigi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  senakahidari.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		 */


		hidarite.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		migite.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;


	}

}
