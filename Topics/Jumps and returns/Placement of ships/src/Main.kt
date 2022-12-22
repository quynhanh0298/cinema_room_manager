fun main() {
    // put your code here
    val rowList = mutableListOf<Int>()
    val columnList = mutableListOf<Int>()
    repeat(3){
        val (a,b) = readln().split(' ')
        rowList.add(a.toInt())
        columnList.add(b.toInt())
    }
    val availableX = mutableListOf<Int>()
    val availableY = mutableListOf<Int>()
    for (i in 1..5){
        if (i in rowList) continue
        else availableX.add(i)
    }
    for (i in 1..5){
        if (i in columnList) continue
        else availableY.add(i)
    }
    println(availableX.joinToString(" "))
    println(availableY.joinToString(" "))
}