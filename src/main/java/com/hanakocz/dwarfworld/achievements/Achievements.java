package com.hanakocz.dwarfworld.achievements;

import com.hanakocz.dwarfworld.tools.DwarfTools;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class Achievements 
{
	public static Achievement killDwarfBoss = (new Achievement("achievement.killDwarfBoss", "killDwarfBoss", 10, -1, DwarfTools.ghostSword, AchievementList.killEnemy)).setSpecial().registerStat();
	
	
	public static void init()
	{
		
	}
}
