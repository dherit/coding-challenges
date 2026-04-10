package fizzbuzz

import higherlower.backMenu

fun main() {
    while (true) {

        println("--- FIZZ BUZZ ---")
        println()
        println("Enter a number:")
        print("> ")
        val n = readln().toInt()

        println()
        println("--- Result ---")

        for (i in 1 until n+1) {
            if (i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            }
            else if (i % 3 == 0) {
                println("Fizz")
            }
            else if (i % 5 == 0) {
                println("Buzz")
            }
            else {
                println(i)
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