fun main() {
    // write your code here
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n){
        list.add(readln().toInt())
    }
    if (readln().toInt() in list) println("YES")
    else println("NO")
}