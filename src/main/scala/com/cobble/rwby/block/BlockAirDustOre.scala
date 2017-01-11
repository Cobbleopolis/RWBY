package com.cobble.rwby.block

import com.cobble.rwby.reference.UnlocalizedNames
import net.minecraft.block.SoundType
import net.minecraft.block.material.Material
import net.minecraft.util.BlockRenderLayer
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class BlockAirDustOre extends RWBYBlock(Material.ROCK) {
    setUnlocalizedName(UnlocalizedNames.AIR_DUST_ORE)
    setSoundType(SoundType.STONE)

    @SideOnly(Side.CLIENT)
    override def getBlockLayer = BlockRenderLayer.CUTOUT_MIPPED
}
