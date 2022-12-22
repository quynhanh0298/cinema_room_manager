fun parseCardNumber(cardNumber: String): Long {
    // TODO
    val regex = Regex("""(\d{4}\s){3}\d{4}""")
    if (regex.matches(cardNumber)) return cardNumber.replace(" ","").toLong()
    else throw Exception("Wrong format")
}