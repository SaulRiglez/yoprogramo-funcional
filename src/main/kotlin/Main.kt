package org.example

fun main() {
    val array1 = arrayOf(
        "yoprogramo",
        "saul",
        "rios",
        "Jessy",
        "areli"
    )

    val array2 = arrayOf(1, 34, 45, 500, 45, 34)
    val predicate1: (String) -> Boolean = { it == "rios" }
    val predicate2: (Int) -> Boolean = { it == 500 }

    println(findFirst(array1, predicate1))
    println(findFirst(array2, predicate2))
}

fun <T> findFirst(xs: Array<T>, p: (T) -> Boolean): Int {
    tailrec fun loop(n: Int): Int {
        return when {
            n >= xs.size -> -1
            p.invoke(xs[n]) -> n
            else -> loop(n + 1)
        }
    }
    return loop(0)
}
