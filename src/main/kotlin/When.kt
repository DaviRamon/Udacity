fun main() {
    whenteste()
}

fun whenteste(){
    val welcomeMessage = "Hello and welcome to Kotlin"

    when (welcomeMessage.length){
        0 -> println("Nothing to say?")
        in 1..10 -> println("Perfect")
        else -> println("Too long!")
    }

}