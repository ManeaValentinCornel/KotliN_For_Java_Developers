package ReferentialEquality_Vs_StructuralEquality

fun main() {

    val employeeOne = Employee("John", 1)
    val employeeTwo = Employee("Mary", 2)
    val employeeThree = Employee("Mary", 2)
    val employeeFour = employeeOne
    //1 REFERENTIAL EQUALITY
    //Equals(===))operator checks for referential equality, which means is going to return true if:
    //the instance on the left hand side is exact the same instance as the one on the right hand side
    println(employeeOne === employeeTwo)//FALSE
    println(employeeTwo === employeeThree)//FALSE
    println(employeeOne === employeeFour)//TRUE
    println(employeeOne !== employeeTwo )//TRUE

    //2 STRUCTURAL EQUALITY
    //.equals() or == method check the content of the object, more concise checks the structural equality of 2 objects
    //In kotlin you don't have to explicitly call the .equals() method, when you want to test whether to instances contain the same values are
    //structural equal you should use equals operator(==)
    println(employeeOne == employeeTwo)//FALSE
    println(employeeTwo == employeeThree)//TRUE
    println(employeeOne !=employeeTwo  )//TRUE
    println(employeeOne.equals(employeeTwo))//FALSE
    println(employeeTwo.equals(employeeThree))//TRUE


}


class Employee(var name: String, val id: Int) {
    //Object of type Any
    //STRUCTURAL EQUALITY
    override fun equals(obj: Any?): Boolean {
        if (obj === null) {
            return false;
        }
        if (obj === this) {
            return true;
        }

        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false;
    }

}
