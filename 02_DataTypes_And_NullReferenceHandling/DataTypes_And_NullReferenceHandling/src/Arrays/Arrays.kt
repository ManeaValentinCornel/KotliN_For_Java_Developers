package Arrays

import java.math.BigDecimal

fun main() {
    //1
    //Array of String
    val names = arrayOf("John", "Jane", "Jill")
    //Array of integers
    val intList = arrayOf(1, 2, 3, 4, 5)
    println(intList is Array<Int>)
    //Array of longs
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4, 5)
    println(longs1 is Array<Long>)
    println(longs2[1])

    //2 Array initialization using lambda into the constructor Array
    //You can use the array constructor to pass a lambda expression to initialise the array
    val evenNumbers = Array(10) { i -> i * 2 }
    for (number in evenNumbers) {
        println(number)
    }
    val lotsOfNumber = Array(20) { i -> i + 1 }
    for (number in lotsOfNumber) {
        println(number)
    }
    val allZeroes = Array(5) { 0 }
    for (zeroes in allZeroes) {
        println(zeroes)
    }

    //3 Mutable array
    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    //4 Mixing data types into arrays
    val mixedArray = arrayOf("hello", 22, BigDecimal(29), 'a')
    for (element in mixedArray) {
        println(element)
    }
    println(mixedArray is Array<Any>)

    //5 Calling a method which take a primitive type array argument
    //When calling java int Array in kotlin you need to use one of the special primitive types array in Kotlin like
    //long array, int array, char array .....
    //you will also get a performance boost by using the special primitive array classes rather than the general array class.
    val myIntArray = IntArray(5) { i -> i + 2 }
    DummyJava().printNumbers(myIntArray)
    //Or it can be change by using toIntArray() converting it into a general array
    DummyJava().printNumbers(someArray.toIntArray())

    //6
    // Changing a primary type array into a general one(typed array)
    var myList: Array<Int> = myIntArray.toTypedArray()

    //7
    // Primitive TypeArray vs General array
    //the primitive type array can be initialize just by passing the size
    var myPrimitiveArray = IntArray(20)
    //the general array type list cannot be initializes just by specifying the array type
    var myGeneralArray = Array(20) { i -> i + 1 }

    //8 ARRAY OF NULLS
    //What are you going to do with this elements is going to be limited
    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        print(i)
    }
}