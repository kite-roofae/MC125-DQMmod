package net.minecraft.src.dqmcore.Block;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class DqmSixBlock extends Block implements ITextureProvider
{
/*
�e�N���X������������K�v�����邽�ߒ�`
*/
public DqmSixBlock(int i, int j)
{
/*
Material.rock�F�΂Ɠ����������������`�����Ă��邾���ł��B
*/
	super(i, j, Material.rock);
}



public int getBlockTextureFromSideAndMetadata(int i, int j)
{
	if (i == 0)//���
	{
		return 4;
	}
    if (i == 1)//���
    {
        return 1;
    }
    if (i == 2)//����
    {
        return 2;
    }
    if (i == 3)//����
    {
        return 3;
    }
    if (i == 4)//�k��
    {
        return 160;
    }
    if (i == 5)//���
    {
        return 161;
    }
else
{
    return 5;
}

}

    /*
�u���b�N���j�󂳂ꂽ���Ƀh���b�v������̂�ݒ�
return��this.blockID�Ȃ̂œ��������h���b�v�����Ă��܂�
*/
public int idDropped(int i, int j,Random random)
    {
        return this.blockID;
    }
    /*
��L�j�󎞂̃h���b�v�A�C�e���̌����w��
return��1�h���b�v����悤�Ɏw�肵�Ă��܂��B
*/
public int quantityDropped(Random random)
    {
        return 1;
    }
@Override
public String getTextureFile()
{
	return "/dqm/DqmTerrain.png";
}
}