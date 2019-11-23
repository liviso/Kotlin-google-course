
fun testArrays(){
    var array: Array<Any>

    array = arrayOf(1,2,'a', 4.5, "hola")

// You can not assign null values, only if you add ? character

    var things: Array<Any?>
    things = arrayOf(1,2,'a', 4.5, "hola", null)
}


//Kotlin can Infer this
var objects = arrayOf(1,2,'a', 4.5, "hola", null)
var arrayNotNull= objects.filterNotNull()

println(objects.get(5))
println(objects[5])

objects[2]='b'
objects.set(1,30)

println(objects[2])
println(objects[1])


arrayNotNull.forEach{println(it)}
objects.reverse()
objects.forEachIndexed{i, valor -> println("Indice: $i y valor $valor")}


//EXAMPLE 2

val arrayZeros = Array(5,{0})
val arrayAsc = Array(5, {i->i})
val arrrayMult=Array(5,{i ->(i*i)})
val arrayToString= Array(5,{i->i.toString()})
val arrayIntString = Array(5, {i ->(i+i).toString() + ">"+i.toString()})

arrayZeros.forEach { println("$it, ") }
println()
arrayAsc.forEach { println("$it, ") }
println()
arrrayMult.forEach { println("$it, ") }
println()
arrayToString.forEach { println("$it, ") }
println()
arrayIntString.forEach { println("$it, ") }
println()


val int:IntArray = intArrayOf(1,2,3)
val short: ShortArray = shortArrayOf(1,2,3)
val long:LongArray = longArrayOf(1,2,3)
val float: FloatArray= floatArrayOf(1.0f, 2.0f, 3.0f)
val double:DoubleArray = doubleArrayOf(1.0,2.0,3.0)
val byte:ByteArray= byteArrayOf(0x01,0x02,0x0F)
val char:CharArray= charArrayOf('a','b','c')