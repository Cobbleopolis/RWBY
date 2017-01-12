package com.cobble.rwby.block

import com.cobble.rwby.reference.Constants.HarvestLevels
import com.cobble.rwby.reference.UnlocalizedNames
import net.minecraft.block.SoundType
import net.minecraft.block.material.Material
import net.minecraft.util.BlockRenderLayer
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class BlockWaterDustOre extends RWBYBlock(Material.ROCK) {
    setUnlocalizedName(UnlocalizedNames.WATER_DUST_ORE)
    setSoundType(SoundType.STONE)
    setHarvestLevel("pickaxe", HarvestLevels.IRON)

    @SideOnly(Side.CLIENT)
    override def getBlockLayer = BlockRenderLayer.CUTOUT_MIPPED

}