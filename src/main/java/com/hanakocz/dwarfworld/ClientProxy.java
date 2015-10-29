package com.hanakocz.dwarfworld;

import com.hanakocz.dwarfworld.entities.monster.DwarfBoss;
import com.hanakocz.dwarfworld.entities.monster.DwarfGhost;
import com.hanakocz.dwarfworld.entities.monster.EvilChicken;
import com.hanakocz.dwarfworld.entities.render.RenderDwarfBoss;
import com.hanakocz.dwarfworld.entities.render.RenderDwarfGhost;
import com.hanakocz.dwarfworld.entities.render.RenderEvilChicken;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelChicken;

public class ClientProxy extends CommonProxy 
{
	
	@Override
	public void registerRenderers() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EvilChicken.class, new RenderEvilChicken(new ModelChicken(), 0.1F));
		RenderingRegistry.registerEntityRenderingHandler(DwarfGhost.class, new RenderDwarfGhost(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(DwarfBoss.class, new RenderDwarfBoss(new ModelBiped(), 0.5F ));

	}
	
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}

}
