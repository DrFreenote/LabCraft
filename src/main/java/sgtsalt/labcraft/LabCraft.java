package sgtsalt.labcraft;

// Scroll down for text tutorial links: http://www.wuppy29.com/minecraft/modding-tutorials/forge-modding-1-8/#sthash.b76vIkL6.dpbs
// This one in particular is useful when it comes to using multiple files to reduce clutter: http://www.wuppy29.com/minecraft/1-8-tutorial/forge-modding-tutorials-1-8-modrecipes/#sthash.3Ie13se7.dpbs

// This one seems more complete: http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = LabCraft.NAME, modid = LabCraft.MODID, version = LabCraft.VERSION)
public class LabCraft {
    public static final String NAME     = "LabCraft";
    public static final String MODID    = "labcraft"; // I don't think this needs to be lowercase, but I'm leaving it as such regardless.
    public static final String VERSION  = "1.0";

    @SidedProxy(clientSide="sgtsalt.labcraft.ClientProxy", serverSide="sgtsalt.labcraft.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        System.out.println("LabCraft PreInitialization");
        LabCraft.proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("LabCraft Initialization");
        LabCraft.proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("LabCraft PostInitialization");
        LabCraft.proxy.postInit(event);
    }
}
