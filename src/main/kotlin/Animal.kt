class Animal(
    var name: String,
    var weight: Double,
    var age: Int,
    var isMammal: Boolean
) {
    // Secondary constructor
    constructor(name: String, isMammal: Boolean) : this(name, 0.1, 0, isMammal) {
        println("Animal $name dibuat dengan default weight & age")
    }

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}
