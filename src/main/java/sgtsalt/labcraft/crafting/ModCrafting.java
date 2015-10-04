package sgtsalt.labcraft.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sgtsalt.labcraft.blocks.ModBlocks;
import sgtsalt.labcraft.items.ModItems;

public class ModCrafting
{
	public static void initCrafting()
	{
		// Crafting recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.vial, 16), " # ", "# #", "###", '#', Blocks.glass); // Vial - Crafting
		GameRegistry.addSmelting(Items.glass_bottle, new ItemStack(ModItems.vial), 0.35F); // Vial - Smelting
		GameRegistry.addRecipe(new ItemStack(ModBlocks.labMachine), "###", "#D#", "###", '#', Blocks.glass, 'D', Items.diamond); // Lab Machine
	}
}
