package internettime

import higherlower.backMenu
import java.net.URL

fun main() {
    while (true) {
        println("--- Internet Time (SNTP)")
        println("1 - Get current internet time")
        println("2 - Exit")
        println()
        println("Select:")
        print("> ")
        val option = readln().toInt()

        when (option) {
            1 -> getInternetTime()
            2 -> return println("Goodbye!")
            else -> {
                println("Invalid option, try again")
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
fun getInternetTime() {
    println()
    print("Connecting to time server")
    repeat(3) {
        Thread.sleep(400)
        print(".")
    }
    println()
    println()

    val api = URL("https://time.now/developer/api/timezone/America/Sao_Paulo")
    val response = api.readText()
    val dateTime = extractDateTime(response)



    println(dateTime)
}
fun extractDateTime(json: String): String {
    val key = "\"datetime\":\""
    val start = json.indexOf(key) + key.length
    val end = json.indexOf("\"", start)
    val fullDateTime = json.substring(start, end)

    println("Time now: ${fullDateTime.substring(11, 19)}")
    return ("Date: ${fullDateTime.substring(8, 10)}/${fullDateTime.substring(5, 7)}/${fullDateTime.substring(0, 4)}")

}