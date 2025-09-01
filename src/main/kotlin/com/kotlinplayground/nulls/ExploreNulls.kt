package com.kotlinplayground.nulls

data class Movie (
    val id : Int?,
    val name : String,
)

fun main() {
    var nameNullable : String? = null
    println("Value is $nameNullable")

    nameNullable = "DG"
    println("Value is $nameNullable")

    val movie = Movie(null, "Avengers")
    val saveMovie = saveMovie(movie)
    println("Save Movie : $saveMovie")

}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
