open class AbstractAnimal(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean) : AbsAnimal(pName, pWeight, pAge, pIsCarnivore) {
    override fun talk() {
        println("Miaw")
    }
}