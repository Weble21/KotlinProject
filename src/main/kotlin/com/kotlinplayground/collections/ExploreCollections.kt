package com.kotlinplayground.collections

fun main() {
    //list
    val names = listOf("Alpa", "Brabo", "Charlie")
    println("Names : $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("namesMutableList : $namesMutableList")
    namesMutableList.add("Adam")
    println("namesMutableList : $namesMutableList")

    //set
    val set = setOf("Alpa", "Brabo", "Charlie")
    println("set : $set")

    val mutableSet = mutableSetOf("Alpa", "Brabo", "Charlie")
    println("mutableSet : $mutableSet")
    mutableSet.add("Adam")
    println("mutableSet : $mutableSet")

    //hashMap
    //key 와 value
    val nameAgeMap = mapOf("Dilip" to 34, "Happy" to 4)
    println("nameAgeMap : $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Dilip" to 34, "Happy" to 4)
    println("nameAgeMutableMap : $nameAgeMutableMap")
    nameAgeMutableMap.put("Delta", 100)
    nameAgeMutableMap["ABC"] = 100
    println("nameAgeMutableMap : $nameAgeMutableMap")

}