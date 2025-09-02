package com.kotlinplayground.nulls

data class Movie (
    val id : Int?,
    val name : String,
)

fun printName(name : String?) {
    println("Name is $name")
}

fun main() {
    var nameNullable : String? = null

//    //printName(nameNullable!!)
//    nameNullable?.run {
//        printName(this)
//    }

    println("Value is $nameNullable")
    //println("Value is ${nameNullable.length}") null도 가능하니까 .length가 안됨
    //미리 if로 확인하면 가능
    if(nameNullable != null) {
        println("Value is {$nameNullable.length}")
    }
    //코틀린에서만 가능한 safe operator ?
    //만약 이미 null값인지 확인을 했다면 ? 안써도 됨.
    println("Value length is : ${nameNullable?.length}")
    var length = nameNullable?.length ?: 0 //null값이면 ?: 다음에 나오는 값을 입력
    println("Value length is $length")

    nameNullable = "DG"
    println("Value is $nameNullable")

    var name : String = "Donggeon"
    printName(name)

    length = nameNullable.length
    println("Value length is $length")

    val movie = Movie(null, "Avengers")
    val saveMovie = saveMovie(movie)
    println(saveMovie.id!!)  //!!는 null값인지 검사하지 않고 그냥 바로 꺼냄
    println("Save Movie : $saveMovie")

}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
