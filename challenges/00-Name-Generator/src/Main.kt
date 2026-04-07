import kotlin.random.Random

fun main() {

    val alphabetUpp = ('A'..'Z').toMutableList()
    val alphabetLow = ('a'..'z').toMutableList()
    val number = ('0'..'9').toMutableList()
    val especialChar = listOf("!", "@", "#", "$", "%", "&", "*")
    val vowel = listOf("a", "e", "i", "o", "u").toMutableList()

    for (i in 0 until 3) {
        val username = alphabetLow.random()
        val vowel = vowel.random()
        print(username)
        print(vowel)
    }
    println()

    for (i in 0 until 10) {
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
