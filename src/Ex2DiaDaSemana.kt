//Escreva um algoritmo que leia um número inteiro (de 1 a 7)
//representando o dia da semana e informe o nome do dia
//correspondente.
fun main() {
    println("Digite um número de 1 a 7 para saber o dia da semana correspondente: ")
    val diaDigitado = readln().toInt()

    when{
        diaDigitado == 1 -> println("Hoje é domingo")
        diaDigitado == 2 -> println("Hoje é segunda-feira")
        diaDigitado == 3 -> println("Hoje é terça-feira")
        diaDigitado == 4 -> println("Hoje é quarta-feira")
        diaDigitado == 5 -> println("Hoje é quinta-feira")
        diaDigitado == 6 -> println("Hoje é sexta-feira")
        diaDigitado == 7 -> println("Hoje é sábado")
        else -> println("Número inválido")
    }
}