package sgtsalt.labcraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks
{
	// Create block instance, can be referred to later (for instance, by renderer)
	public static Block labMachine = new LabMachine("labMachine");
	public static Block reagentBottle = new ReagentBottle("reagentBottle");
	public static Block labGlass = new LabGlass("labGlass");

	// Register blocks with Forge
	public static void createBlocks()
	{
		GameRegistry.registerBlock(labMachine, "lab_machine");
		GameRegistry.registerBlock(reagentBottle, "reagent_bottle");
		GameRegistry.registerBlock(labGlass, "lab_glass");
	}
}
