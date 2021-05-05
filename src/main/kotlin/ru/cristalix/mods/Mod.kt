package ru.cristalix.mods

import KotlinMod
import ru.cristalix.uiengine.UIEngine
import ru.cristalix.uiengine.utility.CENTER
import ru.cristalix.uiengine.utility.text

class Mod: KotlinMod() {

    override fun onEnable() {
        UIEngine.initialize(this)

        val text = text {
            content = "Hello, world!"
            shadow = true
            align = CENTER
            origin = CENTER
        }

        UIEngine.overlayContext.addChild(text)

    }

}