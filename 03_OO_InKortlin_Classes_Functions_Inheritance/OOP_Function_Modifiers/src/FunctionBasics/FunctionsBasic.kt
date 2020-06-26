package FunctionBasics

//-> When a function is a member of a class is usually referred as method or as a member function.
//-> The default return time for a function is UNIT, because is it default you don't have to specify it : fun():Unit


//MAIN
fun main() {
    println(labelMultiply(10, 20, "The result is :"))
    println(labelDivision(20, 2, "quotient"))

//****************************************** NAMED ARGUMENTS ******************************************//
    //another way to document your code
    val emp = Employee(age = 29, firstName = "Bobo")
    print(emp.upperCaseFirstName())
//****************************************** CALLING VARARG FUNCTION******************************************//
    val carRed = Car("Red")
    val carBlue = Car("Blue")
    val carGreen = Car("Green")
    val carPink = Car("Pink")
    val carBrown = Car("Brown")
    printColors(carRed, carBlue, carGreen)
    //if the vararg is not you lat argument in you function you have toi use named argument
    printColors(carRed, carBlue, carGreen, stock = "red")

//******************************************* SPREAD OPERATOR (*) ******************************************/
    //1 In the case we have aa function that expects a vararg argument, and we want to pass an array to it
    //The spread operator will unpack the array and pass the elements as individual arguments
    //This operator can be used any type you want to unpack an Array
    val manyCars = arrayOf(carRed, carBlue, carGreen)
    val moreCars = arrayOf(carPink, carBrown)
    printColors(*manyCars)
    //2
    //Unpack all the object from the array, so instead of being a lost of array will be a list of car objects
    val allCars= arrayOf(*manyCars,*moreCars)
    //Unpack the array again
    printColors(*allCars)


}

//******************************************REGULAR FUNCTION******************************************//
//  Block body will have curly braces
fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return "$label ${operand1 + operand2}"
}

//*******************************************ONE LINE FUNCTION******************************************//
// Expression body
fun labelDivision(dividend: Int, divisor: Int, label: String) =
    "The $label is : $dividend : $divisor = ${dividend / divisor}"

//The main function can be used with expression body
//fun main()= print("hei")

class Employee(val firstName: String, val age: Int) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

//*******************************************  VARARG ******************************************/
// 1
class Car(val color: String)

//You can have only one use of the VARARG  keyword within a function arguments
fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

//2
//IF you have another beside varargs when you call the function you need ex use named argument for the extra parameter
fun printColors(vararg cars: Car, stock: String) {
}


//******************************************* SPREAD OPERATOR ******************************************/







