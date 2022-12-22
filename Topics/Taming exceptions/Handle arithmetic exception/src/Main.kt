fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()

    when (b){
        0 -> println("Division by zero, please fix the second argument!")
        else -> println(a/b)
    }
}