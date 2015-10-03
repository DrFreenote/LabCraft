package sgtsalt.labcraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems
{
	public static Item labTool;

	public static void createItems()
	{
		labTool = new BasicItem("labTool"); // Create instance of basicItem for labTool
		GameRegistry.registerItem(labTool, "labTool"); // Register it as an Item, and a friendly string
	}
}
