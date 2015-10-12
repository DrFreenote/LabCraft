package sgtsalt.labcraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks
{
	// Create block instance, can be referred to later (for instance, by renderer)
	public static Block labMachine;
	public static Block reagentBottle;
	public static Block labGlass;

	// Register blocks with Forge
	public static void createBlocks()
	{
		GameRegistry.registerBlock(labMachine = new LabMachine("labMachine"), "lab_machine");
		GameRegistry.registerBlock(reagentBottle = new ReagentBottle("reagentBottle"), "reagent_bottle");
		GameRegistry.registerBlock(labGlass = new LabGlass("labGlass"), "lab_glass");
	}
}
