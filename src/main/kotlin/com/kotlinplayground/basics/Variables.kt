package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {
    val name : String = "Donggeon"
    println("Hello $name!")
    //name = "ehdrjs"

    var age : Int = 25
    println(age)
    age = 27
    println(age)

    val salary : Long = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course : $course and th e course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()

    println(multiLine1)
    val num = topLevelFunction()
    println("Num is $num")
    println("course is $courseName")


}