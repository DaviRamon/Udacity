fun main(){
fish()
}

fun fish(){
    val trout ="trout"
    val haddock ="haddock"
    val snapper = "snapper"

    println("I like to eat $trout, but not $haddock, also $snapper")
}

fun add(){
    // adiciona algo em uma lista por Input
    val lista : MutableList<String> = ArrayList()
    lista.add(readLine().toString())

    println(lista)
}