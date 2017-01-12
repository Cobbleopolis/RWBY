package com.cobble.rwby.block

import java.util.Random

import com.cobble.rwby.reference.Constants.HarvestLevels
import com.cobble.rwby.reference.DustTypes.DustType
import com.cobble.rwby.reference.{DustTypes, RWBYItems, UnlocalizedNames}
import net.minecraft.block.SoundType
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.item.Item
import net.minecraft.util.BlockRenderLayer
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class BlockDustOre(dustType: DustType) extends RWBYBlock(Material.ROCK) {
    setUnlocalizedName(UnlocalizedNames.Util.getDustOreNameFromDustType(dustType))
    setSoundType(SoundType.STONE)
    setHarvestLevel("pickaxe", HarvestLevels.IRON)
    setHardness(3.0F)
    setResistance(5.0F)

    @SideOnly(Side.CLIENT)
    override def getBlockLayer = BlockRenderLayer.CUTOUT_MIPPED

    override def getItemDropped(state: IBlockState, rand: Random, fortune: Int): Item = dustType match {
        case DustTypes.Air =>   RWBYItems.airDust
        case DustTypes.Earth => RWBYItems.earthDust
        case DustTypes.Fire =>  RWBYItems.fireDust
        case DustTypes.Water => RWBYItems.waterDust
        case _ =>               RWBYItems.airDust
    }

    override def quantityDroppedWithBonus(fortune: Int, random: Random): Int = this.quantityDropped(random) + random.nextInt(fortune + 1)

    override def quantityDropped(random: Random): Int = 3 + random.nextInt(4)

}
