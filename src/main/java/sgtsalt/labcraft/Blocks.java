package sgtsalt.labcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Blocks.MODID, version = Blocks.VERSION)
public class Blocks
{
    public static final String MODID = "labcraft";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("In your language, dirt is "+ net.minecraft.init.Blocks.dirt.getLocalizedName());
    }
}
