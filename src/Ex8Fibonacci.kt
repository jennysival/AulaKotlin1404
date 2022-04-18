//Desenvolva um programa que leia um valor e apresente o número de
//Fibonacci correspondente a este valor lido. Lembre-se que os 2 primeiros
//elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma
//dos 2 anteriores a ele. No final imprima a mensagem "Fib(N) = X", onde X é
//o N-ésimo termo da série de Fibonacci.
fun main() {
    println("Digite um número:")
    val numDig: Long = readln().toLong()
    println("Fib($numDig) = ${fibo(numDig)}")
}

fun fibo(num: Long): Long {
    return if (num == 0L || num == 1L) {
        num
    } else {
        fibo(num - 1) + fibo(num - 2)
    }
}