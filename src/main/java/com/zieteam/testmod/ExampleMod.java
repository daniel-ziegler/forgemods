package com.zieteam.testmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "testmod";
    public static final String VERSION = "1.0";
    
    @ObjectHolder("testmod:zblock")
    public static final Block zblock = null;
    @ObjectHolder("testmod:zblock")
    public static final Item zitemblock = null;
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("Z BLOCK >> "+new ZItemBlock().getRegistryName());
    }

}
