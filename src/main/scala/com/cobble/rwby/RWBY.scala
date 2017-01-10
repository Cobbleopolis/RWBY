package com.cobble.rwby

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "rwby", name = "RWBY", version = "@VERSION@", modLanguage = "scala")
object RWBY {

    @EventHandler
    def preInit(event: FMLPreInitializationEvent): Unit = {
        System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName)
    }

}
