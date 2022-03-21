import junit.framework.Assert.assertEquals

class MainKtTest {

    @org.junit.Test
    fun countCommission_Visa() {
        //arrange
        val card = CardType.Visa
        val transact = 85_000_00
        //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(8563750, result)
    }

    @org.junit.Test
    fun countCommission_MasterCardMax() {
        //arrange
        val card = CardType.MasterCard
        val transact = 85_000_00
        //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(8553000, result)
    }

    @org.junit.Test
    fun countCommission_MasterCardMin() {
        //arrange
        val card = CardType.MasterCard
        val transact = 65_000_00
        //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(6500000, result)
    }

   @org.junit.Test
    fun countCommission_VkPay() {
        //arrange
        val card = CardType.VkPay
        val transact = 85_000_00
        //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(8700000, result)
    }

    @org.junit.Test
    fun countCommission_Maestro() {
        //arrange
        val card = CardType.Maestro
        val transact = 85_000_00
        //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(8553000, result)
    }

    @org.junit.Test
    fun countCommission_MirMax() {
        //arrange
        val card = CardType.Mir
        val transact = 85_000_00
        //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(8563750, result)
    }

    @org.junit.Test
    fun countCommission_MirMin() {
        //arrange
        val card = CardType.Mir
        val transact = 65_000         //act
        val result = countCommission(
            cardType = card,
            currTransaction = transact
        )
        //assert
        assertEquals(68500, result)
    }
}
