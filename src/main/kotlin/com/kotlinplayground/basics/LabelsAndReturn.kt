package com.kotlinplayground.basics

fun main () {
    for ( i in 1..5) {
        println("i in $i")
        if (i==3) break
    }

    label()

    for ( i in 1..5) {
        println("i in return $i")
        if (i==3) return
    }

    println("End of the Program!")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
        //if (i == 3) break@loop
        innerLoop@ for (j in 1..5) {
            println("j in label = $j")
            //if(j==2) break@innerLoop //안쪽 루프만 종료하고, 바깥 루프는 계속 반복
            if(j==2) continue@loop //현재 루프를 건너뛰고, 다음 반복으로 이동
        }
    }
}
