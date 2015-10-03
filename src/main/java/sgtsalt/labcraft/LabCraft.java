package sgtsalt.labcraft;

// Scroll down for text tutorial links: http://www.wuppy29.com/minecraft/modding-tutorials/forge-modding-1-8/#sthash.b76vIkL6.dpbs

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = LabCraft.MODID, version = LabCraft.VERSION)
public class LabCraft
{
    public static final String MODID = "labcraft";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("In your language, dirt is "+ Blocks.dirt.getLocalizedName());
    }
}
