package net.minecraft.src.dqmcore.Pet;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;

public interface DqmPetListener
{
    void registerBike(Class var1, String var2, int var3);

    void sendBikeData(EntityPlayerSP var1, RidableCreature var2);

    void updatePlayer(EntityPlayer var1);
}
