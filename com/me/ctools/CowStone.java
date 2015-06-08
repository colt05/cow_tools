package com.me.ctools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CowStone extends Block{

	protected CowStone() {
		super(Material.clay);
		this.setLightLevel(0.5F);
		this.setHardness(1F);
		this.setBlockTextureName("cowtools:cowstone");
		this.setBlockName("Cow Stone");
		// TODO Auto-generated constructor stub
	}

}
