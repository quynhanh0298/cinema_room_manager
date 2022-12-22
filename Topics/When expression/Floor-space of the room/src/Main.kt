fun main() {
    // write your code here
    val type = readLine()!!

    when (type) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val s = (a + b + c) / 2
            println(Math.sqrt(s * (s - a) * (s - b) * (s - c)))
        }

        "rectangle" -> println(readln().toDouble() * readln().toDouble())
        "circle" -> {
            val r = readln().toDouble()
            println(3.14 * r * r)
        }
    }
}