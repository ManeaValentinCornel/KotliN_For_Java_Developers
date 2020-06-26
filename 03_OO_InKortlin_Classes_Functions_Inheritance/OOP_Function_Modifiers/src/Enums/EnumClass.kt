package Enums

fun main(){

    println(Department.HR.getDeptInfo())

}

enum class Department(val fullName:String,val numEmployees:Int){
    //As in Java you can declare properties and functions within an Enum
    HR("Human Resources",5),IT("Information Technology",10),
    Accounting("Accounting",3),SALES("Sales",20);
    //Exception to semicolon rule
    //When you add a function within an enum you have to add a semicolon after the properties
    fun getDeptInfo()="The $fullName department has $numEmployees empolyees"
}