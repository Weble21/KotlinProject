package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {
    val isCoursePersisted : Boolean
    fun getById(id : Int) : Course

    fun save(course : Course) : Int {
        println("course : ${course}")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

//class에 interface 함수 이름이 같을 경우
interface A {
    fun doSomething() {
        println("A")
    }
}

interface B {
    fun doSomething() {
        println("B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("AB")
    }
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in Modern Java using Project Reactor",
            "DG")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }
}


class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in Modern Java using Project Reactor",
            "DG")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository : ${course}")
        return super.save(course)
    }
}



fun main () {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
    val courseId = sqlCourseRepository.save(Course(5,
        "Reactive Programming in Modern Java using Project Reactor",
        "DG"))
    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    println("Save Course is $courseId")

    val nosqlCourseRepository = NoSqlCourseRepository()
    val course1 = nosqlCourseRepository.getById(2)
    println("Course is $course1")
    val savedCourseId = nosqlCourseRepository.save(Course(7,
        "Reactive Programming in Modern Java using Project Reactor",
        "DG"))
    println("Save Course in noSqlCourseRepository is $savedCourseId")

    val ab = AB()
    ab.doSomething()

}