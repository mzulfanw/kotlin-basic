package org.example

fun main() {
    var local: Char = 'A' // char its unicode

    println("Vocal " + local++)
    println("Vocal " + local++)
    println("Vocal " + local++)
    println("Vocal " + local--)
    println("Vocal " + local--)
    println("Vocal " + local--)

    val userAddress = "Jln Kolonel Masturi no.31"

    println(userAddress)

    // String concatenation
    val fullname = "Muhammad Zulfan"
    println("$fullname Wahyudin")

    // escaped string
    var escapedstr = "Paman berkata, \"Jangan lupa belajar Kotlin hari ini\""
    var addedTab = "Tab \t here"
    var addedLine = "new \n line"
    var addedDollar = "Money \$ here"
    println(escapedstr)
    println(addedTab)
    println(addedLine)
    println(addedDollar)

    var rawstr = """
        === \"Menu Utama"\ ===
        1. Tambah Data
        2. Lihat Data
        3. Keluar
    """.trimIndent()

    println(rawstr)

    // challange dicoding
    val path = """C:\Users\Budi\Documents"""
    val message = "Berkas tersebut telah berhasil disimpan di: $path"
    println(message)
}