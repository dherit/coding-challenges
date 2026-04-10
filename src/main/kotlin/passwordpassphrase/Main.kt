package passwordpassphrase

import kotlin.random.Random
import higherlower.backMenu

fun main() {
    val alphabetUpp = ('A'..'Z')
    val alphabetLow = ('a'..'z')
    val number = ('0'..'9')
    val especialChar = listOf<String>("!", "@", "#", "$", "%", "&", "*")
    val MAX_NUMBER_SIZE_PASSWORD = 10
    val MAX_NUMBER_SIZE_PASSPHRASE = 4
    val words = listOf<String>("jacket", "moon", "car", "jump", "void", "lucky", "september", "victory",
        "rice", "second", "catalogue", "south", "candle", "chandelier",
        "cat", "gas", "computer", "perception")

    while (true) {
        println("--- Password/Passphrase Generator ---")
        println("1 - Generate password")
        println("2 - Generate passphrase")
        println("3 - Exit")
        val option = readln().toInt()

        println("How much do you like generate?")
        val size = readln().toInt()

        when (option) {
            1 -> passwordGenerate(alphabetUpp, alphabetLow, especialChar, number, size, MAX_NUMBER_SIZE_PASSWORD)
            2 -> passphraseGenerate(words, size, MAX_NUMBER_SIZE_PASSPHRASE)
            3 -> return println("Goodbye!")
            else -> {println("Invalid option, try again")
                println()
                continue}
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
fun passwordGenerate(alphabetUpp: CharRange, alphabetLow: CharRange, especialChar: List<String>, number: CharRange, size : Int, MAX_NUMBER_SIZE_PASSWORD : Int) {
    println("Password: ")
    val times = listOf<Int>(0, 1, 2, 3)

    repeat(size) {
        repeat(MAX_NUMBER_SIZE_PASSWORD) {
            var char = ""
                when(times.random()) {
                0 -> char += alphabetUpp.random()
                1 -> char += alphabetLow.random()
                2 -> char += especialChar.random()
                3 -> char += number.random()
                }
            print(char)
        }
        println()
    }
}
fun passphraseGenerate(words: List<String>, size : Int, MAX_NUMBER_SIZE_PASSPHRASE: Int) {
    println("Passphrase: ")
    repeat(size) {
        repeat(MAX_NUMBER_SIZE_PASSPHRASE) {
            print("${words.random()} ")
        }
        println()
    }

}
