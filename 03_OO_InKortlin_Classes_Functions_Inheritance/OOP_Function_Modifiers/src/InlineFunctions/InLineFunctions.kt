package InlineFunctions

fun main(){
    printName("Bobo")

}
//Inline functions, the function body will be directly generated into the bytecode wherever the function is called,
// rather than having a function call
inline fun printName(name:String)= print("Printed name is : $name")