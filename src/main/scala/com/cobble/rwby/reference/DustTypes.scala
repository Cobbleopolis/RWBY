package com.cobble.rwby.reference

import scala.collection.mutable

object DustTypes extends Enumeration {

    sealed abstract class DustType(dustTypeName: String) {

        DustTypes.types += this

        override def toString: String = dustTypeName
    }

    case object Air   extends DustType("air")
    case object Earth extends DustType("earth")
    case object Fire  extends DustType("fire")
    case object Water extends DustType("water")

    val types: mutable.Set[DustType] = mutable.Set[DustType]()

}
