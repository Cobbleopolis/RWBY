package com.cobble.rwby.reference

import com.cobble.rwby.reference.DustTypes.DustType

object UnlocalizedNames {

    object Blocks {
        val AIR_DUST_ORE: String = Util.getDustOreNameFromDustType(DustTypes.Air)

        val EARTH_DUST_ORE: String = Util.getDustOreNameFromDustType(DustTypes.Earth)

        val FIRE_DUST_ORE: String = Util.getDustOreNameFromDustType(DustTypes.Fire)

        val WATER_DUST_ORE: String = Util.getDustOreNameFromDustType(DustTypes.Water)
    }

    object Items {
        val AIR_DUST: String = Util.getDustCrystalNameFromDustType(DustTypes.Air)

        val EARTH_DUST: String = Util.getDustCrystalNameFromDustType(DustTypes.Earth)

        val FIRE_DUST: String = Util.getDustCrystalNameFromDustType(DustTypes.Fire)

        val WATER_DUST: String = Util.getDustCrystalNameFromDustType(DustTypes.Water)
    }

    object Util {
        def getDustOreNameFromDustType(dustType: DustType): String = getDustCrystalNameFromDustType(dustType) + "_ore"

        def getDustCrystalNameFromDustType(dustType: DustType): String = dustType + "_dust"
    }

}
