package funcoes

import java.util.*

fun main() {
    getFortuneCookie()
}


fun getBirthday(): String? {
    print("What is your birthday?  ")
    // recebe o dia como uma string.
    val birthday = readLine()
    return (birthday)

}

fun convertBirthdayToInt(): Int? {

    // converte string recebida para int, caso não seja número, retorna null.
    val receivedBirthday = getBirthday()?.toIntOrNull()
       return (receivedBirthday)

}

fun randomFortune(): String {

    // sorteia uma frase aleatória da lista com base no indice.
    val randomFortune = listOf("You will have a great day!", "Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")

    return (randomFortune[Random().nextInt(7)])

}

fun getFortuneCookie() {
    // recebe a data de aniversario
    when(convertBirthdayToInt()){
        null -> { // caso o valor recebido seja nulo,
            do {
                println("Enter a valid number: ")
            } while (convertBirthdayToInt() == null) // verifica se o valor digitado constinua sendo nulo.
            println("You fortune is: ${randomFortune()}") // caso o usuario digite um numero termina o laço e mostra a sorte do dia.

        }
        else -> println("You fortune is: ${randomFortune()}")

    }

}

// RESPOSTA SUGERIDA PELO DESAFIO
fun getFortune2() : String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}


fun mainsz(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune2()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}





