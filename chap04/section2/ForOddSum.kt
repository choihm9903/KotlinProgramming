package chap04.section2

fun main() {
    var odd = 0
    var even = 0

    for (x in 1..100 step 2) odd += x
    for (x in 2..100 step 2) even += x

    println("Odd total: $odd")
    println("Even total: $even")
}