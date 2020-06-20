package Challenges

fun main() {

    //1 Declare two immutable String variables called hello1 and hello2.Assign hello to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    //2 Using one line of code, test whether hello1 ad hello2 are referentially equal and print thee result
    println("hello1 is referentially equal to hello2 ? ${hello1 === hello2}")//TRUE
    //In java is only one instance of every specific string literal/So here we're assigned the same string literal to hello
    //These 2 string literals are exactly the same String instance

    //3 Do the same thing as above, but test for structurally equal
    println("is hello1 structurally equal to hello2 ? ${hello1 == hello2}")

    //4 Declare a mutable variable of type Int and assign it the value of 2988
    var num = 2988

    //5 Declare a mutable variable of type any.Then using a smart cast String,, print out upperCased String

    val variable: Any = "The any type is the root of the Kotlin hierarchy"
    if (variable is String) {
        println(variable.toUpperCase())
    }


    //6 Using one line of code print out the following.Make sure your code isn nicely indented
    //   1
    //  11
    // 111
    //1111
    print(
        """|   1
            |  11
            | 111
            |1111""".trimMargin()
    )
}