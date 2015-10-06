package sgtsalt.labcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class Vial extends Item
{
	public Vial(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	// If you right click a vial
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		// If you right click a lab machine
		if (worldIn.getBlockState(pos).getBlock().getUnlocalizedName().equals("tile.labMachine"))
		{
			--stack.stackSize; // Remove old vial
			playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.vialSlime, 1)); // Give new slime vial
			worldIn.playSoundAtEntity(playerIn, "random.drink", 0.4F, 1.2F); // Sound effect
		}
		return true;
	}
}
