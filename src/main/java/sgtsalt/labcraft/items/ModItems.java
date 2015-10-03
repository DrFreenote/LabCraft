package sgtsalt.labcraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

    public static Item vialItem;

    public static void createItems() {
        GameRegistry.registerItem(vialItem = new Vial("vialItem"), "Vial");
    }
}
