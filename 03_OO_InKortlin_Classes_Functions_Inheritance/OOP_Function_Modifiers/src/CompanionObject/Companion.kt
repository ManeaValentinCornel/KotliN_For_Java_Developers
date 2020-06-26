package CompanionObject

//You can create companion Object inside classes, and you access companion object without needing an instance of the class
fun main() {
    //Companion Object
    SomeClass.accessPrivateVal()
    //Companion Object for factory methods.
    val anotherClass=AnotherClass.justAssign("Bobo")
    val anotherClass2= AnotherClass.upperOrLowerCase("Cosmin",true) }
//****************************************Companion Objects***********************************************
//1 calling static methods
//1 Using somehow as a static block
//Grouping static members within a companion objects and everything we have within a companion object we can access them
//without needing an instance of the enclosing class
class SomeClass {
    //Everything in the companion objects is equivalent somehow with java static keyword,
    // and now we can access the method inside the companion object without needing an instance of the class
    // You can also explicitly give a name to the companion object
    companion object {
        private val privateVar: Int = 5
        fun accessPrivateVal(): String = "I am accessing privateVal : $privateVar"
    }
}
//****************************************Factory pattern***********************************************
//2 Factory pattern which means that we want this class to be responsible for creating instances
// of some class, nobody should be able to do it directly.No one of the constructor is accessible for outside the class because the primary
//constructor has been defined private.
//Used it to call private constructors, you can use them to implement the factory pattern.Which can be obtained by making the constructor private
//and by using factory functions
class AnotherClass private constructor(var someString: String) {
    //    val someString: String
//    constructor(someString: String) {
//        this.someString = someString
//    }
//    constructor(someString: String, lowerCase: Boolean) {
//        if (lowerCase) {
//            this.someString = someString.toLowerCase()
//        } else {
//            this.someString = someString.toUpperCase()
//        }
//    }
// Replace the previous constructor with this factory companion type
    companion object {
        fun justAssign(str: String) = AnotherClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): AnotherClass {
            if (lowerCase) {
                return AnotherClass(str.toLowerCase())
            } else {
                return AnotherClass(str.toUpperCase())
            }
        }
    }
}