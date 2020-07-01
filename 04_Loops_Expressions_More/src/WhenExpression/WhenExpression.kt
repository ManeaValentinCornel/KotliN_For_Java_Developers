package WhenExpression

import java.math.BigDecimal

fun main() {

    val num = 150
    //*************************************SIMPLE WHEN STATEMENT WITH IN RANGE BRANCH***************************************//
    when (num) {
        in 100..199 -> println("in range 100.199")
        250 -> println(200)
        300 -> println(300)
        else -> println("Doesn't match anything")
    }
    val anotherNum = 10

    //*************************************SIMPLE WHEN STATEMENT ***************************************//
    //When statement work also with the expressions
    when (num) {
        90 + anotherNum -> println(100)
        190 + anotherNum -> println(200)
        260 + anotherNum -> println(300)
        else -> println("Doesn't match anything")
    }

    val obj: Any = "I am a string"
    val obj2: Any = BigDecimal(20)
    val obj3: Any = 20

    val something: Any = obj
    //*************************************WHEN STATEMENT EXPRESSION***************************************//
    //The returned type will be UNIT
    val result = when (something) {
        is String -> print(something.toUpperCase())
        is BigDecimal -> print(something.remainder(BigDecimal(2)))
        is Int -> print("${something - 15}")
        else -> println("Random string")
    }
    println(result is Unit)

    //*************************************WHEN STATEMENT EXPRESSION LAST LINE OF EACH BRANCH IS THE RETURN LINE***************************************//
    //The returned type will be INT
    val result2 = when (something) {
        is String -> {
            print(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            print(something.remainder(BigDecimal(2)))
            2
        }
        is Int -> {
            print("${something - 15}")
            3
        }
        else -> {
            println("Random string")
            5
        }
    }
    println(result2 is Int)

}



