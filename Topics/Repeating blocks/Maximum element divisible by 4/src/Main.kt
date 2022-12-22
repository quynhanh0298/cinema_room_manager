fun main() {
    // put your code here
    val num = readln().toInt()
    var max = -1
    repeat(num){
        val x = readln().toInt()
        if (x > max && x % 4 ==0) max = x
    }
    if (max >= 0) println(max)
    else println("")
}