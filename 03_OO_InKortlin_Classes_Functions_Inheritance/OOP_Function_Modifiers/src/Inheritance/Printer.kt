package Inheritance

//->Everything in Kotlin is public and final.That goes for classes, top level functions, member functions and properties
//-> When toy want as something to be extendable or to be able to be overridden unless it is already define das being abstract.
//-> An ABSTRACT class or method doesn't need to be OPEN, because it is OPEN by default
//->OPEN or Abstract is not applicable for top-level functions
//-> DATA classes are close type, they can't be extended
fun main() {
    val laserPrinter = LaserPrinter("Brother 1234",20)
    laserPrinter.printModel()
    //The parent's class constructor runs first, and the child's class constructor runs
    val somethingElse=Something("Me")

}
//************************************* OPEN CLASS ****************************************************//
//A class is public and final by default, and has to be opened before to get subclassed
open class Employee(val name: String)

// we need to delegate the modelName to the primary constructor -> and we we delegate the handling of that to super constructor
class PartTimeEmployee(name: String) : Employee(name)
//************************************* ABSTRACT CLASS ****************************************************//
//Because the printer class doesn't represent one specific model of a printer it will be made abstract
//An ABSTRACT class has to be extended so the open keyword can be omitted, because is redundant
//Because there is not point is having an abstract class that cab't be extended
abstract class Printer(val modelName: String) {
    //It is perfect normal to have no abstract functions is abstract classes
    //when you want a function to be overridden you should declare it as being open
    open fun printModel() = println("The model name of this printer class is $modelName")

    //In classes abstract functions are opened by defalt
    abstract fun bestSellingPrice(): Double
}
open class LaserPrinter(modelName: String,val pagesPerMinute:Int) : Printer(modelName) {
    //When you want to OVERRIDE a function you need to use the override keyword
    //Whenever you use OVERRIDE keyword you also specify that the overridden function is OPEN,
    //so subclasses of that particular class can continue to override that function further
    override fun printModel() = println("Printer laser model is")
    //************************************* FINAL ****************************************************//
    //Final keyword would ensure that this particular function won't be able to be override further
    //And an override function implicitly includes open. we have to specify final in order to close it
    final override fun bestSellingPrice(): Double = 129.99
}
class SpecialLaserPrinter(name:String,pagesPerMinute:Int):LaserPrinter(name,pagesPerMinute){
}
//************************************* SECONDARY CONSTRUCTOR ****************************************************//
open class Something{
    val someProperty:String
    constructor(someProperty:String){
        this.someProperty=someProperty
        println("I'm in the parent's constructor")
    }
}
class SomethingElse:Something {
    constructor(someProperty: String):super(someProperty){
        println("I'm in the child's constructor")

    }
}
class AnotherSomething(someProperty: String):Something(someProperty)


//************************************* DATA CLASSES ****************************************************//
//Data classes cannot be extended, because they are closed typed, so to make it open won't work
//Also have at least one variable declared into the constructor
//But data classes cam extend other classes but when it come to inheritance the buck stops right with them
data class DataClass(val name:String){

}