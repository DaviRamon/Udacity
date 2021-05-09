fun main(args: Array<String>) {

    // como eu fiz
    val valor = "${args [0]}".toInt()
    if (valor < 12 ) println("Good Morning, Kotlin") else println("Good night, Kotlin")

    // resposta sugerida pelo desafio
    if (args[0].toInt() < 12) println("Good Morning Kotlin")
    else println("Good Night Kotlin" )

    // resposta avançada
    println("${if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
}




