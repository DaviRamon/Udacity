package strings


fun main() {

stringProblem()
}

fun stringProblem() {

    val list = readLine()!!.toInt()

    for(i in 0 until list) {
        val input = readLine()!!
        if (input.contains("a", true) && input.contains("e", true) &&
            input.contains("i", true) && input.contains("o", true) &&
            input.contains("u", true)
        ) {
            println("lovely string")
        } else {
            println("ugly string")
        }


    }
}


