fun main() {
    val user0 = UserData("Muhammad Zulfan Wahyudin", 23)
    //val user1 = user0 // without copy it will change the reference, used copy for copying the reference
    val user1 = user0.copy(name = "Anisa Nasywahasna")
    println(user1)
    println(user0)

    // destructuring
    val (name, age) = user1
    println("My name is $name, I am $age years old")
}