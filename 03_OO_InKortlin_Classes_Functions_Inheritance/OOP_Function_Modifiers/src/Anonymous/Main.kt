package Anonymous

fun main() {

    //Anonymous object created is a singleton
    wantsSomeSinterface(object : SomeInterface {
        //Unlike in Java, the method can access mutable variables
        override fun mustImplement(num: Int) = "This is from most impement ${num * 100}"
    })

    //Thread using anonymous class
    val thread = Thread(object : Runnable {
        override fun run() {
        }
    }).start()


}


fun wantsSomeSinterface(si: SomeInterface) {
    println("Printin from wantsSomeInterface ${si.mustImplement(22)}")
}

