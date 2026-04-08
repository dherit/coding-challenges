package higherlower
import kotlin.random.Random

fun main() {

    while (true) {
        menu()
        val option = readln().toInt()

        when (option) {
            1 -> higherLower()
            2 -> tossCoin()
            3 -> return
        }

        backMenu()
        val menu = readln().toInt()
        println()
        when (menu) {
            0 -> continue
            else -> return println("Goodbye!")
        }
    }
}

fun menu() {
    println("Welcome to minigames. Type for play:")
    println("1 - Higher/Lower")
    println("2 - Toss a coin.")
    println("3 - Exit")
}
fun backMenu() {
    println()
    println("Do you like back to main menu?")
    println("0 - Yes")
    println("1 - Exit")
}
fun higherLower() {
        val randomNumber = (0..100).random()
        var low = 0
        var high = 100
        while (true) {

            println("Choice one number entry " + low + "/" + high + ".")
            val number = readln().toInt()

            if (number < randomNumber) {
                println("Most higher")
                low = number
            }
            if (number > randomNumber){
                println("Most lower")
                high = number
            }
            if (number == randomNumber) {
                println("The number right is $number, You win!" )
                break
            }

        }

}
fun tossCoin() {
    println("------- Toss a coin -------")
    println("Choice a side of the coin:")
    println("0 - For head")
    println("1 - For tail")
    val side = readln().toInt()

    val boolean = Random.nextBoolean()

    val coin = (side == 0)

    if (coin == boolean) {
        println("You win!") // Head = true
    } else {
        println("You lose!") // Tail = false
    }
}
