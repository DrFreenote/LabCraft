package sgtsalt.labcraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks
{
	// Create block instance, can be referred to later (for instance, by renderer)
	public static Block labMachine;

	// Register blocks with Forge
	public static void createBlocks()
	{
		GameRegistry.registerBlock(labMachine = new LabMachine("labMachine"), "labMachine");
	}
}
