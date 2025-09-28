fun main() {
    val jenisTiket = EnumTrain.EKONOMI

    when (jenisTiket) {
        EnumTrain.EKONOMI -> println("EKONOMI")
        EnumTrain.EKSEKUTIF -> println("EKSEKUTIF")
        EnumTrain.BISNIS -> println("BISNIS")
    }
}