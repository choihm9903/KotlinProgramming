package chap06.section1.customproperty

class User(val id: Int, _name: String, var age: Int) {
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }
}

fun main() {
    val user1 = User(1, "kildong", 35)
    user1.name = ""
    println("user3.name = ${user1.name}")
}