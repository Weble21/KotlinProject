package com.kotlinplayground.classes

class Person(
    var name : String = "",
    val age : Int = 0
) {
    var email : String = ""
    var nameLength : Int = 0
    //초기화 기능ㄴ 사용시 init 사용
    init {
        println("Inside Init Block")
        nameLength = name.length
    }
    //부생성자는 웬만하면 사용하지 않기 (오버로딩 시 유용함)
    constructor(
        _email : String,
        _name : String,
        _age : Int
    ) : this(_name, _age) {
        email = _email
    }
    fun action() {
        println("Person Walks")
    }
}

fun main() {
//    val person = Person("Alex", 25)
//    println("Name : ${person.name} and the is ${person.age}")
//    person.name = "DG"
//    person.action()
//    println("Name : ${person.name} and the is ${person.age}")
//
//    val person1 = Person()
//    person1.action()
//    println("Name : ${person1.name} and the is ${person1.age}")

    val person2 = Person(_email = "abc@gmail.com", "Alex", 25)
    println("Name : ${person2.name} and the is ${person2.age}" + "${person2.email} and the nameLength is ${person2.nameLength}")
}