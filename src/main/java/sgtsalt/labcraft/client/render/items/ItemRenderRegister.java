package sgtsalt.labcraft.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import sgtsalt.labcraft.LabCraft;
import sgtsalt.labcraft.items.ModItems;

public class ItemRenderRegister
{
	// List of items to register below
	public static void registerItemRenderer()
	{
		reg(ModItems.labTool);
	}

	// Register renderer for Items with Forge
	// Pass in unlocalized item name
	public static void reg(Item item)
	{
		String itemName = item.getUnlocalizedName().substring(5); // Get item name from unlocalized name.  substring(5) strips off "item:"
		ModelResourceLocation resourceLocation = new ModelResourceLocation(LabCraft.MODID + ":" + itemName, "inventory"); // Get model resource location from item name
		int meta = 0; // Any meta data
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, resourceLocation); // Put it all together and pass to .register()
	}
}
