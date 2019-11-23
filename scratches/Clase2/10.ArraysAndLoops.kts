import java.util.*

//val myList = mutableListOf("tuna", "salmon", "shark")
//myList = mutableListOf()("koi", "goldfish")

val myList = mutableListOf("tuna", "salmon", "shark")
myList.remove("shark")

println(myList)


/**
 LOOPS
 **/

val school = arrayOf("tuna", "salmon", "shark")
var numbers = intArrayOf(1,2,3)

println(Arrays.toString(intArrayOf(2, 3)))

//println(Arrays.toString(intArrayOf(2, "foo")))  NOT COMPILE

//arrayOf assign elements
val mix = arrayOf("fish", 2)
println(Arrays.toString(mix))

//Nest Arrays

val fish =12
val plants = 5

val swarm = listOf(fish, plants)
val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))

println(Arrays.toString(bigSwarm))

for(element in swarm) println(element)

for ((index, element) in swarm.withIndex()){
    println("Fish at $index is $element")
}

for(i in 'b'..'g') println(i)

for(i in 1..5) println(i)

for(i in 5 downTo 1) println(i)

for(i in 3..8 step 2) println(i)


val array = Array(5){it*2}
println(array.asList())