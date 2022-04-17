//Escreva um algoritmo que leia 15 números do usuário. Ao final exiba
//a média dos 15 números. Utilize o comando de repetição Para (For)
fun main() {
    val numerosDoUsuario = IntArray(15)

    for(i in 0..14){
        println("Digite o ${i+1}º número:")
        numerosDoUsuario[i] = readln().toInt()
    }

    var soma=0
    for(i in 0..14){
        soma = soma+numerosDoUsuario[i]
    }

    val media = soma/15

    println("A média dos números digitados é: $media")
}