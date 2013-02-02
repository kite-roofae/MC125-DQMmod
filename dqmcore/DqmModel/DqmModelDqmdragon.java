package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelDqmdragon extends ModelBase
{
	// public boolean isAttacking;
	//fields
	ModelRenderer kuti;
	ModelRenderer kao;
	ModelRenderer kaohire1;
	ModelRenderer kaohire2;
	ModelRenderer migi_tuno;
	ModelRenderer hidari_tuno;
	ModelRenderer kubi;
	ModelRenderer karada1;
	ModelRenderer karada2;
	ModelRenderer karada3;
	ModelRenderer sippo1;
	ModelRenderer sippo2;
	ModelRenderer sippo3;
	ModelRenderer hidariasi2;
	ModelRenderer migiasi2;
	ModelRenderer usiromigiasi2;
	ModelRenderer usirohidariasi2;
	ModelRenderer hire;
	ModelRenderer migiasi;
	ModelRenderer hidariasi;
	ModelRenderer usirohidariasi;
	ModelRenderer usiromigiasi;

	public DqmModelDqmdragon()
	{
		textureWidth = 128;
		textureHeight = 64;

		kuti = new ModelRenderer(this, 0, 7);
		kuti.addBox(-2F, 0F, -12F, 4, 3, 6);
		kuti.setRotationPoint(0F, 20F, -14F);
		kuti.setTextureSize(128, 64);
		kuti.mirror = true;
		setRotation(kuti, 0F, 0F, 0F);
		kao = new ModelRenderer(this, 0, 16);
		kao.addBox(-3F, -3F, -6F, 6, 6, 6);
		kao.setRotationPoint(0F, 20F, -14F);
		kao.setTextureSize(128, 64);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		kaohire1 = new ModelRenderer(this, 110, 11);
		kaohire1.addBox(0F, -4F, 0F, 0, 8, 5);
		kaohire1.setRotationPoint(-3F, 19F, -14F);
		kaohire1.setTextureSize(128, 64);
		kaohire1.mirror = true;
		setRotation(kaohire1, 0F, -0.7435722F, 0F);
		kaohire2 = new ModelRenderer(this, 100, 11);
		kaohire2.addBox(0F, -4F, 0F, 0, 8, 5);
		kaohire2.setRotationPoint(3F, 19F, -14F);
		kaohire2.setTextureSize(128, 64);
		kaohire2.mirror = true;
		setRotation(kaohire2, 0F, 0.7435103F, 0F);
		migi_tuno = new ModelRenderer(this, 24, 16);
		migi_tuno.addBox(-3F, -3F, 1F, 2, 1, 6);
		migi_tuno.setRotationPoint(0F, 20F, -14F);
		migi_tuno.setTextureSize(128, 64);
		migi_tuno.mirror = true;
		setRotation(migi_tuno, 0.5576792F, 0F, 0F);
		hidari_tuno = new ModelRenderer(this, 24, 9);
		hidari_tuno.addBox(1F, -3F, 1F, 2, 1, 6);
		hidari_tuno.setRotationPoint(0F, 20F, -14F);
		hidari_tuno.setTextureSize(128, 64);
		hidari_tuno.mirror = true;
		setRotation(hidari_tuno, 0.5576792F, 0F, 0F);
		kubi = new ModelRenderer(this, 0, 28);
		kubi.addBox(-2F, -2F, 1F, 4, 4, 8);
		kubi.setRotationPoint(0F, 20F, -15F);
		kubi.setTextureSize(128, 64);
		kubi.mirror = true;
		setRotation(kubi, 0.2602503F, 0F, 0F);
		karada1 = new ModelRenderer(this, 50, 17);
		karada1.addBox(-3F, -3F, 0F, 6, 6, 8);
		karada1.setRotationPoint(0F, 18F, -7F);
		karada1.setTextureSize(128, 64);
		karada1.mirror = true;
		setRotation(karada1, 0.2602503F, 0F, 0F);
		karada2 = new ModelRenderer(this, 50, 31);
		karada2.addBox(-4F, -4F, 0F, 8, 8, 8);
		karada2.setRotationPoint(0F, 16F, 0F);
		karada2.setTextureSize(128, 64);
		karada2.mirror = true;
		setRotation(karada2, 0.2602503F, 0F, 0F);
		karada3 = new ModelRenderer(this, 50, 47);
		karada3.addBox(-4F, -4F, 0F, 8, 8, 9);
		karada3.setRotationPoint(0F, 14F, 7F);
		karada3.setTextureSize(128, 64);
		karada3.mirror = true;
		setRotation(karada3, 0F, 0F, 0F);
		sippo1 = new ModelRenderer(this, 97, 26);
		sippo1.addBox(-3F, -3F, 0F, 6, 6, 8);
		sippo1.setRotationPoint(0F, 14F, 16F);
		sippo1.setTextureSize(128, 64);
		sippo1.mirror = true;
		setRotation(sippo1, 0F, 0F, 0F);
		sippo2 = new ModelRenderer(this, 97, 40);
		sippo2.addBox(-2F, -2F, 0F, 4, 4, 8);
		sippo2.setRotationPoint(0F, 14F, 24F);
		sippo2.setTextureSize(128, 64);
		sippo2.mirror = true;
		setRotation(sippo2, 0F, 0F, 0F);
		sippo3 = new ModelRenderer(this, 97, 52);
		sippo3.addBox(-1F, -1F, 0F, 2, 2, 10);
		sippo3.setRotationPoint(0F, 14F, 32F);
		sippo3.setTextureSize(128, 64);
		sippo3.mirror = true;
		setRotation(sippo3, 0F, 0F, 0F);
		hidariasi2 = new ModelRenderer(this, 42, 0);
		hidariasi2.addBox(-2F, 5F, -4F, 4, 1, 5);
		hidariasi2.setRotationPoint(3F, 18F, 0F);
		hidariasi2.setTextureSize(128, 64);
		hidariasi2.mirror = true;
		setRotation(hidariasi2, 0F, 0F, 0F);
		migiasi2 = new ModelRenderer(this, 42, 0);
		migiasi2.addBox(-2F, 5F, -4F, 4, 1, 5);
		migiasi2.setRotationPoint(-3F, 18F, 0F);
		migiasi2.setTextureSize(128, 64);
		migiasi2.mirror = true;
		setRotation(migiasi2, 0F, 0F, 0F);
		usiromigiasi2 = new ModelRenderer(this, 42, 0);
		usiromigiasi2.addBox(-2F, 5F, -4F, 4, 1, 5);
		usiromigiasi2.setRotationPoint(-3F, 18F, 8F);
		usiromigiasi2.setTextureSize(128, 64);
		usiromigiasi2.mirror = true;
		setRotation(usiromigiasi2, 0F, 0F, 0F);
		usirohidariasi2 = new ModelRenderer(this, 42, 0);
		usirohidariasi2.addBox(-2F, 5F, -4F, 4, 1, 5);
		usirohidariasi2.setRotationPoint(3F, 18F, 8F);
		usirohidariasi2.setTextureSize(128, 64);
		usirohidariasi2.mirror = true;
		setRotation(usirohidariasi2, 0F, 0F, 0F);
		hire = new ModelRenderer(this, 0, 40);
		hire.addBox(0F, 0F, 0F, 0, 5, 19);
		hire.setRotationPoint(0F, 9F, -3F);
		hire.setTextureSize(128, 64);
		hire.mirror = true;
		setRotation(hire, 0F, 0F, 0F);
		migiasi = new ModelRenderer(this, 60, 0);
		migiasi.addBox(-1F, 0F, -1F, 2, 6, 2);
		migiasi.setRotationPoint(-3F, 18F, 0F);
		migiasi.setTextureSize(128, 64);
		migiasi.mirror = true;
		setRotation(migiasi, 0F, 0F, 0F);
		hidariasi = new ModelRenderer(this, 60, 0);
		hidariasi.addBox(-1F, 0F, -1F, 2, 6, 2);
		hidariasi.setRotationPoint(3F, 18F, 0F);
		hidariasi.setTextureSize(128, 64);
		hidariasi.mirror = true;
		setRotation(hidariasi, 0F, 0F, 0F);
		usirohidariasi = new ModelRenderer(this, 60, 0);
		usirohidariasi.addBox(-1F, 0F, -1F, 2, 6, 2);
		usirohidariasi.setRotationPoint(3F, 18F, 8F);
		usirohidariasi.setTextureSize(128, 64);
		usirohidariasi.mirror = true;
		setRotation(usirohidariasi, 0F, 0F, 0F);
		usiromigiasi = new ModelRenderer(this, 60, 0);
		usiromigiasi.addBox(-1F, 0F, -1F, 2, 6, 2);
		usiromigiasi.setRotationPoint(-3F, 18F, 8F);
		usiromigiasi.setTextureSize(128, 64);
		usiromigiasi.mirror = true;
		setRotation(usiromigiasi, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		kuti.render(f5);
		kao.render(f5);
		kaohire1.render(f5);
		kaohire2.render(f5);
		migi_tuno.render(f5);
		hidari_tuno.render(f5);
		kubi.render(f5);
		karada1.render(f5);
		karada2.render(f5);
		karada3.render(f5);
		sippo1.render(f5);
		sippo2.render(f5);
		sippo3.render(f5);
		hidariasi2.render(f5);
		migiasi2.render(f5);
		usiromigiasi2.render(f5);
		usirohidariasi2.render(f5);
		hire.render(f5);
		migiasi.render(f5);
		hidariasi.render(f5);
		usirohidariasi.render(f5);
		usiromigiasi.render(f5);
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
		kuti.rotateAngleY = par4 / (180F / (float)Math.PI);
		kuti.rotateAngleX = par5 / (180F / (float)Math.PI);
		kaohire1.rotateAngleY = par4 / (180F / (float)Math.PI);
		kaohire1.rotateAngleX = par5 / (180F / (float)Math.PI);
		kaohire2.rotateAngleY = par4 / (180F / (float)Math.PI);
		kaohire2.rotateAngleX = par5 / (180F / (float)Math.PI);
		hidari_tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
		hidari_tuno.rotateAngleX = par5 / (180F / (float)Math.PI);
		migi_tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
		migi_tuno.rotateAngleX = par5 / (180F / (float)Math.PI);
		/*
    sippo1.rotateAngleY = par4 / (180F / (float)Math.PI);
    sippo1.rotateAngleX = par5 / (180F / (float)Math.PI);
    sippo2.rotateAngleY = par4 / (180F / (float)Math.PI);
    sippo2.rotateAngleX = par5 / (180F / (float)Math.PI);
    sippo3.rotateAngleY = par4 / (180F / (float)Math.PI);
    sippo3.rotateAngleX = par5 / (180F / (float)Math.PI);
		 */
		//kubi.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		sippo3.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		sippo3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		/*
    hidariasi.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    hidariasi2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    usiromigiasi.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    usiromigiasi2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    migiasi.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    migiasi2.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    usirohidariasi.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    usirohidariasi2.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		 */
		hidariasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		hidariasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		usiromigiasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		usiromigiasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		migiasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		migiasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		usirohidariasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		usirohidariasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		/*
    hidariasitume1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    hidariasitume2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    hidariasitume3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    migiasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    usirohidariasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    usirohidariasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    te1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    te2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    bow1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    bow2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    bow3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    bow4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;*/
		/*if (isAttacking)
    {
        float f2 = 1.0F;
        kuti.rotationPointY -= f2 * 5F;
        kao.rotationPointY -= f2 * 5F;
    }*/
	}

}
