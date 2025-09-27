package org.example

fun main() {
    val nama = ""
    val score = 0

    // null adalah nilai kosong
    var namaUser: String? = null
    println(namaUser)

    namaUser = "Anisa Nasywahasna"
    println(namaUser)

    // Safe calls operator
    val judul: String = "Belajar Kotlin"
    var catatanBuku: String? = null
    var panjangCatatanBuku = catatanBuku?.length
    println("Buku $judul memiliki panjang catatan buku: $panjangCatatanBuku karakter")

    catatanBuku = "Wah, seru ya belajar Kotlin"
    panjangCatatanBuku = catatanBuku?.length
    println("Buku $judul memiliki panjang catatan buku: $panjangCatatanBuku karakter")

    // Elvis operator
    var anotherPanjangCatatanBuku = catatanBuku?.length ?: 0 // default value
    println("Buku $judul memiliki panjang $anotherPanjangCatatanBuku")
}