fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

fun main() {
    val sum: (Int, Int) -> Int = ::count
    val hasil = sum(10, 20)
    println("Hasil: $hasil")
}