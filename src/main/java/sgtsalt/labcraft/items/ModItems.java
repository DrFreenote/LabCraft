package sgtsalt.labcraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems
{
	// Create item instance, can be referred to later (for instance, by renderer)
	public static Item labTool = new LabTool("labTool");
	public static Item vial = new Vial("vial");
	public static Item vialSlime = new VialSlime("vialSlime").setAlwaysEdible();

	// Register items with Forge
	public static void createItems()
	{
		GameRegistry.registerItem(labTool, "lab_tool");
		GameRegistry.registerItem(vial, "vial");
		GameRegistry.registerItem(vialSlime, "vial_slime");
	}
}
