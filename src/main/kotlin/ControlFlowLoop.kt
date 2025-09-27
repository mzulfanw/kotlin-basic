package org.example

fun main() {
    var counter = 0
    while(counter <= 7) {
        println("Hello World")
        counter++
    }

    do {
        println("Angka ke-$counter")
        counter++
    } while (counter <= 5)

    var stock = 10

    while(stock >= 0) {
        println("Memeriksa sistem...")
        if(stock == 0) {
            println("Stok habis. Mesin berhenti beroperasi")
        } else {
            println("Stok minuman: $stock")
            println("Mengeluarkan 1 minuman...")
        }
        println()
        stock--
    }

    // Range
    var rangeInt = 1..20
    println(rangeInt)

    var rangeTo = 1.rangeTo(10)
    println(rangeTo) // Ouput 1..20 increment

    var rangeDown = 10.downTo(1)
    println(rangeDown) // Output: 10 down to 1 step 1

    // step
    val anotherRangeInt = 10.downTo(1).step(2)
    println(anotherRangeInt)

    val anotherRangeInt2 = 10..1 step 2
    println(anotherRangeInt2)

    // In check if in loop has a data
    val tenToOne = 10.downTo(1)
    if(7 in tenToOne) {
        println("Nilai 7 berada di dalam rentang nilai")
    }

    if(11 !in tenToOne) {
        println("Nilai 11 tidak berada di dalam rentang nilai")
    }

    val nilaiGanjil = 1.rangeTo(10).step(2)
    for (nilai in nilaiGanjil) {
        println("Nilai $nilai")
    }

    val bulanTerakhirMenabung = 1.rangeTo(10)
    var tabungan = 0
    for(total in bulanTerakhirMenabung) {
        tabungan += total * 10000
        println("Total tabungan di minggu ke-$total: Rp ${tabungan}")
    }
    println()
    println("Total tabungan selama 10 minggu: Rp ${tabungan}")
}