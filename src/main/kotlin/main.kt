enum class CardType {
    Visa, VkPay, MasterCard, Maestro, Mir
}

fun main() {
    val cardType: CardType = CardType.Visa
    val currTransaction: Int = 85_000_00
    var transaction = countCommission(cardType, currTransaction)
    println("Перевод с учетом комиссии составит ${( transaction/ 100).toInt()} рублей ${transaction % 100} копеек")
}

fun countCommission(cardType: CardType = CardType.VkPay, currTransaction: Int): Int {
    var commission: Int = 0
    when (cardType) {
        CardType.MasterCard, CardType.Maestro -> if (currTransaction > 75_000_00) commission =
         (currTransaction * 0.006 + 20_00).toInt()
        CardType.Visa, CardType.Mir -> commission =
         if ((currTransaction * 0.0075).toInt() > 35_00) (currTransaction * 0.0075).toInt() else 35_00

    }
    return currTransaction + commission
}