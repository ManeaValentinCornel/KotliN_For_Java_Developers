package Challenge

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int=10) {
    fun applyBrake(decrement: Int) {
        cadence -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
    open fun printDescription()=println("""|Bike gear is $gear
        |with the cadence of $cadence
        |travelling at a speed of $speed.
    """.trimMargin())

}
