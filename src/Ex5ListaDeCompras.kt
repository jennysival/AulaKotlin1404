//Faça um programa que receba de lista de compras sendo que a
//pessoa usuária irá inserir a quantidade de itens que quer adicionar
//na lista de compras e após inserir a quantidade o programa deverá
//permitir que o usuário insira os produtos nessa lista. Exiba a lista
//completa para o usuário.

fun main() {
    println("Quantos itens terá na sua lista de compras?")
    val qtdItens = readln().toInt()

    var vetorListaDeCompras = arrayOfNulls<String>(qtdItens)

    for(i: Int in vetorListaDeCompras.indices){
        println("Digite o ${i+1}º item da sua lista:")
        vetorListaDeCompras[i] = readln()
    }

    println("Aqui está sua lista de compras")

    for(i: Int in vetorListaDeCompras.indices){
        println("${i+1}: ${vetorListaDeCompras[i]}")
    }
}