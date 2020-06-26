package Singletons

import java.time.Year
//->In Kotlin it is a way to declare a class and define an instance of the same time, and here is where the object keyword comes in.
//->SINGLETONS, common design pattern in Java, used when we want one and only one instance of a class, during the running of an application.
fun main(){
    //Nobody from the outside can actually, an instance of this class, the one single instance is created the first time you use the class.
    println(CompanyCommunication.getTagLine())
    println(CompanyCommunication.getCopyrightLine())
    println(PrinterSingleton.getName("bobo"))
}
//*****************************************************OBJECT CLASSES**************************************************//
//Object classes use the keyword object.
//Object declaration can extend classes and implement interfaces
object CompanyCommunication{
    //We can't have any constructor, because and object class declares and created an instance at the same time
    val currentYear= Year.now().value
    fun getTagLine()="Our Company rocks!"
    fun getCopyrightLine()="Copyright \u00A9 $currentYear Our Company"
}
//No constructor needed
object PrinterSingleton{
    fun getName(name:String):String="Printed name is : "+ name;
}