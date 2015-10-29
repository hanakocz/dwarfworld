package com.hanakocz.dwarfworld.blocks;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PlotProt extends Block
{	
	protected PlotProt(String unlocalizedName,Material material) 
	{
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(DwarfWorld.MODID.concat(":").concat(unlocalizedName));
		this.setCreativeTab(DwarfWorld.tabName);
		this.setHardness(6.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
			
	}

}
