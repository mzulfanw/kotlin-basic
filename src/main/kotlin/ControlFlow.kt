package org.example

fun main() {
    val pendapatan = 18000
    val pengeluaran = 18000

    if (pendapatan > pengeluaran) {
        println("Ada keuntungan")
    } else if (pendapatan == pengeluaran) {
        println("Pendapatan dan pengeluaran seimbang")
    }else {
        println("Ada kerugian")
    }

    val hari = "Minggu"

    when(hari) {
        "Senin" -> println("Senin")
        "Sabtu" -> println("Sabtu")
        "Minggu" -> println("Minggu")
        else -> println("Hari kerja biasa")
    }

    val skor = 70
    var kategori: Char

    when (skor) {
        100 -> {
            println("Skor sangat baik!")
            kategori = 'A'
        }
        70 -> {
            println("Skor cukup, masih bisa ditingkatkan.")
            kategori = 'B'
        }
        else -> {
            println("Kamu tidak lulus")
            kategori = 'E'
        }
    }
    println("Kategori nilai: $kategori")

    val aktivitas = when (hari) {
        "Senin" -> "kerja"
        "Sabtu" -> "belajar"
        "Minggu" -> "libur"
        else -> "kuliah"
    }

    println("Aktivitas hari ini: $aktivitas")

    // Challenge
    val platKendaraaan: String = "DK"
    when (platKendaraaan) {
        "A" -> println("Banten")
        "L" -> println("Surabaya")
        "DK" -> println("Bali")
        "DM" -> println("Gorontalo")
        else -> println("Progam belum mengetahui plat kendaraan tersebut")
    }
}