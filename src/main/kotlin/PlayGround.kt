package org.example

val <T> List<T>.tail: List<T>
    get() = drop(1)

val <T> List<T>.head: T
    get() = first()


val p1 = { a: Int, b: Int -> a <= b }

fun <T> isSorted(aa: List<T>, order: (T, T) -> Boolean): Boolean {
    tailrec fun loop(head: T, tail: List<T>): Boolean {
        return when {
            tail.isEmpty() -> true
            !order(head, tail.first()) -> false
            else -> loop(tail.head, tail.tail)
        }
    }

    return aa.isEmpty() || loop(aa.head, aa.tail)
}