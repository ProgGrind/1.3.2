package ru.netology

import kotlin.math.roundToLong

fun main() {
    print("Напишите сумму перевода: ")
    val money = readLine()?. toInt() ?: return
    val amount = money * 100
    val allPayings = 700000
    val account = "mastercard"


    val kop = commissionAmount(amount, account, allPayings) % 100
    val rubles = commissionAmount(amount, account, allPayings) / 100
    println("Ваша комиссия: $rubles рублей $kop копеек")
}

fun commissionAmount (amount: Int, account: String, allPayings: Int) = when (account) {
    "vk pay" -> 0
    "mastercard" -> if (allPayings < 75_000) 0 else (amount * 0.006 + 2000).roundToLong()
    "visa" -> if (amount * 0.0075 > 3500) (amount * 0.0075).roundToLong() else 3500
    else -> 0
}