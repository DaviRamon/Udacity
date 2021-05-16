fun main() {
    for (i in 1..100){
        if ( i%15 == 0) {
            println("FizzBuzz")}
        else if(i%5 == 0) {
            println("Buzz")}
        else if(i%3 == 0){
            println("Fizz")}
        else {
            println(i)
        }

    }
}

fun fizzBuzz(n: Int): Unit {

    for (n in 1..100){
        when {
            n %15 ==0 -> {
                println("FizzBuzz")
            }
            n % 5 ==0 -> {
                println("Buzz")
            }
            n %3 == 0 -> {
                println("Fizz")
            }
            else -> println(n)
        }

    }

}