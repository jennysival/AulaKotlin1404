fun main() {
    var vetorNumeros = IntArray(5)
    var soma = 0

    for(i: Int in vetorNumeros.indices) {
        print("Digite um número: ")
        vetorNumeros[i] = readln().toInt()
    }

    for(i: Int in vetorNumeros.indices){
        soma = soma+vetorNumeros[i]
    }

    println("O resultado da soma dos números digitados é: $soma")
}