package net.minecraft.src.dqmcore.DqmModel;

import net.minecraft.src.*;

public class DqmModelAtorasu extends ModelBase
{
	//fields
	ModelRenderer tuno1;
	ModelRenderer tuno2;
	ModelRenderer atama;
	ModelRenderer karadaue;
	ModelRenderer kosi;
	ModelRenderer karadasita;
	ModelRenderer migiudeue;
	ModelRenderer migiudesita;
	ModelRenderer hidariudeue;
	ModelRenderer hidariudesita;
	ModelRenderer migiasiue;
	ModelRenderer migiasisita;
	ModelRenderer migiasi;
	ModelRenderer hidariasiue;
	ModelRenderer hidariasisita;
	ModelRenderer hidariasi;
	ModelRenderer konboutotte;
	ModelRenderer konbou;

	public DqmModelAtorasu()
	{
		textureWidth = 256;
		textureHeight = 256;

		tuno1 = new ModelRenderer(this, 208, 0);
		tuno1.addBox(-2.5F, -19F, 0F, 5, 5, 0);
		tuno1.setRotationPoint(0F, -74F, 0F);
		tuno1.setTextureSize(256, 256);
		tuno1.mirror = true;
		setRotation(tuno1, 0F, 0F, 0F);
		tuno2 = new ModelRenderer(this, 208, 0);
		tuno2.addBox(0F, -19F, -2.5F, 0, 5, 5);
		tuno2.setRotationPoint(0F, -74F, 0F);
		tuno2.setTextureSize(256, 256);
		tuno2.mirror = true;
		setRotation(tuno2, 0F, 0F, 0F);
		atama = new ModelRenderer(this, 144, 0);
		atama.addBox(-8F, -16F, -8F, 16, 16, 16);
		atama.setRotationPoint(0F, -72F, 0F);
		atama.setTextureSize(256, 256);
		atama.mirror = true;
		setRotation(atama, 0F, 0F, 0F);
		karadaue = new ModelRenderer(this, 0, 0);
		karadaue.addBox(-24F, 0F, -12F, 48, 32, 24);
		karadaue.setRotationPoint(0F, -72F, 0F);
		karadaue.setTextureSize(256, 256);
		karadaue.mirror = true;
		setRotation(karadaue, 0F, 0F, 0F);
		kosi = new ModelRenderer(this, 144, 32);
		kosi.addBox(-18F, 0F, -10F, 36, 6, 20);
		kosi.setRotationPoint(0F, -40F, 0F);
		kosi.setTextureSize(256, 256);
		kosi.mirror = true;
		setRotation(kosi, 0F, 0F, 0F);
		karadasita = new ModelRenderer(this, 0, 56);
		karadasita.addBox(-22F, 0F, -13F, 44, 21, 24);
		karadasita.setRotationPoint(0F, -34F, 0F);
		karadasita.setTextureSize(256, 256);
		karadasita.mirror = true;
		setRotation(karadasita, 0F, 0F, 0F);
		migiudeue = new ModelRenderer(this, 0, 101);
		migiudeue.addBox(-16F, -8F, -8F, 16, 32, 16);
		migiudeue.setRotationPoint(-24F, -64F, 0F);
		migiudeue.setTextureSize(256, 256);
		migiudeue.mirror = true;
		setRotation(migiudeue, -0.2617994F, 0F, 0.0872665F);
		migiudesita = new ModelRenderer(this, 0, 149);
		migiudesita.addBox(-13F, 18F, 6F, 12, 32, 12);
		migiudesita.setRotationPoint(-26F, -64F, 0F);
		migiudesita.setTextureSize(256, 256);
		migiudesita.mirror = true;
		setRotation(migiudesita, -0.7853982F, 0F, 0.0349066F);
		hidariudeue = new ModelRenderer(this, 64, 101);
		hidariudeue.addBox(0F, -8F, -8F, 16, 32, 16);
		hidariudeue.setRotationPoint(24F, -64F, 0F);
		hidariudeue.setTextureSize(256, 256);
		hidariudeue.mirror = true;
		setRotation(hidariudeue, -0.2617994F, 0F, -0.0872665F);
		hidariudesita = new ModelRenderer(this, 64, 149);
		hidariudesita.addBox(4F, 18F, 6F, 12, 32, 12);
		hidariudesita.setRotationPoint(25F, -64F, 0F);
		hidariudesita.setTextureSize(256, 256);
		hidariudesita.mirror = true;
		setRotation(hidariudesita, -0.7853982F, 0F, 0.0349066F);
		migiasiue = new ModelRenderer(this, 144, 58);
		migiasiue.addBox(-6F, 0F, -6F, 12, 32, 12);
		migiasiue.setRotationPoint(-8F, -24F, 0F);
		migiasiue.setTextureSize(256, 256);
		migiasiue.mirror = true;
		setRotation(migiasiue, -0.5235988F, 0.7853982F, -0.0174533F);
		migiasisita = new ModelRenderer(this, 144, 102);
		migiasisita.addBox(-6F, 15F, -29F, 12, 24, 12);
		migiasisita.setRotationPoint(-8F, -24F, 0F);
		migiasisita.setTextureSize(256, 256);
		migiasisita.mirror = true;
		setRotation(migiasisita, 0.3839724F, 0.7853982F, 0F);
		migiasi = new ModelRenderer(this, 144, 138);
		migiasi.addBox(-7F, 40F, -25F, 14, 8, 25);
		migiasi.setRotationPoint(-8F, -24F, 0F);
		migiasi.setTextureSize(256, 256);
		migiasi.mirror = true;
		setRotation(migiasi, 0F, 0.7853982F, 0F);
		hidariasiue = new ModelRenderer(this, 192, 58);
		hidariasiue.addBox(-6F, 0F, -6F, 12, 32, 12);
		hidariasiue.setRotationPoint(8F, -24F, 0F);
		hidariasiue.setTextureSize(256, 256);
		hidariasiue.mirror = true;
		setRotation(hidariasiue, -0.5235988F, -0.7853982F, -0.0174533F);
		hidariasisita = new ModelRenderer(this, 192, 102);
		hidariasisita.addBox(-5F, 15F, -29F, 12, 24, 12);
		hidariasisita.setRotationPoint(8F, -24F, 0F);
		hidariasisita.setTextureSize(256, 256);
		hidariasisita.mirror = true;
		setRotation(hidariasisita, 0.3839724F, -0.7853982F, 0F);
		hidariasi = new ModelRenderer(this, 144, 171);
		hidariasi.addBox(-6F, 40F, -25F, 14, 7, 25);
		hidariasi.setRotationPoint(8F, -24F, 0F);
		hidariasi.setTextureSize(256, 256);
		hidariasi.mirror = true;
		setRotation(hidariasi, 0F, -0.7853982F, 0F);
		konboutotte = new ModelRenderer(this, 0, 193);
		konboutotte.addBox(7F, 0F, -47F, 5, 32, 5);
		konboutotte.setRotationPoint(25F, -64F, 0F);
		konboutotte.setTextureSize(256, 256);
		konboutotte.mirror = true;
		setRotation(konboutotte, 0.7853982F, 0F, 0.0349066F);
		konbou = new ModelRenderer(this, 20, 193);
		konbou.addBox(1F, -32F, -53F, 16, 32, 16);
		konbou.setRotationPoint(24F, -64F, 0F);
		konbou.setTextureSize(256, 256);
		konbou.mirror = true;
		setRotation(konbou, 0.7853982F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		tuno1.render(f5);
		tuno2.render(f5);
		atama.render(f5);
		karadaue.render(f5);
		kosi.render(f5);
		karadasita.render(f5);
		migiudeue.render(f5);
		migiudesita.render(f5);
		hidariudeue.render(f5);
		hidariudesita.render(f5);
		migiasiue.render(f5);
		migiasisita.render(f5);
		migiasi.render(f5);
		hidariasiue.render(f5);
		hidariasisita.render(f5);
		hidariasi.render(f5);
		konboutotte.render(f5);
		konbou.render(f5);
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

		//setRotation(hidariasiue, -0.5235988F, -0.7853982F, -0.0174533F);

		tuno1.rotateAngleY = par4 / (180F / (float)Math.PI);
		tuno2.rotateAngleX = par5 / (180F / (float)Math.PI);
		atama.rotateAngleY = par4 / (180F / (float)Math.PI);
		/*
      float var7 = ((float)Math.PI / 4F);
      //this.spiderLeg1.rotateAngleZ = -var7;
      hidariudeue.rotateAngleX = -var7;
      hidariudesita.rotateAngleX = -var7;
      konbou.rotateAngleX = -var7;
      konboutotte.rotateAngleX = -var7;
      float var8 = -0.0F;
      float var9 = 0.3926991F;
      hidariudeue.rotateAngleX = var9 * 2.0F + var8;
      hidariudesita.rotateAngleX = var9 * 2.0F + var8;
      konbou.rotateAngleX = var9 * 2.0F + var8;
      konboutotte.rotateAngleX = var9 * 2.0F + var8;

      float var10  = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
      hidariudeue.rotateAngleX += var10;
      hidariudesita.rotateAngleX += var10;
      konbou.rotateAngleX += var10;
      konboutotte.rotateAngleX += var10;

      migiudeue.rotateAngleX -= var10;
      migiudesita.rotateAngleX -= var10;

      hidariasiue.rotateAngleX -= var10;
      hidariasisita.rotateAngleX -= var10;
      hidariasi.rotateAngleX -= var10;
      migiasiue.rotateAngleX += var10;
      migiasisita.rotateAngleX += var10;
      migiasi.rotateAngleX += var10;

      hidariudeue.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      hidariudesita.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      konbou.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      konboutotte.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      migiudeue.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      migiudesita.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

      hidariasiue.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      hidariasisita.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      hidariasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      migiasiue.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      migiasisita.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      migiasi.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		 */
	}

}
