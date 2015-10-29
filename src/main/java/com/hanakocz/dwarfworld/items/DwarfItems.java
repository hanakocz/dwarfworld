package com.hanakocz.dwarfworld.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class DwarfItems {
	
	public static Item EvilEgg;
	
	public static final void init()
	{
		GameRegistry.registerItem(EvilEgg = new EvilEgg("EvilEgg"), "EvilEgg");
	}

}
