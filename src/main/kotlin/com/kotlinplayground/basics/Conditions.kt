package com.kotlinplayground.basics

fun main() {
    var name = "Alex"
    name = "Chloe"
    val result = if(name.length == 4) {
        println("Name is Four Characters")
        name.length
    } else {
        println("Name is not Four Characters")
        name
    }
    println("result : $result")

    var position = 1
    position = 2
    val medalIF = if(position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    position = 1
    val medalWH = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println("if medal: $medalIF, when medal: $medalWH")
}