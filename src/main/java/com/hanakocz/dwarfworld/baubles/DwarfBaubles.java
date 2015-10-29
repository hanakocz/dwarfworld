package com.hanakocz.dwarfworld.baubles;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class DwarfBaubles {
	
	public static Item DwarfBauble;
	
	public static final void init()
	{
		GameRegistry.registerItem(DwarfBauble = new TestRing("TestRing"), "TestRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfRedRing("DwarfRedRing"), "DwarfRedRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfBlueRing("DwarfBlueRing"), "DwarfBlueRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfYellowRing("DwarfYellowRing"), "DwarfYellowRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfCyanRing("DwarfCyanRing"), "DwarfCyanRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfGrayRing("DwarfGrayRing"), "DwarfGrayRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfGreenRing("DwarfGreenRing"), "DwarfGreenRing");
		GameRegistry.registerItem(DwarfBauble = new DwarfPurpleRing("DwarfPurpleRing"), "DwarfPurpleRing");
	}

}
