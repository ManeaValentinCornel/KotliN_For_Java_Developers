package anotherModule

import Imports_Package_Module_Internal.anotherPackage.RandomClass
import Imports_Package_Module_Internal.anotherPackage.topLevelFunction as tp

fun main() {

    tp("Hello from another module")
    RandomClass.printRandom()
    println(Singletons.PrinterSingleton.getName("Me"))

}