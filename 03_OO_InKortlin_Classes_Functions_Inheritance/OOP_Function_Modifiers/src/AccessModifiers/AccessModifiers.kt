package AccessModifiers
//-> Access modifier also known as visibility modifiers. In Kotlin the default visibility in public.
//-> In Kotlin if a top level item is private then everything in the same file can access it
//-> In Kotlin you can have as many public classes as you want in a single file
//-> In Kotlin you cas also use private with classes, which you can't use in Java.Everything in the same File can access it
//-> In Kotlin you can't use protected at the top level
//-> In Kotlin classes can't see private members belonging to inner classes
//-> A top level file marked as internal is visible to everything belonging to the same module
//-> In Kotlin is is possible to have top level functions and properties. Top level item are public by default.
//-> In Kotlin are 4 visibility modifier(access modifier) public, private , protected ,internal
//-> When the Kotlin applications are compiled the access modifier have to be compiled to the modifiers that the JVM understands
//and private is compiled to package private, internal is compiled to public

fun main() {
    val emp = Employee()
}

//PRIVATE CLASS VISIBLE TO EVERYTHING IN THE SAME FILE
private class Employee() {
}