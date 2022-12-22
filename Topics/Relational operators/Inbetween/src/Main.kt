fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    println(num1 in num2..num3 || num1 in num3..num2)
}