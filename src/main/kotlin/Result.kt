fun main() {
    val result: Result = Result.Error("Oops!")
//    println("Error: ${result.message}") // error should handle\

    when (result) {
        is Result.Success ->{
            println("Success: ${result.dataUser}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading...")
        }
    }
}