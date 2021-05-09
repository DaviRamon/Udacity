fun main(){
nullTest()
}

fun nullTest(){

//    var marbles: Int? = null
//    println(marbles)
//    println()
//
//    var fishFoodTreats =6
//    if(fishFoodTreats!=null){
//        fishFoodTreats = fishFoodTreats.dec()
//    }

    var fishFoodTreats = 6
    //fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.inc()
    println (fishFoodTreats)

}