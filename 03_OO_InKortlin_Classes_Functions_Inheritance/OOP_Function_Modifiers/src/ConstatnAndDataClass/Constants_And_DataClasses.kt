package ConstatnAndDataClass
//-> In Kotlin is allowed to have top level constants just as is it allowed to have top-level functions
//->(1)The main purpose of the data DATA CLASS is to store state that is a good candidate gor data class
//DATA classes implement some functionality for free which are : toString(), equals(), hashcode , copy()
    //but if you want to change the custom implementation provided by the data class you just need to override it.
    //DATA classes have to meet certain requirements, first the primary constructor has to have at least one parameter,
    //and all the primary constructor parameters have to declared as val or var.Also data classes cannot be abstract,sealed or inner classes.

fun main(){
    print(PI)

    val car=Car("blue","Toyota",2015)
    val car2=Car("blue","Toyota",2015)
    //toString() method is implemented by default
    println(car)
    //STRUCTURAL EQUALITY (==) .equals()
    println(car==car2)//or equals()
    //COPY,
    val car3=car2.copy();
    print(car3===car2)//NOT REFERENTIAL EQUAL
    val car4=car.copy(year=2018)

}
//TOP-LEVEL CONSTANT
val PI=3.14f
//DATA CLASS
data class Car(val color:String,val model:String,val year:Int)

