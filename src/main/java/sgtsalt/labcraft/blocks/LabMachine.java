package sgtsalt.labcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LabMachine extends Block
{
	public LabMachine(String unlocalizedName)
	{
		super(Material.rock);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.5f);
		this.setResistance(0.5f);
		this.setLightLevel(1.0f);
	}
}
