fun main(){
    println(max(10, 5))
    println(max1(10, 5))
    variables()
}

// Corpo de Bloco
fun max(a: Int, b: Int): Int{
    return if(a > b) a else b
}

// Corpo de Expressão
fun max1(a: Int, b: Int) = if (a > b) a else b



fun variables(){
    var fish = "golden fish"
    var plant = " ferns"

    println(" i have 3 $fish and, 2 $plant ")
}

