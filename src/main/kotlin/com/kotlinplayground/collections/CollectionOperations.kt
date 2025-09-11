package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    //Parameter로 람다를 넘겨줄 수 있음
    val devPredicate = { c : Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c : Course -> c.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1,2,3), listOf(4,5,6))

    val mapResult = list.map{ outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("mapResult = $mapResult")
    val flatMapResult = list.flatMap{ outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("flatMapResult = $flatMapResult")


    //exploreFilter(courseList, desPredicate)
    //println("\n")
    //exploreMap(courseList, devPredicate)
    val courses = exploreFlatMap(courseList, KAFKA)
    println("courses = $courses")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
    return kafkaCourses
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
