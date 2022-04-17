//Faça um programa que permita que a pessoa usuária digite o nome
//de uma banda musical e insira o nome de 3 músicas dessa banda, as
//músicas deverão ser armazenadas e no final o programa deverá
//mostrar a seguinte mensagem:
//NomeDaBanda
//Musica1
//Musica2
//Musica3
fun main() {
    println("Qual a sua banda preferida?")
    var banda = readln()

    var musicas = arrayOfNulls<String>(3)

    for(i: Int in musicas.indices){
        println("Escreva o nome de uma música de $banda:")
        musicas[i] = readln()
    }

    println("-----------\n$banda\n----------")

    for(i: Int in musicas.indices){
        println(musicas[i])
    }
}