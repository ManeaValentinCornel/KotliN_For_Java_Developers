package Exercices

fun main() {
//    //5,10,15...5000
//   for (i in 5..5000 step 5) {
//       print("$i ,")
//}

//    //-500,-499... 0
//    for(i in -500.. 0){
//        print("$i ,")
//    }

////      Fibonacci sequence 0,1,1,2,3,5,8,13,21...
////      FIRST 15 NUMBERS
//    var x0=0
//    println(x0)
//    var x1=1
//    println(x1)
//    for(i in 1..13){
//        val temp =x1
//        x1=x1+x0
//        x0=temp
//        println(x1)
//    }

    // produce the sequence 1, 11, 100, 99, 98, 2
    iLoop@ for (i in 1..5) {
        println(i)
        if (i == 2) break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) continue@iLoop
            }
        }
    }

    //Declare a variable called num (int) and then assign it whatever you want
    //Declare a variable called dnum (double) and assign it as follows:
    //if num >100m assign dnum -234.567
    //if num <100, assign dnum 4444.555
    //if num ==100 assign dnum 0.0

    //1
    val num: Int = 20
    val dnum = if (num < 100) 4444.555
    else if (num == 0) 0.0
    else -234.567

    //2 When doesn't take any values, in this particular case cause we want to compare num
    val dnum2 = when {
        num < 100 ->  4444.555
        num ==0 -> 0.0
        else ->-234.567
    }


}
