fun main() {
    val cardType: String = "Visa"
    val prevTransactions: Int = 120_000_00
    val currTransaction: Int = 85_000_00
    countCommission(cardType, prevTransactions, currTransaction)
}

fun countCommission(cardType: String = "Vk Pay", prevTransactions: Int = 0, currTransaction: Int) {
    var commission: Int = 0
    when (cardType) {
        "MasterCard", "Maestro" -> if (currTransaction > 75_000_00) commission =
            (currTransaction * 0.006 + 20_00).toInt()
        "Visa", "Мир" -> commission =
            if ((currTransaction * 0.0075).toInt() > 35_00) (currTransaction * 0.0075).toInt() else 35_00
    }
    val total: Int = currTransaction + commission
    println("Перевод с учетом комиссии составит ${(total / 100).toInt()} рублей ${total % 100} копеек")
}