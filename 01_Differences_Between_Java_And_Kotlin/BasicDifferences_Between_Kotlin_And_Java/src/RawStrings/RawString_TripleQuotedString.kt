package RawStrings

//RAW STRING or TRIPLE QUOTED STRINGS
//Recommended to be used for filePaths
fun main(){

    //1 One use of triple quoted strings, when you have a bunch of code you have to escape, and you want your string to look nicer,
    // you can use a triple quoted string instead
    val filePath="c:\\somedir\\somedir2"
    val filePathRawString="""c:\somedir\somedir2"""

    //2 When you have a String you want to break over several lines
    val eggName="Humpty Dumpty"
    val nurseryRhyme="""                             |$eggName sat on the wall
                        |$eggName had a great fall
                        |All the king's horses and all the king's men|
                        |Could't put $eggName together again""".trimMargin()
    //the default character for timing the margins is | pipe operator
    println(nurseryRhyme)
}