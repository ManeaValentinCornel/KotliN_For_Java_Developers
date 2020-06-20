package StringTemplate
//1 STRING TEMPLATE IS OBTAINED BY USING THE DOLLAR SIGN OPERATOR($)
// $ acts as a place holder where the variable values will be substituted

fun main(){
    val employee=Employee("Bobo",22222)
    println(employee)
    //1 Using $ to substitute an variable into a string
    val change=4.22
    print("If you ever run into a situation where you want to use dollar sign $change\$")


    //2 Using ${} Substitute an expression into a string
    val numerator=10.99
    val denominator=20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    //3 When you reference a property value from outside the class that is considered as being an expression
    //so we have to enclose that is curly braces
    print("Employee name is ${employee.name}")

}
class Employee(var name:String,var id:Int){

    override fun toString(): String {
        return "Employee name is $name and its id is $id"
    }
}