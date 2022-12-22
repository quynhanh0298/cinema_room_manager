fun main() {
    // put your code here
    var product: Long = 1
    val a = readln().toInt()
    val b = readln().toInt()
    for (i in a until b){
        product *= i
    }
    println(product)
}