fun printResult(valueA: Int, valueB: Int, sum: (Int, Int) -> Int) {
    val result = sum(valueA, valueB)
    println("Hasil: $result")
}

fun multiplier(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}

fun main() {
    val penjumlahan: (Int, Int) -> Int = { valueA: Int, valueB: Int ->
        val nilai = valueA + valueB
        nilai * 100
    }
    val hasil = penjumlahan(10, 20)
    println("Hasil: $hasil")

    // control flow
    val emailPendaftar = listOf<String>(
        "alice@gmail.com",
        "bob@gmail.com",
        "charlie@gmail.com",
        "alice@gmail.com",
        "diana@gmail.com"
    )

    emailPendaftar.forEach { value -> println(value) }

    emailPendaftar.forEachIndexed { index, email ->
        println("This element is at $index. Value is $email")
    }

    val timer10Detik = {
        val detik = 10.downTo(1)
        for (i in detik) {
            println("Hitung mundur: $i detik")
        }
        println("Waktu habis")
    }

    timer10Detik()
    printResult(10, 20, penjumlahan)

    val multiplyBy5 = multiplier(5)
    val result = multiplyBy5(10)
    println("Result: $result") // Output: 50

    val multipless = multiplier(2)(20)
    println("Multiples: $multipless")
}