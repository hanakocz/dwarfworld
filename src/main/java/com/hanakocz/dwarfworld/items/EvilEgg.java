package com.hanakocz.dwarfworld.items;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EvilEgg extends Item{

	protected EvilEgg(String unlocalizedName)
	{
		super();
		this.setTextureName(DwarfWorld.MODID.concat(":EvilEgg"));
		this.setCreativeTab(DwarfWorld.tabName);
		this.setUnlocalizedName("EvilEgg");
		
	}
	
}
