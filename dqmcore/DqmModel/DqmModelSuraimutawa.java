package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelSuraimutawa extends ModelBase
{
	//fields
	ModelRenderer tuno1;
	ModelRenderer ue1;
	ModelRenderer naka1;
	ModelRenderer sita1;
	ModelRenderer tuno2;
	ModelRenderer ue2;
	ModelRenderer naka2;
	ModelRenderer sita2;
	ModelRenderer tuno3;
	ModelRenderer ue3;
	ModelRenderer naka3;
	ModelRenderer sita3;

	public DqmModelSuraimutawa()
	{
		textureWidth = 128;
		textureHeight = 64;

		tuno1 = new ModelRenderer(this, 32, 32);
		tuno1.addBox(-1F, -11F, -1F, 2, 4, 2);
		tuno1.setRotationPoint(0F, 8F, 0F);
		tuno1.setTextureSize(128, 64);
		tuno1.mirror = true;
		setRotation(tuno1, 0F, 0F, 0F);
		ue1 = new ModelRenderer(this, 4, 37);
		ue1.addBox(-3F, -7F, -3F, 6, 2, 6);
		ue1.setRotationPoint(0F, 8F, 0F);
		ue1.setTextureSize(128, 64);
		ue1.mirror = true;
		setRotation(ue1, 0F, 0F, 0F);
		naka1 = new ModelRenderer(this, 0, 45);
		naka1.addBox(-4F, -5F, -4F, 8, 4, 8);
		naka1.setRotationPoint(0F, 8F, 0F);
		naka1.setTextureSize(128, 64);
		naka1.mirror = true;
		setRotation(naka1, 0F, 0F, 0F);
		sita1 = new ModelRenderer(this, 4, 57);
		sita1.addBox(-3F, -1F, -3F, 6, 1, 6);
		sita1.setRotationPoint(0F, 8F, 0F);
		sita1.setTextureSize(128, 64);
		sita1.mirror = true;
		setRotation(sita1, 0F, 0F, 0F);
		tuno2 = new ModelRenderer(this, 80, 0);
		tuno2.addBox(-1F, -11F, -1F, 2, 4, 2);
		tuno2.setRotationPoint(0F, 16F, 0F);
		tuno2.setTextureSize(128, 64);
		tuno2.mirror = true;
		setRotation(tuno2, 0F, 0F, 0F);
		ue2 = new ModelRenderer(this, 52, 5);
		ue2.addBox(-3F, -7F, -3F, 6, 2, 6);
		ue2.setRotationPoint(0F, 16F, 0F);
		ue2.setTextureSize(128, 64);
		ue2.mirror = true;
		setRotation(ue2, 0F, 0F, 0F);
		naka2 = new ModelRenderer(this, 48, 13);
		naka2.addBox(-4F, -5F, -4F, 8, 4, 8);
		naka2.setRotationPoint(0F, 16F, 0F);
		naka2.setTextureSize(128, 64);
		naka2.mirror = true;
		setRotation(naka2, 0F, 0F, 0F);
		sita2 = new ModelRenderer(this, 52, 25);
		sita2.addBox(-3F, -1F, -3F, 6, 1, 6);
		sita2.setRotationPoint(0F, 16F, 0F);
		sita2.setTextureSize(128, 64);
		sita2.mirror = true;
		setRotation(sita2, 0F, 0F, 0F);
		tuno3 = new ModelRenderer(this, 32, 0);
		tuno3.addBox(-1F, -11F, -1F, 2, 4, 2);
		tuno3.setRotationPoint(0F, 24F, 0F);
		tuno3.setTextureSize(128, 64);
		tuno3.mirror = true;
		setRotation(tuno3, 0F, 0F, 0F);
		ue3 = new ModelRenderer(this, 4, 5);
		ue3.addBox(-3F, -7F, -3F, 6, 2, 6);
		ue3.setRotationPoint(0F, 24F, 0F);
		ue3.setTextureSize(128, 64);
		ue3.mirror = true;
		setRotation(ue3, 0F, 0F, 0F);
		naka3 = new ModelRenderer(this, 0, 13);
		naka3.addBox(-4F, -5F, -4F, 8, 4, 8);
		naka3.setRotationPoint(0F, 24F, 0F);
		naka3.setTextureSize(128, 64);
		naka3.mirror = true;
		setRotation(naka3, 0F, 0F, 0F);
		sita3 = new ModelRenderer(this, 4, 25);
		sita3.addBox(-3F, -1F, -3F, 6, 1, 6);
		sita3.setRotationPoint(0F, 24F, 0F);
		sita3.setTextureSize(128, 64);
		sita3.mirror = true;
		setRotation(sita3, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		tuno1.render(f5);
		ue1.render(f5);
		naka1.render(f5);
		sita1.render(f5);
		tuno2.render(f5);
		ue2.render(f5);
		naka2.render(f5);
		sita2.render(f5);
		tuno3.render(f5);
		ue3.render(f5);
		naka3.render(f5);
		sita3.render(f5);
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

		tuno1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		ue1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		naka1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		sita1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		tuno2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		ue2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		naka2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		sita2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		tuno3.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		ue3.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		naka3.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		sita3.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;

		tuno1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		ue1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		naka1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		sita1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		tuno2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		ue2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		naka2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		sita2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.2F * par2;
		tuno3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		ue3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		naka3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;
		sita3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.2F * par2;

	}

}
