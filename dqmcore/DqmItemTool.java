package net.minecraft.src.dqmcore;

import net.minecraft.src.*;
import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;

public class DqmItemTool extends ItemTool implements ITextureProvider {
	private Block[] blocksEffectiveAgainst;
	private int tool = 0; // �c�[����ʐݒ�
	protected String Texture = "/dqm/DqmItems.png"; // �e�N�X�`���}�b�v�p�X�p�ϐ�
	private int rColor1 = 0xFFFFFF;
	private int rColor2 = 0xFFFFFF;
	private int iconIndex2 = -1; // ��ʂɕ\�������e�N�X�`���ݒ�
	// �c�[���K���A�C�e���ݒ�
	static Block[] pickaxe = new Block[] { Block.cobblestone,
		Block.stairDouble, Block.stairSingle, Block.stone, Block.sandStone,
		Block.cobblestoneMossy, Block.oreIron, Block.blockSteel,
		Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond,
		Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis,
		Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing,
		Block.rail, Block.railDetector, Block.railPowered };
	static Block[] axe = new Block[] { Block.planks, Block.bookShelf,
		Block.wood, Block.chest, Block.stairDouble, Block.stairSingle,
		Block.pumpkin, Block.pumpkinLantern };
	static Block[] spade = new Block[] { Block.grass, Block.dirt, Block.sand,
		Block.gravel, Block.snow, Block.blockSnow, Block.blockClay,
		Block.tilledField, Block.slowSand, Block.mycelium };
	static Block[] hoe = new Block[] { Block.bedrock };// �_�~�[�̃u���b�N�j��K�����L�̓K���Z�b�g

	public DqmItemTool(int id, int toolfalg,
			EnumToolMaterial par3EnumToolMaterial) {
		super(id, toolfalg, par3EnumToolMaterial, hoe);
		tool = toolfalg;
		if (toolfalg == 0) {
			this.blocksEffectiveAgainst = hoe;
		}
		if (toolfalg == 1) {
			this.blocksEffectiveAgainst = spade;
		}
		if (toolfalg == 2) {
			this.blocksEffectiveAgainst = pickaxe;
		}
		if (toolfalg == 3) {
			this.blocksEffectiveAgainst = axe;
		}
		//�@�U���͕␳1�����ɂȂ����ꍇ�Œ�l�Ƃ���1���Z�b�g
		//�@����ȊO�͒ʏ�v�Z���ŏ���
		if(1 > toolfalg + par3EnumToolMaterial.getDamageVsEntity())
        this.damageVsEntity = 1;
	}

    public DqmItemTool setdamageVsEntity(int par1)
    {
        this.damageVsEntity = par1;
        return this;
    }
    public DqmItemTool setIconCoord(int par1, int par2)
    {
        this.iconIndex = par1 + par2 * 16;
        return this;
    }

    public DqmItemTool setIconCoord2(int par1, int par2)
    {
        this.iconIndex2 = par1 + par2 * 16;
        return this;
    }

	@Override
	public DqmItemTool setIconIndex(int par1)
	{
		this.iconIndex = par1;
		return this;
	}
	public DqmItemTool setIconIndex2(int par1)
	{
		this.iconIndex2 = par1;
		return this;
	}
	public DqmItemTool setColor(int par1)
	{
		this.rColor1 = par1;
		return this;
	}
	public DqmItemTool setColor2(int par1)
	{
		this.rColor2 = par1;
		return this;
	}
	public DqmItemTool setTexture(String par1)
	{
		this.Texture = par1;
		return this;
	}

	//�e�N�X�`���̍����̔����L�[
	@Override
	public boolean requiresMultipleRenderPasses() {
		if(iconIndex2 > 0) {//iconIndex2�ɉ��������Ă��獇�������L�[�ɐ^��Ԃ�
			return true;
		}
		return false;
	}
	//��������e�N�X�`���̔ԍ���Ԃ�
	//�u���b�N�̃e�N�X�`���Ɠ����l�ɔԍ����ӂ��Ă���̂ŁA�����Ԃ�
	@Override
	public int func_46057_a(int tex1, int tex2)
	{
			return tex2 > 0 ? iconIndex:iconIndex2;
	}

