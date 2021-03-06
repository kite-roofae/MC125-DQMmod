package net.minecraft.src.dqmcore;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.forge.IEntityLivingHandler;

public class DqmEntityLivingHandler implements IEntityLivingHandler
{
	private int ccount = 0;
	protected static Random Rand = new Random();
	private int posX = 0;
	private int posY = 0;
	private int posZ = 0;

	//EntityLiving（動物やモブやプレイヤー）がアイテムによらずに自然にスポーンした時に呼ばれます．
	//trueを返すと，スポーン時の処理がここで終了します．
	@Override
	public boolean onEntityLivingSpawn(EntityLiving entity, World world, float x, float y, float z)
	{

		return false;
	}
	//EntityLivingの体力が０になった時に呼ばれます．ここで，体力を回復させないと，また死ぬことになります．
	//Forgeの説明と違いますが，Trueの時バニラの死亡処理を飛ばします．
	@Override
	public boolean onEntityLivingDeath(EntityLiving entity, DamageSource killer)
	{
		return false;
	}
	//EntityLivingが攻撃対象としてAIにセットされた時に呼ばれます．AIのないモブがプレイヤーを見つけた場合には呼ばれません．
	@Override
	public void onEntityLivingSetAttackTarget(EntityLiving entity, EntityLiving target)
	{

	}
	//EntityLivingが攻撃を受けた時に呼ばれます．今回はこれを使います．
	//trueを返すとそれ以降のバニラの処理を飛ばします．
	@Override
	public boolean onEntityLivingAttacked(EntityLiving entity, DamageSource attack, int damage)
	{
		World w = ModLoader.getMinecraftInstance().theWorld;
		if(entity instanceof EntityPlayer && attack.getEntity() instanceof EntityLiving)
			//ここでプレイヤーと攻撃対象を判定
		{
			ItemStack armor = ((EntityPlayer)entity).inventory.armorItemInSlot(2);
			//アーマーインベントリから防具を取得
			if(armor !=null && armor.itemID == mod_Dqm.Honoonoyoroi.shiftedIndex)
			{
				attack.getEntity().setFire(5);
				w.playSoundAtEntity(entity, "DQM_Sound.Honoo", 0.9F, 0.9F);
			}
			if(armor != null && armor.itemID == mod_Dqm.Yaibanoyoroi.shiftedIndex) {
				attack.getEntity().attackEntityFrom(DamageSource.generic, damage / 2);
			}
			w.playSoundAtEntity(entity, "DQM_Sound.Yaiba", 0.9F, 0.9F);
			//攻撃対象に受けたダメージ分与える
		}
		return false;
		//falseで以降のダメージ処理は行う．trueにすればダメージを完全に反射する．
	}
	//EntityLivingがジャンプした時に呼ばれます．
	@Override
	public void onEntityLivingJump(EntityLiving entity)
	{

	}
	//EntityLivingが落ちて地面についた時に呼ばれます．
	//trueを返して以降の処理を飛ばせます．
	@Override
	public boolean onEntityLivingFall(EntityLiving entity, float distance)
	{
		return false;
	}
	//毎tick呼ばれるonUpdateより前に呼ばれます．
	//trueで以降の処理，つまりonUpdateを飛ばせます．
	//TODO アーマー関連の特殊効果処理
	@Override
	public boolean onEntityLivingUpdate(EntityLiving entity)
	{
		EntityLiving ep = ModLoader.getMinecraftInstance().thePlayer;
		World world = ModLoader.getMinecraftInstance().theWorld;
		ItemStack armor = ModLoader.getMinecraftInstance().thePlayer.inventory.armorItemInSlot(2);//アーマーインベントリから防具を取得
		if(armor != null && !ep.isPotionActive(Potion.fireResistance) && armor.itemID == mod_Dqm.Honoonoyoroi.shiftedIndex)
		{
			ep.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 50, 0));
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
		{if(ccount >= 5)
		{
			if(posX != (int)ep.posX || posY != (int)ep.posY || posZ != (int)ep.posZ)
			{
				world.setLightValue(EnumSkyBlock.Block, posX, posY, posZ, 0);
				world.updateAllLightTypes(posX - 1, posY, posZ);
				world.updateAllLightTypes(posX + 1, posY, posZ);
				world.updateAllLightTypes(posX, posY - 1, posZ);
				world.updateAllLightTypes(posX, posY + 1, posZ);
				world.updateAllLightTypes(posX, posY, posZ - 1);
				world.updateAllLightTypes(posX, posY, posZ + 1);
				posX = (int)ep.posX;
				posY = (int)ep.posY;
				posZ = (int)ep.posZ;
			}
			//ep.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 0));
			world.setLightValue(EnumSkyBlock.Block, posX, posY, posZ, 0xbb);
			world.updateAllLightTypes(posX - 1, posY, posZ);
			world.updateAllLightTypes(posX + 1, posY, posZ);
			world.updateAllLightTypes(posX, posY - 1, posZ);
			world.updateAllLightTypes(posX, posY + 1, posZ);
			world.updateAllLightTypes(posX, posY, posZ - 1);
			world.updateAllLightTypes(posX, posY, posZ + 1);
			ccount = 0;
		}
		else ccount++;
		}
		else if((armor == null) || (armor != null && armor.itemID != mod_Dqm.Mirayoroi.shiftedIndex) && ccount <= 5)
		{
			ccount = 6;
			world.updateAllLightTypes(posX, posY, posZ);
			world.updateAllLightTypes(posX - 1, posY, posZ);
			world.updateAllLightTypes(posX + 1, posY, posZ);
			world.updateAllLightTypes(posX, posY - 1, posZ);
			world.updateAllLightTypes(posX, posY + 1, posZ);
			world.updateAllLightTypes(posX, posY, posZ - 1);
			world.updateAllLightTypes(posX, posY, posZ + 1);
		}

		return false;
	}
	//EntityLivingのダメージ処理の中で呼ばれます．
	//返し値を受けてアーマーやポーションの処理が行われます．返し値０で以降の処理を飛ばせます．
	@Override
	public int onEntityLivingHurt(EntityLiving entity, DamageSource source, int damage)
	{
		return damage;
	}

	//EntityLivingが死んでアイテムをドロップするときに呼ばれます．
	//クリーパーからのレコードやプレイヤーのインベントリドロップへの対応は上のonEntityLivingDeathが推奨されています．
	@Override
	public void onEntityLivingDrops(EntityLiving entity, DamageSource source, ArrayList<EntityItem> drops, int lootingLevel, boolean recentlyHit, int specialDropValue)
	{

	}
}
