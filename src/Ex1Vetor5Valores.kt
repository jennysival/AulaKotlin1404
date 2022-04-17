//Faça um programa que leia 5 valores inteiros, armazene-os em um
//vetor, calcule e apresente a soma destes valores.

fun main() {
    var vetorNumeros = IntArray(5)
    var soma = 0

    for(i: Int in vetorNumeros) {
        print("Digite um número: ")
        vetorNumeros[i] = readln().toInt()
        soma = soma+vetorNumeros[i]
    }

    println("O resultado da soma dos números digitados é: $soma")
}