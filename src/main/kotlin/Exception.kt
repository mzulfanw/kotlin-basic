package org.example

fun main() {
    val valueX: String = "11.0"
    try {
        val valueY: Int = valueX.toInt()
        println(valueY)
    } catch (e: NullPointerException) {
        println("Nilai valueX null. Harap tetapkan nilai String sebelum menambahkannya ke dalam valueY")
    } catch (e: NumberFormatException) {
        println("Format nilai valueX tidak Int. Harap sesuaikan dahulu sebelum menambahkannya ke dalam valueY")
    } catch (e: Exception) {
        println("Terjadi exception dalam program")
    } finally {
        println("Program akan logout dan membersihkan memory")
    }
}