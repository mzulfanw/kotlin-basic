abstract class AbsAnimal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {
    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }

    abstract fun talk()
}