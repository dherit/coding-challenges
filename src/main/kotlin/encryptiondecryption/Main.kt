package encryptiondecryption

import higherlower.backMenu

fun main() {
    while (true) {
        println("--- Encryption System ---")
        println("1 - Encrypt")
        println("2 - Decrypt")
        println("3 - Exit")

        val option = readln().toInt()
        when (option) {
            1 -> encrypt()
            2 -> decrypt()
            else -> return
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
fun encrypt() {
    var encrypted = ""

    println("--- Encrypt ---")
    println("Type your message:")
    print("> ")
    val message = readln()

    println()
    println("Type the key:")
    print("> ")
    val key = readln().toInt()

    for (char in message) {
        if (char.isLetter()) {
            val number = char.lowercaseChar() - 'a'
            val newNumber = (number + key) % 26
            val newChar = 'a' + newNumber
            encrypted += newChar
        } else {
            encrypted += char
        }
    }

    println()
    println("Encrypted result:")
    println("> $encrypted")
}
fun decrypt() {
    var decrypted = ""

    println("--- Decrypt ---")
    println("Type your message:")
    print("> ")
    val message = readln()

    println()
    println("Type the key:")
    print("> ")
    val key = readln().toInt()

    for (char in message) {
        if (char.isLetter()) {
            val number = char.lowercaseChar() - 'a'
            val newNumber = (number - key + 26) % 26
            val newChar = 'a' + newNumber
            decrypted += newChar
        } else {
            decrypted += char
        }
    }

    println()
    println("Encrypted result:")
    println("> $decrypted")
}

