package sgtsalt.labcraft;

// Scroll down for text tutorial links: http://www.wuppy29.com/minecraft/modding-tutorials/forge-modding-1-8/#sthash.b76vIkL6.dpbs
// This one in particular is useful when it comes to using multiple files to reduce clutter: http://www.wuppy29.com/minecraft/1-8-tutorial/forge-modding-tutorials-1-8-modrecipes/#sthash.3Ie13se7.dpbs

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = LabCraft.MODID, version = LabCraft.VERSION)
public class LabCraft
{
    public static final String MODID = "labcraft";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        System.out.println("LabCraft PreInitialization");

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("In your language, dirt is "+ Blocks.dirt.getLocalizedName());
    }
}
