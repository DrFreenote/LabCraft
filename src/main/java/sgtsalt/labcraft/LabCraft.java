package sgtsalt.labcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import sgtsalt.labcraft.proxy.CommonProxy;

@Mod(modid = LabCraft.MODID, name = LabCraft.MODNAME, version = LabCraft.VERSION)
public class LabCraft
{
	//////////
	// Init //
	//////////

	// Constants
	public static final String MODID = "labcraft";
	public static final String MODNAME = "LabCraft";
	public static final String VERSION = "1.0";

	// Create instance of mod
	// Forge will do this automatically, but creating our own lets us interact with it
	@Mod.Instance(MODID)
	public static LabCraft instance = new LabCraft();

	// Create instance of proxy
	// This will vary depending on if the client or server is running
	@SidedProxy(clientSide="sgtsalt.labcraft.proxy.ClientProxy", serverSide="sgtsalt.labcraft.proxy.ServerProxy")
	public static CommonProxy proxy;

	////////////
	// Events //
	////////////

	// Pre-Init
	// Network handling, config file, register item and blocks
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.proxy.preInit(event);
	}

	// Init
	// Register GUIs, tileEntities, crafting recipes, general event handlers
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		this.proxy.init(event);
	}

	// Post-Init
	// Wrap things up.  Run code after other mods have initialized.
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		this.proxy.postInit(event);
	}
}
