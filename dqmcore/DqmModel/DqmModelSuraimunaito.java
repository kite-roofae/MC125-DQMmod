package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;
public class DqmModelSuraimunaito extends ModelBase
{
  //fields
    ModelRenderer a1;
    ModelRenderer a2;
    ModelRenderer a3;
    ModelRenderer z1;
    ModelRenderer z2;
    ModelRenderer z3;
    ModelRenderer z4;
    ModelRenderer ma1;
    ModelRenderer ma2;
    ModelRenderer ha1;
    ModelRenderer ha2;
    ModelRenderer mt1;
    ModelRenderer mt2;
    ModelRenderer ht1;
    ModelRenderer ht2;
    ModelRenderer mt3;
    ModelRenderer t1;
    ModelRenderer z5;

  public DqmModelSuraimunaito()
  {
    textureWidth = 128;
    textureHeight = 128;

      a1 = new ModelRenderer(this, 0, 19);
      a1.addBox(-1F, -6F, 0.5F, 2, 1, 4);
      a1.setRotationPoint(0F, 7F, 3F);
      a1.setTextureSize(128, 32);
      a1.mirror = true;
      setRotation(a1, 0F, 0F, 0F);
      a2 = new ModelRenderer(this, 0, 30);
      a2.addBox(-2F, -4F, -2.5F, 4, 4, 4);
      a2.setRotationPoint(0F, 7F, 3F);
      a2.setTextureSize(128, 32);
      a2.mirror = true;
      setRotation(a2, 0F, 0F, 0F);
      a3 = new ModelRenderer(this, 0, 25);
      a3.addBox(-1F, -5F, -1.5F, 2, 1, 3);
      a3.setRotationPoint(0F, 7F, 3F);
      a3.setTextureSize(128, 32);
      a3.mirror = true;
      setRotation(a3, 0F, 0F, 0F);
      z1 = new ModelRenderer(this, 50, 50);
      z1.addBox(-4.5F, 0F, -4.5F, 9, 1, 9);
      z1.setRotationPoint(0F, 23F, 0F);
      z1.setTextureSize(128, 32);
      z1.mirror = true;
      setRotation(z1, 0F, 0F, 0F);
      z2 = new ModelRenderer(this, 50, 34);
      z2.addBox(-4F, 0F, -4F, 10, 5, 10);
      z2.setRotationPoint(-1F, 18F, -1F);
      z2.setTextureSize(128, 32);
      z2.mirror = true;
      setRotation(z2, 0F, 0F, 0F);
      z3 = new ModelRenderer(this, 50, 24);
      z3.addBox(-3F, 0F, -3F, 8, 1, 8);
      z3.setRotationPoint(-1F, 17F, -1F);
      z3.setTextureSize(128, 32);
      z3.mirror = true;
      setRotation(z3, 0F, 0F, 0F);
      z4 = new ModelRenderer(this, 50, 16);
      z4.addBox(-2F, 0F, -2F, 6, 1, 6);
      z4.setRotationPoint(-1F, 16F, -1F);
      z4.setTextureSize(128, 32);
      z4.mirror = true;
      setRotation(z4, 0F, 0F, 0F);
      ma1 = new ModelRenderer(this, 15, 92);
      ma1.addBox(-1F, -1F, -6F, 2, 3, 1);
      ma1.setRotationPoint(-2F, 14F, 3F);
      ma1.setTextureSize(128, 32);
      ma1.mirror = true;
      setRotation(ma1, 0F, 0F, 0F);
      ma2 = new ModelRenderer(this, 0, 92);
      ma2.addBox(-1F, 0F, -5F, 2, 2, 5);
      ma2.setRotationPoint(-2F, 14F, 3F);
      ma2.setTextureSize(128, 32);
      ma2.mirror = true;
      setRotation(ma2, 0F, 0F, 0F);
      ha1 = new ModelRenderer(this, 15, 100);
      ha1.addBox(-1F, -1F, -6F, 2, 3, 1);
      ha1.setRotationPoint(2F, 14F, 3F);
      ha1.setTextureSize(128, 32);
      ha1.mirror = true;
      setRotation(ha1, 0F, 0F, 0F);
      ha2 = new ModelRenderer(this, 0, 100);
      ha2.addBox(-1F, 0F, -5F, 2, 2, 5);
      ha2.setRotationPoint(2F, 14F, 3F);
      ha2.setTextureSize(128, 32);
      ha2.mirror = true;
      setRotation(ha2, 0F, 0F, 0F);
      mt1 = new ModelRenderer(this, 0, 44);
      mt1.addBox(-2F, -1F, -7F, 2, 2, 7);
      mt1.setRotationPoint(-3F, 10F, 3F);
      mt1.setTextureSize(128, 32);
      mt1.mirror = true;
      setRotation(mt1, 0F, 0F, 0F);
      mt2 = new ModelRenderer(this, 18, 53);
      mt2.addBox(-2.5F, -2F, -7F, 3, 1, 2);
      mt2.setRotationPoint(-3F, 10F, 3F);
      mt2.setTextureSize(128, 32);
      mt2.mirror = true;
      setRotation(mt2, 0F, 0F, 0F);
      ht1 = new ModelRenderer(this, 19, 60);
      ht1.addBox(2F, -3F, -7F, 1, 6, 5);
      ht1.setRotationPoint(3F, 10F, 3F);
      ht1.setTextureSize(128, 32);
      ht1.mirror = true;
      setRotation(ht1, 0F, 0F, 0F);
      ht2 = new ModelRenderer(this, 0, 60);
      ht2.addBox(0F, -1F, -7F, 2, 2, 7);
      ht2.setRotationPoint(3F, 10F, 3F);
      ht2.setTextureSize(128, 32);
      ht2.mirror = true;
      setRotation(ht2, 0F, 0F, 0F);
      mt3 = new ModelRenderer(this, 20, 42);
      mt3.addBox(-1.5F, -10F, -7F, 1, 8, 2);
      mt3.setRotationPoint(-3F, 10F, 3F);
      mt3.setTextureSize(128, 32);
      mt3.mirror = true;
      setRotation(mt3, 0F, 0F, 0F);
      t1 = new ModelRenderer(this, 50, 8);
      t1.addBox(-1F, -5F, -1F, 2, 5, 2);
      t1.setRotationPoint(0F, 16F, 0F);
      t1.setTextureSize(128, 32);
      t1.mirror = true;
      setRotation(t1, 0F, 0F, 0F);
      z5 = new ModelRenderer(this, 0, 73);
      z5.addBox(-1F, -4F, -1F, 6, 7, 3);
      z5.setRotationPoint(-2F, 11F, 2F);
      z5.setTextureSize(128, 32);
      z5.mirror = true;
      setRotation(z5, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    a1.render(f5);
    a2.render(f5);
    a3.render(f5);
    z1.render(f5);
    z2.render(f5);
    z3.render(f5);
    z4.render(f5);
    ma1.render(f5);
    ma2.render(f5);
    ha1.render(f5);
    ha2.render(f5);
    mt1.render(f5);
    mt2.render(f5);
    ht1.render(f5);
    ht2.render(f5);
    mt3.render(f5);
    t1.render(f5);
    z5.render(f5);
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

		t1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.4F * par2;
		t1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.4F * par2;

		/*
		ha1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		ha2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		ma1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		ma2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		*/
		mt1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		mt2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;
		mt3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.6F * par2;

		
		ht1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;
		ht2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2;


	}

}

