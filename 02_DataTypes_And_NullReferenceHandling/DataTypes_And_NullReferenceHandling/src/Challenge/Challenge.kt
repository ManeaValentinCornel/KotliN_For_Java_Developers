package Challenge

fun main() {
    //1 Declare a non-nullable float variable two ways, and assign it the value -3847,384
    val myFloat: Float = -3847.384f
    val myFloat2 = 03847.52.toFloat()

    //2 Now change both of of those variable declarations into nullable variables
    val myNullableFloat: Float? = myFloat
    val myNullableFloat2: Float? = myFloat2

    //3 Now declare an array of type non-nullable of type Short. Make it size 5, and assign it the values 1,2,3,4 and 5
    val myArray: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    val mySecondArray = shortArrayOf(1, 2, 3, 4, 5)

    //4 Now declare an array of type nullable Ints and initialize it with the values 5,10,15,20..., all the way up to 200
    val myIntArray: Array<Int?> = Array(41) { i -> i * 5 }
    for (number in myIntArray) {
        println(number)
    }

    //5 YOu have to call a Java method with the following signature form Kotlin:
    //public void method1(char[] charArray). Declare an array that you could
    //pass to the method and initialize it with the values 'a','b','c'
    val charArray = charArrayOf('a', 'b', 'c')
    DummyClass().method1(charArray)


    //6 Given the following code
    val x: String? = "I AM IN UPPERCASE"
    //Using a line a of code, declare another string variable
    //and assign it x.toLowerCase when x isn't null
    //and the string "I give up!" when x is null
    val y: String = x?.toLowerCase() ?: "I give up!"

    //7 Now use the let function to (a) lowercase the string, and then b replace "am" with "am not" in the result
    val z = x?.let { it.toLowerCase().replace("am", "am not") }
    println(z)

    //You are really really confident that the variable myNotNullVariable can't contain null.
    //Change the following code to assert that myNonNUllVariable isn't null
    //(and shoot yourself in the foot!)
    val myNonNunVariable: Int? = null
//    myNonNunVariable!!.toDouble()


}

