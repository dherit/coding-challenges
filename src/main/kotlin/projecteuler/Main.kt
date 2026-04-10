package projecteuler

import higherlower.backMenu

fun main() {
    while (true) {

        println("--- Project Euler ---")
        println()
        println("Project 1 - Multiples of 3 and 5")
        println("Enter a limit:")
        print("> ")
        val n = readln().toInt()

        println()
        println("Result:")

        var sum = 0

        for (i in 1 until n) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i
            }
        }
        println("> $sum")

        backMenu()
        val menu = readln().toInt()
        println()
        when (menu) {
            0 -> continue
            else -> return println("Goodbye!")
        }
    }
}