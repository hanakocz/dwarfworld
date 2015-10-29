package com.hanakocz.dwarfworld.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public final class DwarfTools {
	
	public static ItemSword ghostSword;
	
	public static ToolMaterial ghostMetal = EnumHelper.addToolMaterial("ghostMetal", 2, 66, 6.0F, 3.0F, 18);
	public static final void init()
	{
		GameRegistry.registerItem(ghostSword = new GhostSword("GhostSword", ghostMetal), "GhostSword");
	}

}
