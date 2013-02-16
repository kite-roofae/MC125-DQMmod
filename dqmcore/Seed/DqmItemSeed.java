package net.minecraft.src.dqmcore.Seed;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class DqmItemSeed extends Item implements ITextureProvider
{
    private int blockType;
    private int soilBlockID;

    /*
     * mod_hogeCropにも書いたけど
     * i：ItemID
     * j：対象ブロック（BlockHogeCropのこと）
     * k：成長するブロック
     */
	public DqmItemSeed(int i, int j, int k)
	{
	super(i);
	blockType = j;
	this.soilBlockID = k;
	}

	/*
	 * 種を植えるときの処理判定
	 * 特に変える必要はないと思う。
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