/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
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
    
    // take input
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
    
}