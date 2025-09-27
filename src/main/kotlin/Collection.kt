package org.example

fun main() {
    // Immutable cannot be change
    val numberList: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numberList)

    val stringList: List<String> = listOf("one","two","three","four","five","six")
    println(stringList)

    val charList: List<Char> = listOf('a','b','c','d','e')
    println(charList)

    val anyList: List<Any> = listOf('a', "Kotlin", 3, true)
    println(anyList)

    // MutableList can be change
    val listOfNumbers: MutableList<Int> = mutableListOf(4,5,99)
    println(listOfNumbers)
    listOfNumbers[listOfNumbers.size - 1] = 100
    println(listOfNumbers)
    listOfNumbers.add(320) // menambah nilai item di akhir list
    println(listOfNumbers)
    listOfNumbers.add(0, 0)
    println(listOfNumbers)
    listOfNumbers.removeAt(0)
    println(listOfNumbers)

    // challenge
    val daftarHadir: List<String> = listOf("Aulia", "Bayu", "Citra", "Doni", "Eka")

    println("Daftar Mahasiswa yang Hadir Hari Ini:")
    for (hadir in daftarHadir) {
        println("- $hadir")
    }
    val namaDicari1 = "Bayu"
    if (namaDicari1 in daftarHadir) {
        println("$namaDicari1 hadir di kelas hari ini.")
    } else {
        println("$namaDicari1 tidak hadir di kelas hari ini.")
    }
    val namaDicari2 = "Bima"
    if (namaDicari2 in daftarHadir) {
        println("$namaDicari2 hadir di kelas hari ini.")
    } else {
        println("$namaDicari2 tidak hadir .")
    }

    // Set Unik, tidak bisa di ubah
    val integerset = setOf<Int>(1,2,3,3,3,4)
    println(integerset)

    val mutableSet = mutableSetOf<Int>(1,2,3,4,2,5)
    println(mutableSet)

    mutableSet.add(6) // menambahkan item di akhir set
    mutableSet.remove(1) // menghapus item yang memiliki nilai

    println(mutableSet)

    for(number in 1..5) {
        if(number in mutableSet) {
            println(number)
        }
    }

    // challenge Set
    val emailPendaftar = listOf<String>(
        "alice@gmail.com",
        "bob@gmail.com",
        "charlie@gmail.com",
        "alice@gmail.com",
        "diana@gmail.com"
    )

    val emailTerdaftar = mutableSetOf<String>()

    for(email in emailPendaftar) {
        if(email !in emailTerdaftar) {
            println("Email '$email' berhasil didaftarkan.")
            emailTerdaftar.add(email)
        } else {
            println("Email '$email' sudah terdaftar. Pendaftaran ditolak.")
        }
    }
    println("Daftar email yang sudah terdaftar:")
    for(email in emailTerdaftar) {
        println("$email")
    }

    // Map key value pair, tidak bisa diubah
    val bukuKontak: Map<String, String> = mapOf(
        "Anisa" to "0812",
        "Nasywa" to "0811",
        "Hasna" to "0813",
        "Anoy" to "0814"
    )

    println(bukuKontak)

    // accessed by key
    println(bukuKontak["Anisa"])

    // accessed by getValue fun
    println(bukuKontak.getValue("Anoy"))

    // get keys
    println(bukuKontak.keys)

    // get values
    println(bukuKontak.values)

    // Map MutableMap bisa diubah
    val learningPathAndroid = mutableMapOf(
        80 to "Kotlin",
        51 to "Belajar Membuat Aplikasi Android untuk Pemula",
        14 to "Belajar Fundamental Aplikasi Android",
        100 to "Android Kotlin"
    )

    println(learningPathAndroid)

    learningPathAndroid[80] = "Memulai Pemrograman dengan Kotlin"
    println(learningPathAndroid)
    learningPathAndroid.put(352, "Belajar Pengembangan Aplikasi Android Intermediate")
    learningPathAndroid.put(165, "Menjadi Android Developer Expert")

    learningPathAndroid.remove(100)
    println(learningPathAndroid)

    for(kodeKelas in learningPathAndroid.keys) {
        println("Kode kelas: $kodeKelas - Nama kelas: $learningPathAndroid[kodeKelas]")
    }

    for((kodeKelas, namaKelas) in learningPathAndroid) {
        println("Kode kelas: $kodeKelas - Nama kelas: $namaKelas")
    }

    // Challenge
    val dataIbukota: MutableMap<String, String> = mutableMapOf(
        "Indonesia" to "Jakarta",
        "Jepang" to "Tokyo",
        "Perancis" to "Paris",
        "India" to "New Delhi",
        "Brazil" to "Brasilia"
    )
    println("Daftar Negara dan Ibukotanya:")
    for ((negara, kota) in  dataIbukota) {
        println("- $negara : $kota")
    }

    val negaraDicari = "Jepang"
    var hasilIbukota: String? = null

    for ((negara, kota) in  dataIbukota) {
        if(negara == negaraDicari) {
            hasilIbukota = kota
            break;
        }
    }

    if(hasilIbukota != null) {
        println("Ibukota dari $negaraDicari adalah $hasilIbukota.")
    } else {
        println("Negara $negaraDicari tidak ditemukan.")
    }

    println("Menambahkan ibu kota negara Thailand")
    dataIbukota.put("Thailand", "Bangkok")

    println("Daftar Negara dan Ibukotanya:")
    for ((negara, kota) in  dataIbukota) {
        println("- $negara : $kota")
    }

    // Filter
    val angkaFilterGenap = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val genap = angkaFilterGenap.filter { it % 2 == 0 }
    val ganjil = angkaFilterGenap.filterNot { it % 2 == 0 }

    println("Genap: $genap")
    println("Ganjil: $ganjil")

    // Map
    val numberListMultiplied: List<Int> = listOf(1,2,3,4,5,6,7,8,9)
    val multipliedList = numberListMultiplied.map { it * 5 }
    println(multipliedList)

    // FirstOrNull
    val firstOddNumber = numberListMultiplied.firstOrNull { it % 2 == 1  } // 1
    println(firstOddNumber)

    val numberEleven = numberListMultiplied.firstOrNull { it == 11 }// null
    println(numberEleven)

    // LastOrNull
    val lastOddNumber = numberListMultiplied.lastOrNull { it % 2 == 1  }
    println(lastOddNumber)

    val lastOrNullNumberEleven = numberListMultiplied.lastOrNull { it == 11 }
    println(lastOrNullNumberEleven)

    // sorted
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()  // [i, k, l, n, o, t]
    println(ascendingSort)
}