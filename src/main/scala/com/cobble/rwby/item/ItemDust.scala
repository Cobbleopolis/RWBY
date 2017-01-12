package com.cobble.rwby.item

import com.cobble.rwby.reference.DustTypes.DustType
import com.cobble.rwby.reference.UnlocalizedNames

class ItemDust(dustType: DustType) extends RWBYItem(UnlocalizedNames.Util.getDustCrystalNameFromDustType(dustType)) {

}
