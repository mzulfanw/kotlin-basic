package org.example

fun main() {
    println(sum(1, 2))
    sapaPengguna("Anisa Nasywahasna")

    var hargaAwal = 200000.0
    var discount = 15.0

    println(hitungDiskon(hargaAwal, discount))

    var fullName = getFullName(first = "Muhammad", middle = "Zulfan", last = "Wahyudin")
    println(fullName)

    sapa("Anisa Nasywahasna")

    val number = sumNumbers(10,20,30,40,50)
    println(number)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sapaPengguna(name: String): Unit {
    val ucapanPembuka = "Halo $name"
    val ucapanTambahan = "Semoga harimu menyenangkan."

    println(ucapanPembuka)
    println(ucapanTambahan)
}

// challenge

fun hitungDiskon(hargaAwal: Double, persenDiskon: Double): Double {
    var discount = hargaAwal * persenDiskon/100
    return hargaAwal - discount
}

// Named argument
fun getFullName(first: String ,middle: String, last: String): String {
    return "$first $middle $last"
}

// Default argument
fun sapa(name: String, message: String = "Selamat datang") {
    println("$message $name")
}

// variable arguments
fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}