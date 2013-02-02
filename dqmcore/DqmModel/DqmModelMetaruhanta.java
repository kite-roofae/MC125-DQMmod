package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelMetaruhanta extends ModelBase
{
	//fields
	ModelRenderer asi1;
	ModelRenderer asi2;
	ModelRenderer asi3;
	ModelRenderer asi4;
	ModelRenderer asinobou1;
	ModelRenderer asinobou2;
	ModelRenderer asinobou3;
	ModelRenderer asinobou4;
	ModelRenderer hiza1;
	ModelRenderer hiza2;
	ModelRenderer hiza3;
	ModelRenderer hiza4;
	ModelRenderer hutimomo;
	ModelRenderer hutomomo;
	ModelRenderer mata;
	ModelRenderer doutai;
	ModelRenderer me;
	ModelRenderer kata1;
	ModelRenderer kata2;
	ModelRenderer katatuno1;
	ModelRenderer Shape1;
	ModelRenderer ude1;
	ModelRenderer ude2;
	ModelRenderer yumi1;
	ModelRenderer yumi2;
	ModelRenderer ya;
	ModelRenderer te;

	public DqmModelMetaruhanta()
	{
		textureWidth = 128;
		textureHeight = 128;

		asi1 = new ModelRenderer(this, 0, 0);
		asi1.addBox(-3F, 0F, -3F, 6, 2, 6);
		asi1.setRotationPoint(-1F, 22F, -1F);
		asi1.setTextureSize(128, 128);
		asi1.mirror = true;
		setRotation(asi1, 0F, 0F, 0F);
		asi2 = new ModelRenderer(this, 0, 0);
		asi2.addBox(-3F, 0F, -3F, 6, 2, 6);
		asi2.setRotationPoint(-1F, 22F, 17F);
		asi2.setTextureSize(128, 128);
		asi2.mirror = true;
		setRotation(asi2, 0F, 0F, 0F);
		asi3 = new ModelRenderer(this, 0, 0);
		asi3.addBox(-3F, 0F, -3F, 6, 2, 6);
		asi3.setRotationPoint(17F, 22F, -1F);
		asi3.setTextureSize(128, 128);
		asi3.mirror = true;
		setRotation(asi3, 0F, 0F, 0F);
		asi4 = new ModelRenderer(this, 0, 0);
		asi4.addBox(-3F, 0F, -3F, 6, 2, 6);
		asi4.setRotationPoint(17F, 22F, 17F);
		asi4.setTextureSize(128, 128);
		asi4.mirror = true;
		setRotation(asi4, 0F, 0F, 0F);
		asinobou1 = new ModelRenderer(this, 0, 10);
		asinobou1.addBox(-1F, 0F, -1F, 2, 9, 2);
		asinobou1.setRotationPoint(-1F, 13F, -1F);
		asinobou1.setTextureSize(128, 128);
		asinobou1.mirror = true;
		setRotation(asinobou1, 0F, 0F, 0F);
		asinobou2 = new ModelRenderer(this, 0, 10);
		asinobou2.addBox(-1F, 0F, -1F, 2, 9, 2);
		asinobou2.setRotationPoint(17F, 13F, -1F);
		asinobou2.setTextureSize(128, 128);
		asinobou2.mirror = true;
		setRotation(asinobou2, 0F, 0F, 0F);
		asinobou3 = new ModelRenderer(this, 0, 10);
		asinobou3.addBox(-1F, 0F, -1F, 2, 9, 2);
		asinobou3.setRotationPoint(-1F, 13F, 17F);
		asinobou3.setTextureSize(128, 128);
		asinobou3.mirror = true;
		setRotation(asinobou3, 0F, 0F, 0F);
		asinobou4 = new ModelRenderer(this, 0, 10);
		asinobou4.addBox(-1F, 0F, -1F, 2, 9, 2);
		asinobou4.setRotationPoint(17F, 13F, 17F);
		asinobou4.setTextureSize(128, 128);
		asinobou4.mirror = true;
		setRotation(asinobou4, 0F, 0F, 0F);
		hiza1 = new ModelRenderer(this, 26, 0);
		hiza1.addBox(-2F, 0F, -2F, 4, 4, 4);
		hiza1.setRotationPoint(-1F, 9F, -1F);
		hiza1.setTextureSize(128, 128);
		hiza1.mirror = true;
		setRotation(hiza1, 0F, 0.7853982F, 0F);
		hiza2 = new ModelRenderer(this, 26, 0);
		hiza2.addBox(-2F, 0F, -2F, 4, 4, 4);
		hiza2.setRotationPoint(17F, 9F, -1F);
		hiza2.setTextureSize(128, 128);
		hiza2.mirror = true;
		setRotation(hiza2, 0F, 0.7853982F, 0F);
		hiza3 = new ModelRenderer(this, 26, 0);
		hiza3.addBox(-2F, 0F, -2F, 4, 4, 4);
		hiza3.setRotationPoint(-1F, 9F, 17F);
		hiza3.setTextureSize(128, 128);
		hiza3.mirror = true;
		setRotation(hiza3, 0F, 0.7853982F, 0F);
		hiza4 = new ModelRenderer(this, 26, 0);
		hiza4.addBox(-2F, 0F, -2F, 4, 4, 4);
		hiza4.setRotationPoint(17F, 9F, 17F);
		hiza4.setTextureSize(128, 128);
		hiza4.mirror = true;
		setRotation(hiza4, 0F, 0.7853982F, 0F);
		hutimomo = new ModelRenderer(this, 10, 12);
		hutimomo.addBox(0F, -1F, -1F, 22, 2, 2);
		hutimomo.setRotationPoint(0F, 11F, 0F);
		hutimomo.setTextureSize(128, 128);
		hutimomo.mirror = true;
		setRotation(hutimomo, 0F, -0.7853982F, 0F);
		hutomomo = new ModelRenderer(this, 10, 12);
		hutomomo.addBox(0F, -1F, -1F, 22, 2, 2);
		hutomomo.setRotationPoint(0F, 11F, 15.64F);
		hutomomo.setTextureSize(128, 128);
		hutomomo.mirror = true;
		setRotation(hutomomo, 0F, 0.7853982F, 0F);
		mata = new ModelRenderer(this, 0, 24);
		mata.addBox(-4F, 0F, -4F, 8, 6, 8);
		mata.setRotationPoint(8F, 7F, 8F);
		mata.setTextureSize(128, 128);
		mata.mirror = true;
		setRotation(mata, 0F, 0F, 0F);
		doutai = new ModelRenderer(this, 25, 44);
		doutai.addBox(-6F, 0F, -4.013333F, 12, 12, 8);
		doutai.setRotationPoint(8F, -5F, 8F);
		doutai.setTextureSize(128, 128);
		doutai.mirror = true;
		setRotation(doutai, 0F, 0F, 0F);
		me = new ModelRenderer(this, 2, 52);
		me.addBox(-2F, -4F, -3F, 4, 4, 6);
		me.setRotationPoint(8F, -5F, 6F);
		me.setTextureSize(128, 128);
		me.mirror = true;
		setRotation(me, 0F, 0F, 0F);
		kata1 = new ModelRenderer(this, 35, 24);
		kata1.addBox(0F, 0F, 0F, 4, 4, 10);
		kata1.setRotationPoint(-2F, -6F, 3F);
		kata1.setTextureSize(128, 128);
		kata1.mirror = true;
		setRotation(kata1, 0F, 0F, 0F);
		kata2 = new ModelRenderer(this, 35, 24);
		kata2.addBox(0F, 0F, 0F, 4, 4, 10);
		kata2.setRotationPoint(14F, -6F, 3F);
		kata2.setTextureSize(128, 128);
		kata2.mirror = true;
		setRotation(kata2, 0F, 0F, 0F);
		katatuno1 = new ModelRenderer(this, 59, 39);
		katatuno1.addBox(-1F, -3F, -1F, 1, 3, 1);
		katatuno1.setRotationPoint(0F, -6F, 8F);
		katatuno1.setTextureSize(128, 128);
		katatuno1.mirror = true;
		setRotation(katatuno1, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 59, 39);
		Shape1.addBox(0F, -3F, 0F, 1, 3, 1);
		Shape1.setRotationPoint(16F, -6F, 7F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		ude1 = new ModelRenderer(this, 2, 40);
		ude1.addBox(-1F, 0F, -1F, 2, 6, 2);
		ude1.setRotationPoint(0F, -2F, 7F);
		ude1.setTextureSize(128, 128);
		ude1.mirror = true;
		setRotation(ude1, 0F, 0F, 0F);
		ude2 = new ModelRenderer(this, 2, 40);
		ude2.addBox(-1F, 0F, -7F, 2, 2, 8);
		ude2.setRotationPoint(16F, -2F, 7F);
		ude2.setTextureSize(128, 128);
		ude2.mirror = true;
		setRotation(ude2, 0F, 0F, 0F);
		yumi1 = new ModelRenderer(this, 44, 0);
		yumi1.addBox(-2F, -1F, 0F, 4, 2, 5);
		yumi1.setRotationPoint(16F, -1F, -5F);
		yumi1.setTextureSize(128, 128);
		yumi1.mirror = true;
		setRotation(yumi1, 0F, 0F, 0F);
		yumi2 = new ModelRenderer(this, 64, 0);
		yumi2.addBox(-7F, 0F, -3F, 14, 0, 6);
		yumi2.setRotationPoint(16F, -1F, -3F);
		yumi2.setTextureSize(128, 128);
		yumi2.mirror = true;
		setRotation(yumi2, 0F, 0F, 0F);
		ya = new ModelRenderer(this, 106, 0);
		ya.addBox(-1F, 0F, 0F, 2, 0, 4);
		ya.setRotationPoint(16F, -1F, -10F);
		ya.setTextureSize(128, 128);
		ya.mirror = true;
		setRotation(ya, 0F, 0F, 0F);
		te = new ModelRenderer(this, 66, 50);
		te.addBox(-2F, 0F, -9F, 4, 4, 10);
		te.setRotationPoint(0F, 4.013333F, 7F);
		te.setTextureSize(128, 128);
		te.mirror = true;
		setRotation(te, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		asi1.render(f5);
		asi2.render(f5);
		asi3.render(f5);
		asi4.render(f5);
		asinobou1.render(f5);
		asinobou2.render(f5);
		asinobou3.render(f5);
		asinobou4.render(f5);
		hiza1.render(f5);
		hiza2.render(f5);
		hiza3.render(f5);
		hiza4.render(f5);
		hutimomo.render(f5);
		hutomomo.render(f5);
		mata.render(f5);
		doutai.render(f5);
		me.render(f5);
		kata1.render(f5);
		kata2.render(f5);
		katatuno1.render(f5);
		Shape1.render(f5);
		ude1.render(f5);
		ude2.render(f5);
		yumi1.render(f5);
		yumi2.render(f5);
		ya.render(f5);
		te.render(f5);
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
		me.rotateAngleY = par4 / (180F / (float)Math.PI);
		me.rotateAngleX = par5 / (180F / (float)Math.PI);
		/*
      asinobou1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      asi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      asinobou2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      asi3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      asinobou3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      asi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      asinobou4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      asi4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		 */
	}

}
