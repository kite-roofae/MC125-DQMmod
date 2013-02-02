package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmpetModelLittleEsterk extends ModelBase
{
	//fields
	ModelRenderer h_tuno;
	ModelRenderer m_tuno;
	ModelRenderer kao;
	ModelRenderer karada;
	ModelRenderer karada2;
	ModelRenderer h_te;
	ModelRenderer h_ken1;
	ModelRenderer h_ken2;
	ModelRenderer h_asi1;
	ModelRenderer h_asi2;
	ModelRenderer m_te;
	ModelRenderer m_ken1;
	ModelRenderer m_ken2;
	ModelRenderer m_asi1;
	ModelRenderer m_asi2;

	public DqmpetModelLittleEsterk()
	{
		textureWidth = 64;
		textureHeight = 32;

		h_tuno = new ModelRenderer(this, 0, 19);
		h_tuno.addBox(3.5F, -4F, -0.5F, 6, 1, 1);
		h_tuno.setRotationPoint(0F, 5.5F, 0F);
		h_tuno.setTextureSize(64, 32);
		h_tuno.mirror = true;
		setRotation(h_tuno, 0F, 0F, -0.3490659F);
		m_tuno = new ModelRenderer(this, 0, 19);
		m_tuno.addBox(-9.5F, -4F, -0.5F, 6, 1, 1);
		m_tuno.setRotationPoint(0F, 5.5F, 0F);
		m_tuno.setTextureSize(64, 32);
		m_tuno.mirror = true;
		setRotation(m_tuno, 0F, 0F, 0.3490659F);
		kao = new ModelRenderer(this, 0, 22);
		kao.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
		kao.setRotationPoint(0F, 5.5F, 0F);
		kao.setTextureSize(64, 32);
		kao.mirror = true;
		setRotation(kao, 0F, 0F, 0F);
		karada = new ModelRenderer(this, 36, 0);
		karada.addBox(-4F, 0F, -3F, 8, 9, 6);
		karada.setRotationPoint(0F, 5.5F, 0F);
		karada.setTextureSize(64, 32);
		karada.mirror = true;
		setRotation(karada, 0F, 0F, 0F);
		karada2 = new ModelRenderer(this, 36, 15);
		karada2.addBox(-1.5F, 6F, -2.5F, 3, 4, 5);
		karada2.setRotationPoint(0F, 8.5F, 0F);
		karada2.setTextureSize(64, 32);
		karada2.mirror = true;
		setRotation(karada2, 0F, 0F, 0F);
		h_te = new ModelRenderer(this, 7, 0);
		h_te.addBox(0F, -1F, -1.5F, 8, 2, 3);
		h_te.setRotationPoint(4F, 6.5F, 0F);
		h_te.setTextureSize(64, 32);
		h_te.mirror = true;
		setRotation(h_te, 0F, 0F, 0F);
		h_ken1 = new ModelRenderer(this, 0, 0);
		h_ken1.addBox(6F, -10F, -1F, 1, 9, 2);
		h_ken1.setRotationPoint(4F, 6.5F, 0F);
		h_ken1.setTextureSize(64, 32);
		h_ken1.mirror = true;
		setRotation(h_ken1, 0F, 0F, 0F);
		h_ken2 = new ModelRenderer(this, 7, 6);
		h_ken2.addBox(6F, -1.5F, -2F, 1, 3, 4);
		h_ken2.setRotationPoint(4F, 6.5F, 0F);
		h_ken2.setTextureSize(64, 32);
		h_ken2.mirror = true;
		setRotation(h_ken2, 0F, 0F, 0F);
		h_asi1 = new ModelRenderer(this, 20, 17);
		h_asi1.addBox(-0.5F, -1.5F, -1.5F, 5, 3, 3);
		h_asi1.setRotationPoint(2F, 16F, 0F);
		h_asi1.setTextureSize(64, 32);
		h_asi1.mirror = true;
		setRotation(h_asi1, 0F, 0F, 0F);
		h_asi2 = new ModelRenderer(this, 22, 23);
		h_asi2.addBox(1.5F, 1.5F, -1.5F, 3, 6, 3);
		h_asi2.setRotationPoint(2F, 16F, 0F);
		h_asi2.setTextureSize(64, 32);
		h_asi2.mirror = true;
		setRotation(h_asi2, 0F, 0F, 0F);
		m_te = new ModelRenderer(this, 7, 0);
		m_te.addBox(-8F, -1F, -1.5F, 8, 2, 3);
		m_te.setRotationPoint(-4F, 6.5F, 0F);
		m_te.setTextureSize(64, 32);
		m_te.mirror = true;
		setRotation(m_te, 0F, 0F, 0F);
		m_ken1 = new ModelRenderer(this, 0, 0);
		m_ken1.addBox(-7F, -10F, -1F, 1, 9, 2);
		m_ken1.setRotationPoint(-4F, 6.5F, 0F);
		m_ken1.setTextureSize(64, 32);
		m_ken1.mirror = true;
		setRotation(m_ken1, 0F, 0F, 0F);
		m_ken2 = new ModelRenderer(this, 7, 6);
		m_ken2.addBox(-7F, -1.5F, -2F, 1, 3, 4);
		m_ken2.setRotationPoint(-4F, 6.5F, 0F);
		m_ken2.setTextureSize(64, 32);
		m_ken2.mirror = true;
		setRotation(m_ken2, 0F, 0F, 0F);
		m_asi1 = new ModelRenderer(this, 20, 17);
		m_asi1.addBox(-4.5F, -1.5F, -1.5F, 5, 3, 3);
		m_asi1.setRotationPoint(-2F, 16F, 0F);
		m_asi1.setTextureSize(64, 32);
		m_asi1.mirror = true;
		setRotation(m_asi1, 0F, 0F, 0F);
		m_asi2 = new ModelRenderer(this, 22, 23);
		m_asi2.addBox(-4.5F, 1.5F, -1.5F, 3, 6, 3);
		m_asi2.setRotationPoint(-2F, 16F, 0F);
		m_asi2.setTextureSize(64, 32);
		m_asi2.mirror = true;
		setRotation(m_asi2, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		h_tuno.render(f5);
		m_tuno.render(f5);
		kao.render(f5);
		karada.render(f5);
		karada2.render(f5);
		h_te.render(f5);
		h_ken1.render(f5);
		h_ken2.render(f5);
		h_asi1.render(f5);
		h_asi2.render(f5);
		m_te.render(f5);
		m_ken1.render(f5);
		m_ken2.render(f5);
		m_asi1.render(f5);
		m_asi2.render(f5);
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
		kao.rotateAngleY = par4 / (180F / (float)Math.PI);
		kao.rotateAngleX = par5 / (180F / (float)Math.PI);
		h_tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
		h_tuno.rotateAngleX = par5 / (180F / (float)Math.PI);
		m_tuno.rotateAngleY = par4 / (180F / (float)Math.PI);
		m_tuno.rotateAngleX = par5 / (180F / (float)Math.PI);
		m_asi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		m_asi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		h_asi1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		h_asi2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		m_te.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		m_ken1.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		m_ken2.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		h_te.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		h_ken1.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		h_ken2.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

		m_te.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		m_ken1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		m_ken2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		h_te.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		h_ken1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		h_ken2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

	}

}
