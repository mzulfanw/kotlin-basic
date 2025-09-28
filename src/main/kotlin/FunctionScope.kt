// let, run, with, apply and also

// lambda receiver run, with, apply

class Tiger(val name: String, var age: Int, var owner: String) {
    fun meow() {
        println("$name is meowing")
    }
    fun eat() {
        println("$name is eating")
    }
}

data class Person(val name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

fun main() {
  Person("Alice", 20, "Amsterdam").let {
      println(it)
      it.moveTo("London")
      it.incrementAge()
      println(it)
  }

    // example run
    var nullableTigger: Tiger? = null
    var age = nullableTigger?.run {
        this.age++
        println("Hai ${this.name}. Selamat ulang tahun ke-${this.age}")
        this.age
    }
    println("Umur Kucing sekarang: $age")

    println("==============================")

    nullableTigger = Tiger("Miska", 2, "Zulfan")

    age = nullableTigger?.run {
        this.age++
        println("Hai ${this.name}. Selamat ulang tahun ke-${this.age}")
        this.age
    }

    println("Umur Kucing sekarang: $age")

    // example with non nullable

    val nonNullableTigger = Tiger("Miska", 2, "Zulfan")

    val ageT = with(nonNullableTigger) {
        println("Hai ${this.name}. Selamat ulang tahun ke-${this.age + 1}")
        this.age++
    }

    println("Umur Kucing sekarang: $ageT")

    // example apply set sekaligus

    var applyTiger = Tiger("Miska", 2, "Zulfan")
    println("${applyTiger.name} berumur ${applyTiger.age}. Pemiliknya adalah ${applyTiger.owner}")

    applyTiger.apply {
        this.age++
        this.owner = "Anisa Nasywahasna"
    }

    println("${applyTiger.name} berumur ${applyTiger.age}. Pemiliknya adalah ${applyTiger.owner}")

    // let lebih bisa dibaca
    var ageLet = nullableTigger?.let {
        it.age++
        println("Hai ${it.name}. Selamat ulang tahun ke-${it.age}")
        it.age
    }

    println("Umur Kucing sekarang: $ageLet")

    println("==============================")

    // also
    val alsoTiger = Tiger("Alice", 2, "Zulfan").also {
        it.age++
        it.owner = "Anisa Nasywahasna"
    }

    println(alsoTiger.name)

    // run, with, apply lambda receiver
    // let, also lambda argument
}