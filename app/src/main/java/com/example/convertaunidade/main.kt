package com.example.convertaunidade
fun main() {
    val taxaDeConversao = 5.0
    print("Digite o valor em dólares: ")
    val valorEmDolares = readLine()?.toDoubleOrNull() ?: 0.0
    val valorEmReais = valorEmDolares * taxaDeConversao
    println("O valor em reais é: R$ $valorEmReais")
}