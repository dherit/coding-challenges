import kotlin.random.Random

fun main() {

    val alphabetUpp = ('A'..'Z').toMutableList()
    val alphabetLow = ('a'..'z').toMutableList()
    val number = ('0'..'9').toMutableList()
    val especialChar = listOf("!", "@", "#", "$", "%", "&", "*")
    val vowel = listOf("a", "e", "i", "o", "u").toMutableList()
    val MAX_NUMBER_SIZE_NAME = 3
    val MAX_NUMBER_SIZE_PASSWORD = 10

    var name = ""

    print("Username: ")
    for (i in 0 until MAX_NUMBER_SIZE_NAME) {
        val username = alphabetLow.random()
        val vowel = vowel.random()
        name += vowel + username
    }
    print(name)

    println()

    print("Password: ")
    for (i in 0 until MAX_NUMBER_SIZE_PASSWORD) {
        val char = if (Random.nextBoolean()){
            alphabetUpp.random()
        } else if (Random.nextBoolean()) {
            alphabetLow.random()
        } else if (Random.nextBoolean()) {
            especialChar.random()
        } else {
            number.random()
        }
        print(char)
    }
}
