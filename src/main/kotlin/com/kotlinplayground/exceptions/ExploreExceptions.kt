package com.kotlinplayground.exceptions

fun returnNothing() : Nothing {
    throw RuntimeException("Exception")
}

fun main() {
    println("${nameLength("Dilip")}")
    println("${nameLength(null)}")
    returnNothing()
}

fun nameLength(name : String?): Int? {
    val result = try {
        name!!.length   //!!은 이 값이 null이 아니라고 단정하고 진행됨. 따라서 실제로 null이면 오류가 발생
    } catch (ex : Exception) {
        println("Exception is $ex")
        null
    }
    return result
}
