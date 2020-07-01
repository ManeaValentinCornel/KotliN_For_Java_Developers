package IF_Expression

fun main() {
    val someCondition = 10 > 5

    //IN THE IF EXPRESSION THE ELSE IS A MUST
    val num = if (someCondition) {
        println("The last line will the value assigned to the num variable")
        50
    } else {
        println("The last line will the value assigned to the num variable")
        20
    }


    val x = if (someCondition) {
        println("Something")
    } else {
        println("Something else")
    }
    //VALUE OF X WILL BE UNIT
    print(x is Unit)
}