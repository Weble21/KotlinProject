package com.kotlinplayground.classes

//어떤 함수에든 상속시켜줌
open class User(val name : String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside user Login")
    }

    //여기서만 사용 가능
    private fun secret() {
        println("Inside user Secret")
    }

    //상속 받은 자식 클래스에서까지 사용 가능
    open protected fun logout() {
        println("Inside user Logout")
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

    public override fun logout() {
        super.logout()
        println("Inside Student Logout")
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

    //val user = User("DG")
    student.logout()
}