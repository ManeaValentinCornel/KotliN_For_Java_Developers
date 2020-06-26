package Challenge

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int=10) : Bicycle(cadence, speed, gear) {
    var color:String?=null
    constructor(color:String,seatHeight: Int,cadence: Int,speed:Int,gear:Int=10):this(seatHeight,cadence,speed,gear){
        this.color=color
        println(color)
    }
    override fun printDescription() = println(
        """|Mountain gear is $gear
        |with the cadence of $cadence
        |travelling at a speed of $speed.
    """.trimMargin()
    )

    companion object{
        val availableColor= arrayOf("blue","red","white","black","green","brown")

    }

}
