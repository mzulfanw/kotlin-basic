fun main() {
    val colorRed = EnumColor.RED
    val colorGreen = EnumColor.GREEN
    val colorBlue = EnumColor.BLUE

    println(colorRed.hexValue.toString(16))

    val colors: Array<EnumColor> = EnumColor.entries.toTypedArray()
    for(color in colors) {
        println(color)
    }

    val valueOfRed = EnumColor.valueOf("RED")
    println("Color is $valueOfRed")

    // ordinal posisi
    val colorPosition = EnumColor.GREEN
    println("Position GREEN is ${colorPosition.ordinal}")

    // ordnial
    val colorIndex = EnumColor.GREEN.ordinal
    val color = EnumColor.entries[colorIndex]
    println("Color is $color")

}