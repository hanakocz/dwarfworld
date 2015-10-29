package com.hanakocz.dwarfworld.tools;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.item.ItemSword;

public class GhostSword extends ItemSword{

	public GhostSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(DwarfWorld.MODID.concat(":GhostSword"));
		this.setCreativeTab(DwarfWorld.tabName);
		
		
	}
	

}
