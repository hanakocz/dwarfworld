package com.hanakocz.dwarfworld.blocks;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DenseCobble extends Block
{

	protected DenseCobble(String unlocalizedName,Material material) 
	{
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(DwarfWorld.MODID.concat(":").concat(unlocalizedName));
		this.setCreativeTab(DwarfWorld.tabName);
		this.setHardness(6.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
			
	}
	
}
