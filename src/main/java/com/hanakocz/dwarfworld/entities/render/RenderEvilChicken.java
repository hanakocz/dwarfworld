package com.hanakocz.dwarfworld.entities.render;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEvilChicken extends RenderChicken {

	private static final ResourceLocation textureLocation = new ResourceLocation(DwarfWorld.MODID + ":" + "textures/models/entityEvilChicken.png");

	public RenderEvilChicken(ModelChicken model, float shadowSize) 
		{
			super(model, shadowSize);
		}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return textureLocation;
	}
	
	/*@Override
	protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.handleRotationFloat((EvilChicken)p_77044_1_, p_77044_2_);
    }
	
	@Override
	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        this.doRender((EvilChicken)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }
	
	@Override
	public void doRender(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        this.doRender((EvilChicken)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }*/

}