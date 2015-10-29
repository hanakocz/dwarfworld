package com.hanakocz.dwarfworld.entities.monster;

import com.hanakocz.dwarfworld.items.DwarfItems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EvilChicken extends EntityMob{
	
	public EvilChicken(World par1World)
	{
		super(par1World);
		experienceValue = 5;
        this.isImmuneToFire = true;
        
		
        this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 2, true));
        this.targetTasks.addTask(10, new EntityAIHurtByTarget(this, false));
        this.tasks.addTask(3, new EntityAIWander(this, 0.8D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(1, new EntityAISwimming(this));
        /*this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));*/
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.35D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);
	}
	
	protected void dropRareDrop(int par1)
	{
		this.dropItem(DwarfItems.EvilEgg, 1);
	}
	
	protected void dropFewItems(boolean var1, int var2)
    {
        this.entityDropItem(new ItemStack(DwarfItems.EvilEgg), 0.0F);
    }
	
	public boolean isAIEnabled()
	{
		   return true;
	}
	
	protected String getLivingSound()
    {
        return "mob.chicken.say";
    }
	
	protected String getHurtSound()
    {
        return "mob.chicken.hurt";
    }
	
	protected String getDeathSound()
    {
        return "mob.chicken.plop";
    }


} 
