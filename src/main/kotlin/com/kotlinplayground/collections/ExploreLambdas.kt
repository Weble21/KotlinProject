package com.kotlinplayground.collections

fun main() {
    val addLambda = { x: Int -> x + x}

    val addResult = addLambda(3)
    println("addResult : $addResult")

    val multiplyLambda = { x: Int, y: Int ->
        println("x is $x and y is $y")
        x * y     //항상 마지막 문장이 람다바디(return 값)가 됨
    }
    val multiplyResult = multiplyLambda(2, 3)
    println("multiplyResult : $multiplyResult")
}