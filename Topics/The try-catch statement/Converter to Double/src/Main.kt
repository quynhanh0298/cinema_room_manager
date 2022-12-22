import java.lang.NumberFormatException

fun convertStringToDouble(input: String): Double {
    /**
    * It returns a double value or 0 if an exception occurred
    */
    return try {
        input.toDouble()
    }
    catch (e: NumberFormatException){
        0.0
    }
    catch (e: Exception){
        0.0
    }
}