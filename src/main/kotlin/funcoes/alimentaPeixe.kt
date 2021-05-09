package funcoes

import java.util.*

fun main() {
feedTheFish()

}

fun feedTheFish(){
    val day = randomDay()
    val food = "ração"
    println("Hoje é $day e o peixe comeu $food")
}

fun randomDay() : String {
    val week = listOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado")
    return  week[Random().nextInt(7)] // index 0 to 6

}
