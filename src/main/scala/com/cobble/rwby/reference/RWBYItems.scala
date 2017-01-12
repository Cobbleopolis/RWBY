package com.cobble.rwby.reference

import com.cobble.rwby.item.{ItemAirDust, RWBYItem}
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.common.registry.GameRegistry

import scala.collection.mutable.ArrayBuffer

object RWBYItems {

    val itemArray: ArrayBuffer[RWBYItem] = ArrayBuffer[RWBYItem]()

    final val airDust: ItemAirDust = new ItemAirDust

    def registerItems(): Unit = {
        println("Begin registering items...")
        registerItem(airDust)
        println("Finished registering items")
    }

    def registerItem(item: RWBYItem): Unit = {
        GameRegistry.register(item.asInstanceOf[Item])
    }

    def registerItemRenderers(): Unit = {
        println("Begin registering item renderers...")
        registerItemRenderer(airDust)
        println("Finished registering item renderers")
    }

    def registerItemRenderer(item: RWBYItem, meta: Int = 0): Unit = {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName, "inventory"))
    }

}
