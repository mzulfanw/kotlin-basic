import kotlinx.coroutines.*

// Menjebatani async code dan sync code
//fun main() {
////    exampleRunBlocking()
//    exampleLaunchBlocking()
//}

fun exampleRunBlocking() {
    println("Run blocking")
    runBlocking {
        println("Helo")
        delay(2000L)
    }
    println("Another Test")
}

// mengembalikan nilai
fun exampleLaunchBlocking() {
    println("Start")
    runBlocking {
        launch {
            delay(1000L)
            println("Coroutine 1 completed")
        }
        launch {
            delay(2000L)
            println("Coroutine 2 completed")
        }
    }

    println("End")
}

// async yang mengembalikan nilai
suspend fun getCapital(): Int {
    delay(1000L)
    return 5000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 7500
}

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit ${income.await() - capital.await()}")
}
