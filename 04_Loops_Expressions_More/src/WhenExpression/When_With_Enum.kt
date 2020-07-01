package WhenExpression

enum class Season{
    SPRING,SUMMER,FALL,WINTER
}

fun main(){
    val timeOfYear=Season.SPRING

    //************************************* WHEN WITH ENUM***************************************//
    //We exhausted all the possibilities out of Season enum, that is why the else -> branch is not required anymore
    val str=when(timeOfYear){
        Season.SPRING->"Flowers are blooming"
        Season.SUMMER->"It's hot"
        Season.FALL->"It's getting cooler"
        Season.WINTER->"Flowers are blooming"
    }



}