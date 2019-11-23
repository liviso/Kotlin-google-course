/**
 * If you start with 2 fish, and they breed twice, producing 71 offspring the first time, and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel, how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?

Hint: You can chain method calls.
Hint: You can call the methods on numbers, and Kotlin will convert them to objects for you.
Bonus question: What is special about all the numbers of fish?
 **/

2.plus(71).plus(233).minus(13).div(30).plus(1)


/**
Practice Time: Variables
Create a String variable rainbowColor, set its color value, then change it.
Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
 **/

var rainbowColor = "red"
rainbowColor = "blue"
val blackColor = "black"
blackColor = "white" // Error


/**
 * Practice Time: Nullability
Try to set rainbowColor to null. Declare two variables, greenColor and blueColor. Use two different ways of setting them to null.
 **/
var greenColor = null
var blueColor: Int? = null


/**
Practice Time: Nullability/Lists
Create a list with two elements that are null; do it in two different ways.
Next, create a list where the list is null.
 **/
listOf(null,null)
[null, null]
var list: List<Int?> = listOf(null, null)
var list2:List<Int>? = null


/**
 * Practice Time: Null Checks
Create a nullable integer variable called nullTest, and set it to null. Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
Hint: Use the Elvis operator.
 **/
var nullTest: Int?=null
println(nullTest?.inc() ?:0)
