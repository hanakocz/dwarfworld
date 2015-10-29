package com.hanakocz.dwarfworld.blocks;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DoubleDenseCobble extends Block{

	protected DoubleDenseCobble(String unlocalizedName,Material material) 
	{
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(DwarfWorld.MODID.concat(":").concat(unlocalizedName));
		this.setCreativeTab(DwarfWorld.tabName);
		this.setHardness(10.0F);
		this.setResistance(20.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
		
		
	}
	
	


	

}
