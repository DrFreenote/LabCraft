package sgtsalt.labcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import sgtsalt.labcraft.blocks.LabMachine;

public class Vial extends Item
{
	public Vial(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if (worldIn.getBlockState(pos).getBlock().getUnlocalizedName().equals("tile.labMachine"))
		{
			System.out.println("DEBUG_MESSAGE: Lab machine found");
		}
		return true;
	}
}
