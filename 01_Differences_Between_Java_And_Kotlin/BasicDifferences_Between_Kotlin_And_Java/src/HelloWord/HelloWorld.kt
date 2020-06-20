package HelloWord

//1 First HelloWord.TypeAliases.VariableDeclaration.main difference between Java and Kotlin is that this function isn't within a class, so we're able to have code outside classes
//2 It is not really that we can have code outside of classes it is just when writing code we don't have to explicitly include the class definition
//-> so the compiler is smart enough to realise the code should be within a class and will generate a class under the cover for us
//3 Main goal of the Kotlin is to be more concise and to cut down on boilerplate code
//4 JVM is going to be looking for the usual HelloWord.TypeAliases.VariableDeclaration.main method signature is the entry point of the application
//5 Kotlin Imports a lot of stuff by default, most of the imports belong to the Kotlin standard library

//No return type specified anywhere,we don;t se void anywhere and has the same signature as the function defined

//TOP LEVEL FUNCTION
fun main(args: Array<String>){
    //no semicolon at the end of the line
    println("Hello World")
}

