package com.zieteam.testmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientEvents {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		Item item = Item.getItemFromBlock(ExampleMod.zblock);
		ModelLoader.setCustomModelResourceLocation(
				item,
				0,
				new ModelResourceLocation(new ResourceLocation("testmod:zblock"), "inventory")
		);
	}
}
