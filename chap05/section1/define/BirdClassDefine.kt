package chap05.section1.define

class Bird {    // 클래스의 정의
    // 프로퍼티(속성)
    var name: String ="mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 메소드(함수)
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird()
    coco.color = "blue"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}