package org.example

val <T> List<T>.tail: List<T>
    get() = drop(1)

val <T> List<T>.head: T
    get() = first()


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

fun <A, B, C> partial1(a: A, f: (a: A, b: B) -> C): (B) -> C = { b ->
    f(a, b)
}

//Currying function - Exercise 2.3
fun <A, B, C> curry(f: (a: A, b: B) -> C): (a: A) -> (b: B) -> C = { a -> { b -> f(a, b) } }
