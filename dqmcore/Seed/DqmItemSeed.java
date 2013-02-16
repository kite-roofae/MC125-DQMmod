package net.minecraft.src.dqmcore.Seed;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmItemSeed extends Item implements ITextureProvider
{
    private int blockType;
    private int soilBlockID;

    /*
     * mod_hogeCrop�ɂ�����������
     * i�FItemID
     * j�F�Ώۃu���b�N�iBlockHogeCrop�̂��Ɓj
     * k�F��������u���b�N
     */
	public DqmItemSeed(int i, int j, int k)
	{
	super(i);
	blockType = j;
	this.soilBlockID = k;
	}

	/*
	 * ���A����Ƃ��̏�������
	 * ���ɕς���K�v�͂Ȃ��Ǝv���B
	 */
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
		if(l != 1)
		{
			return false;
		}
        if (!entityplayer.canPlayerEdit(i, j, k) || !entityplayer.canPlayerEdit(i, j + 1, k))
        {
            return false;
        }
        int i1 = world.getBlockId(i, j, k);
        if (i1 == soilBlockID && world.isAirBlock(i, j + 1, k))
        {
            world.setBlockWithNotify(i, j + 1, k, blockType);
            itemstack.stackSize--;
            return true;
        }
        else
        {
            return false;
        }
    }
	@Override
	public String getTextureFile()
	{
		return "/dqm/DqmItems.png";
	}
}