package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelKimera extends ModelBase
{
	//fields
	ModelRenderer tosaka;
	ModelRenderer kao;
	ModelRenderer kuti_ue;
	ModelRenderer kuti_sita;
	ModelRenderer kubiwa;
	ModelRenderer karada_ue;
	ModelRenderer karada_sita;
	ModelRenderer hane_migi;
	ModelRenderer hane_hidari;
	ModelRenderer sippo;

	public DqmModelKimera()
	{
		textureWidth = 128;
		textureHeight = 64;

		tosaka = new ModelRenderer(this, 50, 0);
		tosaka.addBox(-1.5F, -8F, -4F, 3, 2, 4);
		tosaka.setRotationPoint(0F, 0F, 0F);
		tosaka.setTextureSize(128, 64);
		tosaka.mirror = true;
		setRotation(tosaka, 0F, 0F, 0F);
		kao = new ModelRenderer(this, 46, 7);
		kao.addBox(-3F, -6F, -6F, 6, 6, 6);
		kao.setRotationPoint(0F, 0F, 0F);
		kao.setTextureSize(128, 64);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		kuti_ue = new ModelRenderer(this, 46, 20);
		kuti_ue.addBox(-2F, -2F, -15F, 4, 1, 8);
		kuti_ue.setRotationPoint(0F, 0F, 0F);
		kuti_ue.setTextureSize(128, 64);
		kuti_ue.mirror = true;
		setRotation(kuti_ue, 0F, 0F, 0F);
		kuti_sita = new ModelRenderer(this, 46, 30);
		kuti_sita.addBox(-2F, -2F, -15F, 4, 1, 8);
		kuti_sita.setRotationPoint(0F, 0F, 0F);
		kuti_sita.setTextureSize(128, 64);
		kuti_sita.mirror = true;
		setRotation(kuti_sita, 0.2230717F, 0F, 0F);
		kubiwa = new ModelRenderer(this, 0, 14);
		kubiwa.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
		kubiwa.setRotationPoint(0F, 1F, 0F);
		kubiwa.setTextureSize(128, 64);
		kubiwa.mirror = true;
		setRotation(kubiwa, 0.3717861F, 0F, 0F);
		karada_ue = new ModelRenderer(this, 0, 22);
		karada_ue.addBox(-2F, 0F, -2F, 4, 8, 4);
		karada_ue.setRotationPoint(0F, 0F, 0F);
		karada_ue.setTextureSize(128, 64);
		karada_ue.mirror = true;
		setRotation(karada_ue, 0.3717861F, 0F, 0F);
		karada_sita = new ModelRenderer(this, 0, 35);
		karada_sita.addBox(-3.5F, 7F, -0.5F, 7, 8, 7);
		karada_sita.setRotationPoint(0F, 0F, 0F);
		karada_sita.setTextureSize(128, 64);
		karada_sita.mirror = true;
		setRotation(karada_sita, 0F, 0F, 0F);
		hane_migi = new ModelRenderer(this, 23, 0);
		hane_migi.addBox(-11F, -12F, 0F, 11, 14, 0);
		hane_migi.setRotationPoint(-2F, 2F, 3F);
		hane_migi.setTextureSize(128, 64);
		hane_migi.mirror = true;
		setRotation(hane_migi, 0.2230717F, 0.9294653F, 0F);
		hane_hidari = new ModelRenderer(this, 0, 0);
		hane_hidari.addBox(0F, -12F, 0F, 11, 14, 0);
		hane_hidari.setRotationPoint(2F, 2F, 3F);
		hane_hidari.setTextureSize(128, 64);
		hane_hidari.mirror = true;
		setRotation(hane_hidari, 0.2230705F, -0.9294576F, 0F);
		sippo = new ModelRenderer(this, 0, 51);
		sippo.addBox(-3F, 4F, -12.5F, 6, 4, 9);
		sippo.setRotationPoint(0F, 9F, 0F);
		sippo.setTextureSize(128, 64);
		sippo.mirror = true;
		setRotation(sippo, 0.5205006F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		tosaka.render(f5);
		kao.render(f5);
		kuti_ue.render(f5);
		kuti_sita.render(f5);
		kubiwa.render(f5);
		karada_ue.render(f5);
		karada_sita.render(f5);
		hane_migi.render(f5);
		hane_hidari.render(f5);
		sippo.render(f5);
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
		//super.setRotationAngles(f, f1, f2, f3, f4, f5);
		kao.rotateAngleY = par4 / (180F / (float)Math.PI);
		kao.rotateAngleX = par5 / (180F / (float)Math.PI);
		tosaka.rotateAngleY = par4 / (180F / (float)Math.PI);
		tosaka.rotateAngleX = par5 / (180F / (float)Math.PI);
		kuti_ue.rotateAngleY = par4 / (180F / (float)Math.PI);
		kuti_ue.rotateAngleX = par5 / (180F / (float)Math.PI);
		kuti_sita.rotateAngleY = par4 / (180F / (float)Math.PI);
		kuti_sita.rotateAngleX = par5 / (180F / (float)Math.PI);
		//hane_migi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//hane_hidari.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		/*
    hidari_tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
    hidari_tuno.rotateAngleX = par5 / (180F / (float)Math.PI);
    migi_tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
    migi_tuno.rotateAngleX = par5 / (180F / (float)Math.PI);*/
	}

}
