package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelBubsura extends ModelBase
{
	//fields
	ModelRenderer kao_ue;
	ModelRenderer kao;
	ModelRenderer kao_sita;
	ModelRenderer karada;
	ModelRenderer awa1;
	ModelRenderer awa2;
	ModelRenderer awa3;

	public DqmModelBubsura()
	{
		textureWidth = 128;
		textureHeight = 64;

		kao_ue = new ModelRenderer(this, 0, 24);
		kao_ue.addBox(-1F, -1F, -4F, 4, 1, 4);
		kao_ue.setRotationPoint(-1F, 17F, -2F);
		kao_ue.setTextureSize(128, 64);
		kao_ue.mirror = true;
		setRotation(kao_ue, 0F, 0F, 0F);
		kao = new ModelRenderer(this, 0, 29);
		kao.addBox(-3F, -2F, -7F, 6, 3, 6);
		kao.setRotationPoint(0F, 19F, 0F);
		kao.setTextureSize(128, 64);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		kao_sita = new ModelRenderer(this, 0, 38);
		kao_sita.addBox(-3F, -1F, -3F, 8, 1, 7);
		kao_sita.setRotationPoint(-1F, 21F, -4F);
		kao_sita.setTextureSize(128, 64);
		kao_sita.mirror = true;
		setRotation(kao_sita, 0F, 0F, 0F);
		karada = new ModelRenderer(this, 0, 46);
		karada.addBox(-8F, 0F, -8F, 16, 2, 16);
		karada.setRotationPoint(0F, 22F, 0F);
		karada.setTextureSize(128, 64);
		karada.mirror = true;
		setRotation(karada, 0F, 0F, 0F);
		awa1 = new ModelRenderer(this, 0, 21);
		awa1.addBox(0F, 0F, 0F, 1, 1, 1);
		awa1.setRotationPoint(4F, 17F, 2F);
		awa1.setTextureSize(128, 64);
		awa1.mirror = true;
		setRotation(awa1, 0F, 0F, 0F);
		awa2 = new ModelRenderer(this, 0, 18);
		awa2.addBox(0F, 0F, 0F, 1, 1, 1);
		awa2.setRotationPoint(-3.6F, 15F, 1.6F);
		awa2.setTextureSize(128, 64);
		awa2.mirror = true;
		setRotation(awa2, 0F, 0F, 0F);
		awa3 = new ModelRenderer(this, 0, 15);
		awa3.addBox(0F, 0F, 0F, 1, 1, 1);
		awa3.setRotationPoint(-7.2F, 17.4F, -6.533333F);
		awa3.setTextureSize(128, 64);
		awa3.mirror = true;
		setRotation(awa3, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		kao_ue.render(f5);
		kao.render(f5);
		kao_sita.render(f5);
		karada.render(f5);
		awa1.render(f5);
		awa2.render(f5);
		awa3.render(f5);
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
