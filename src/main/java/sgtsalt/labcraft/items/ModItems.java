package sgtsalt.labcraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems
{
	// Create item instance, can be referred to later (for instance, by renderer)
	public static Item labTool;
	public static Item vial;

	// Register items with Forge
	public static void createItems()
	{
		GameRegistry.registerItem(labTool = new LabTool("labTool"), "labTool");
		GameRegistry.registerItem(vial = new Vial("vial"), "vial");
	}
}
