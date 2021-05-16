fun main(){
    list()

}

fun list(){
    val list =  mutableListOf("Tuna", "Salmon", "Shark")
    val myList = mutableListOf("koi","goldfish")

    // remove by index
    myList.removeAt(1)

    // remove by name
    list.remove("Salmon")


    println(myList)
    println(list)

    // adiciona algo em uma lista por Input
    val lista : MutableList<String> = ArrayList()
    list.add(readLine().toString())

    println(list)

}