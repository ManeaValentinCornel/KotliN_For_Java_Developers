package Try_Catch

fun main() {
    println(getNumber("22"))
    println(getNumber2("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))

}

//*************************************RETURN TRY CATCH BLOCK EXPRESSION***************************************//
//The last line each block(branch) will be the value wh=ich the try catch block returns
//Return specified value should be in try, catch block
fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        //You can execute code in the finally block but no value will be returned from here
        println("I am in the finally block")
    }
}

//*************************************RETURN TRY CATCH BLOCK EXPRESSION WITH EVLIS OPERATOR***************************************//
fun getNumber2(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        //You can execute code in the finally block but no value will be returned from here
        println("I am in the finally block")
    }
}

//*************************************NOT IMPLEMENTED FUNCTION***************************************//
fun notImplementedFunction(somethig: String): Nothing {
    throw java.lang.IllegalArgumentException("Implement me!")

}

