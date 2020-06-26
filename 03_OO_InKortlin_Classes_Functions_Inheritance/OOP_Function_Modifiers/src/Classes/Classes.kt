package Classes

//-> In Kotlin all classes are public and final by default
fun main() {

    val emp = Employee5("John")
    val employee6 = Employee6("Ghita")

}

//Kotlin has the notation of the PRIMARY CONSTRUCTOR and it is declared outside of the curly braces and cannot contain code
class Employee constructor(firstName: String) {
    val firstName: String

    //initializer block is not a constructor, and it is used in conjunction with the primary constructor
    //init block usually used as the body for the primary constructor, but not quite
    //it is possible to have multiple initializer block, maybe for organization
    init {
        this.firstName = firstName
    }

    init {
        println("Second init block, maybe for a better organization")
    }
}

class Employee2 protected constructor(firstName: String) {
    val firstName: String = firstName

}

//The most concise way of declaring a class in Kotlin
class Employee3(val firstName: String) {
}

//Default values with 2 constructors
class Employee4(val firstName: String) {
    //1 we have to declare the property in the class
    var fulltime: Boolean = true;
    //2 All of the secondary constructors have to delegate to the primary constructor, in other word they have to call primary constructor
    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        //secondary constructor doesn't declare properties for us only the primary constructor does
        this.fulltime=fulltime
    }
}
//Assign default values to the primary constructor, way more concise
class Employee5(firstName: String, var fullTime: Boolean = true)

//Class without primary constructor but with secondary
class Employee6{
    val dummy:String
    constructor(dummy: String){
        this.dummy=dummy
    }
}


