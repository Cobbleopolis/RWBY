package com.cobble.rwby

import com.cobble.rwby.reference.{RWBYBlocks, Constants}
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemStack}
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class RWBYTab extends CreativeTabs(Constants.MOD_ID) {

    @SideOnly(Side.CLIENT)
    override def getTabIconItem: Item = Item.getItemFromBlock(RWBYBlocks.dustOre)

}
