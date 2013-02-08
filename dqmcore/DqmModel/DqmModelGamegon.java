package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelGamegon extends ModelBase
{
  //fields
    ModelRenderer k1;
    ModelRenderer k2;
    ModelRenderer k3;
    ModelRenderer k4;
    ModelRenderer k5;
    ModelRenderer k6;
    ModelRenderer k7;
    ModelRenderer mu1;
    ModelRenderer mu2;
    ModelRenderer mm1;
    ModelRenderer mm2;
    ModelRenderer hm1;
    ModelRenderer hm2;
    ModelRenderer hu1;
    ModelRenderer hu2;
    ModelRenderer s1;
    ModelRenderer s2;
    ModelRenderer z2;
    ModelRenderer z3;
    ModelRenderer z4;
    ModelRenderer z5;
    ModelRenderer z6;
    ModelRenderer z7;
    ModelRenderer z8;
    ModelRenderer z9;
    ModelRenderer z10;
    ModelRenderer z11;
    ModelRenderer z12;

  public DqmModelGamegon()
  {
    textureWidth = 256;
    textureHeight = 128;

      k1 = new ModelRenderer(this, 0, 0);
      k1.addBox(-2F, 0F, -20F, 4, 3, 6);
      k1.setRotationPoint(0F, 15F, -3F);
      k1.setTextureSize(256, 128);
      k1.mirror = true;
      setRotation(k1, 0F, 0F, 0F);
      k2 = new ModelRenderer(this, 0, 9);
      k2.addBox(-3F, -3F, -14F, 6, 6, 6);
      k2.setRotationPoint(0F, 15F, -3F);
      k2.setTextureSize(256, 128);
      k2.mirror = true;
      setRotation(k2, 0F, 0F, 0F);
      k3 = new ModelRenderer(this, 165, -5);
      k3.addBox(-10F, -4F, -7F, 0, 8, 5);
      k3.setRotationPoint(0F, 15F, -3F);
      k3.setTextureSize(256, 128);
      k3.mirror = true;
      setRotation(k3, 0F, -0.7435722F, 0F);
      k4 = new ModelRenderer(this, 154, -5);
      k4.addBox(10F, -4F, -7F, 0, 8, 5);
      k4.setRotationPoint(0F, 15F, -3F);
      k4.setTextureSize(256, 128);
      k4.mirror = true;
      setRotation(k4, 0F, 0.7435103F, 0F);
      k5 = new ModelRenderer(this, 158, 21);
      k5.addBox(-3F, -9F, -8F, 2, 1, 6);
      k5.setRotationPoint(0F, 15F, -3F);
      k5.setTextureSize(256, 128);
      k5.mirror = true;
      setRotation(k5, 0.5576792F, 0F, 0F);
      k6 = new ModelRenderer(this, 158, 14);
      k6.addBox(1F, -9F, -8F, 2, 1, 6);
      k6.setRotationPoint(0F, 15F, -3F);
      k6.setTextureSize(256, 128);
      k6.mirror = true;
      setRotation(k6, 0.5576792F, 0F, 0F);
      k7 = new ModelRenderer(this, 0, 35);
      k7.addBox(-2F, -2F, -8F, 4, 4, 8);
      k7.setRotationPoint(0F, 15F, -3F);
      k7.setTextureSize(256, 128);
      k7.mirror = true;
      setRotation(k7, 0F, 0F, 0F);
      mu1 = new ModelRenderer(this, 0, 61);
      mu1.addBox(-4F, 5F, -6F, 4, 2, 4);
      mu1.setRotationPoint(-8F, 17F, 20F);
      mu1.setTextureSize(256, 128);
      mu1.mirror = true;
      setRotation(mu1, 0F, 0F, 0F);
      mu2 = new ModelRenderer(this, 0, 48);
      mu2.addBox(-4F, -2F, -2F, 4, 9, 4);
      mu2.setRotationPoint(-8F, 17F, 20F);
      mu2.setTextureSize(256, 128);
      mu2.mirror = true;
      setRotation(mu2, 0F, 0F, 0F);
      mm1 = new ModelRenderer(this, 0, 48);
      mm1.addBox(-4F, -2F, -2F, 4, 9, 4);
      mm1.setRotationPoint(-8F, 17F, 0F);
      mm1.setTextureSize(256, 128);
      mm1.mirror = true;
      setRotation(mm1, 0F, 0F, 0F);
      mm2 = new ModelRenderer(this, 0, 61);
      mm2.addBox(-4F, 5F, -6F, 4, 2, 4);
      mm2.setRotationPoint(-8F, 17F, 0F);
      mm2.setTextureSize(256, 128);
      mm2.mirror = true;
      setRotation(mm2, 0F, 0F, 0F);
      hm1 = new ModelRenderer(this, 0, 48);
      hm1.addBox(0F, -2F, -2F, 4, 9, 4);
      hm1.setRotationPoint(8F, 17F, 0F);
      hm1.setTextureSize(256, 128);
      hm1.mirror = true;
      setRotation(hm1, 0F, 0F, 0F);
      hm2 = new ModelRenderer(this, 0, 61);
      hm2.addBox(0F, 5F, -6F, 4, 2, 4);
      hm2.setRotationPoint(8F, 17F, 0F);
      hm2.setTextureSize(256, 128);
      hm2.mirror = true;
      setRotation(hm2, 0F, 0F, 0F);
      hu1 = new ModelRenderer(this, 0, 48);
      hu1.addBox(0F, -2F, -2F, 4, 9, 4);
      hu1.setRotationPoint(8F, 17F, 20F);
      hu1.setTextureSize(256, 128);
      hu1.mirror = true;
      setRotation(hu1, 0F, 0F, 0F);
      hu2 = new ModelRenderer(this, 0, 61);
      hu2.addBox(0F, 5F, -6F, 4, 2, 4);
      hu2.setRotationPoint(8F, 17F, 20F);
      hu2.setTextureSize(256, 128);
      hu2.mirror = true;
      setRotation(hu2, 0F, 0F, 0F);
      s1 = new ModelRenderer(this, 20, 22);
      s1.addBox(-1F, -1F, 9F, 2, 2, 8);
      s1.setRotationPoint(0F, 17F, 20F);
      s1.setTextureSize(256, 128);
      s1.mirror = true;
      setRotation(s1, 0F, 0F, 0F);
      s2 = new ModelRenderer(this, 0, 22);
      s2.addBox(-1.5F, -1.5F, 2F, 3, 3, 7);
      s2.setRotationPoint(0F, 17F, 20F);
      s2.setTextureSize(256, 128);
      s2.mirror = true;
      setRotation(s2, 0F, 0F, 0F);
      z2 = new ModelRenderer(this, 50, 23);
      z2.addBox(-7F, -10F, 9F, 14, 1, 12);
      z2.setRotationPoint(0F, 19F, -5F);
      z2.setTextureSize(256, 128);
      z2.mirror = true;
      setRotation(z2, 0F, 0F, 0F);
      z3 = new ModelRenderer(this, 50, 100);
      z3.addBox(-10F, -7F, 5F, 20, 7, 20);
      z3.setRotationPoint(0F, 19F, -5F);
      z3.setTextureSize(256, 128);
      z3.mirror = true;
      setRotation(z3, 0F, 0F, 0F);
      z4 = new ModelRenderer(this, 27, 88);
      z4.addBox(-8F, -7F, 23F, 16, 7, 5);
      z4.setRotationPoint(0F, 19F, -5F);
      z4.setTextureSize(256, 128);
      z4.mirror = true;
      setRotation(z4, 0F, 0F, 0F);
      z5 = new ModelRenderer(this, 50, 40);
      z5.addBox(-8F, -9F, 7F, 16, 1, 16);
      z5.setRotationPoint(0F, 19F, -5F);
      z5.setTextureSize(256, 128);
      z5.mirror = true;
      setRotation(z5, 0F, 0F, 0F);
      z6 = new ModelRenderer(this, 50, 68);
      z6.addBox(-9F, -8F, 6F, 18, 1, 18);
      z6.setRotationPoint(0F, 19F, -5F);
      z6.setTextureSize(256, 128);
      z6.mirror = true;
      setRotation(z6, 0F, 0F, 0F);
      z7 = new ModelRenderer(this, 25, 100);
      z7.addBox(-8F, -7F, 2F, 16, 7, 6);
      z7.setRotationPoint(0F, 19F, -6F);
      z7.setTextureSize(256, 128);
      z7.mirror = true;
      setRotation(z7, 0F, 0F, 0F);
      z8 = new ModelRenderer(this, 34, 70);
      z8.addBox(-7F, -8F, 4F, 14, 1, 2);
      z8.setRotationPoint(0F, 19F, -5F);
      z8.setTextureSize(256, 128);
      z8.mirror = true;
      setRotation(z8, 0F, 0F, 0F);
      z9 = new ModelRenderer(this, 103, 41);
      z9.addBox(-6F, -9F, 6F, 12, 1, 1);
      z9.setRotationPoint(0F, 19F, -5F);
      z9.setTextureSize(256, 128);
      z9.mirror = true;
      setRotation(z9, 0F, 0F, 0F);
      z10 = new ModelRenderer(this, 34, 73);
      z10.addBox(-7F, -8F, 24F, 14, 1, 2);
      z10.setRotationPoint(0F, 19F, -5F);
      z10.setTextureSize(256, 128);
      z10.mirror = true;
      setRotation(z10, 0F, 0F, 0F);
      z11 = new ModelRenderer(this, 103, 43);
      z11.addBox(-6F, -9F, 23F, 12, 1, 1);
      z11.setRotationPoint(0F, 19F, -5F);
      z11.setTextureSize(256, 128);
      z11.mirror = true;
      setRotation(z11, 0F, 0F, 0F);
      z12 = new ModelRenderer(this, 64, 0);
      z12.addBox(-7F, 0F, 1F, 14, 1, 18);
      z12.setRotationPoint(0F, 19F, 0F);
      z12.setTextureSize(256, 128);
      z12.mirror = true;
      setRotation(z12, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    k1.render(f5);
    k2.render(f5);
    k3.render(f5);
    k4.render(f5);
    k5.render(f5);
    k6.render(f5);
    k7.render(f5);
    mu1.render(f5);
    mu2.render(f5);
    mm1.render(f5);
    mm2.render(f5);
    hm1.render(f5);
    hm2.render(f5);
    hu1.render(f5);
    hu2.render(f5);
    s1.render(f5);
    s2.render(f5);
    z2.render(f5);
    z3.render(f5);
    z4.render(f5);
    z5.render(f5);
    z6.render(f5);
    z7.render(f5);
    z8.render(f5);
    z9.render(f5);
    z10.render(f5);
    z11.render(f5);
    z12.render(f5);
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
		k1.rotateAngleY = par4 / (180F / (float)Math.PI);
		k2.rotateAngleY = par4 / (180F / (float)Math.PI);
		k3.rotateAngleY = par4 / (180F / (float)Math.PI);
		k4.rotateAngleY = par4 / (180F / (float)Math.PI);
		k5.rotateAngleY = par4 / (180F / (float)Math.PI);
		k6.rotateAngleY = par4 / (180F / (float)Math.PI);
		k7.rotateAngleY = par4 / (180F / (float)Math.PI);


		mm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		mm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		hu1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		hu2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;


		mu1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		mu2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		hm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		hm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;

		s1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		s2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		s1.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		s2.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;


	}

}
