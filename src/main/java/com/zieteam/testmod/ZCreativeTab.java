package com.zieteam.testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ZCreativeTab extends CreativeTabs {

	public ZCreativeTab() {
		super("zieteam");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(new ZItemBlock());
	}

}
