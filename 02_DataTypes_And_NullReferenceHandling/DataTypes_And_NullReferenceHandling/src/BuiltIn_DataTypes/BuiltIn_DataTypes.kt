package BuiltIn_DataTypes

//1 Kotlin doesn't AUTOMATICALLY widen the data, every data has 2 function used to convert the data
//3 In Kotlin you cannot treat characters as numbers
fun main() {
    // 1 NO AUTOMATICALLY WIDEN THE DATA
    // Kotlin doesn't automatically widen the DataTypes we need to use a function
    // Int the default value for whole numbers is Int
    val myInt = 10
    var myLong = 22L
    //INSTEAD OF  myLong=myInt
    myLong = myInt.toLong();
    val myByte: Byte = 111
    var myShort: Short = myByte.toShort()

    // 2 DOUBLE
    // Default value for floating point notation is Double
    val myDouble = 65.984
    val myFloat = 838.8492f
    println(myDouble is Double)
    println(myFloat is Float)

    //3 CHAR
    //THe compiler can infer the type
    val char = 'b'
    //val myChar:Char=64
    val myCharInt = 65
    println(myCharInt.toChar())

    //4 BOOLEAN
    val onVacation: Boolean = true

    //5 CALLING JAVA PRIMITIVE
    // Calling a java method which takes an primitive type boolean argument works
    val workingString = DummyJava().isVacationTime(onVacation)
    println(workingString)

    //6 Any class
    //Any class is sort of object class in Java, it is the root of every Kotlin object
    //it includes function definition for equals,hashcode.
    val anything: Any

}