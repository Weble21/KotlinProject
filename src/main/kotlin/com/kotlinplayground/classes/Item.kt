package com.kotlinplayground.classes

import com.kotlinplayground.functions.topLevelFunction

class Item() {
    var name: String = ""
    constructor(_name : String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 16"
    println("Item name is ${item.name}")
}