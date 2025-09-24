package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory

fun main() {
    exploreApply()
    exploreAlso()
}

//.apply : 객체를 반환, 주로 객체의 초기화나 속성설정 시 사용, 객체 상태 변경이 주 목적
fun exploreApply() {
    val course = Course(1,
        "Design Thinking in Kotlin",
        "DG"
    ).apply {
        //courseCategory = CourseCategory.DESIGN
        this.courseCategory = CourseCategory.DESIGN
    }

    println("course : $course")

}

//also : 객체를 반환, 객체의 부수적인 작업(로그 출력 등)을 수행하면서 객체 자체를 그대로 반환
fun exploreAlso() {
    val course = Course(2,
        "Design Thinking in Kotlin",
        "DG2"
    ).also {
        it.courseCategory = CourseCategory.DESIGN
        println("Course is $it")
    }

    println("course : $course")

}
