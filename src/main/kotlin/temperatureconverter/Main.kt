package temperatureconverter

fun main() {

    while (true) {
        menu()
        val option = readln().toInt()

        when (option) {
            0 -> ctof()
            1 -> ftoc()
            2 -> ctok()
            3 -> ktoc()
            else -> return println("Invalid option")

        }

        backMenu()
        val menu = readln().toInt()
        when (menu) {
            0 -> continue
            else -> return println("Invalid option")
        }

    }
}
fun menu() {
    println("0 - Celsius -> Fahrenheit")
    println("1 - Fahrenheit -> Celsius")
    println("2 - Celsius -> Kelvin")
    println("3 - Kelvin -> Celsius")
}
fun backMenu() {
    println("Do you like back to main menu?")
    println("0 - Yes")
    println("1 - Exit")
}
fun ctof() {
    print("Type the temperature:")
    val celsius = readln().toDouble()
    val temperature = (celsius * 1.8) + 32
    println("Result: %.2f°F".format(temperature))
}
fun ftoc() {
    print("Type the temperature:")
    val fahrenheit = readln().toDouble()
    val temperature = (fahrenheit - 32) / 1.8
    println("Result: %.2f°C".format(temperature))
}
fun ctok() {
    print("Type the temperature:")
    val celsius = readln().toDouble()
    val temperature = celsius + 273.15
    println("Result: %.2f K".format(temperature))
}
fun ktoc() {
    print("Type the temperature:")
    val kelvin = readln().toDouble()
    val temperature = kelvin - 273.15
    println("Result: %.2f°C".format(temperature))
}