package ExtensionFucntions

class Util {
    fun upperFirst(str: String): String {
        val upperFirst = str.substring(0, 1).toUpperCase()+str.substring(1)
        return upperFirst;
    }
}