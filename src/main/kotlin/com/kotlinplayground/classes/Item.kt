package com.kotlinplayground.classes

import com.kotlinplayground.functions.topLevelFunction

class Item() {
    var name: String = ""
    var price : Double = 0.0
        get() {
            println("Inside Getter")
            return field
        }
        set (value) {
            if(value >= 0.0) {
                println("Inside Setter")
                field = value
            } else {
                throw IllegalArgumentException("Value can't be negative")
            }
        }
    constructor(_name : String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 16"
    println("Item name is ${item.name}")

    item.price = 10.0 //setter 호출
    println("Item price is ${item.price}")  //getter 호출
}