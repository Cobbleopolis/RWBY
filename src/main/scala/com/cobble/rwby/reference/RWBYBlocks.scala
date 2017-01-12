package com.cobble.rwby.reference

import com.cobble.rwby.block.{BlockAirDustOre, BlockEarthDustOre, BlockFireDustOre, RWBYBlock}
import net.minecraft.block.Block
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.{Item, ItemBlock}
import net.minecraftforge.fml.common.registry.GameRegistry

import scala.collection.mutable.ArrayBuffer

object RWBYBlocks {

    val blockArray: ArrayBuffer[RWBYBlock] = ArrayBuffer[RWBYBlock]()

    val airDustOre: BlockAirDustOre = new BlockAirDustOre
    val earthDustOre: BlockEarthDustOre = new BlockEarthDustOre
    val fireDustOre: BlockFireDustOre = new BlockFireDustOre

    def registerBlocks(): Unit = {
        println("Begin registering blocks...")
        registerBlock(airDustOre)
        registerBlock(earthDustOre)
        registerBlock(fireDustOre)
        println("Finished registering blocks...")
    }

    def registerBlock(block: RWBYBlock): Unit = {
        GameRegistry.register(block.setRegistryName(block.getUnlocalizedName))
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getUnlocalizedName))
    }

    def registerItemRenderers(): Unit = {
        println("Registering item renderers...")
        registerBlockItemRender(airDustOre)
        registerBlockItemRender(earthDustOre)
        registerBlockItemRender(fireDustOre)
        println("Finished registering item renderers...")
    }

    def registerBlockItemRender(block: RWBYBlock, meta: Int = 0): Unit = {
        Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(Item.getItemFromBlock(block.asInstanceOf[Block]), meta, new ModelResourceLocation(Constants.RESOURCE_PREFIX + block.getUnlocalizedName, "inventory"))
    }

}
