package org.example

fun main() {
    val angka1 = 20
    val angka2 = 5
    val angka3 = 2

    // Penjumlahan
    val hasilPenjumlahan = angka1 + angka2
    println("Hasil Penjumlahan: $angka1 + $angka2 = $hasilPenjumlahan")

    // Pengurangan
    val hasilPengurangan = angka1 - angka2
    println("Hasil Pengurangan: $angka1 - $angka2 = $hasilPengurangan")

    // Perkalian
    val hasilPerkalian = angka1 * angka2
    println("Hasil Perkalian: $angka1 * $angka2 = $hasilPerkalian")

    // Pembagian
    val hasilPembagian = angka1 / angka2
    println("Hasil Pembagian: $angka1 / $angka2 = $hasilPembagian")

    // Modulus (sisa pembagian)
    val hasilPembagianPecahan = angka1 % angka2
    println("Hasil Pembagian dengan pecahan: $angka1 / $angka2 = $hasilPembagianPecahan")

    val hasilTanpaKurung = angka1 + angka2 * angka3
    println("Hasil Tanpa Kurung: $angka1 + $angka2 * $angka3 = $hasilTanpaKurung")

    val hasilDenganKurung = (angka1 + angka2) * angka3
    println("Hasil Dengan Kurung: ($angka1 + $angka2) * $angka3 = $hasilDenganKurung")

    val hasilLain = angka1 / angka2 + angka3 * angka2
    println("Hasil Lain: $angka1 / $angka2 + $angka3 * $angka2 = $hasilLain")
}