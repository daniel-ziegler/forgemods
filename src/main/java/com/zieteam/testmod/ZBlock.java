package com.zieteam.testmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZBlock extends Block {

	public ZBlock() {
		super(Material.IRON);
		setHardness(5f);
		setUnlocalizedName("zblock");
		setRegistryName("zblock");
		setCreativeTab(CreativeTabs.MATERIALS);
	}

}
