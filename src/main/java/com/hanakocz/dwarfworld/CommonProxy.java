package com.hanakocz.dwarfworld;

import com.hanakocz.dwarfworld.achievements.Achievements;
import com.hanakocz.dwarfworld.baubles.DwarfBaubles;
import com.hanakocz.dwarfworld.blocks.DwarfBlocks;
import com.hanakocz.dwarfworld.entities.monster.DwarfMonsters;
import com.hanakocz.dwarfworld.items.DwarfItems;
import com.hanakocz.dwarfworld.tools.DwarfTools;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void registerRenderers()
	{
		
	}
	
	public void preInit(FMLPreInitializationEvent event)
	{
		DwarfItems.init();
		DwarfBlocks.init();
		DwarfTools.init();
		DwarfBaubles.init();
		DwarfMonsters.init();
		Achievements.init();
		registerRenderers();
				
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	

}
