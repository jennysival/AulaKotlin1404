//Escreva um algoritmo que leia dois números e apresente um menu
//com 4 opções:
//a. 1) Somar os números;
//b. 2) Subtrair os números;
//c. 3) Multiplicar os números;
//d. 4) Dividir os números. Leia a opção do usuário e execute a
//operação e apresente o resultado. Caso a opção digitada seja
//inválida, apresente a mensagem de “Opção inválida” para o
//usuário
fun main() {
    println("Digite o primeiro número:")
    val num1 = readln().toInt()

    println("Digite o segundo número:")
    val num2 = readln().toInt()

    println("---------------------------")
    println("O que deseja fazer?")
    println("1) Somar os números")
    println("2) Subtrair os números")
    println("3) Multiplicar os números")
    println("4) Dividir os números")
    println("---------------------------")
    println("Digite apenas o número da opção escolhida:")
    val opcMenu = readln().toInt()

    when(opcMenu){
        1 -> println("$num1 + $num2 = ${num1+num2}")
        2 -> println("$num1 - $num2 = ${num1-num2}")
        3 -> println("$num1 x $num2 = ${num1*num2}")
        4 -> println("$num1 / $num2 = ${num1/num2}")
        else -> println("Seleção Inválida")
    }

}