class Dog(val name: String, weight_param: Int, breed_param: String) {

    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walking", "Running")
    val breed = breed_param.capitalize()

    init {
        println("The breed is $breed")
    }
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}