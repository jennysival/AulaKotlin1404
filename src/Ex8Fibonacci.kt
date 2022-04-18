//Desenvolva um programa que leia um valor e apresente o número de
//Fibonacci correspondente a este valor lido. Lembre-se que os 2 primeiros
//elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma
//dos 2 anteriores a ele. No final imprima a mensagem "Fib(N) = X", onde X é
//o N-ésimo termo da série de Fibonacci.

fun main() {
    println("Digite um número:")
    val numeroDigitado = readln().toInt()

    var vetorFibo = IntArray(numeroDigitado)

    var atual = 0
    var proximo = 1
    var soma = 0

    for(i: Int in vetorFibo.indices){
        soma = atual + proximo
        vetorFibo[i] = atual
        atual = proximo
        proximo = soma
    }

    if(numeroDigitado == 0){
        println("F(0) = 0")
    }
    else if(numeroDigitado == 1){
        println("F(1) = 1")
    }


    }

}