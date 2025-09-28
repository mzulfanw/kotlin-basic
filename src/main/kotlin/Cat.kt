class Cat(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : Inheritance(pName, pWeight, pAge, pIsCarnivore)  {
    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat() {
        super.eat()
        println("$name sedang memakan ikan")
    }
}