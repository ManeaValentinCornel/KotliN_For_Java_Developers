package Loops_Ranges

fun main() {
    //*************************************LOOPS***************************************//
    //Instead of the regular for loops, kotlin uses ranges.A range has a start and a end value
    //Any type which is Comparable can be used in a range
    val range = 1..5
    val charRange = 'a'..'z'
    //It is not possible to loop to string range
    val stringRange = "AB".."XY"
    //RANGE
    println(3 in range)//TRUE
    println('q' in charRange)//TRUE
    println("CC" in stringRange)//TRUE
    //DOWN TO
    val backWardRange = 5 downTo 1
    val backWardRange2 = 5.downTo(1)
    for (i in backWardRange) {
        print("$i, ")
    }
    // STEP DOWN TO AND REVERSE CAN BE USEd ONLY WITH NUMERIC TYPES AND CHARS
    val stepRange = 3..15
    val rangeStep = stepRange.step(3)
    val reversesRange = range.reversed()

    //For every value of i belongs to this range, print it
    for (i in 1..10) {
        print("$i, ")
    }
    //STEP RANGE
    for (i in 1..10 step 2) {
        print("$i, ")
    }
    //REVERSE RANGE
    for (i in (1..10).reversed()) {
        print("$i, ")
    }
    //DOWN TO
    for (i in 'z' downTo 'a') {
        print("$i, ")
    }

    //*************************************DO NOT INCLUDE THE LAST VALUE***************************************//
    //The last value is not included
    for (i in 1 until 10) {
        print("$i, ")
    }

    //*************************************STRING LOOPS***************************************//
    //Because the String class has an iterator defined on it
    val name = "Valentin"
    for (letter in name) {
        print(letter)
    }

    //*************************************ARRAY LOOPS***************************************//
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }
    //Test whether something is not within the range
    val isSeason = "whatever" !in seasons
    println(isSeason)
    val str = "Hello"
    println("e" in str)
    println("l" !in str)
    //*************************************INDICES LOOPING***************************************//
    //Iterate using indices
    for (index in seasons.indices) {
        println(seasons[index])
    }
    //*************************************FOR EACH***************************************//
    //lambda
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    //*************************************NAMED LOOPS***************************************//
    //Giving a loop a name, and then you can reference that name with continue and break
    myloop@for(i in 1..3) {
        println("i=$i ")
        jloop@for (j in 1..4) {
            println("j=$j ")
            for (k in 1..10) {
                println("k=$k ")
                if( k == 7){
                    break@myloop
                }
            }
        }
    }


}