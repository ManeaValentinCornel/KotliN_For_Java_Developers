package VariableDeclaration

//1 Kotlin uses TYPE INFERENCE, the compiler can usually figure out or INFER the type the variable based on the context in which you're using it
//-> and that is achieved an compile time not runtime
//2 STATICALLY TYPED LANGUAGE so every expression is determined and known at compile time
//3 Every variable declaration starts with val or VAR, VAL is IMMUTABLE that means in can be assigned only once, equivalent with final in java
//4 KOTLIN recommendation is that the variables should be declared val or immutable variables whenever is possible, it doesn't enforce this but is the best practice
fun main() {
    //*************************************************IMMUTABLE***************************************************************//
    //Kotlin use TYPE INFERENCE to figure out the type of the variable
    //Explicitly assigning a value, the default data type for the whole numbers is Int
    val number=20
    val secondNumber : Int
    //Val cannot be reassigned
    secondNumber=10
    //Not recommend, you don't need to give the compiler the same information twice
    val thirdNumber: Int=100
    //Because the default data type for the whole number is Int, if you want use Byte or Short or Long you should specify explicitly the data type
    val fourthNumber:Byte=25
    val fifthNumber:Short=30
    val sixthNumber:Long=50

    //************************************************* MUTABLE ***************************************************************//
    //VAR variables are mutable and their value can be change as often as is needed
    //The compiler will underline the var variable with an underline, sow it can be tell from a glance which variables are mutable and which are immutable

    //************************************************* IMMUTABLE CLASS INSTANCES ***************************************************************//
    //When a variable is immutable doesn't mean that the instance variables are immutable, it means you cannot assign another instance to the variable
    val employee1= Employee("Lynn Jones", 500)
    //We still can change the instance properties in employee1
    employee1.name="LynnSmith"
    //But we can not reassign a completely different instance
    //employee1=VariableDeclaration.Employee("Tim Watson",100)



    var name="Valentin"
    //Can't change the data type of a variable on the fly
    //name=6


}

class Employee(var name:String,val id:Int){

}