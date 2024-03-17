package org.example

fun main() {
    val stringList = mutableListOf(
        "yoprogramo",
        "saul",
        "rios",
        "Jessy",
        "areli"
    )

    println(findString(stringList, "Jessy"))
}

fun findString(stringList: MutableList<String>, key: String): Int {
    tailrec fun loop(n: Int): Int {
        return when {
            n >= stringList.size -> -1
            stringList[n] == key -> n
            else -> loop(n + 1)
        }
    }

    return loop(0)
}
