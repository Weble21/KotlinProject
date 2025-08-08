package com.kotlinplayground.classes

data class Employee (
    var id:Int,
    var name:String
)

fun main() {
    val employee = Employee(21, "Donggeon")
    println(employee)

    val employee2 = Employee(21, "Donggeon")
    println("Compare result : ${employee2 == employee}")

    val employee3 = employee.copy(23)
    println("Compare result : ${employee3 == employee}")
}