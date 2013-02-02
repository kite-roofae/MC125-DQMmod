package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelGaikotukensi extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer shoulder_right;
	ModelRenderer upper_arm_right;
	ModelRenderer hand_right;
	ModelRenderer shoulder_left_;
	ModelRenderer upper_arm_left;
	ModelRenderer hand_left;
	ModelRenderer thigh_right;
	ModelRenderer kutu_right;
	ModelRenderer boots_right;
	ModelRenderer thigh_left;
	ModelRenderer kutu_left;
	ModelRenderer boots_left;
	ModelRenderer sabre;

	public DqmModelGaikotukensi()
	{
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-2.5F, -6F, -5F, 5, 13, 6);
		head.setRotationPoint(0F, -3F, -1F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.1115358F, 0F, 0F);
		body = new ModelRenderer(this, 32, 0);
		body.addBox(-5F, 0F, -1F, 10, 16, 6);
		body.setRotationPoint(0F, -2F, -1F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0371786F, 0F, 0F);
		shoulder_right = new ModelRenderer(this, 13, 44);
		shoulder_right.addBox(-9F, 0F, 0F, 4, 4, 5);
		shoulder_right.setRotationPoint(0F, -2F, -1F);
		shoulder_right.setTextureSize(64, 64);
		shoulder_right.mirror = true;
		setRotation(shoulder_right, 0.0371786F, 0F, -0.0371786F);
		upper_arm_right = new ModelRenderer(this, 56, 42);
		upper_arm_right.addBox(-2F, 0F, 0F, 1, 11, 1);
		upper_arm_right.setRotationPoint(-5F, 0F, 1F);
		upper_arm_right.setTextureSize(64, 64);
		upper_arm_right.mirror = true;
		setRotation(upper_arm_right, 0F, -0.2974289F, 0.0743572F);
		hand_right = new ModelRenderer(this, 36, 22);
		hand_right.addBox(-3F, 11F, -1F, 2, 3, 3);
		hand_right.setRotationPoint(-5F, 0F, 1F);
		hand_right.setTextureSize(64, 64);
		hand_right.mirror = true;
		setRotation(hand_right, 0F, -0.3346075F, 0F);
		shoulder_left_ = new ModelRenderer(this, 31, 44);
		shoulder_left_.addBox(5F, 0F, 0F, 4, 4, 5);
		shoulder_left_.setRotationPoint(0F, -2F, -1F);
		shoulder_left_.setTextureSize(64, 64);
		shoulder_left_.mirror = true;
		setRotation(shoulder_left_, 0.0371786F, 0F, 0.0371786F);
		upper_arm_left = new ModelRenderer(this, 60, 42);
		upper_arm_left.addBox(1F, 0F, 0F, 1, 11, 1);
		upper_arm_left.setRotationPoint(5F, 0F, 1F);
		upper_arm_left.setTextureSize(64, 64);
		upper_arm_left.mirror = true;
		setRotation(upper_arm_left, 0F, 0.1115358F, -0.0743572F);
		hand_left = new ModelRenderer(this, 36, 22);
		hand_left.addBox(1F, 11F, -1F, 2, 3, 3);
		hand_left.setRotationPoint(5F, 0F, 1F);
		hand_left.setTextureSize(64, 64);
		hand_left.mirror = true;
		setRotation(hand_left, -0.0743572F, 0F, 0F);
		thigh_right = new ModelRenderer(this, 0, 45);
		thigh_right.addBox(-1F, -1F, 0F, 1, 9, 1);
		thigh_right.setRotationPoint(-3F, 13F, 0F);
		thigh_right.setTextureSize(64, 64);
		thigh_right.mirror = true;
		setRotation(thigh_right, 0F, 0.2602503F, 0F);
		kutu_right = new ModelRenderer(this, 5, 30);
		kutu_right.addBox(-2F, 7F, -1F, 3, 2, 3);
		kutu_right.setRotationPoint(-3F, 13F, 0F);
		kutu_right.setTextureSize(64, 64);
		kutu_right.mirror = true;
		setRotation(kutu_right, 0F, 0.3346075F, 0F);
		boots_right = new ModelRenderer(this, 0, 19);
		boots_right.addBox(-2F, 9F, -3F, 3, 2, 5);
		boots_right.setRotationPoint(-3F, 13F, 0F);
		boots_right.setTextureSize(64, 64);
		boots_right.mirror = true;
		setRotation(boots_right, 0F, 0.2230717F, 0F);
		thigh_left = new ModelRenderer(this, 4, 45);
		thigh_left.addBox(0F, -1F, 0F, 1, 9, 1);
		thigh_left.setRotationPoint(3F, 13F, 0F);
		thigh_left.setTextureSize(64, 64);
		thigh_left.mirror = true;
		setRotation(thigh_left, 0F, -0.2602503F, 0F);
		kutu_left = new ModelRenderer(this, 17, 30);
		kutu_left.addBox(-2F, 7F, -1F, 3, 2, 3);
		kutu_left.setRotationPoint(4F, 13F, 0F);
		kutu_left.setTextureSize(64, 64);
		kutu_left.mirror = true;
		setRotation(kutu_left, 0F, -0.3346075F, 0F);
		boots_left = new ModelRenderer(this, 0, 19);
		boots_left.addBox(-2F, 9F, -3F, 3, 2, 5);
		boots_left.setRotationPoint(4F, 13F, 0F);
		boots_left.setTextureSize(64, 64);
		boots_left.mirror = true;
		setRotation(boots_left, 0F, -0.2230717F, 0F);
		sabre = new ModelRenderer(this, 6, 35);
		sabre.addBox(2F, 11F, -22F, 0, 4, 25);
		sabre.setRotationPoint(5F, 0F, 1F);
		sabre.setTextureSize(64, 64);
		sabre.mirror = true;
		setRotation(sabre, -0.0743572F, 0.0371786F, 0.0174533F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		head.render(f5);
		body.render(f5);
		shoulder_right.render(f5);
		upper_arm_right.render(f5);
		hand_right.render(f5);
		shoulder_left_.render(f5);
		upper_arm_left.render(f5);
		hand_left.render(f5);
		thigh_right.render(f5);
		kutu_right.render(f5);
		boots_right.render(f5);
		thigh_left.render(f5);
		kutu_left.render(f5);
		boots_left.render(f5);
		sabre.render(f5);
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
		head.rotateAngleY = par4 / (180F / (float)Math.PI);
		head.rotateAngleX = par5 / (180F / (float)Math.PI);


		upper_arm_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;
		hand_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;

		sabre.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		upper_arm_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		hand_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		sabre.rotateAngleY = MathHelper.cos(par1 * 0.4662F + (float)Math.PI) * 0.5F * par2;
		upper_arm_left.rotateAngleY = MathHelper.cos(par1 * 0.4662F + (float)Math.PI) * 0.5F * par2;
		hand_left.rotateAngleY = MathHelper.cos(par1 * 0.4662F + (float)Math.PI) * 0.5F * par2;

		thigh_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;
		kutu_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;
		boots_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;

		thigh_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		kutu_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		boots_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;

	}

}
