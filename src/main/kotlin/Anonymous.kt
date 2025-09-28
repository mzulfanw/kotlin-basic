// Anonymous

//interface ISwim {
//    fun swim()
//}
//
//fun swimWithWings(fish: ISwim) {
//    fish.swim()
//}
//
//fun main() {
//    swimWithWings(object : ISwim {
//        override fun swim() {
//            println("swim")
//        }
//    })
//}


// Fungsi Single Abstract Method (SAM)
fun interface ISwim {
    fun swim()
}

fun swimWithWings(fish: ISwim) {
    fish.swim()
}

fun main() {
    swimWithWings {
        println("The Bird flying")
    }
}