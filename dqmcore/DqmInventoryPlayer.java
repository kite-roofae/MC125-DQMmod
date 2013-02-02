package net.minecraft.src.dqmcore;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public class DqmInventoryPlayer extends InventoryPlayer {
	public ISaveHandler saveHandler=null;
	mod_Dqm Dqm;
	Minecraft mc;
	private int[] SpawnPosition;
	public static int EpPositionX;
	public static int EpPositionY;
	public static int EpPositionZ;

	//Constructor method
	public DqmInventoryPlayer(InventoryPlayer oldInventory,ISaveHandler saveHandler){
		//This inventory will belong to the inventory of the old player;
		super(oldInventory.player);
		//Copy over ALL the key data from the old player inventory
	    mainInventory=oldInventory.mainInventory;
	    armorInventory=oldInventory.armorInventory;
	    currentItem=oldInventory.currentItem;
	    setItemStack(oldInventory.getItemStack());
	    inventoryChanged=oldInventory.inventoryChanged;
	    //Set the save handler that this inventory belongs to; to the save handler of the current world
	    this.saveHandler=saveHandler;

	}



	//Method from parent overridden so you can keep your items on death!
	@Override
    public void dropAllItems()
    {
        int var1;
		EntityPlayer ep = ModLoader.getMinecraftInstance().thePlayer;
		World world = ModLoader.getMinecraftInstance().theWorld;
		WorldInfo w = world.getWorldInfo();
		InventoryPlayer inventory = ep.inventory;
		ItemStack itemstack;
		SpawnPosition = new int[]{w.getSpawnX(), w.getSpawnY(), w.getSpawnZ()};
        for (var1 = 0; var1 < this.mainInventory.length; ++var1)
        {
            if (this.mainInventory[var1] != null && this.mainInventory[var1].itemID == Dqm.Inotinoisi.shiftedIndex && ep.getHealth() <= 0 && this.mainInventory[var1].stackSize > 0)
            {
            	itemstack = this.mainInventory[var1];
        			w.setSpawnPosition(EpPositionX,EpPositionY,EpPositionZ);
        			itemstack.damageItem(2, ep);
        			ep.respawnPlayer();
        			w.setSpawnPosition(SpawnPosition[0],SpawnPosition[1],SpawnPosition[2]);
        			world.playSoundAtEntity(ep, "DQM_Sound.Inoti", 0.9F, 0.9F);
            }
            if (this.mainInventory[var1] != null && !Dqm.Keep)
            {
                this.player.dropPlayerItemWithRandomChoice(this.mainInventory[var1], true);
                this.mainInventory[var1] = null;
            }
        }

        for (var1 = 0; var1 < this.armorInventory.length; ++var1)
        {
            if (this.armorInventory[var1] != null && !Dqm.Keep)
            {
                this.player.dropPlayerItemWithRandomChoice(this.armorInventory[var1], true);
                this.armorInventory[var1] = null;
            }
        }
    }
//    public void dropAllItems()
//    {
//		/*Now you can go back and exact vengeance, on that last group of skeleton archers/blaze gaurdians who murdered you,
//		  WITHOUT the hassle of reorganizing your inventory;*/
//    	return;
//    }
	@Override
	public void decrementAnimations(){
		super.decrementAnimations();

	}

}
