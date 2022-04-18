//Escreva um algoritmo que leia o ano de nascimento de uma pessoa
//e apresente uma linha do tempo, mostrando cada ano de vida da
//pessoa e quantos anos ela tinha em cada ano até o ano atual.
fun main() {

    println("Digite seu ano de nascimento:")
    val anoNascimento = readln().toInt()

    val idade = 2022-anoNascimento

    val vetorLinhaDoTempo = IntArray(idade)

    for(i: Int in vetorLinhaDoTempo.indices){
        vetorLinhaDoTempo[i] = anoNascimento+i
    }

    vetorLinhaDoTempo.forEachIndexed { index, i -> println("$i: $index anos") }
}