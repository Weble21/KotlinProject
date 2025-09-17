package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {

    //sequence는 값을 하나씩 차례대로 처리하기 떄문에 큰 용량을 처리할 때 좋음.
    val namesListUsingSequence = listOf("alex", "ben", "chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence : $namesListUsingSequence")

    val devPredicate = { c : Course -> c.category == CourseCategory.DEVELOPEMENT }

    exploreFilterUsingSequence(courseList(), devPredicate)

    val range = 1 .. 1000000000

    //asSequence가 없으면 map함수 자체에서 range를 다 돌아버림
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach { println("Value is $it") }
}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate : (Course) -> Boolean) {
    courseList
        //.filter { it.category == CourseCategory.DEVELOPEMENT }
        .asSequence()
        .filter {predicate.invoke(it)}
        .forEach {
            println("Courses : $it") //it는 그 해당 course를 가르키고 있음.
        }
}