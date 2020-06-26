package Imports_Package_Module_Internal.anotherPackage
// package Imports_Package_Module.random
//Kotlin doesn't enforce that there should be a directory structure that matches the package,
// for example our package is ImportsInKotlin.imports not ImportsInKotlin.random, but is not recommended practice
fun main(){
    //Even if the directory structure doesn't match the package structure that's fine
    println("My package doesn't match")
}
//Internal means something is visible within the same module

//Public function
//Private visible within the same file
fun topLevelFunction(name:String)=println("Top level function: $name")
//Internal function
internal fun internalTopLevelFunction(name:String)=println("Internal top level function $name")


class RandomClass{
    companion object {
        fun printRandom() {
            println("Hello from Random class")
        }
    }




}