fun main() {
    // put your code here
    var num = readln().toInt()
    print("$num ")
    while (num != 1){
        if (num % 2 == 0) num /= 2
        else num = num * 3 + 1
        print("$num ")
    }
}