package org.example

fun main() {
    val isOfficeOpen = true
    println("Is office open? $isOfficeOpen")

    val a = 10
    val b = 10
    println(a == b)  // Output: true

    val c = "Dicoding"
    val d = "Dicoding"

    println(c != d) // Output: false

    // Operator logika
    val x = true
    val y = true
    val z = false

    val xy = x && y
    val xz = x && z
    val xyz = x && y && z

    println("Nilai x && y: $xy")
    println("Nilai x && z: $xz")
    println("Nilai x && y && z: $xyz")
}