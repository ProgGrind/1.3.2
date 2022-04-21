package ru.netology

import org.junit.Test

import org.junit.Assert.*

class NetologyKtTest {

    @Test
    fun commissionAmount_mastercard_75k_plus() {
        //arrange
        val moneyTest = 50000
        val accountTest = "mastercard"
        val allPayingsTest = 76000

        //act
        val result = ru.netology.commissionAmount(
            amount = moneyTest,
            account = accountTest,
            allPayings = allPayingsTest
        )

        //assert
        assertEquals(2300, result)
    }

    @Test
    fun commissionAmount_mastercard_75k_minus() {
        //arrange
        val moneyTest = 50000
        val accountTest = "mastercard"
        val allPayingsTest = 0

        //act
        val result = ru.netology.commissionAmount(
            amount = moneyTest,
            account = accountTest,
            allPayings = allPayingsTest
        )

        //assert
        assertEquals(0, result)
    }

    @Test
    fun commissionAmount_visa_big() {
        //arrange
        val moneyTest = 500000
        val accountTest = "visa"
        val allPayingsTest = 0

        //act
        val result = ru.netology.commissionAmount(
            amount = moneyTest,
            account = accountTest,
            allPayings = allPayingsTest
        )

        //assert
        assertEquals(3750, result)
    }

    @Test
    fun commissionAmount_visa_small() {
        //arrange
        val moneyTest = 50000
        val accountTest = "visa"
        val allPayingsTest = 0

        //act
        val result = ru.netology.commissionAmount(
            amount = moneyTest,
            account = accountTest,
            allPayings = allPayingsTest
        )

        //assert
        assertEquals(3500, result)
    }

    @Test
    fun commissionAmount_vkpay() {
        //arrange
        val moneyTest = 50000
        val accountTest = "vk pay"
        val allPayingsTest = 0

        //act
        val result = ru.netology.commissionAmount(
            amount = moneyTest,
            account = accountTest,
            allPayings = allPayingsTest
        )

        //assert
        assertEquals(0, result)
    }
}