package com.kotlinplayground.classes

data class Course(
    var id : Int,
    val name : String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT //DEVELOPMENT가 DEFAULT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1,
        "Reactive Programming in Modern Java using Project Reactor",
        "DG")
    //println(course)
    val course1 = Course(2,
        "Reactive Programming in Modern Java using Project Reactor",
        "DG")
    println("Checking Object Equality : ${course1 == course}")

    val course3 = course1.copy(
        id=3, author = "DD"
    )
    println(course3)

    val marketingCourse = Course(2,
        "Facebook Marketing",
        "DG",
        CourseCategory.MARKETING)
    println(marketingCourse)

}