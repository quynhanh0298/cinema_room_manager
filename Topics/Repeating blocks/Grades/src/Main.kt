fun main() {
    // put your code here
    val n = readln().toInt()
    var A = 0
    var B = 0
    var C = 0
    var D = 0
    repeat(n){
        val x = readln().toInt()
        if (x == 5) A++
        else if (x == 4) B++
        else if (x == 3) C++
        else D++
    }
    println("$D $C $B $A")
}