package ExtensionFucntions
//EXTENSION FUNCTIONS let you extend any class you want to extend, the extend mean add function to it
//You can create the illusion of adding some function to an already defined class, by using extension functions
//It is pretty much more associated a function with a class
//Kotlin uses extension function, a lot of the Kotlin standard library functions are extension functions to JDk

fun main() {

    var lowerCase:String="valentin"
    //Is a big illusion,it's making it to appear as the  upper first and last function belongs to the String class when it fact it doesn't
    lowerCase.upperFirst()


}
//Associated the upperFirst method with the String class.In this case the String is the receiver object
//Because we associated this function with the String class.So instead of using and String parameter, the use parameter will be this.
//In our example oyr parameter is the String (this) which substituted by using the keyword this
//String in the case os the object of the receiver type
fun String.upperFirst(): String {
    val upperFirst = this.substring(0, 1).toUpperCase()+this.substring(1)
    //In this particula case the this keyword can be removed and the result will be still the same
    return upperFirst;
}