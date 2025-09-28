fun Int.printInt() {
    println("Nilai bilangan bulat: $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int get() = this / 3

fun main() {
    val number = 10
    number.printInt()

    20.printInt()

    println(number.plusThree())

    println(number.slice)
}