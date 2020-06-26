package Interfaces
//->Interface doesn't have a constructor because, cause having a constructor doesn't have any sense
//->For interfaces the open keyword is redundant, because the interfaces are implicitly opened.Extendable by default
//->Interfaces can have properties, and this properties don;t have to be abstract you can even provide accessors for them
//and sub interfaces can override the accessors
//**********************************************Interface methods*************************************************//
interface MyInterface {
    fun myFunction(str: String): String
}
interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): Int
}
open class Something() : MySubInterface {
    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun mySubFunction(num: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
//**********************************************Interface properties*************************************************//
interface DoInterface{
    //Abstract property need to be overridden
    val number:Int
    //Concrete property achieved by adding a getter accessor, can be overridden but doesn't need to
    val age:Int
         get()= 100
}

class SomeClass():DoInterface{
    override val number:Int=200

}