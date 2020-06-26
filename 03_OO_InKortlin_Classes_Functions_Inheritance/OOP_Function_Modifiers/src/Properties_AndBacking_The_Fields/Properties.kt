package Properties_AndBacking_The_Fields

//Kotlin classes have only properties they do not have fields
//-> FOr public properties in Kotlin you get the setter and getters for
//-> The rule is Kotlin is that have to have the same visibility  as the property or less permissive visibility
//-> So unlike java, in Kotlin you don't have to declare a property private to prevent it from being directly modified
//-> Kotlin auto-generate accessors

fun main() {
    val emp = Employee("Name", true)
    emp.isFullTime = false
    //1
    val emp2 = Employee2("Name", true)
    //cannot be accessed
    //when the property private there will be no way, no modify that properties from outside
    //emp2.fullTime=false
}

class Employee(val name: String, var isFullTime: Boolean) {
}

class Employee2(val name: String, private var isFullTime: Boolean) {
}

// 2 Custom get for the one of the properties-> first need to remove the variable declaration and leave just the parameter
class Employee3(val name: String, fullTime: String) {
    //At this point the compiler will generate the default getter and setter for us
    //When you want a custom accessor it has to come immediately after the property declaration
    var fullTime = fullTime
    //field identifier(backing field)
    get(){
        print("Running is custom get")
        return field
    }
    set(value){
        println("Running the custom set")
        field=value
    }

}