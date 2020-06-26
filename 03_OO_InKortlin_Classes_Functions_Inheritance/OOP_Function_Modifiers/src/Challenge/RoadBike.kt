package Challenge

class RoadBike(cadence:Int,speed:Int,gear:Int=15,var tideWidth:Int):Bicycle(cadence,speed,gear) {
    override fun printDescription()=println("""|Roadbike gear is $gear
        |with the cadence of $cadence
        |travelling at a speed of $speed.
    """.trimMargin())

}