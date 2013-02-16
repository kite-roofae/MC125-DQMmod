package net.minecraft.src.dqmcore.Seed;

import java.util.Random;
import net.minecraft.src.*;
import java.util.ArrayList;
import net.minecraft.src.forge.ITextureProvider;

public class DqmMamoriSeed3 extends BlockFlower implements ITextureProvider
{

    public DqmMamoriSeed3(int i, int j)
    {
        super(i, j);
        blockIndexInTexture = j;
        setTickRandomly(true);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setStepSound(soundGrassFootstep);
    }

    /*
     * �Ώۃu���b�N�ŐA���������ł��邩�̔��肾�����͂��B
     */
    protected boolean canThisPlantGrowOnThisBlockID(int i)
    {
        return i == Block.tilledField.blockID;
    }


    /*
     * �����Ő�����������
     * world.getBlockLightValue�����x����
     * 9�ȏ�Ȃ琬�������Ƃ����L�q�@�ő�15�i���z����ԏƂ��Ă���Ƃ��j
     */
    public void updateTick(World world, int i, int j, int k, Random random)
    {
        super.updateTick(world, i, j, k, random);
        if (world.getBlockLightValue(i, j + 1, k) >= 9)
        {
            int l = world.getBlockMetadata(i, j, k);
            if (l < 7)
            {
                float f = getGrowthRate(world, i, j, k);
                if (random.nextInt((int)(25F / f) + 1) == 0)
                {
                    l++;
                    world.setBlockMetadataWithNotify(i, j, k, l);
                }
            }
        }
    }

    /*
     * ���m�F�ł����A�����ō����������Ă�͂��B
     */
    public void fertilize(World world, int i, int j, int k)
    {
        world.setBlockMetadataWithNotify(i, j, k, 7);
    }

    /*
     * �������x���Ǘ����Ă��郁�\�b�h�ł��B
     * �ŏ��̍s��
     * float f = 1.0F;�@�ŊǗ����Ă�̂ŁA���̐������₹�΃O���O��
     */
    private float getGrowthRate(World world, int i, int j, int k)
    {
        float f = 1.0F;
        int l = world.getBlockId(i, j, k - 1);
        int i1 = world.getBlockId(i, j, k + 1);
        int j1 = world.getBlockId(i - 1, j, k);
        int k1 = world.getBlockId(i + 1, j, k);
        int l1 = world.getBlockId(i - 1, j, k - 1);
        int i2 = world.getBlockId(i + 1, j, k - 1);
        int j2 = world.getBlockId(i + 1, j, k + 1);
        int k2 = world.getBlockId(i - 1, j, k + 1);
        boolean flag = j1 == blockID || k1 == blockID;
        boolean flag1 = l == blockID || i1 == blockID;
        boolean flag2 = l1 == blockID || i2 == blockID || j2 == blockID || k2 == blockID;
        for (int l2 = i - 1; l2 <= i + 1; l2++)
        {
            for (int i3 = k - 1; i3 <= k + 1; i3++)
            {
                int j3 = world.getBlockId(l2, j - 1, i3);
                float f1 = 0.0F;
                if (j3 == Block.tilledField.blockID)
                {
                    f1 = 1.0F;
                    if (world.getBlockMetadata(l2, j - 1, i3) > 0)
                    {
                        f1 = 3F;
                    }
                }
                if (l2 != i || i3 != k)
                {
                    f1 /= 4F;
                }
                f += f1;
            }
        }

        if (flag2 || flag && flag1)
        {
            f /= 2.0F;
        }
        return f;
    }

    /*
     * �������̃e�N�X�`����i�K�I�ɔ��f������̂͂���
     */
    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
    	if (j == 0)
    	{
    		return 48;
    	}
        if (j == 1)
        {
            return 49;
        }
        if (j == 2)
        {
            return 50;
        }
        if (j == 3)
        {
            return 51;
        }
        if (j == 4)
        {
            return 52;
        }
        if (j == 5)
        {
            return 53;
        }
        if (j == 6)
        {
            return 54;
        }
        if (j == 7)
        {
            return 54;
        }
        if (j == 8)
        {
            return 57;
        }
        else
        {
        	return 48;
        }

    }
    //1�Œ��S���\���P �A6�Ŏl�p�ɂS��

    public int getRenderType()
    {
        return 1;
    }

    /*
     * �����i�K���ő�̍ۂ̎��n�����ꍇ�̔���
     * �G���`�����g�A�C�e���i�t�H�[�`�����j�g�p���̐ݒ��for���̂Ƃ���B
     */
    /*
    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int i, int j, int k, int meta, int fortune)
    {
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        if (meta == 6)
        {
        	ret.add(new ItemStack(Item.wheat));
        }

        for (int n = 0; n < 3 + fortune; n++)
        {
            if (world.rand.nextInt(15) <= meta)
            {
                ret.add(new ItemStack(Item.seeds));
            }
        }
        return ret;
    }*/


    /*
     * �������O�i�K�̍앨���󂵂����̔���ł����B
     * �Ȃ̂ŁA����1�������Ē�`�ł��B
     * ������ return Item.wheat.shiftedIndex�Ŕj�󎞏������h���b�v�����Ă��܂���
     * �I���W�i���̍앨������ꍇ�͂����Őݒ肵�܂��B
     */
    public int idDropped(int i, Random random, int j)
    {
        if (i <= 7 && i >= 3)
        {
            return this.blockID;
        }
        if (i == 8)
        {
            return mod_Dqm.Mamorinotane3.shiftedIndex;

        }
        else
        {
            return -1;
        }
    }
    /*
     * �h���b�v�A�C�e���̌����w��
     * return �̌�̐����ŕς��܂��B
     */
    public int quantityDropped(Random random)
    {
        return 1;
    }
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmSeeds.png";
	}

}