package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    //Parameter로 람다를 넘겨줄 수 있음
    val devPredicate = { c : Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c : Course -> c.category == CourseCategory.DESIGN }

    exploreFilter(courseList, desPredicate)
    println("\n")
    exploreMap(courseList, devPredicate)
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter { predicate.invoke(it) }
        .map { "${it.name} - #${it.category}" }
        .forEach { println(it) }
    println("courses : $courses")
}

fun exploreFilter(courseList: MutableList<Course>,
                   predicate : (Course) -> Boolean) {
    courseList
        //.filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter {predicate.invoke(it)}
        .forEach {
            println("Courses : $it") //it는 그 해당 course를 가르키고 있음.
        }
}
