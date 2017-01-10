package com.cobble.rwby.proxy

import com.cobble.rwby.reference.RWBYBlocks

class ClientProxy extends CommonProxy {

    override def getClientProxy: ClientProxy = this

    override def initRenderingAndTextures(): Unit = {}

    override def registerEventHandlers(): Unit = {}

    override def registerKeybindings(): Unit = {}

    override def registerRenderers(): Unit = {
        RWBYBlocks.registerItemRenderers()
    }

    override def playSound(soundName: String, xCoord: Float, yCoord: Float, zCoord: Float, volume: Float, pitch: Float): Unit = {}

    override def spawnParticle(particleName: String, xCoord: Double, yCoord: Double, zCoord: Double, xVelocity: Double, yVelocity: Double, zVelocity: Double): Unit = {}

}
