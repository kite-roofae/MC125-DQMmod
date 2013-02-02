package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelZoma extends ModelBase
{
  //fields
    ModelRenderer k1;
    ModelRenderer k2;
    ModelRenderer k3;
    ModelRenderer a1;
    ModelRenderer a2;
    ModelRenderer a3;
    ModelRenderer a4;
    ModelRenderer a5;
    ModelRenderer ht1;
    ModelRenderer k4;
    ModelRenderer mt1;
    ModelRenderer mt2;
    ModelRenderer ht2;
    ModelRenderer k5;
    ModelRenderer k6;
    ModelRenderer k7;
    ModelRenderer k8;
    ModelRenderer k9;
    ModelRenderer a6;
    ModelRenderer k10;
    ModelRenderer k11;
    ModelRenderer ha1;
    ModelRenderer ma1;

  public DqmModelZoma()
  {
    textureWidth = 256;
    textureHeight = 128;

      k1 = new ModelRenderer(this, 142, 83);
      k1.addBox(-1F, 0F, -6F, 2, 33, 12);
      k1.setRotationPoint(12F, -11F, -1F);
      k1.setTextureSize(256, 128);
      k1.mirror = true;
      setRotation(k1, 0F, -0.5235988F, -0.3490659F);
      k2 = new ModelRenderer(this, 64, 83);
      k2.addBox(-1F, 0F, -6F, 2, 33, 12);
      k2.setRotationPoint(-14F, -11F, -1F);
      k2.setTextureSize(256, 128);
      k2.mirror = true;
      setRotation(k2, 0F, 0.5235988F, 0.3490659F);
      k3 = new ModelRenderer(this, 93, 83);
      k3.addBox(-11F, 0F, -1F, 22, 32, 2);
      k3.setRotationPoint(-1F, -11F, 4F);
      k3.setTextureSize(256, 128);
      k3.mirror = true;
      setRotation(k3, 0.3194262F, 0F, 0F);
      a1 = new ModelRenderer(this, 88, 20);
      a1.addBox(-9F, -17F, -1F, 2, 7, 2);
      a1.setRotationPoint(0F, -11F, -1F);
      a1.setTextureSize(256, 128);
      a1.mirror = true;
      setRotation(a1, 0F, 0F, 0F);
      a2 = new ModelRenderer(this, 105, 33);
      a2.addBox(-2.5F, -14F, -3F, 5, 4, 6);
      a2.setRotationPoint(0F, -11F, -1F);
      a2.setTextureSize(256, 128);
      a2.mirror = true;
      setRotation(a2, 0F, 0F, 0F);
      a3 = new ModelRenderer(this, 97, 25);
      a3.addBox(-9F, -10F, -1F, 5, 2, 2);
      a3.setRotationPoint(0F, -11F, -1F);
      a3.setTextureSize(256, 128);
      a3.mirror = true;
      setRotation(a3, 0F, 0F, 0F);
      a4 = new ModelRenderer(this, 120, 25);
      a4.addBox(4F, -10F, -1F, 5, 2, 2);
      a4.setRotationPoint(0F, -11F, -1F);
      a4.setTextureSize(256, 128);
      a4.mirror = true;
      setRotation(a4, 0F, 0F, 0F);
      a5 = new ModelRenderer(this, 135, 20);
      a5.addBox(7F, -17F, -1F, 2, 7, 2);
      a5.setRotationPoint(0F, -11F, -1F);
      a5.setTextureSize(256, 128);
      a5.mirror = true;
      setRotation(a5, 0F, 0F, 0F);
      ht1 = new ModelRenderer(this, 23, 62);
      ht1.addBox(-4F, -7.5F, -22F, 8, 10, 2);
      ht1.setRotationPoint(9F, -5F, -1F);
      ht1.setTextureSize(256, 128);
      ht1.mirror = true;
      setRotation(ht1, 0.2602503F, 0.1858931F, 0.4089647F);
      k4 = new ModelRenderer(this, 136, 50);
      k4.addBox(0F, -17F, -6F, 1, 18, 13);
      k4.setRotationPoint(8F, -10F, 0F);
      k4.setTextureSize(256, 128);
      k4.mirror = true;
      setRotation(k4, -0.0349066F, -0.6108652F, 0.3490659F);
      mt1 = new ModelRenderer(this, 0, 62);
      mt1.addBox(-4F, -7.5F, -22F, 8, 10, 2);
      mt1.setRotationPoint(-10F, -5F, -1F);
      mt1.setTextureSize(256, 128);
      mt1.mirror = true;
      setRotation(mt1, 0.1115358F, -0.1115358F, -0.2625223F);
      mt2 = new ModelRenderer(this, 0, 103);
      mt2.addBox(-2.5F, -2.5F, -20F, 5, 5, 20);
      mt2.setRotationPoint(-10F, -5F, -1F);
      mt2.setTextureSize(256, 128);
      mt2.mirror = true;
      setRotation(mt2, 0.1115358F, -0.1115358F, -0.2625223F);
      ht2 = new ModelRenderer(this, 0, 76);
      ht2.addBox(-2.5F, -2.5F, -20F, 5, 5, 20);
      ht2.setRotationPoint(9F, -5F, -1F);
      ht2.setTextureSize(256, 128);
      ht2.mirror = true;
      setRotation(ht2, 0.2602503F, 0.1858931F, 0.4089647F);
      k5 = new ModelRenderer(this, 136, 30);
      k5.addBox(0F, -1F, -6F, 15, 2, 12);
      k5.setRotationPoint(7F, -12F, -1F);
      k5.setTextureSize(256, 128);
      k5.mirror = true;
      setRotation(k5, 0F, 0F, -0.1745329F);
      k6 = new ModelRenderer(this, 214, 45);
      k6.addBox(-9F, 0F, -5.9F, 9, 31, 12);
      k6.setRotationPoint(9F, -11F, -1F);
      k6.setTextureSize(256, 128);
      k6.mirror = true;
      setRotation(k6, 0F, 0F, -0.2268928F);
      k7 = new ModelRenderer(this, 171, 45);
      k7.addBox(0F, 0F, -5.866667F, 9, 31, 12);
      k7.setRotationPoint(-10F, -11F, -1F);
      k7.setTextureSize(256, 128);
      k7.mirror = true;
      setRotation(k7, 0F, 0F, 0.2268928F);
      k8 = new ModelRenderer(this, 46, 30);
      k8.addBox(-15F, -1F, -6F, 15, 2, 12);
      k8.setRotationPoint(-7F, -12F, -1F);
      k8.setTextureSize(256, 128);
      k8.mirror = true;
      setRotation(k8, 0F, 0F, 0.1745329F);
      k9 = new ModelRenderer(this, 194, 0);
      k9.addBox(0F, 0F, -6F, 19, 32, 12);
      k9.setRotationPoint(-10F, -11F, -1F);
      k9.setTextureSize(256, 128);
      k9.mirror = true;
      setRotation(k9, 0F, 0F, 0F);
      a6 = new ModelRenderer(this, 100, 44);
      a6.addBox(-4F, -10F, -4F, 8, 10, 8);
      a6.setRotationPoint(0F, -11F, -1F);
      a6.setTextureSize(256, 128);
      a6.mirror = true;
      setRotation(a6, 0F, 0F, 0F);
      k10 = new ModelRenderer(this, 100, 64);
      k10.addBox(-7F, -16F, -1F, 16, 16, 1);
      k10.setRotationPoint(-1F, -11F, 5F);
      k10.setTextureSize(256, 128);
      k10.mirror = true;
      setRotation(k10, -0.2602503F, 0F, 0F);
      k11 = new ModelRenderer(this, 69, 50);
      k11.addBox(0F, -17F, -6F, 1, 18, 13);
      k11.setRotationPoint(-9F, -10F, 0F);
      k11.setTextureSize(256, 128);
      k11.mirror = true;
      setRotation(k11, -0.0349066F, 0.6108652F, -0.3490659F);
      ha1 = new ModelRenderer(this, 0, 0);
      ha1.addBox(-4F, -2F, -14F, 8, 4, 14);
      ha1.setRotationPoint(8F, 21F, 0F);
      ha1.setTextureSize(256, 128);
      ha1.mirror = true;
      setRotation(ha1, 0F, 0F, 0F);
      ma1 = new ModelRenderer(this, 0, 19);
      ma1.addBox(-4F, -2F, -14F, 8, 4, 14);
      ma1.setRotationPoint(-8F, 21F, 0F);
      ma1.setTextureSize(256, 128);
      ma1.mirror = true;
      setRotation(ma1, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    k1.render(f5);
    k2.render(f5);
    k3.render(f5);
    a1.render(f5);
    a2.render(f5);
    a3.render(f5);
    a4.render(f5);
    a5.render(f5);
    ht1.render(f5);
    k4.render(f5);
    mt1.render(f5);
    mt2.render(f5);
    ht2.render(f5);
    k5.render(f5);
    k6.render(f5);
    k7.render(f5);
    k8.render(f5);
    k9.render(f5);
    a6.render(f5);
    k10.render(f5);
    k11.render(f5);
    ha1.render(f5);
    ma1.render(f5);
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
		a1.rotateAngleY = par4 / (180F / (float)Math.PI);
		a2.rotateAngleY = par4 / (180F / (float)Math.PI);
		a3.rotateAngleY = par4 / (180F / (float)Math.PI);
		a4.rotateAngleY = par4 / (180F / (float)Math.PI);
		a5.rotateAngleY = par4 / (180F / (float)Math.PI);
		a6.rotateAngleY = par4 / (180F / (float)Math.PI);



		ht1.rotateAngleY = par4 / (180F / (float)Math.PI);
		ht2.rotateAngleY = par4 / (180F / (float)Math.PI);
		mt1.rotateAngleY = par4 / (180F / (float)Math.PI);
		mt2.rotateAngleY = par4 / (180F / (float)Math.PI);



		ha1.rotateAngleX = MathHelper.cos(par1 * 0.2662F) * 0.2F * par2;
		ma1.rotateAngleX = MathHelper.cos(par1 * 0.2662F + (float)Math.PI) * 0.2F * par2;


	}

}
