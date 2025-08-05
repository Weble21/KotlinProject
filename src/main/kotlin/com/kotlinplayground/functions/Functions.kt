package com.kotlinplayground.functions

import java.time.LocalDate

fun main () {
    val unit = printName("Donggeon")
    println("Unit is $unit")
    val result = addition(1, 2)
    println("Result is $result")

    val result1 = addition_approach1(1, 2)
    println("Result is $result1")

    printPersonDetails("Donggeon", "kuk4270@gmail.com", LocalDate.parse("2001-02-05"))
    printPersonDetails("Donggeon" )
    printPersonDetails(name = "Donggeon", dob = LocalDate.parse("2001-02-05"))
    printPersonDetails(dob = LocalDate.parse("2001-02-05"), name = "Donggeon", email = "kdk4270@naver.com")

}

fun addition(x: Int, y: Int) : Int {
    return x + y
}

fun addition_approach1(x: Int, y: Int) = x+y

//unit : return 값 없음.
fun printName(name : String) : Unit {
    println("Name is $name")
}

fun printPersonDetails(
    name : String,
    email : String = "",
    dob : LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and the dob is $dob")
}
