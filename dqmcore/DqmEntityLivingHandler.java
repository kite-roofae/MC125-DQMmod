package net.minecraft.src.dqmcore;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.forge.IEntityLivingHandler;

public class DqmEntityLivingHandler implements IEntityLivingHandler
{
	private int c = 0;
	protected static Random Rand = new Random();

	//EntityLiving�i�����⃂�u��v���C���[�j���A�C�e���ɂ�炸�Ɏ��R�ɃX�|�[���������ɌĂ΂�܂��D
	//true��Ԃ��ƁC�X�|�[�����̏����������ŏI�����܂��D
	@Override
	public boolean onEntityLivingSpawn(EntityLiving entity, World world, float x, float y, float z)
	{

		return false;
	}
	//EntityLiving�̗̑͂��O�ɂȂ������ɌĂ΂�܂��D�����ŁC�̗͂��񕜂����Ȃ��ƁC�܂����ʂ��ƂɂȂ�܂��D
	//Forge�̐����ƈႢ�܂����CTrue�̎��o�j���̎��S�������΂��܂��D
	@Override
	public boolean onEntityLivingDeath(EntityLiving entity, DamageSource killer)
	{
		return false;
	}
	//EntityLiving���U���ΏۂƂ���AI�ɃZ�b�g���ꂽ���ɌĂ΂�܂��DAI�̂Ȃ����u���v���C���[���������ꍇ�ɂ͌Ă΂�܂���D
	@Override
	public void onEntityLivingSetAttackTarget(EntityLiving entity, EntityLiving target)
	{

	}
	//EntityLiving���U�����󂯂����ɌĂ΂�܂��D����͂�����g���܂��D
	//true��Ԃ��Ƃ���ȍ~�̃o�j���̏������΂��܂��D
	@Override
	public boolean onEntityLivingAttacked(EntityLiving entity, DamageSource attack, int damage)
	{
		if(entity instanceof EntityPlayer && attack.getEntity() instanceof EntityLiving)
			//�����Ńv���C���[�ƍU���Ώۂ𔻒�
		{
				ItemStack armor = ((EntityPlayer)entity).inventory.armorItemInSlot(2);
				//�A�[�}�[�C���x���g������h����擾
				if(armor !=null && armor.itemID == mod_Dqm.Honoonoyoroi.shiftedIndex)
				{
					attack.getEntity().setFire(10);
				}
				if(armor != null && armor.itemID == mod_Dqm.Yaibanoyoroi.shiftedIndex)
					attack.getEntity().attackEntityFrom(DamageSource.generic, damage / 2);
					//�U���ΏۂɎ󂯂��_���[�W���^����
		}
		return false;
		//false�ňȍ~�̃_���[�W�����͍s���Dtrue�ɂ���΃_���[�W�����S�ɔ��˂���D
	}
	//EntityLiving���W�����v�������ɌĂ΂�܂��D
	@Override
	public void onEntityLivingJump(EntityLiving entity)
	{

	}
	//EntityLiving�������Ēn�ʂɂ������ɌĂ΂�܂��D
	//true��Ԃ��Ĉȍ~�̏������΂��܂��D
	@Override
	public boolean onEntityLivingFall(EntityLiving entity, float distance)
	{
		return false;
	}
	//��tick�Ă΂��onUpdate���O�ɌĂ΂�܂��D
	//true�ňȍ~�̏����C�܂�onUpdate���΂��܂��D
	//TODO �A�[�}�[�֘A�̓�����ʏ���
	@Override
	public boolean onEntityLivingUpdate(EntityLiving entity)
	{
		EntityLiving ep = ModLoader.getMinecraftInstance().thePlayer;
		World world = ModLoader.getMinecraftInstance().theWorld;
		ItemStack armor = ModLoader.getMinecraftInstance().thePlayer.inventory.armorItemInSlot(2);//�A�[�}�[�C���x���g������h����擾
		if(armor != null && !ep.isPotionActive(Potion.fireResistance) && armor.itemID == mod_Dqm.Honoonoyoroi.shiftedIndex)
		{
			ep.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1, 0));
		}
		if(armor != null && !ep.isPotionActive(Potion.regeneration) && armor.itemID == mod_Dqm.Sinpinoyoroi.shiftedIndex)
		{
			ep.addPotionEffect(new PotionEffect(Potion.regeneration.id, 30, 0));
			if(Rand.nextInt(5) <= 1){armor.damageItem(1, ep);}
		}
		if(armor != null && ep.isPotionActive(Potion.poison) && armor.itemID == mod_Dqm.Urokonoyoroi.shiftedIndex)
		{
			ep.removePotionEffect(Potion.poison.id);
		}
		if(armor != null && ep.isBurning() && armor.itemID == mod_Dqm.Doragonmeiru.shiftedIndex)
		{
			ep.extinguish();
		}
		if(armor != null /*&& !ep.isPotionActive(Potion.nightVision)*/ && armor.itemID == mod_Dqm.Mirayoroi.shiftedIndex)
		{
			//ep.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 0));
			world.setLightValue(EnumSkyBlock.Block, (int)ep.posX, (int)ep.posY, (int)ep.posZ, 0xff);
			world.updateAllLightTypes((int)ep.posX - 1, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX + 1, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY - 1, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY + 1, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ - 1);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ + 1);
			c = 0;
		}
		else if((armor == null) || (armor != null && armor.itemID != mod_Dqm.Mirayoroi.shiftedIndex) && c == 0)
		{
			c = 1;
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX - 1, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX - 2, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX + 1, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX + 2, (int)ep.posY, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY - 1, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY + 1, (int)ep.posZ);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ - 1);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ - 2);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ + 1);
			world.updateAllLightTypes((int)ep.posX, (int)ep.posY, (int)ep.posZ + 2);
		}

		return false;
	}
	//EntityLiving�̃_���[�W�����̒��ŌĂ΂�܂��D
	//�Ԃ��l���󂯂ăA�[�}�[��|�[�V�����̏������s���܂��D�Ԃ��l�O�ňȍ~�̏������΂��܂��D
	@Override
	public int onEntityLivingHurt(EntityLiving entity, DamageSource source, int damage)
	{
		return damage;
	}

	//EntityLiving������ŃA�C�e�����h���b�v����Ƃ��ɌĂ΂�܂��D
	//�N���[�p�[����̃��R�[�h��v���C���[�̃C���x���g���h���b�v�ւ̑Ή��͏��onEntityLivingDeath����������Ă��܂��D
	@Override
	public void onEntityLivingDrops(EntityLiving entity, DamageSource source, ArrayList<EntityItem> drops, int lootingLevel, boolean recentlyHit, int specialDropValue)
	{

	}
}
