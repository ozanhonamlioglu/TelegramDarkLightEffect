package com.ozy.darklighttoggle

sealed class ColorMode(val resourceId: Int) {
    data class Dark(val id: Int) : ColorMode(id)
    data class Light(val id: Int): ColorMode(id)
}