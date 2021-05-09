import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.pow

fun main(){
    arrayAndLoops()
}

fun arraysz(){
    val fishs = arrayOf("tuna", "salmon", "shark")
    val numbers = intArrayOf(1,2,3)

    // não se pode misturar tipos na array de inteiros,
    val mix = arrayOf("fish", 2)

    println(mix)
    println(fishs)
    println(numbers)

    println(" ")

    // e para imprimir deve-se converter para string com contentToString ou toString.
    println(Arrays.toString(mix))
    println(Arrays.toString(fishs))
    println(numbers.contentToString()) // val = numbers

}


fun boilerplateArray(){
    // define os valores da array, pelo indice * 2.
    val array = Array(8) {it * 2}
    println(array.asList())
}

//
fun arrayAndLoops(){
    val array = Array(7) { 1000.0.pow(it) }
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabite", "terabite", "petabyte", "exabyte")

    for((i, value) in array.withIndex())
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
}

