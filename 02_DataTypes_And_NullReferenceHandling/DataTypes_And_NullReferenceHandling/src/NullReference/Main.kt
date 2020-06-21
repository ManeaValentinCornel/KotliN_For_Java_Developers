package NullReference

//1 Kotlin has the notion of nullable types, and Kotlin enforces nullable check
//->so if you want a variable  to be able to contain null, you have to explicitly tell the compiler that by using ?

fun main() {

    //1 NULLABLE VARIABLE (?)
    //Null cannot be a value of a non-null type String, but if we want to we need to explicitly let the compiler know by following the name with a question mark
    val str: String? = null

    //2 SMART NULL CHECK
    //When using a nullable type variable not all the methods will still be available.
    //In order to get the methods access back again, we need to check if the variable is null before
    val nullableString: String? = "This isn't null"
    //nullableString.toUpperCase() -> doesn't work any longer


    //3 SAFE CALL  OPERATOR(ACCESS) EXPRESSION (?.)
    // -> short hand for : if(nullableString != null) {}
    //This is a short hand for checking if a variable is null
    //With the question mark we say this could be null, and generate a null check under the covers,
    //->and if that null check passes, only then call the upper case method
    str?.toUpperCase()
    //3.1 SHORT HAND FOR
    //The compiler remembers that you have a null check, and goes ahead and lets you the methods as if it is a non-nullable variable type
    if (str == null) {
        null
    } else {
        str.toUpperCase()
    }
    //3.2 Shorthand for 3.1


    //4 TEST
    // Essentially what happens is, when you have a safe operator expression, if the variable is null, the expression evaluates to null
    val myString: String? = null
    println("What happens when we do this: ${str?.toUpperCase()}")// NO NULL POINTER EXCEPTION THROWN


    //5 ELVIS OPERATOR(?:)
    //If the variable is assigned to be null, using the Elvis Operator, we can specify a default value for the variable in case in is null
    var str3 = str ?: "This is the default value"
    //5.1 SHORT HAND FOR
    if (str != null) {
        str3 = str
    } else {
        str3 = "This is the default value"
    }

    //6
    // SAFE CASTING OPERATOR as?
    //If the result array variable cannot be casted as a String will return null instead of an Exception
    val array = Array(5) { i -> i + 1 }
    val string = array as? String
    print(string?.toUpperCase())


    //7 NOT NULL ASSERTION OPERATOR !!.
    // Let's say you have a situation where you are absolutely sure a variable won't be null.
    // But the compiler wants you to do the safe call operator but you know 100% the variable won't contain null
    // instead of using a safe call operator(?)
    //Why would you use NOT NULL ASSERTION OPERATOR ? Maybe you want to return an exception when the variable or expression is null
    val str5: String? = "This isn't null"
    val str6 = str5!!.toUpperCase()
    //7.1 SHORT HAND FOR
    if (str5 == null) {
        throw KotlinNullPointerException();
    } else {
        str5.toUpperCase()

    }
    //7.3
    var string1: String? = null
    var string2 = string1!!
    val string3 = string2.toUpperCase()
    //The exception will be thrown at the line 75 not at the line 76.The exception occurs at the assertion at the line 75
    //That is why is not a good idea to string null assertion together because for example bank()!!.money()!!.etc!! because it will point the bank line
    //-> no matter which method have thrown the exception

    //8 LET FUNCTION
    val str7: String? = "this isn't null"
    //In this case is better to not call the function if the str7 is null,rather than saying im am 100% str7 is null
    //What this function refers to ? So if the variable isn't null, using the save call operator, let this function call go ahead
    //-> and you refer to the variable with the call safe operator.
    str7?.let { printText(it) }
    //If str is null the function won't happen, but if str7 is not null the expression can go ahead

    //8.1 Longhand for
    if (str7 != null) {
        printText(str7)
    }

    //9 Structural equality is safe for null,the safe call operator is used under the covers
    print(null == str7)

}


fun printText(text: String) {
    println(text)
}
