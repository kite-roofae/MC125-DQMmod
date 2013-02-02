package net.minecraft.src.dqmcore.DqmEntity;

import net.minecraft.src.*;

public class DqmEntityAIEsterkSwell extends EntityAIBase
{
	/** The Esterk that is swelling. */
	DqmEntityEsterk swellingEsterk;
	DqmEntityTameable swellingEsterk2;


	/**
	 * The Esterk's attack target. This is used for the changing of the Esterk's state.
	 */
	EntityLiving EsterkAttackTarget;

	public DqmEntityAIEsterkSwell(DqmEntityEsterk par1DqmEntityEsterk,DqmEntityTameable par2DqmEntityTameable)
	{
		swellingEsterk = par1DqmEntityEsterk;
		setMutexBits(1);
		swellingEsterk2 = par2DqmEntityTameable;
		setMutexBits(1);

	}



	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	@Override
	public boolean shouldExecute()
	{
		EntityLiving entityliving = swellingEsterk.getAttackTarget();
		return swellingEsterk.getCreeperState() > 0 || entityliving != null && swellingEsterk.getDistanceSqToEntity(entityliving) < 9D;
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	@Override
	public void startExecuting()
	{
		swellingEsterk.getNavigator().clearPathEntity();
		EsterkAttackTarget = swellingEsterk.getAttackTarget();
	}

	/**
	 * Resets the task
	 */
	@Override
	public void resetTask()
	{
		EsterkAttackTarget = null;
	}

	/**
	 * Updates the task
	 */
	@Override
	public void updateTask()
	{
		if (EsterkAttackTarget == null)
		{
			swellingEsterk.setCreeperState(-1);
			return;
		}

		if (swellingEsterk.getDistanceSqToEntity(EsterkAttackTarget) > 49D)
		{
			swellingEsterk.setCreeperState(-1);
			return;
		}

		/*if (!swellingEsterk.func_48090_aM().canSee(EsterkAttackTarget))
        {
            swellingEsterk.setCreeperState(-1);
            return;
        }
        else*/
		{
			swellingEsterk.setCreeperState(1);
			return;
		}
	}
}
