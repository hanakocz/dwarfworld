package com.hanakocz.dwarfworld.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class DwarfBlocks {

	public static Block DenseCobble;
	public static Block DoubleDenseCobble;
	public static Block PeaceKeeper;
	public static Block CityProt;
	public static Block PlotProt;
	
	public static final void init()
	{
		GameRegistry.registerBlock(DenseCobble = new DenseCobble("DenseCobble", Material.rock), "DenseCobblestone");
		GameRegistry.registerBlock(DoubleDenseCobble = new DoubleDenseCobble("DoubleDenseCobble", Material.rock), "DoubleDenseCobblestone");
		GameRegistry.registerBlock(PeaceKeeper = new PeaceKeeper("PeaceKeeper", Material.rock), "PeaceKeeper");
		GameRegistry.registerBlock(CityProt = new CityProt("CityProt", Material.rock), "CityProtection");
		GameRegistry.registerBlock(PlotProt = new PlotProt("PlotProt", Material.rock), "PlotProtection");
	}
}
