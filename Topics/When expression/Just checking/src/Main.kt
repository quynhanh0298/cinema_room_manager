fun main() {
    // write your code here
    val num = readln().toInt()
    println(when(num){
        1 -> "No!"
        2 -> "Yes!"
        3 -> "No!"
        4 -> "No!"
        else -> "Unknown number"
    })
}