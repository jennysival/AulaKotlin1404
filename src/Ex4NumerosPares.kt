//Faça um programa que receba 10 números inteiros informados pela
//pessoa usuária, armazene-os e verifique quais números são pares, e
//exiba para o usuário apenas os números pares da lista.

fun main() {
    var vetorNumeros = IntArray(10)

    for(i: Int in vetorNumeros.indices){
        println("Digite um número inteiro:")
        vetorNumeros[i] = readln().toInt()
    }

    for(i: Int in vetorNumeros.indices){
        if(vetorNumeros[i] %2==0){
            println("Os números pares são: ${vetorNumeros[i]}")
        }
    }
}