//fun main() {
//    println("Digite um número de 1 a 7 para saber o dia da semana correspondente: ")
//    val diaDigitado = readln().toInt()
//
//    when{
//        diaDigitado == 1 -> println("Hoje é domingo")
//        diaDigitado == 2 -> println("Hoje é segunda-feira")
//        diaDigitado == 3 -> println("Hoje é terça-feira")
//        diaDigitado == 4 -> println("Hoje é quarta-feira")
//        diaDigitado == 5 -> println("Hoje é quinta-feira")
//        diaDigitado == 6 -> println("Hoje é sexta-feira")
//        diaDigitado == 7 -> println("Hoje é sábado")
//        else -> println("Número inválido")
//    }
//}

fun main() {
    val diasDaSemana = arrayListOf<String>("Domingo","Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira","Sábado")

    println("Digite um número de 1 a 7 para saber o dia da semana correspondente: ")
    val diaDigitado = readln().toInt()

    diasDaSemana.forEachIndexed { index, s -> if (diaDigitado == index+1){println(s)} }

}