fun main() {
    // put your code here
    var countArray = readln().toInt()
    var num = 1
    while (countArray - num >= 0){
        countArray -= num
        repeat(num){
            print("$num ")
        }
        num++
    }
    repeat(countArray){
        print("$num ")
    }
}