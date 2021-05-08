fun main(){
    println(max(10, 5))
    println(max1(10, 5))
}

// Corpo de Bloco
fun max(a: Int, b: Int): Int{
    return if(a > b) a else b
}

// Corpo de Expressão
fun max1(a: Int, b: Int) = if (a > b) a else b