package sgtsalt.labcraft.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sgtsalt.labcraft.blocks.ModBlocks;
import sgtsalt.labcraft.items.ModItems;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.createItems();
		ModBlocks.createBlocks();
	}

	public void init(FMLInitializationEvent event)
	{
	}

	public void postInit(FMLPostInitializationEvent event)
	{
	}
}
