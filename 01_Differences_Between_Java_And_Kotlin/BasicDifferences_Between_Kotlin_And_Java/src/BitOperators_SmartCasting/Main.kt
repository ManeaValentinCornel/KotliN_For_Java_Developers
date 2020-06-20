package BitOperators_SmartCasting

//LOGICAL OPERATORS OPERATE ON LOGICAL VALUES(BOOLEAN VALUES)
// WHILE BITWISE OPERATORS OPERATE ON INTEGER BITS.
fun main(args: Array<String>) {

    //1 BITWISE OPERATORS
    //Bitwise operators are represented differently in Kotlin
    //| as or
    //& as and
    //^ AS XOR
    val x = 0b0000001
    val y = 0b10000000
    // THE | and & operators don't exists in Kotlin instead it it use or or and
    println(x or y)
    println(x and y)
    println(x xor y)
    //Bitwise operators operate on

    //2 IS OPERATOR
    //In Kotlin rather than using instance of operator we use IS operator to find if a instance is of a certain type
    val employee:Any=Employee()
    println(employee is Employee)

    //3 AS OPERATOR
    //Casting in Kotlin is made by using as operator
    val employee2=employee as Employee

    //4 SMART CASTING
    //After you performed an is operation, you can then treat the variable as if it has been cast
    if(employee2 is Employee){
        //if the condition is evaluated as being true the casting is done automatically
        //casting after checking the is type condition is redundant
      val newEmpoyee: Any=employee2 as Employee
    }





}


class Employee() {

}