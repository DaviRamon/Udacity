import java.util.*

fun main(){
tests()
}

/*
    Run -> Edit configuration -> program arguments : Aquii
    fun main(args: Array<String>){
    println("Olha eu ${args[0] }!")
       //Olha eu Aquii!
    }
*/

// Corpo de Bloco
fun max(a: Int, b: Int): Int{
    return if(a > b) a else b
    //10
}

// Corpo de Expressão
fun max1(a: Int, b: Int) = if (a > b) a else b
// 10

fun variables(){
    val fish = "golden fish"
    val plant = " ferns"
    println(" i have 3 $fish and, 2 $plant ")
}

fun dayOfWeek(){
    // imprime o dia do ano.
    println("O Dia do Ano é: ")
     println(Calendar.getInstance().get(Calendar.DAY_OF_YEAR))

    println("O dia da semana é: ")
    // imprime o dia em valor numérico de 1 a 7
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println( when (day) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        4 -> "Quarta"
        5 -> "Quinta"
        6 -> "Sexta"
        7 -> "Sabado"
        else -> "O tempo parou"
    })
}


fun tests(){
    val isUnit = println("Essa e uma expressão")
    println(isUnit)

    val temperature = 51
    val isHot = if (temperature > 50) true else false
    println(isHot)

    // !!!!!!!!!!!!!!!!
    val message = "You are ${ if (temperature > 50 ) "fried" else "safe" } fish!"
    println(message)

}

