package com.cobble.rwby

import com.cobble.rwby.proxy.IProxy
import com.cobble.rwby.reference.{Constants, RWBYBlocks}
import com.cobble.rwby.world.RWBYOreGeneration
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.registry.GameRegistry

@Mod(modid = "@MODID@", name = "@MODNAME@", version = "@VERSION@", modLanguage = "scala")
object RWBY {

    @Mod.Instance(value = "@MODID@")
    var luminousFlux = null

    @SidedProxy(clientSide="com.cobble.rwby.proxy.ClientProxy", serverSide="com.cobble.rwby.proxy.ServerProxy")
    var proxy: IProxy = _

    val createiveTab: CreativeTabs = new RWBYTab

    @EventHandler
    def preInit(event: FMLPreInitializationEvent): Unit = {
        System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName)
        RWBYBlocks.registerBlocks()
    }

    @EventHandler
    def init(event: FMLInitializationEvent): Unit = {
        proxy.registerRenderers()
        GameRegistry.registerWorldGenerator(new RWBYOreGeneration, 64)
    }

}
