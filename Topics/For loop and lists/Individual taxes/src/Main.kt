fun main() {
    // write your code here
    val n = readln().toInt()
    val incomeOfCompanyList = mutableListOf<Int>()
    val taxRateOfCompanyList = mutableListOf<Int>()
    val taxOfCompanyList = mutableListOf<Int>()

    for (i in 1..n){
        incomeOfCompanyList.add(readln().toInt())
    }
    for (i in 1..n){
        taxRateOfCompanyList.add(readln().toInt())
    }
    for (i in 0 until n){
        taxOfCompanyList.add(incomeOfCompanyList[i] * taxRateOfCompanyList[i])
    }
    val max = taxOfCompanyList.maxOrNull()
    println(taxOfCompanyList.indexOf(max) + 1)
}