"Hello Fish"

"Hello" + "fish"

val numberOfFish = 5

val numberOfPlants = 12

"I have $numberOfFish fish and $numberOfPlants plants"

"I have ${numberOfFish + numberOfPlants} fish and plants"


val fish ="fish"
val plant = "plant"
 fish == plant

fish ==fish

fish != plant

val numberOfFish2 = 50
val numberOfPlants2 = 23

if(numberOfFish2> numberOfPlants2) println ("Good ratio!")
else
    println("unhealthy ratio")


val fishQty= 50
if(fishQty in 1..100) println(fish)

when (numberOfFish2){
    0 -> println("Empty tank")
    50 -> println("Full tank")
    else -> println("Perfect")
}


var welcomeMessage = "Hello and welcome to Kotlin"
when (welcomeMessage.length) {
    0 -> println("Nothing to say?")
    in 1..50 -> println("Perfect")
    else -> println("Too long!")
}