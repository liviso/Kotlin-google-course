/**
 *
 *Practice Time
Create three String variables for trout, haddock, and snapper.
Use a String template to print whether you do or don't like to eat these kinds of fish.
 */

val trout ="trout"
var haddock = "haddock"
var snapper = "snapper"
println("I like to eat $trout and $snapper, but not a big fan of $haddock.")


/**
when statements in Kotlin are like case or switch statements in other languages.

Create a when statement with three comparisons:

If the length of the fishName is 0, print an error message.
If the length is in the range of 3...12, print "Good fish name".
If it's anything else, print "OK fish name".

 **/


var firstName="Gary"
when(firstName.length){
    0 -> println("Error Message")
    in 3 .. 12 -> println("Good fish name")
    else -> println("OK fish name.")
}