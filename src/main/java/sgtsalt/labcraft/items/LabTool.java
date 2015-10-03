package sgtsalt.labcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LabTool extends Item
{
	public LabTool(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
