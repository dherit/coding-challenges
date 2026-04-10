package rockpaperscissors

fun main() {
        while (true) {
            println("--- Rock, Paper or Scissors ---")
            println("0 - Rock")
            println("1 - Paper")
            println("2 - Scissors")
            val nameList = listOf<String>("Rock", "Paper", "Scissors").random()
            var option = readln().toInt()

            val result = when (option) {
                0 -> "Rock".toString()
                1 -> "Paper".toString()
                2 -> "Scissors".toString()
                else -> return println("Goodbye!")

            }
            println("${result.toString()} x $nameList")
            if (result == nameList) {
                println("Draw")
            } else if (result == "Rock" && nameList == "Scissors" || result == "Paper" && nameList == "Rock" || result == "Scissors" && nameList == "Paper") {
                println("You win!")
            } else println("You lose!")

        backMenu()
        val menu = readln().toInt()
        when (menu) {
            0 -> continue
            else -> return println("Goodbye!")
        }
    }
}
fun backMenu() {
    println()
    println("Do you like to play again?")
    println("0 - Yes")
    println("1 - Exit")
}
