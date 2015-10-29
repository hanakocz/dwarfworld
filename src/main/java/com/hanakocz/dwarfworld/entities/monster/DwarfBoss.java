package com.hanakocz.dwarfworld.entities.monster;

import com.hanakocz.dwarfworld.DwarfWorld;
import com.hanakocz.dwarfworld.achievements.Achievements;
import com.hanakocz.dwarfworld.tools.DwarfTools;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class DwarfBoss extends EntityMob implements IBossDisplayData
{
	
	public DwarfBoss(World par1World)
	{
		super(par1World);
		experienceValue = 100;
		this.isImmuneToFire = true;
        addRandomArmor();
        
        
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 2, true));
        this.targetTasks.addTask(11, new EntityAIHurtByTarget(this, false));
        this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAISwimming(this));
        this.tasks.addTask(9, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		 super.applyEntityAttributes();
		 
		 this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.4D);
		 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
		 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	}
	protected void addRandomArmor()
	{

		this.setCurrentItemOrArmor(0, new ItemStack(DwarfTools.ghostSword));
		this.setCurrentItemOrArmor(4, new ItemStack(Items.golden_helmet));
	}
	
	protected void dropRareDrop(int par1)
	{
		this.dropItem(DwarfTools.ghostSword, 1);
	}
	
	protected void dropFewItems(boolean var1, int var2)
    {
        this.entityDropItem(new ItemStack(Items.nether_star), 0.0F);
    }
	
	public boolean isAIEnabled()
	{
		   return true;
	}
	
	protected String getLivingSound()
    {
        return "mob.wither.idle";
    }
	
	protected String getHurtSound()
    {
        return "mob.wither.hurt";
    }
	
	protected String getDeathSound()
    {
        return "mob.ghast.death";
    }
	
	public void onDeath(DamageSource p_70645_1_)
    {
        super.onDeath(p_70645_1_);

        if (p_70645_1_.getEntity() instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)p_70645_1_.getEntity();
            entityplayer.triggerAchievement(Achievements.killDwarfBoss);
            
        }
    }
	
	

}
