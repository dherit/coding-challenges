package randomsentencegenerator

fun main() {
    val subject = listOf("i", "you", "he", "she", "we", "they").random()
    var verb = listOf("have", "say", "go", "get", "think", "see", "want", "try", "be").random()
    val preposition = listOf("to", "with", "in", "on").random()
    val noun = listOf("book", "apple", "car", "letter", "movie").random()
    val adjective = listOf("nice", "mysterious", "scary", "fat", "short", "elegant", "clean").random()
    val adverb = listOf("always", "never", "quickly", "almost", "frequently").random()
    val conjunction = listOf("since", "while", "and", "but", "because").random()
    val prepositionalPhrase = listOf("in the house", "on the table", "near the window", "at work", "at night", "after work").random()
    val secondIdea = listOf("it is healthy", "i am tired", "he is not here", "i am very happy", "she is very excited").random()
    val vowel = listOf('a', 'e', 'i', 'o', 'u')
    var article = if ((0..1).random() == 0) {
        "the"
    } else {
        if (noun[0] in vowel) "an" else "a"
    }


    if (subject == "he" || subject == "she") {
        verb = when (verb) {
            "have" -> "has"
            "go" -> "goes"
            "be" -> "is"
            "try" -> "tries"
            else -> "${verb}s"
        }
    } else if (subject == "i" && verb == "be") {
        verb = "am"
    } else if (verb == "be") {
        verb = "are"
    }


    val sentences = listOf("$subject $adverb $verb $preposition $article $adjective $noun $prepositionalPhrase, $conjunction $secondIdea",
        "$subject $verb $article $noun $prepositionalPhrase",
        "$subject $adverb $verb $article $adjective $noun").random()
    println(sentences)



}

