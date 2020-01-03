import kotlin.random.Random

fun main() {
    val options = arrayOf("Paper", "Rock", "Scissors")
    val aiChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    announceResult(userChoice, aiChoice)

}

fun getGameChoice(options: Array<String>): String = options[Random.nextInt(options.size)]

fun getUserChoice(options: Array<String>): String {
    var isValid = false
    var userChoice = ""
    while (!isValid) {
        print("Please enter one of the following: ")
        for (element in options) {
            print(" $element")
        }
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput.capitalize() in options) {
            isValid = true
            userChoice = userInput
        }
    }
    return userChoice
}

fun announceResult(userChoice: String, aiChoice: String) {
    val result: String = if (userChoice == aiChoice) "Tie!"
    else if ((userChoice == "Rock" && aiChoice == "Scissors") ||
        (userChoice == "Scissors" && aiChoice == "Paper") ||
        (userChoice == "Paper" && aiChoice == "Rock")
    ) "User wins!"
    else "Computer wins!"
    println("Computers choice was $aiChoice, Your choice was $userChoice, the result is: $result")
}
