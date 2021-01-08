package chap03.section1

fun main() {
    val result1 = sum1(3,2)
    val result2 = sum2(6,7)
    println(result1)
    println(result2)
}

fun sum1(a: Int, b: Int): Int {
    var sum = a+b
    return sum
}

fun sum2(a: Int, b: Int) = a + b