	// �F�̏�Z
	@Override
	public int getColorFromDamage(int par1, int par2) {
		if (par2 > 0) {
			// ��ɕ`�ʂ����e�N�X�`���̐F��Z
			return rColor1;
		} else {
			// ���n�̃e�N�X�`���̐F��Z
			return rColor2;
		}
	}

	@Override
	public String getTextureFile() {
		// �t�H�[�W�p�g�p�e�N�X�`���ς�
		return Texture;
	}
	public static void addRecipe(Item item1, Item item2, Item item3,
			Object obj) {
		ModLoader.addRecipe(new ItemStack(item1, 1), new Object[] { "x", "y",
			"y", 'x', obj, 'y', Item.stick });
		ModLoader.addRecipe(new ItemStack(item2, 1), new Object[] { "xxx",
			" y ", " y ", 'x', obj, 'y', Item.stick });
		ModLoader.addRecipe(new ItemStack(item3, 1), new Object[] { "xx ",
			"xy ", " y ", 'x', obj, 'y', Item.stick });
	}

	@Override
	public boolean canHarvestBlock(Block par1Block) // �V���x���p����
	{
		if (tool == 1) {
			return par1Block == Block.snow ? true
					: par1Block == Block.blockSnow;
		} else if (tool == 2) {
			return par1Block == Block.obsidian ? this.toolMaterial
					.getHarvestLevel() == 3
					: (par1Block != Block.blockDiamond
					&& par1Block != Block.oreDiamond ? (par1Block != Block.blockGold
					&& par1Block != Block.oreGold ? (par1Block != Block.blockSteel
					&& par1Block != Block.oreIron ? (par1Block != Block.blockLapis
					&& par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone
					&& par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true
							: par1Block.blockMaterial == Material.iron)
							: this.toolMaterial.getHarvestLevel() >= 2)
							: this.toolMaterial.getHarvestLevel() >= 1)
							: this.toolMaterial.getHarvestLevel() >= 1)
							: this.toolMaterial.getHarvestLevel() >= 2)
							: this.toolMaterial.getHarvestLevel() >= 2);
		}
		return false;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		if (tool == 2) {
			return par2Block != null
					&& (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial
							: super.getStrVsBlock(par1ItemStack, par2Block);
		} else if (tool == 3) {
			return par2Block != null
					&& par2Block.blockMaterial == Material.wood ? this.efficiencyOnProperMaterial
							: super.getStrVsBlock(par1ItemStack, par2Block);
		} else if (tool == 1) {
			for (int var3 = 0; var3 < this.blocksEffectiveAgainst.length; ++var3) {
				if (this.blocksEffectiveAgainst[var3] == par2Block) {
					return this.efficiencyOnProperMaterial;
				}
			}
		}

		return 1.0F;
	}
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
    {
    	if(tool == 0) {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
        {
            return false;
        }
        else
        {
            if (ForgeHooks.onUseHoe(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6))
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }
            int var8 = par3World.getBlockId(par4, par5, par6);
            int var9 = par3World.getBlockId(par4, par5 + 1, par6);

            if ((par7 == 0 || var9 != 0 || var8 != Block.grass.blockID) && var8 != Block.dirt.blockID)
            {
                return false;
            }
            else
            {
                Block var10 = Block.tilledField;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var10.stepSound.getStepSound(), (var10.stepSound.getVolume() + 1.0F) / 2.0F, var10.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    par3World.setBlockWithNotify(par4, par5, par6, var10.blockID);
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            }
        }
        }
    	else return false;
    }

	@Override
	public boolean isItemTool(ItemStack par1ItemStack)
	{
		return this.getItemStackLimit() == 1 && this.isDamageable();
		//		return par1ItemStack.stackSize == 1;
	}

	@Override
	public float getStrVsBlock(ItemStack stack, Block block, int meta) {
		if (ForgeHooks.isToolEffective(stack, block, meta)) {
			return efficiencyOnProperMaterial;
		}
		return getStrVsBlock(stack, block);
	}

}