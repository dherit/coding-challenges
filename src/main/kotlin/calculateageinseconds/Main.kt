package calculateageinseconds

import higherlower.backMenu
import java.time.LocalDate
import java.time.Period

fun main() {

        var birthDay : Int
        var birthMonth : Int
        var birthYear : Int

    while (true) {

        println("Date of birth (dd mm yyyy):")
        print("> ")
        var input = readln().trim()

        if (input.isEmpty()) {
            println("Invalid option, try again")
            continue
        }

        var parts = input.replace("/", " ").split("\\s+".toRegex())

        if (parts.size != 3) {
            println("Invalid format")
            continue
        }
            birthDay = parts[0].toInt()
            birthMonth = parts[1].toInt()
            birthYear = parts[2].toInt()

        val birthDate = LocalDate.of(birthYear, birthMonth, birthDay)
        val today = LocalDate.now()

        val period = Period.between(birthDate, today)

        val result = (period.days * 86400) + (period.months * 2628000) + (period.years * 31556952)
        val formatted = "%,d".format(result)

        println("The difference between:")
        println("---------------")

        println("Birth date: $birthDay/$birthMonth/$birthYear")
        println()
        println("Current date: ${LocalDate.now().dayOfMonth}/${LocalDate.now().monthValue}/${LocalDate.now().year}")

        println("---------------")
        println("Result:")
        println("Years: ${period.years}")
        println("Months: ${period.months}")
        println("Days: ${period.days}")
        println()
        println("Your age in seconds $formatted")

        backMenu()
        val menu = readln().toInt()
        println()
        when (menu) {
            0 -> continue
            else -> return println("Goodbye!")
        }

    }
}