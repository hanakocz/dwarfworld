package com.hanakocz.dwarfworld;

import com.hanakocz.dwarfworld.tools.DwarfTools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

@Mod(modid = DwarfWorld.MODID, version = DwarfWorld.VERSION, name = DwarfWorld.NAME)
public class DwarfWorld
{
    public static final String MODID = "dwarfworld";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Dwarf World";
    
    
    public static CreativeTabs tabName = new CreativeTabs("DwarfWorld")
	{
		public ItemSword getTabIconItem()
		{
			return DwarfTools.ghostSword;
		}
	};
	
    @Instance
    public static DwarfWorld instance = new DwarfWorld();
    
    @SidedProxy(clientSide="com.hanakocz.dwarfworld.ClientProxy", serverSide="com.hanakocz.dwarfworld.ServerProxy")
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    	
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
		
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    	
    }

}
