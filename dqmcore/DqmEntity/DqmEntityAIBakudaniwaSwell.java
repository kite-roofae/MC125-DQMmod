package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityAIBakudaniwaSwell extends EntityAIBase
{
	/** The Bakudaniwa that is swelling. */
	DqmEntityBakudaniwa swellingBakudaniwa;
	DqmEntityTameable swellingBakudaniwa2;

	/**
	 * The Bakudaniwa's attack target. This is used for the changing of the Bakudaniwa's state.
	 */
	EntityLiving BakudaniwaAttackTarget;

	public DqmEntityAIBakudaniwaSwell(DqmEntityBakudaniwa par1DqmEntityBakudaniwa,DqmEntityTameable par2DqmEntityTameable)
	{
		swellingBakudaniwa = par1DqmEntityBakudaniwa;
		setMutexBits(1);
		swellingBakudaniwa2 = par2DqmEntityTameable;
		setMutexBits(1);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	@Override
	public boolean shouldExecute()
	{
		EntityLiving entityliving = swellingBakudaniwa.getAttackTarget();
		return swellingBakudaniwa.getCreeperState() > 0 || entityliving != null && swellingBakudaniwa.getDistanceSqToEntity(entityliving) < 9D;
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	@Override
	public void startExecuting()
	{
		swellingBakudaniwa.getNavigator().clearPathEntity();
		BakudaniwaAttackTarget = swellingBakudaniwa.getAttackTarget();
	}

	/**
	 * Resets the task
	 */
	@Override
	public void resetTask()
	{
		BakudaniwaAttackTarget = null;
	}

	/**
	 * Updates the task
	 */
	@Override
	public void updateTask()
	{
		if (BakudaniwaAttackTarget == null)
		{
			swellingBakudaniwa.setCreeperState(-1);
			return;
		}

		if (swellingBakudaniwa.getDistanceSqToEntity(BakudaniwaAttackTarget) > 49D)
		{
			swellingBakudaniwa.setCreeperState(-1);
			return;
		}

		/*if (!swellingBakudaniwa.func_48090_aM().canSee(BakudaniwaAttackTarget))
        {
            swellingBakudaniwa.setCreeperState(-1);
            return;
        }
        else*/
		{
			swellingBakudaniwa.setCreeperState(1);
			return;
		}
	}
}
