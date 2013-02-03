package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.*;

public class DqmModelKirapanBike extends ModelBase
{
	//fields
	ModelRenderer kao;
	ModelRenderer hana;
	ModelRenderer hkiba;
	ModelRenderer mkiba;
	ModelRenderer hmimi;
	ModelRenderer tategami1;
	ModelRenderer tategami2;
	ModelRenderer tategami3;
	ModelRenderer tategami4;
	ModelRenderer mmasi1;
	ModelRenderer mmasi2;
	ModelRenderer mmasi3;
	ModelRenderer muasi1;
	ModelRenderer muasi2;
	ModelRenderer muasi3;
	ModelRenderer huasi1;
	ModelRenderer huasi2;
	ModelRenderer huasi3;
	ModelRenderer hmasi1;
	ModelRenderer hmasi2;
	ModelRenderer hmasi3;
	ModelRenderer sippo2;
	ModelRenderer sippo1;
	ModelRenderer mmimi;
	ModelRenderer doutai1;
	ModelRenderer doutai2;
	ModelRenderer siri;

	public DqmModelKirapanBike()
	{
		textureWidth = 128;
		textureHeight = 64;

		kao = new ModelRenderer(this, 50, 23);
		kao.addBox(-3F, -4F, -5F, 6, 7, 5);
		kao.setRotationPoint(0F, 13F, -10F);
		kao.setTextureSize(64, 32);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		hana = new ModelRenderer(this, 50, 35);
		hana.addBox(-1.5F, -1F, -7F, 3, 3, 2);
		hana.setRotationPoint(0F, 13F, -10F);
		hana.setTextureSize(64, 32);
		hana.mirror = true;
		setRotation(hana, 0F, 0F, 0F);
		hkiba = new ModelRenderer(this, 50, 40);
		hkiba.addBox(1.5F, 0F, -6.5F, 1, 5, 1);
		hkiba.setRotationPoint(0F, 13F, -10F);
		hkiba.setTextureSize(64, 32);
		hkiba.mirror = true;
		setRotation(hkiba, 0F, 0F, 0F);
		mkiba = new ModelRenderer(this, 50, 40);
		mkiba.addBox(-2.5F, 0F, -6.5F, 1, 5, 1);
		mkiba.setRotationPoint(0F, 13F, -10F);
		mkiba.setTextureSize(64, 32);
		mkiba.mirror = true;
		setRotation(mkiba, 0F, 0F, 0F);
		hmimi = new ModelRenderer(this, 72, 23);
		hmimi.addBox(2.5F, -5F, -2F, 2, 2, 1);
		hmimi.setRotationPoint(0F, 13F, -10F);
		hmimi.setTextureSize(64, 32);
		hmimi.mirror = true;
		setRotation(hmimi, 0F, 0F, 0F);
		tategami1 = new ModelRenderer(this, 0, 47);
		tategami1.addBox(-0.5F, -7F, -4F, 1, 3, 4);
		tategami1.setRotationPoint(0F, 13F, -10F);
		tategami1.setTextureSize(64, 32);
		tategami1.mirror = true;
		setRotation(tategami1, 0F, 0F, 0F);
		tategami2 = new ModelRenderer(this, 0, 39);
		tategami2.addBox(-0.5F, -7F, 0F, 1, 3, 5);
		tategami2.setRotationPoint(0F, 12F, -10F);
		tategami2.setTextureSize(64, 32);
		tategami2.mirror = true;
		setRotation(tategami2, 0F, 0F, 0F);
		tategami3 = new ModelRenderer(this, 0, 23);
		tategami3.addBox(-0.5F, -6F, 5F, 1, 3, 13);
		tategami3.setRotationPoint(0F, 12F, -10F);
		tategami3.setTextureSize(64, 32);
		tategami3.mirror = true;
		setRotation(tategami3, 0F, 0F, 0F);
		tategami4 = new ModelRenderer(this, 20, 39);
		tategami4.addBox(-0.5F, -4F, 18F, 1, 3, 3);
		tategami4.setRotationPoint(0F, 12F, -10F);
		tategami4.setTextureSize(64, 32);
		tategami4.mirror = true;
		setRotation(tategami4, 0F, 0F, 0F);
		mmasi1 = new ModelRenderer(this, 30, 23);
		mmasi1.addBox(-2.5F, 0F, -1.5F, 3, 4, 3);
		mmasi1.setRotationPoint(-4F, 15F, -7F);
		mmasi1.setTextureSize(64, 32);
		mmasi1.mirror = true;
		setRotation(mmasi1, 0F, 0F, 0F);
		mmasi2 = new ModelRenderer(this, 30, 30);
		mmasi2.addBox(-2F, 4F, -1F, 2, 4, 2);
		mmasi2.setRotationPoint(-4F, 15F, -7F);
		mmasi2.setTextureSize(64, 32);
		mmasi2.mirror = true;
		setRotation(mmasi2, 0F, 0F, 0F);
		mmasi3 = new ModelRenderer(this, 30, 36);
		mmasi3.addBox(-2.5F, 8F, -2F, 3, 1, 3);
		mmasi3.setRotationPoint(-4F, 15F, -7F);
		mmasi3.setTextureSize(64, 32);
		mmasi3.mirror = true;
		setRotation(mmasi3, 0F, 0F, 0F);
		muasi1 = new ModelRenderer(this, 30, 23);
		muasi1.addBox(-2.5F, 0F, -1.5F, 3, 4, 3);
		muasi1.setRotationPoint(-3F, 15F, 6F);
		muasi1.setTextureSize(64, 32);
		muasi1.mirror = true;
		setRotation(muasi1, 0F, 0F, 0F);
		muasi2 = new ModelRenderer(this, 30, 30);
		muasi2.addBox(-2F, 4F, -1F, 2, 4, 2);
		muasi2.setRotationPoint(-3F, 15F, 6F);
		muasi2.setTextureSize(64, 32);
		muasi2.mirror = true;
		setRotation(muasi2, 0F, 0F, 0F);
		muasi3 = new ModelRenderer(this, 30, 36);
		muasi3.addBox(-2.5F, 8F, -2F, 3, 1, 3);
		muasi3.setRotationPoint(-3F, 15F, 6F);
		muasi3.setTextureSize(64, 32);
		muasi3.mirror = true;
		setRotation(muasi3, 0F, 0F, 0F);
		huasi1 = new ModelRenderer(this, 30, 23);
		huasi1.addBox(-0.5F, 0F, -1.5F, 3, 4, 3);
		huasi1.setRotationPoint(3F, 15F, 6F);
		huasi1.setTextureSize(64, 32);
		huasi1.mirror = true;
		setRotation(huasi1, 0F, 0F, 0F);
		huasi2 = new ModelRenderer(this, 30, 30);
		huasi2.addBox(0F, 4F, -1F, 2, 4, 2);
		huasi2.setRotationPoint(3F, 15F, 6F);
		huasi2.setTextureSize(64, 32);
		huasi2.mirror = true;
		setRotation(huasi2, 0F, 0F, 0F);
		huasi3 = new ModelRenderer(this, 30, 36);
		huasi3.addBox(-0.5F, 8F, -2F, 3, 1, 3);
		huasi3.setRotationPoint(3F, 15F, 6F);
		huasi3.setTextureSize(64, 32);
		huasi3.mirror = true;
		setRotation(huasi3, 0F, 0F, 0F);
		hmasi1 = new ModelRenderer(this, 30, 23);
		hmasi1.addBox(-0.5F, 0F, -1.5F, 3, 4, 3);
		hmasi1.setRotationPoint(4F, 15F, -7F);
		hmasi1.setTextureSize(64, 32);
		hmasi1.mirror = true;
		setRotation(hmasi1, 0F, 0F, 0F);
		hmasi2 = new ModelRenderer(this, 30, 30);
		hmasi2.addBox(0F, 4F, -1F, 2, 4, 2);
		hmasi2.setRotationPoint(4F, 15F, -7F);
		hmasi2.setTextureSize(64, 32);
		hmasi2.mirror = true;
		setRotation(hmasi2, 0F, 0F, 0F);
		hmasi3 = new ModelRenderer(this, 30, 36);
		hmasi3.addBox(-0.5F, 8F, -2F, 3, 1, 3);
		hmasi3.setRotationPoint(4F, 15F, -7F);
		hmasi3.setTextureSize(64, 32);
		hmasi3.mirror = true;
		setRotation(hmasi3, 0F, 0F, 0F);
		sippo2 = new ModelRenderer(this, 80, 19);
		sippo2.addBox(-1F, -1F, 14F, 2, 2, 3);
		sippo2.setRotationPoint(0F, 14F, 11F);
		sippo2.setTextureSize(128, 64);
		sippo2.mirror = true;
		setRotation(sippo2, -0.4066927F, 0F, 0F);
		sippo1 = new ModelRenderer(this, 80, 0);
		sippo1.addBox(-0.5F, -0.5F, 0F, 1, 1, 18);
		sippo1.setRotationPoint(0F, 14F, 11F);
		sippo1.setTextureSize(128, 64);
		sippo1.mirror = true;
		setRotation(sippo1, -0.4066927F, 0F, 0F);
		mmimi = new ModelRenderer(this, 44, 23);
		mmimi.addBox(-4.5F, -5F, -2F, 2, 2, 1);
		mmimi.setRotationPoint(0F, 13F, -10F);
		mmimi.setTextureSize(64, 32);
		mmimi.mirror = true;
		setRotation(mmimi, 0F, 0F, 0F);
		doutai1 = new ModelRenderer(this, 38, 0);
		doutai1.addBox(-4F, -4F, 0F, 8, 9, 5);
		doutai1.setRotationPoint(0F, 12F, -10F);
		doutai1.setTextureSize(64, 32);
		doutai1.mirror = true;
		setRotation(doutai1, 0F, 0F, 0F);
		doutai2 = new ModelRenderer(this, 0, 0);
		doutai2.addBox(-3F, -3F, 5F, 6, 8, 13);
		doutai2.setRotationPoint(0F, 12F, -10F);
		doutai2.setTextureSize(64, 32);
		doutai2.mirror = true;
		setRotation(doutai2, 0F, 0F, 0F);
		siri = new ModelRenderer(this, 64, 0);
		siri.addBox(-2F, -1F, 18F, 4, 5, 3);
		siri.setRotationPoint(0F, 12F, -10F);
		siri.setTextureSize(64, 32);
		siri.mirror = true;
		setRotation(siri, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		kao.render(f5);
		hana.render(f5);
		hkiba.render(f5);
		mkiba.render(f5);
		hmimi.render(f5);
		tategami1.render(f5);
		tategami2.render(f5);
		tategami3.render(f5);
		tategami4.render(f5);
		mmasi1.render(f5);
		mmasi2.render(f5);
		mmasi3.render(f5);
		muasi1.render(f5);
		muasi2.render(f5);
		muasi3.render(f5);
		huasi1.render(f5);
		huasi2.render(f5);
		huasi3.render(f5);
		hmasi1.render(f5);
		hmasi2.render(f5);
		hmasi3.render(f5);
		sippo2.render(f5);
		sippo1.render(f5);
		mmimi.render(f5);
		doutai1.render(f5);
		doutai2.render(f5);
		siri.render(f5);
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
		kao.rotateAngleY = par4 / (180F / (float)Math.PI);
		kao.rotateAngleX = par5 / (180F / (float)Math.PI);
		hana.rotateAngleY = par4 / (180F / (float)Math.PI);
		hana.rotateAngleX = par5 / (180F / (float)Math.PI);
		hmimi.rotateAngleY = par4 / (180F / (float)Math.PI);
		hmimi.rotateAngleX = par5 / (180F / (float)Math.PI);
		mmimi.rotateAngleY = par4 / (180F / (float)Math.PI);
		mmimi.rotateAngleX = par5 / (180F / (float)Math.PI);
		tategami1.rotateAngleY = par4 / (180F / (float)Math.PI);
		tategami1.rotateAngleX = par5 / (180F / (float)Math.PI);
		hkiba.rotateAngleY = par4 / (180F / (float)Math.PI);
		hkiba.rotateAngleX = par5 / (180F / (float)Math.PI);
		mkiba.rotateAngleY = par4 / (180F / (float)Math.PI);
		mkiba.rotateAngleX = par5 / (180F / (float)Math.PI);
		/*
	    sippo1.rotateAngleY = par4 / (180F / (float)Math.PI);
	    sippo1.rotateAngleX = par5 / (180F / (float)Math.PI);
	    sippo2.rotateAngleY = par4 / (180F / (float)Math.PI);
	    sippo2.rotateAngleX = par5 / (180F / (float)Math.PI);
	    sippo3.rotateAngleY = par4 / (180F / (float)Math.PI);
	    sippo3.rotateAngleX = par5 / (180F / (float)Math.PI);
		 */
		 //kubi.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		 sippo1.rotateAngleY = MathHelper.cos(par1 * 0.3000F) * 1.4F * par2;
		 sippo1.rotateAngleX = MathHelper.cos(par1 * 0.3000F) * 1.4F * par2;
		 sippo2.rotateAngleY = MathHelper.cos(par1 * 0.3000F) * 1.4F * par2;
		 sippo2.rotateAngleX = MathHelper.cos(par1 * 0.3000F) * 1.4F * par2;
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
		 hmasi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		 hmasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		 hmasi3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		 muasi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		 muasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		 muasi3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		 mmasi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		 mmasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		 mmasi3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		 huasi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		 huasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		 huasi3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		 /*
	    usiromigiasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    usiromigiasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

	    migiasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    migiasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    usirohidariasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	    usirohidariasi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;*/
	}



}
