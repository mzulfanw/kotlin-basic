package org.example

fun main() {
    val byteMaxNumber: Byte = 127
    println("Nilai maksimal Byte: $byteMaxNumber \n")

    val shortMaxNumber: Short = 32767
    println("Nilai maksimal Short: $shortMaxNumber \n")

    val intMaxNumber: Int = 2147483647
    println("Nilai maksimal Int: $intMaxNumber \n")

    val longMaxNumber: Long = 9223372036854775807
    println("Nilai maksimal Long: $longMaxNumber \n")

    val byteNumber: Byte = 10
    val shortNumber: Short = 10
    val longNumber: Long = 10

    // Type Inference untuk Long dengan menambahkan suffix "L"
    val anotherLongNumber = 10L
}