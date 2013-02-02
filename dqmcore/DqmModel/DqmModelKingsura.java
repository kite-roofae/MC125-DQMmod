package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelKingsura extends ModelBase
{
	//public boolean isAttacking;
	//fields
	ModelRenderer sura_ue;
	ModelRenderer sura_naka;
	ModelRenderer sura_sita;
	ModelRenderer ou_aka;
	ModelRenderer ou_ki1;
	ModelRenderer ou_ki2;
	ModelRenderer ou_ki3;
	ModelRenderer ou_ki4;
	ModelRenderer ou_ki_sita;
	ModelRenderer hoppe1;
	ModelRenderer hoppe2;

	public DqmModelKingsura()
	{
		textureWidth = 128;
		textureHeight = 128;
		sura_ue = new ModelRenderer(this, 0, 47);
		sura_ue.addBox(-9F, 0F, -9F, 18, 3, 18);
		sura_ue.setRotationPoint(0F, 5F, 0F);
		sura_ue.setTextureSize(128, 128);
		sura_ue.mirror = true;
		setRotation(sura_ue, 0F, 0F, 0F);
		sura_naka = new ModelRenderer(this, 0, 68);
		sura_naka.addBox(-12F, 0F, -12F, 24, 14, 24);
		sura_naka.setRotationPoint(0F, 8F, 0F);
		sura_naka.setTextureSize(128, 128);
		sura_naka.mirror = true;
		setRotation(sura_naka, 0F, 0F, 0F);
		sura_sita = new ModelRenderer(this, 0, 106);
		sura_sita.addBox(-10F, 0F, -10F, 20, 2, 20);
		sura_sita.setRotationPoint(0F, 22F, 0F);
		sura_sita.setTextureSize(128, 128);
		sura_sita.mirror = true;
		setRotation(sura_sita, 0F, 0F, 0F);
		ou_aka = new ModelRenderer(this, 0, 19);
		ou_aka.addBox(-4F, -4F, -4F, 8, 4, 8);
		ou_aka.setRotationPoint(0F, 3F, 0F);
		ou_aka.setTextureSize(128, 128);
		ou_aka.mirror = true;
		setRotation(ou_aka, 0F, 0F, 0F);
		ou_ki1 = new ModelRenderer(this, 112, 16);
		ou_ki1.addBox(-1F, -6F, -1F, 2, 6, 2);
		ou_ki1.setRotationPoint(0F, 3F, -5F);
		ou_ki1.setTextureSize(128, 128);
		ou_ki1.mirror = true;
		setRotation(ou_ki1, 0F, 0F, 0F);
		ou_ki2 = new ModelRenderer(this, 112, 0);
		ou_ki2.addBox(-1F, -6F, -1F, 2, 6, 2);
		ou_ki2.setRotationPoint(0F, 3F, 5F);
		ou_ki2.setTextureSize(128, 128);
		ou_ki2.mirror = true;
		setRotation(ou_ki2, 0F, 0F, 0F);
		ou_ki3 = new ModelRenderer(this, 120, 8);
		ou_ki3.addBox(-1F, -6F, -1F, 2, 6, 2);
		ou_ki3.setRotationPoint(5F, 3F, 0F);
		ou_ki3.setTextureSize(128, 128);
		ou_ki3.mirror = true;
		setRotation(ou_ki3, 0F, 0F, 0F);
		ou_ki4 = new ModelRenderer(this, 104, 8);
		ou_ki4.addBox(-1F, -6F, -1F, 2, 6, 2);
		ou_ki4.setRotationPoint(-5F, 3F, 0F);
		ou_ki4.setTextureSize(128, 128);
		ou_ki4.mirror = true;
		setRotation(ou_ki4, 0F, 0F, 0F);
		ou_ki_sita = new ModelRenderer(this, 0, 31);
		ou_ki_sita.addBox(-6F, -2F, -6F, 12, 2, 12);
		ou_ki_sita.setRotationPoint(0F, 5F, 0F);
		ou_ki_sita.setTextureSize(128, 128);
		ou_ki_sita.mirror = true;
		setRotation(ou_ki_sita, 0F, 0F, 0F);
		hoppe1 = new ModelRenderer(this, 0, 5);
		hoppe1.addBox(-2F, -2F, -1F, 4, 4, 1);
		hoppe1.setRotationPoint(-6F, 14F, -12F);
		hoppe1.setTextureSize(128, 128);
		hoppe1.mirror = true;
		setRotation(hoppe1, 0F, 0F, 0F);
		hoppe2 = new ModelRenderer(this, 0, 0);
		hoppe2.addBox(-2F, -2F, -1F, 4, 4, 1);
		hoppe2.setRotationPoint(6F, 14F, -12F);
		hoppe2.setTextureSize(128, 128);
		hoppe2.mirror = true;
		setRotation(hoppe2, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		sura_ue.render(f5);
		sura_naka.render(f5);
		sura_sita.render(f5);
		ou_aka.render(f5);
		ou_ki1.render(f5);
		ou_ki2.render(f5);
		ou_ki3.render(f5);
		ou_ki4.render(f5);
		ou_ki_sita.render(f5);
		hoppe1.render(f5);
		hoppe2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	/*
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }*//*
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
    {
    if (isAttacking)
    {
        float f2 = 1.0F;
        sura_naka.rotationPointY -= f2 * 5F;
    }}*/
}
