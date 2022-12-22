fun main() {
    // put your code here
    val letter = readln().first()
    for (i in 'a'..'z'){
        if (i < letter) print(i)
        else break
    }
}