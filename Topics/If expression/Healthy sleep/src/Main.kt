fun main() {    
    // write your code here
    val A = readln().toInt()
    val B = readln().toInt()
    val H = readln().toInt()
    if (H in A..B) println("Normal")
    else if (H < A) println("Deficiency")
    else println("Excess")
}