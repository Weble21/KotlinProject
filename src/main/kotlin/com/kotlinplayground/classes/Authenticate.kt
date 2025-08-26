package com.kotlinplayground.classes


//object 클래스는 싱글톤 패턴으로 만들어짐. -> 생성자 인수 추가 불가
object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("User authenticate for userName : $userName")
    }
}

fun main() {
    Authenticate.authenticate(userName = "John", password = "abc")
}