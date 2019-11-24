package com.dubulduke.ui.layout

interface BaseLayout {
    val x: Double
    val y: Double
    val width: Double
    val height: Double
    val center: Point
    val left: Double get() = x
    val bottom: Double get() = y
    val top: Double get() = y + height
    val right: Double get() = x + width

}