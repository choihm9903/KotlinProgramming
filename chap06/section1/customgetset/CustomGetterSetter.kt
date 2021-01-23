package chap06.section1.customgetset

class User(val id: Int, _name: String, var age: Int) {
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }
}

fun main() {
    val user1 = User(1, "kildong", 35)
    user1.name = "coco"
    println("user3.name = ${user1.name}")
}