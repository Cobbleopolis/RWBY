package com.cobble.rwby.block

import com.cobble.rwby.RWBY
import com.cobble.rwby.reference.RWBYBlocks
import net.minecraft.block.Block
import net.minecraft.block.material.Material

abstract class RWBYBlock(material: Material) extends Block(material) {
    RWBYBlocks.blockArray += this
    setCreativeTab(RWBY.createiveTab)
}
