package com.zieteam.testmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class ZItemBlock extends ItemBlock {

	public ZItemBlock() {
		super(new ZBlock());
		setUnlocalizedName("zieteam.zblock");
		setRegistryName("zblock");
		setCreativeTab(CreativeTabs.MATERIALS);
	}

}
