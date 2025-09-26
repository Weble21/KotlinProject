package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory

fun main() {
    //exploreApply()
    //exploreAlso()
    //exploreLet()
    //exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result = numbers.run {
        numbers =mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Run Result is : $result")

    val length = run {
        val name = "Donggeon"
        println(name)
        name.length
    }
    println("Run length is : $length")
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers) {
        println("Size is $size")
        val list = numbers.plus(6)
        list.sum()
    }

    println("With result is : $result")
}

//람다값을 반환함
fun exploreLet() {
    val numbers = mutableListOf(1,2,3,4,5)
    val result = numbers.map{it*2}.filter { it > 5}.let {
        println(it)
        it.sum()
    }
    println(result)

    var name : String? = null
    name = "donggeon"
    val result1 = name?.let {
        println(it)
        it.uppercase()  //이 람다값을 반환함
    }
    println(result1)
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
