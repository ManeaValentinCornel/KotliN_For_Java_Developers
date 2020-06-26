package Challenge

fun main(){
    val bicycle= Bicycle(10,3,10)
    bicycle.printDescription()
    val roadBicycle=RoadBike(10,5,5,5)
    roadBicycle.printDescription()
    val mountainBicycle=MountainBike(10,5,5,5)
    mountainBicycle.printDescription()


    for(color in MountainBike.availableColor){
        println(color)
    }
    MountainBike.availableColor.forEach { println(it) }
    MountainBike.availableColor.forEach { i->println(i) }









}