package cinema

var rows: Int = 0
var seatsEachRow: Int = 0

//Create an empty list to contain ordered seat
val orderedSeatsList = mutableListOf(mutableListOf<Int>())
var numberOf_10_Dollar_Tickets: Int = 0
var numberOf_8_Dollar_Tickets: Int = 0

var choseRowNumber = 0
var choseSeatNumber = 0

fun main() {

    //Start of program: Read the number of rows and number of seats in each row
    println("Enter the number of rows:")
    print("> ")
    rows = readln().toInt()
    println("Enter the number of seats in each row:")
    print("> ")
    seatsEachRow = readln().toInt()


    //Print menu:
    showTheMenu()

}

//Show the Statistics:
fun showStatistics() {
    val total = numberOf_10_Dollar_Tickets + numberOf_8_Dollar_Tickets
    val percentage = "%.2f".format((total.toDouble() / (rows * seatsEachRow).toDouble()) * 100)
    val currentIncome = numberOf_10_Dollar_Tickets * 10 + numberOf_8_Dollar_Tickets * 8
    val totalIncome =
        if (rows * seatsEachRow <= 60) rows * seatsEachRow * 10
        else (rows / 2 * 10 + (rows - rows / 2) * 8) * seatsEachRow
    println("Number of purchased tickets: $total")
    println("Percentage: $percentage%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
}

//Show the menu with three items: 1. Show the seats   2.Buy a ticket   0.Exit
fun showTheMenu() {
    println()
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")

    //Input the number of menu
    print("> ")


    //Execute the selected item
    when (readln().toInt()) {
        1 -> {
            showTheSeat()
            showTheMenu()
        }

        2 -> {
            buyTicket()
            showTheMenu()
        }

        3 -> {
            showStatistics()
            showTheMenu()
        }

        0 -> {
            return
        }
    }
}

//Show the seat
fun showTheSeat() {
    println("\nCinema:")
    print("  ")
    for (i in 1..seatsEachRow) print("$i ")
    println()
    for (i in 1..rows) {
        print("$i ")
        for (j in 1..seatsEachRow) {
            if (orderedSeatsList.contains(mutableListOf(i, j))) print("B ")
            else print("S ")
        }
        println()
    }
}

//Enter the coordinate of seat:
fun chooseSeat() {
    println("Enter a row number:")
    print("> ")
    choseRowNumber = readln().toInt()
    println("Enter a seat number in that row:")
    print("> ")
    choseSeatNumber = readln().toInt()

    if (orderedSeatsList.contains(mutableListOf(choseRowNumber, choseSeatNumber))) {
        println("That ticket has already been purchased!")
        chooseSeat()
    } else {
        if (choseRowNumber < 1 || choseRowNumber > rows || choseSeatNumber < 1 || choseSeatNumber > seatsEachRow) {
            println("Wrong input!")
            chooseSeat()
        }
    }
}

//Buy a ticket:
fun buyTicket() {
    chooseSeat()

    orderedSeatsList.add(mutableListOf(choseRowNumber, choseSeatNumber))

    val price: Int =
        if (rows * seatsEachRow <= 60) 10
        else {
            if (rows % 2 == 0) {
                if (choseRowNumber <= rows / 2) 10
                else 8
            } else {
                if (choseRowNumber <= rows / 2) 10
                else 8
            }
        }
    if (price == 10) numberOf_10_Dollar_Tickets++
    else numberOf_8_Dollar_Tickets++
    println("\nTicket price: $$price")
}
