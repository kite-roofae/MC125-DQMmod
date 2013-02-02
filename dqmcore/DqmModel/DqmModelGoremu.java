package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelGoremu extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body;
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

	public DqmModelGoremu()
	{
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 1);
		head.addBox(-3.5F, -10F, -6F, 7, 12, 6);
		head.setRotationPoint(0F, -6F, -1F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 1, 24);
		body.addBox(-6.5F, 0F, -1F, 13, 17, 7);
		body.setRotationPoint(0F, -7F, -1F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0.0371786F, 0F, 0F);
		upper_arm_right = new ModelRenderer(this, 92, 40);
		upper_arm_right.addBox(-4F, 0F, -2F, 4, 15, 4);
		upper_arm_right.setRotationPoint(-8F, -6F, 2F);
		upper_arm_right.setTextureSize(128, 64);
		upper_arm_right.mirror = true;
		setRotation(upper_arm_right, 0F, -0.0743572F, 0.0743572F);
		hand_right = new ModelRenderer(this, 28, 48);
		hand_right.addBox(-6F, 14F, -3F, 6, 6, 6);
		hand_right.setRotationPoint(-8F, -6F, 2F);
		hand_right.setTextureSize(128, 64);
		hand_right.mirror = true;
		setRotation(hand_right, 0F, -0.1115358F, -0.0371786F);
		shoulder_left_ = new ModelRenderer(this, 27, 0);
		shoulder_left_.addBox(-10F, 0F, -3F, 20, 11, 10);
		shoulder_left_.setRotationPoint(0F, -8F, -1F);
		shoulder_left_.setTextureSize(128, 64);
		shoulder_left_.mirror = true;
		setRotation(shoulder_left_, 0.0371786F, 0F, 0F);
		upper_arm_left = new ModelRenderer(this, 109, 40);
		upper_arm_left.addBox(0F, 0F, -2F, 4, 15, 4);
		upper_arm_left.setRotationPoint(8F, -6F, 2F);
		upper_arm_left.setTextureSize(128, 64);
		upper_arm_left.mirror = true;
		setRotation(upper_arm_left, 0F, 0.0743572F, -0.0743572F);
		hand_left = new ModelRenderer(this, 53, 48);
		hand_left.addBox(0F, 14F, -3F, 6, 6, 6);
		hand_left.setRotationPoint(8F, -6F, 2F);
		hand_left.setTextureSize(128, 64);
		hand_left.mirror = true;
		setRotation(hand_left, 0F, 0.1115358F, 0.0371786F);
		thigh_right = new ModelRenderer(this, 91, 5);
		thigh_right.addBox(-2F, 0F, -2F, 4, 10, 4);
		thigh_right.setRotationPoint(-4F, 9F, 2F);
		thigh_right.setTextureSize(128, 64);
		thigh_right.mirror = true;
		setRotation(thigh_right, 0F, 0.0743572F, 0F);
		kutu_right = new ModelRenderer(this, 68, 25);
		kutu_right.addBox(-3F, 7F, -3F, 6, 5, 6);
		kutu_right.setRotationPoint(-4F, 9F, 2F);
		kutu_right.setTextureSize(128, 64);
		kutu_right.mirror = true;
		setRotation(kutu_right, 0F, 0.0743572F, 0F);
		boots_right = new ModelRenderer(this, 41, 34);
		boots_right.addBox(-3F, 12F, -6F, 6, 3, 10);
		boots_right.setRotationPoint(-4F, 9F, 2F);
		boots_right.setTextureSize(128, 64);
		boots_right.mirror = true;
		setRotation(boots_right, 0F, 0.0743572F, 0F);
		thigh_left = new ModelRenderer(this, 108, 5);
		thigh_left.addBox(-2F, 0F, -2F, 4, 10, 4);
		thigh_left.setRotationPoint(4F, 9F, 2F);
		thigh_left.setTextureSize(128, 64);
		thigh_left.mirror = true;
		setRotation(thigh_left, 0F, -0.0743572F, 0F);
		kutu_left = new ModelRenderer(this, 93, 25);
		kutu_left.addBox(-3F, 7F, -3F, 6, 5, 6);
		kutu_left.setRotationPoint(4F, 9F, 2F);
		kutu_left.setTextureSize(128, 64);
		kutu_left.mirror = true;
		setRotation(kutu_left, 0F, -0.0743572F, 0F);
		boots_left = new ModelRenderer(this, 41, 34);
		boots_left.addBox(-3F, 12F, -6F, 6, 3, 10);
		boots_left.setRotationPoint(4F, 9F, 2F);
		boots_left.setTextureSize(128, 64);
		boots_left.mirror = true;
		setRotation(boots_left, 0F, -0.0743572F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		head.render(f5);
		body.render(f5);
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


		upper_arm_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		hand_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		upper_arm_right.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.4F * par2;
		hand_right.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.4F * par2;

		upper_arm_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		hand_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		upper_arm_left.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.4F * par2;
		hand_left.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.4F * par2;

		thigh_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		kutu_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		boots_left.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

		thigh_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		kutu_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		boots_right.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

	}

}
