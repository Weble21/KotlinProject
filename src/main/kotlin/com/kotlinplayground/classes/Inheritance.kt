package com.kotlinplayground.classes

//어떤 함수에든 상속시켜줌
open class User(val name : String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside user Login")
    }
}

class Student(name : String) : User(name) {
    override var isLoggedIn : Boolean = false

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }
    override fun login() {
        println("Inside Student Login")
        //super는 오버라이드 전에 함수를 불러옴
        super.login()
    }
}
//상속은 한가지 클래스만 가능
class Instructor(name : String) : User(name)

fun main () {
    val student = Student("Alex")
    println("name is : ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")

    val country = Student.country()
    println("Country is : $country")

    println("noOfEnrolledCourses is : ${Student.noOfEnrolledCourses}")
    val instructor = Instructor("John")
    println("name is : ${instructor.name}")
    instructor.login()
}