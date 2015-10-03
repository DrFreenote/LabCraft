package sgtsalt.labcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemVial extends Item
{
    private final String name = "vialItem";
    public ItemVial()
    {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(LabCraft.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    public String getName()
    {
        return name;
    }
}
