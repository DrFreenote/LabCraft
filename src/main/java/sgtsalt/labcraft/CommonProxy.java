package sgtsalt.labcraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sgtsalt.labcraft.items.ModItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModItems.createItems();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
