class Student(val name: String) {
    companion object {
        val academy = "Dicoding Academy"

        fun printAcademyInfo() {
            println("Siswa berasal dari $academy")
        }
    }
}

fun main() {
    println(Student.academy)
    println(Student.printAcademyInfo())
}