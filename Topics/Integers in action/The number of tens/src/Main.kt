fun main() {
    // put your code here
    val num = readln().toInt()
    if(num in 0..9) println(0)
    else println(num % 100 / 10)
}