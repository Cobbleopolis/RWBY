package com.cobble.rwby.world

import java.util.Random

import com.cobble.rwby.reference.RWBYBlocks
import com.google.common.base.Predicate
import net.minecraft.block.Block
import net.minecraft.block.state.IBlockState
import net.minecraft.block.state.pattern.BlockMatcher
import net.minecraft.init.Blocks
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraft.world.chunk.{IChunkGenerator, IChunkProvider}
import net.minecraft.world.gen.feature.WorldGenMinable
import net.minecraftforge.fml.common.IWorldGenerator

class RWBYOreGeneration extends IWorldGenerator {

    override def generate(rand: Random, x: Int, z: Int, world: World, iChunkGenerator: IChunkGenerator, iChunkProvider: IChunkProvider): Unit = {
        generateOre(RWBYBlocks.airDustOre, world, rand, x, z, 2, 8, 8, 5, 68)
    }

    def generateOre(block: Block, world: World, random: Random, chunkX: Int, chunkZ: Int, minVeinSize: Int, maxVeinSize: Int, chance: Int, minY: Int, maxY: Int, generateIn: Predicate[IBlockState] = BlockMatcher.forBlock(Blocks.STONE).asInstanceOf[Predicate[IBlockState]]): Unit = {
        val veinSize: Int = minVeinSize + random.nextInt(maxVeinSize - minVeinSize)
        val heightRange: Int = maxY - minY
        val gen: WorldGenMinable = new WorldGenMinable(block.getDefaultState, veinSize, generateIn)
        (0 to chance).foreach(_ => {
            val randX: Int = chunkX * 16 + random.nextInt(16)
            val randY: Int = random.nextInt(heightRange) + minY
            val randZ: Int = chunkZ * 16 +  random.nextInt(16)
            gen.generate(world, random, new BlockPos(randX, randY, randZ))
        })
    }

}
