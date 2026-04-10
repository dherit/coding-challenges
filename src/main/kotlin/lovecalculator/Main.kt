package lovecalculator

import higherlower.backMenu

fun main() {
    while (true) {
        println("--- Love Calculator ---")
        println("1 - Calculate love score")
        println("2 - Exit")
        val option = readln().toInt()

        when (option) {
            1 -> calculateLoveScore()
            2 -> return println("Goodbye!")
            else -> {println("Invalid option, try again")
                println()
                continue
            }
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
fun calculateLoveScore() {

    println("Enter first name:")
    print("> ")
    val name1 = readln()
    println("Enter second name:")
    print("> ")
    val name2 = readln()

    val sum1 = name1.sumOf { it.code }
    val sum2 = name2.sumOf { it.code }

    val result = (sum1 + sum2) % 101

    println()
    print("Calculation compatibility")
    repeat(3) {
        Thread.sleep(800)
        print(".")
    }
    println()
    println()

    println("Love score:")
    println("> $result%")
}