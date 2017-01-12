package com.cobble.rwby.reference

import com.cobble.rwby.item._
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.common.registry.GameRegistry

import scala.collection.mutable.ArrayBuffer

object RWBYItems {

    val itemArray: ArrayBuffer[RWBYItem] = ArrayBuffer[RWBYItem]()

    val airDust: ItemDust = new ItemDust(DustTypes.Air)
    val earthDust: ItemDust = new ItemDust(DustTypes.Earth)
    val fireDust: ItemDust = new ItemDust(DustTypes.Fire)
    val waterDust: ItemDust = new ItemDust(DustTypes.Water)

    def registerItems(): Unit = {
        println("Begin registering items...")
        registerItem(airDust)
        registerItem(earthDust)
        registerItem(fireDust)
        registerItem(waterDust)
        println("Finished registering items")
    }

    def registerItem(item: RWBYItem): Unit = {
        GameRegistry.register(item.asInstanceOf[Item])
    }

    def registerItemRenderers(): Unit = {
        println("Begin registering item renderers...")
        registerItemRenderer(airDust)
        registerItemRenderer(earthDust)
        registerItemRenderer(fireDust)
        registerItemRenderer(waterDust)
        println("Finished registering item renderers")
    }

    def registerItemRenderer(item: RWBYItem, meta: Int = 0): Unit = {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName, "inventory"))
    }

}
