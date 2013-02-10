package net.minecraft.src.dqmcore.Block;

import net.minecraft.src.*;

public class DqnModelTubo extends ModelBase
{
  //fields
    ModelRenderer z1;
    ModelRenderer z2;
    ModelRenderer z3;
    ModelRenderer z4;
    ModelRenderer z5;
    ModelRenderer z6;
    ModelRenderer z7;

  public DqnModelTubo()
  {
    textureWidth = 64;
    textureHeight = 32;

      z1 = new ModelRenderer(this, 0, 0);
      z1.addBox(-6.5F, 0F, -6.5F, 13, 1, 13);
      z1.setRotationPoint(0F, 22F, 0F);
      z1.setTextureSize(64, 32);
      z1.mirror = true;
      setRotation(z1, 0F, 0F, 0F);
      z2 = new ModelRenderer(this, 0, 0);
      z2.addBox(-5F, -2F, -5F, 10, 1, 10);
      z2.setRotationPoint(0F, 12F, 0F);
      z2.setTextureSize(64, 32);
      z2.mirror = true;
      setRotation(z2, 0F, 0F, 0F);
      z3 = new ModelRenderer(this, 0, 0);
      z3.addBox(-6F, 0F, -6F, 12, 1, 12);
      z3.setRotationPoint(0F, 23F, 0F);
      z3.setTextureSize(64, 32);
      z3.mirror = true;
      setRotation(z3, 0F, 0F, 0F);
      z4 = new ModelRenderer(this, 0, 0);
      z4.addBox(-7F, -2F, -7F, 14, 10, 14);
      z4.setRotationPoint(0F, 14F, 0F);
      z4.setTextureSize(64, 32);
      z4.mirror = true;
      setRotation(z4, 0F, 0F, 0F);
      z5 = new ModelRenderer(this, 0, 0);
      z5.addBox(-7F, -2F, -7F, 14, 1, 14);
      z5.setRotationPoint(0F, 10F, 0F);
      z5.setTextureSize(64, 32);
      z5.mirror = true;
      setRotation(z5, 0F, 0F, 0F);
      z6 = new ModelRenderer(this, 0, 0);
      z6.addBox(-6F, -2F, -6F, 12, 1, 12);
      z6.setRotationPoint(0F, 13F, 0F);
      z6.setTextureSize(64, 32);
      z6.mirror = true;
      setRotation(z6, 0F, 0F, 0F);
      z7 = new ModelRenderer(this, 0, 0);
      z7.addBox(-6F, -2F, -6F, 12, 1, 12);
      z7.setRotationPoint(0F, 11F, 0F);
      z7.setTextureSize(64, 32);
      z7.mirror = true;
      setRotation(z7, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    z1.render(f5);
    z2.render(f5);
    z3.render(f5);
    z4.render(f5);
    z5.render(f5);
    z6.render(f5);
    z7.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
