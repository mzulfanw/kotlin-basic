open class Inheritance(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
  open fun eat() {
        println("$name sedang makan!")
    }

    // overloading
    fun eat(typeFood: String) {
        println("$name memakan $typeFood")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}