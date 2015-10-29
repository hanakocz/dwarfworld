package com.hanakocz.dwarfworld.entities.render;

import com.hanakocz.dwarfworld.DwarfWorld;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.util.ResourceLocation;

public class RenderDwarfBoss extends RenderBiped{
	
	private static final ResourceLocation textureLocation = new ResourceLocation(DwarfWorld.MODID + ":" + "textures/models/entityDwarfBoss.png");	

	public RenderDwarfBoss (ModelBiped model, float shadowSize)
	{
		super(model, shadowSize);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return textureLocation;
	}
	
	@Override
	public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        BossStatus.setBossStatus((IBossDisplayData) par1EntityLiving, false);

        super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
    }
}
