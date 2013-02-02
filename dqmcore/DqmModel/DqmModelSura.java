package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelSura extends ModelBase
{
	//fields
	ModelRenderer Suraimu1;
	ModelRenderer Suraimu2;
	ModelRenderer Suraimu3;
	ModelRenderer Suraimu4;

	public DqmModelSura()
	{
		textureWidth = 64;
		textureHeight = 32;
		Suraimu1 = new ModelRenderer(this, 32, 0);
		Suraimu1.addBox(-1F, -4F, -1F, 2, 4, 2);
		Suraimu1.setRotationPoint(0F, 17F, 0F);
		Suraimu1.setTextureSize(64, 32);
		Suraimu1.mirror = true;
		setRotation(Suraimu1, 0F, 0F, 0F);
		Suraimu2 = new ModelRenderer(this, 4, 5);
		Suraimu2.addBox(-3F, -1F, -3F, 6, 2, 6);
		Suraimu2.setRotationPoint(0F, 18F, 0F);
		Suraimu2.setTextureSize(64, 32);
		Suraimu2.mirror = true;
		setRotation(Suraimu2, 0F, 0F, 0F);
		Suraimu3 = new ModelRenderer(this, 0, 13);
		Suraimu3.addBox(-4F, 0F, -4F, 8, 4, 8);
		Suraimu3.setRotationPoint(0F, 19F, 0F);
		Suraimu3.setTextureSize(64, 32);
		Suraimu3.mirror = true;
		setRotation(Suraimu3, 0F, 0F, 0F);
		Suraimu4 = new ModelRenderer(this, 4, 25);
		Suraimu4.addBox(-3F, 0F, -3F, 6, 1, 6);
		Suraimu4.setRotationPoint(0F, 23F, 0F);
		Suraimu4.setTextureSize(64, 32);
		Suraimu4.mirror = true;
		setRotation(Suraimu4, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Suraimu1.render(f5);
		Suraimu2.render(f5);
		Suraimu3.render(f5);
		Suraimu4.render(f5);
	}




	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}
}
