package namegenerator

import passwordpassphrase.passwordGenerate
import higherlower.backMenu

fun main() {

    val alphabetUpp = ('A'..'Z')
    val alphabetLow = ('a'..'z')
    val number = ('0'..'9')
    val especialChar = listOf<String>("!", "@", "#", "$", "%", "&", "*")
    val vowel = listOf("a", "e", "i", "o", "u")
    val MAX_NUMBER_SIZE_USERNAME = 3
    val MAX_NUMBER_SIZE_PASSWORD = 10

    while (true) {
        println("--- Name Generator ---")
        println("1 - Generate username")
        println("2 - Generate password")
        println("3 - Exit")
        val option = readln().toInt()

        println("How much do you like generate?")
        val size = readln().toInt()

        when (option) {
            1 -> usernameGenerate(alphabetLow, vowel, size, MAX_NUMBER_SIZE_USERNAME)
            2 -> passwordGenerate(alphabetUpp, alphabetLow, especialChar, number, size, MAX_NUMBER_SIZE_PASSWORD)
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
fun usernameGenerate(alphabetLow : CharRange, vowel : List<String>, size : Int, MAX_NUMBER_SIZE_USERNAME : Int) {
    println("Username: ")
    repeat(size) {
    var name = ""

    repeat(MAX_NUMBER_SIZE_USERNAME) {
        val username = alphabetLow.random()
        val vowel = vowel.random()
        name += username + vowel
    }
    println(name)
    }
}