package sgtsalt.labcraft.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import sgtsalt.labcraft.LabCraft;
import sgtsalt.labcraft.blocks.ModBlocks;

public final class BlockRenderRegister
{
	// List of blocks to register below
	public static void registerBlockRenderer()
	{
		reg(ModBlocks.labMachine);
	}

	// Register renderer for Blocks with Forge
	// Pass in unlocalized block name
	public static void reg(Block block)
	{
		String blockName = block.getUnlocalizedName().substring(5); // Get block name from unlocalized name.  substring(5) strips off "tile:"
		ModelResourceLocation resourceLocation = new ModelResourceLocation(LabCraft.MODID + ":" + blockName, "inventory"); // Get model resource location from block name
		int meta = 0; // Any meta data
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, resourceLocation); // Put it all together and pass to .register()
	}
}
