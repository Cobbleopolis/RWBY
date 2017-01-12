package com.cobble.rwby.block

import java.util.Random

import com.cobble.rwby.reference.Constants.HarvestLevels
import com.cobble.rwby.reference.{RWBYItems, UnlocalizedNames}
import net.minecraft.block.SoundType
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.item.Item
import net.minecraft.util.BlockRenderLayer
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class BlockFireDustOre extends RWBYBlock(Material.ROCK) {
    setUnlocalizedName(UnlocalizedNames.Blocks.FIRE_DUST_ORE)
    setSoundType(SoundType.STONE)
    setHarvestLevel("pickaxe", HarvestLevels.IRON)
    setHardness(3.0F)
    setResistance(5.0F)

    @SideOnly(Side.CLIENT)
    override def getBlockLayer = BlockRenderLayer.CUTOUT_MIPPED

    override def getItemDropped(state: IBlockState, rand: Random, fortune: Int): Item = RWBYItems.fireDust

    override def quantityDroppedWithBonus(fortune: Int, random: Random): Int = this.quantityDropped(random) + random.nextInt(fortune + 1)

    override def quantityDropped(random: Random): Int = 3 + random.nextInt(4)

}
