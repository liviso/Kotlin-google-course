/**Para que en Kotlin aparezca un error de Null Pointer Exception tendriamos que forzarlo nosotros mismos
 * 1.- Llamada explicita a throw NullPointerException().
 * 2.- Uso del operador !!
 * 3.- Causado por un código externo de Java
**/

//var a:String ="abc"
//a= null
//Es un tipo de referencia que no puede ser null

var c: String? = "abcde"
 c = null

//? el objeto puede contener un valor null

//val l = b.length
//val l = if(b != null) b!!.length else -1

fun test(){
 var c: String? = "abcde"
 c = null
 val z=c?.length
 println(z)
}

test()


fun validation(){
 var b:String ?="abc"
 b=null
 val l= if(b!=null)b.length else -1
 println(l)
}

validation()


//tenemos que validar si es null o no, para evitar NullPointerException

//Operador Elvis ?:

fun validationWithOperator(){
 var b:String ?="abc"
 b=null
 val l= b?.length ?:-1
 println(l)
}

validationWithOperator();



fun validationWithNull(){
 var b:String ?="abc"
 b=null
 val l=b!!.length
 println(l)
}

validationWithNull(); //Returns Null Pointer Exception
