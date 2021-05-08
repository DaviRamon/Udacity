
fun main(){
    fishName()
}
fun whenteste(){
    var welcomeMessage = "Hello and welcome to Kotlin"

    when (welcomeMessage.length){
        0 -> println("Nothing to say?")
        in 1..10 -> println("Perfect")
        else -> println("Too long!")
    }

}

fun fishName(){
    var fishName = "Davi Ramon Gonçalves"

    when(fishName.length){
        0 -> println("Error: The fish must have a name!")
        in 3..12 -> println("Good fish name!")
        else -> println("Ok fish name")
    }
}


