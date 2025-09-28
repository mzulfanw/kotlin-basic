object CentralLibrary {
    val books: List<String> = listOf("Book1", "Book2", "Book3")

    fun borrowBookByIndex(index: Int) {
        println("${books[index]} has been borrowed!")
    }
}

fun main() {
    val centralLibrary = CentralLibrary
    println(centralLibrary.books)
    println(centralLibrary.borrowBookByIndex(0))
}