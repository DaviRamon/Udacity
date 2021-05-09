
fun main(){
    fishName()
}


fun fishName(){
    val fishName = "Davi Ramon Gonçalves"

    when(fishName.length){
        0 -> println("Error: The fish must have a name!")
        in 3..12 -> println("Good fish name!")
        else -> println("Ok fish name")
    }
}


