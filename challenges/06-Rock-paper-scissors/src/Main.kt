import kotlin.random.Random

fun main() {
    while (true) {

        println("Choose rock, paper or scissors:")
        println("0 - Rock")
        println("1 - Paper")
        println("2 - Scissors")
        val option = readln().toInt()

        when {
            option > 3 -> return println("Invalid option")
        }

        val nameList = listOf("Rock", "Paper", "Scissors")
        val random = nameList.random()

        var receive: String
        receive = nameList[option]

        println("$receive x $random")

        val result = when {
            random == receive -> "Draw"

            receive == "Rock" && random == "Scissors" -> "You win!"
            receive == "Paper" && random == "Rock" -> "You win!"
            receive == "Scissors" && random == "Paper" -> "You win!"

            else -> "You lose!"
        }
        println(result)

        backMenu()
        val menu = readln().toInt()
        when (menu) {
            0 -> continue
            else -> return println("Invalid option")
        }
    }
}
fun backMenu() {
    println()
    println("Do you like to play again?")
    println("0 - Yes")
    println("1 - Exit")
}
