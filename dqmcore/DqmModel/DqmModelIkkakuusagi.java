package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelIkkakuusagi extends ModelBase
{
	//fields
	ModelRenderer Body;
	ModelRenderer Head;
	ModelRenderer tuno;
	ModelRenderer rightmimi;
	ModelRenderer leftmimi;
	ModelRenderer leftmomo;
	ModelRenderer rightmomo;
	ModelRenderer rightasi;
	ModelRenderer leftasi;
	ModelRenderer righthand;
	ModelRenderer lefthand;
	ModelRenderer sippo;

	public DqmModelIkkakuusagi()
	{
		textureWidth = 64;
		textureHeight = 39;

		Body = new ModelRenderer(this, 14, 0);
		Body.addBox(-4F, -3F, 0F, 8, 8, 10);
		Body.setRotationPoint(0F, 18F, -3F);
		Body.setTextureSize(64, 39);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Head = new ModelRenderer(this, 22, 18);
		Head.addBox(-3F, -3F, -4F, 6, 6, 4);
		Head.setRotationPoint(0F, 18F, -3F);
		Head.setTextureSize(64, 39);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		tuno = new ModelRenderer(this, 30, 28);
		tuno.addBox(-0.5F, -10F, -2F, 1, 7, 1);
		tuno.setRotationPoint(0F, 18F, -3F);
		tuno.setTextureSize(64, 39);
		tuno.mirror = true;
		setRotation(tuno, 0.0872665F, 0F, 0F);
		rightmimi = new ModelRenderer(this, 12, 20);
		rightmimi.addBox(-3F, -7F, -4F, 1, 4, 4);
		rightmimi.setRotationPoint(0F, 18F, -3F);
		rightmimi.setTextureSize(64, 39);
		rightmimi.mirror = true;
		setRotation(rightmimi, 0F, 0F, -0.1396263F);
		leftmimi = new ModelRenderer(this, 42, 20);
		leftmimi.addBox(2F, -7F, -4F, 1, 4, 4);
		leftmimi.setRotationPoint(0F, 18F, -3F);
		leftmimi.setTextureSize(64, 39);
		leftmimi.mirror = true;
		setRotation(leftmimi, 0F, 0F, 0.1396263F);
		//leftmomo.mirror = true;
		leftmomo = new ModelRenderer(this, 50, 0);
		leftmomo.addBox(0F, 0F, -2F, 3, 6, 3);
		leftmomo.setRotationPoint(4F, 16F, 6F);
		leftmomo.setTextureSize(64, 39);
		leftmomo.mirror = true;
		setRotation(leftmomo, 0F, 0F, 0F);
		//leftmomo.mirror = false;
		rightmomo = new ModelRenderer(this, 2, 0);
		rightmomo.addBox(-3F, 0F, -2F, 3, 6, 3);
		rightmomo.setRotationPoint(-4F, 16F, 6F);
		rightmomo.setTextureSize(64, 39);
		rightmomo.mirror = true;
		setRotation(rightmomo, 0F, 0F, 0F);
		rightasi = new ModelRenderer(this, 0, 31);
		rightasi.addBox(-3F, 6F, -5F, 3, 2, 6);
		rightasi.setRotationPoint(-4F, 16F, 6F);
		rightasi.setTextureSize(64, 39);
		rightasi.mirror = true;
		setRotation(rightasi, 0F, 0F, 0F);
		leftasi = new ModelRenderer(this, 46, 31);
		leftasi.addBox(0F, 6F, -5F, 3, 2, 6);
		leftasi.setRotationPoint(4F, 16F, 6F);
		leftasi.setTextureSize(64, 39);
		leftasi.mirror = true;
		setRotation(leftasi, 0F, 0F, 0F);
		righthand = new ModelRenderer(this, 18, 34);
		righthand.addBox(0F, 0F, -2F, 1, 3, 2);
		righthand.setRotationPoint(-4F, 21F, -3F);
		righthand.setTextureSize(64, 39);
		righthand.mirror = true;
		setRotation(righthand, 0F, 0F, 0F);
		lefthand = new ModelRenderer(this, 40, 34);
		lefthand.addBox(0F, 0F, -2F, 1, 3, 2);
		lefthand.setRotationPoint(3F, 21F, -3F);
		lefthand.setTextureSize(64, 39);
		lefthand.mirror = true;
		setRotation(lefthand, 0F, 0F, 0F);
		sippo = new ModelRenderer(this, 6, 14);
		sippo.addBox(-1F, -1F, 0F, 2, 2, 2);
		sippo.setRotationPoint(0F, 18F, 7F);
		sippo.setTextureSize(64, 39);
		sippo.mirror = true;
		setRotation(sippo, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Body.render(f5);
		Head.render(f5);
		tuno.render(f5);
		rightmimi.render(f5);
		leftmimi.render(f5);
		leftmomo.render(f5);
		rightmomo.render(f5);
		rightasi.render(f5);
		leftasi.render(f5);
		righthand.render(f5);
		lefthand.render(f5);
		sippo.render(f5);
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
		Head.rotateAngleY = par4 / (180F / (float)Math.PI);
		Head.rotateAngleX = par5 / (180F / (float)Math.PI);
		tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
		tuno.rotateAngleX = par5 / (180F / (float)Math.PI);
		rightmimi.rotateAngleY = par4 / (180F / (float)Math.PI);
		rightmimi.rotateAngleX = par5 / (180F / (float)Math.PI);
		leftmimi.rotateAngleY = par4 / (180F / (float)Math.PI);
		leftmimi.rotateAngleX = par5 / (180F / (float)Math.PI);

		//shoulder_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		leftmomo.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		leftasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//ude1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//sabre.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		//shoulder_left_.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		rightmomo.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		rightasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		righthand.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//kutu_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//boots_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		//ude1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		lefthand.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		//kutu_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		//boots_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		//asi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	}

}
