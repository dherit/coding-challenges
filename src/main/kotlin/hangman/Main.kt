package hangman

var wrong = 0
val word = listOf("alive", "castle", "joke").random()

fun main() {
    val miss = mutableListOf<Char>()
    val guessed = mutableListOf<Char>()

    while (true) {

        hangmanPrint(wrong)
        println()

        print("Word: ")
        for (char in word) {
            if (char in guessed) {
                print(char)
            } else {
                print("_")
            }
        }

        println()

        print("Miss: ")
        println(miss.joinToString(" "))

        println("Type a letter: ")
        print("> ")
        val letter = readln().lowercase()[0]

        if (letter in guessed || letter in miss) {
            println("You already used this letter $letter")
            continue
        }

        if (letter in word) {
            guessed.add(letter)
        } else {
            miss.add(letter)
            wrong++
        }

        if (word.all { it in guessed}) {
            println("You win, the word was $word!")
            break
        }

        if (wrong == 6) {
            hangmanPrint(wrong)
            println("You lose, the word was $word")
            break
        }


    }
}
fun hangmanPrint(wrong: Int) {

    val head = if (wrong >= 1) "◯" else ""
    val leftArm = if (wrong >= 2) "/" else ""
    val stem = if (wrong >= 3) "|" else ""
    val rightArm = if (wrong >= 4) "\\" else ""
    val leftFoot = if (wrong >= 5) "/" else ""
    val rightFoot = if (wrong >= 6) "\\" else ""

    val hangman = """                
                 --------------
                 |            |
                 |            |
                 |            $head 
                 |           $leftArm$stem$rightArm 
                 |           $leftFoot $rightFoot 
                 |
             ----|----
            -----------""".trimIndent()

    print(hangman)
    println()


}
