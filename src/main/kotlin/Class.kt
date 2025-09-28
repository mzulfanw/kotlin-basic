package org.example

import Animal
import Cat
import Calculator
import AbstractAnimal
import Bird

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()

    val dicodingInheritance = Cat("Dicoding Inheritance", 4.2, 2, true, "Brown", 4)

    dicodingInheritance.playWithHuman()
    dicodingInheritance.eat()
    dicodingInheritance.eat("Ikan Tuna")
    dicodingInheritance.eat("Ikan Tuna", 10.0)

    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.5, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(1, 2, 3))

    println(calc.min(9, 2))
    println(calc.min(17.2, 18.3))

    val absAnimalDicoding = AbstractAnimal("Dicoding Maiw", 5.2, 2, true)
    absAnimalDicoding.eat()
    absAnimalDicoding.talk()

    val birdClass = Bird(2)
    birdClass.fly()

}