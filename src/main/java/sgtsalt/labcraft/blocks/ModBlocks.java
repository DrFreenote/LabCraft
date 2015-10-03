package sgtsalt.labcraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks
{
	public static Block labMachine;

	public static void createBlocks()
	{
		// Register block, set light level
		GameRegistry.registerBlock(labMachine = new BasicBlock("labMachine"), "labMachine").setLightLevel(1.0f);
	}
}
