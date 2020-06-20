package LightningQuickDifferences
//1 SEMICOLON at the end of the statement is not required. It is ok if you do it, but IntelliJ grays it out and it says redundant semicolon.
//2 Kotlin standard library has WRAPPERS, for some java most commonly used methods
//3 HARD KEYWORDS(reserved word exactly as in java you can use them only for there intended purpose.
//4 SOFT KEYWORD reserved words that are just a bit more relaxed, you can use them in other places as long as you don;t use them where they have a special meaning
//5 Collections can use SQUARE BRACKETS to retrieve an entry of the collection base on the index number
//6 Kotlin has its own STRING CLASS not the one which java uses java.lang.string
//6.1 in java String length() is a method and in Kotlin is a property
//7 EXCEPTIONS:All EXCEPTION ARE UNCHECKED. Kotlin doesn't distinguish between checked and unchecked exceptions.So you no longer have to declare that a function can throw an exception
//->In java you have to declare when a method can throws a checked exception
//8 TERNARY OPERATOR is not longer there in Kotlin
//9 The originally for loop doesn't exist anymore in Kotlin : for(int=0;i<10;i++)
//10 Kotlin doesn't have any longer the STATIC keyword(but it replaced it somehow)(TOP LEVEL FUNCTION ARE SOMEHOW REPLACED STATIC FUNCTIONS)
//->the concept of the static is still, but not syntactically.
//11 No longer NEW KEYWORD, and this is just another way of kotlin making it more concise
fun main(){
    //1 Redundant semicolon
    var name="Valentin";
    //2 Wrappers
    println("Kotlin standard library has wrappers, wrapping java classes")
    //5
    val names= arrayListOf("John","Jane","Bobo")
    println(names[1])
    //6.1
    print("Bobo".length)

}
