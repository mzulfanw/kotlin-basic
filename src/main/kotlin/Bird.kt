open class Bird(override val numberOfWings: Int): IFly {
    override fun fly() {
        println("I fly with wings")
    }
}