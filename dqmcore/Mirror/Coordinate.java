package net.minecraft.src.dqmcore.Mirror;

import java.util.ArrayList;
import java.util.List;

public class Coordinate
{
    private int posX;
    private int posY;
    private int posZ;

    public int getPosX()
    {
        return this.posX;
    }

    public void setPosX(int var1)
    {
        this.posX = var1;
    }

    public int getPosY()
    {
        return this.posY;
    }

    public void setPosY(int var1)
    {
        this.posY = var1;
    }

    public int getPosZ()
    {
        return this.posZ;
    }

    public void setPosZ(int var1)
    {
        this.posZ = var1;
    }

    public void setPosition(int var1, int var2, int var3)
    {
        this.posX = var1;
        this.posY = var2;
        this.posZ = var3;
    }

    public Coordinate(int var1, int var2, int var3)
    {
        this.setPosition(var1, var2, var3);
    }

    public Coordinate()
    {
        this(0, 0, 0);
    }

    public boolean equals(Object var1)
    {
        if (!(var1 instanceof Coordinate))
        {
            return false;
        }
        else
        {
            Coordinate var2 = (Coordinate)var1;
            return this.posX == var2.getPosX() && this.posY == var2.getPosY() && this.posZ == var2.getPosZ();
        }
    }

    public int hashCode()
    {
        return this.posX + this.posY + this.posZ;
    }

    public List getAdjacent()
    {
        return this.getAdjacent(false);
    }

    public List getAdjacent(boolean var1)
    {
        ArrayList var2 = new ArrayList();
        var2.add(new Coordinate(this.posX + 1, this.posY, this.posZ));
        var2.add(new Coordinate(this.posX - 1, this.posY, this.posZ));
        var2.add(new Coordinate(this.posX, this.posY, this.posZ + 1));
        var2.add(new Coordinate(this.posX, this.posY, this.posZ - 1));

        if (var1)
        {
            var2.add(new Coordinate(this.posX, this.posY + 1, this.posZ));
            var2.add(new Coordinate(this.posX, this.posY - 1, this.posZ));
        }

        return var2;
    }

    public String toString()
    {
        return this.getClass().getName() + "(" + Integer.toString(this.posX) + "," + Integer.toString(this.posY) + "," + Integer.toString(this.posZ) + ")";
    }
}
