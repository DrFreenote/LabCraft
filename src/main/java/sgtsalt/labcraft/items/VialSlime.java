package sgtsalt.labcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VialSlime extends ItemFood
{
	public VialSlime(String unlocalizedName)
	{
		super(0, 0f, false); // amount, saturation, isWolfFood
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
	}
}
