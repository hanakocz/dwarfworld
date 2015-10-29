package com.hanakocz.dwarfworld.entities.render;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDwarfGhost extends RenderBiped{
	
	private static final ResourceLocation textureLocation = new ResourceLocation(DwarfWorld.MODID + ":" + "textures/models/entityDwarfGhost.png");	

	public RenderDwarfGhost (ModelBiped model, float shadowSize)
	{
		super(model, shadowSize);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return textureLocation;
	}
}
