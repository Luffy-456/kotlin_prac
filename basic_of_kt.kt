/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {

/*
    // implicit
    val x=5
    println(x)
    
    // explicit
    val y:Int =10
    println(y)
    
    val a: Float=5.5f
    println(a)
    
    val b: Boolean=true
    //or val b = true
    println(b)
    
    
    // string
    val c: String="hello world"
    // or val c="hello"
//     c="llll" we cannot do this val they cannot be reassigned
    println(c)
    
    
    
    
    // use var if you want to reassign
    
    var z=5
    println(z)
    z=10
    println(z)
    
    
    println(z==x)
    println(z>=x)
    
    val equal = z==x
    println(equal)
    
    println("\nvalue of z: $z\nvalue of x:$x\nAre both equal? ans: ${z==x}\n(z%2==0)? ans: ${z%2==0}")
    val botheven= z%2==0 && x%2==0
    
    println("\nare both even? \nans: $botheven\nif one even?\nans: ${x%2==0 || z%2==0}")

*/

    
/*    // take input
    println("\n")
    println("enter a num: ")
    // by default it takes input as a string 
    val input = readln()

    // use this for Int
    val inputasint=readln().toInt()

    // or convert
    val inputconvert=input.toInt()

    println("inputconvert: $inputconvert")
    println("input: $input")
    println("inputasint: $inputasint")
    
    val iseven= inputasint%2==0
    println("\ninputasint is even: $iseven")
*/


/*
    // using null in input
    println("\nenter inputnull: ")
    val inputnull=readln().toIntOrNull() ?: 0 // setting 0 as default in case of null
    
    //ex: 78 or jkhfkjs(null)
    
    println("if value is int it will print the value otherwise null: $inputnull")


    // but for this to work i need to handle the case where input is null 
    // to do so we use " ?: " this is used to set default values

    println("\nis inputnull even : ${inputnull%2==0}")

*/

    /* output:
    enter inputnull: 
    hello
    if value is int it will print the value otherwise null: 0

    is inputnull even : true

    enter inputnull: 
    78
    if value is int it will print the value otherwise null: 78
    */


    // using " ?. " this is called null safety 

    println("enter value for ?.inc() : ")
    val input= readln().toIntOrNull() ?.inc() // will ++ if input is int otherwise return null but use orNull() better
    println("?.inc(): $input")

    println("enter value for ?.rem() ?.equals() : ")
    val inputcheck= readln().toIntOrNull() ?.rem(2) ?.equals(0)
    println("?.rem(2) ?.equals(0) so is input is even : $inputcheck")

    /*other variations

        this one allows Boolean to be empty cause boolean can't be empty
        val inputcheck: Boolean ?= readln().toIntOrNull() ?.rem(2) ?.equals(0)

        this one assign a default value as false
        val inputcheck: Boolean = readln().toIntOrNull() ?.rem(2) ?.equals(0) ?: false

    */

}
