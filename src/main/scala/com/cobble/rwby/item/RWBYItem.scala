package com.cobble.rwby.item

import com.cobble.rwby.RWBY
import com.cobble.rwby.reference.RWBYItems
import net.minecraft.item.Item

class RWBYItem(unlocalizedName: String) extends Item {

    RWBYItems.itemArray += this
    setCreativeTab(RWBY.createiveTab)
    setRegistryName(unlocalizedName)
    setUnlocalizedName(unlocalizedName)
}
