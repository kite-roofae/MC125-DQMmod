package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmOneBlock extends Block implements ITextureProvider
{ //�N���X�{�́BBlock�N���X���p������

   public DqmOneBlock(int i, int j) //�u���b�N�̊�{�ݒ�
   {
      super(i, j, Material.ground); //�ގ���y��
   }

   public int idDropped(int i, int j,Random random)
   {
      return this.blockID; //�󂵂��Ƃ��ɂ��̃u���b�N���h���b�v����
   }
   public int quantityDropped(Random random)
   {
      return 1; //idDroped�Ńh���b�v���鐔��ݒ�
   }
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmOre.png";
	}
}