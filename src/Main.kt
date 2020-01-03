fun main(args: Array<String>) {
    val dog = Dog("Fido", 22, "Mixed")
    dog.bark()
    println(dog.weightInKgs)
}

fun iterate(number: Int): Int {
    var times = number;
    for (i in 1..number) {
        times -= 1
    }
    return times
}