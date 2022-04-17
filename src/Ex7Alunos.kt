//Escreva um programa que pergunte para a pessoa usuária quantos alunos
//tem na sala dela. Em seguida, através de um laço while, peça a pessoa
//usuária para que entre com as notas de todos os alunos da sala, um por
//vez. Por fim, o programa mostra a nota média da turma
fun main() {
    println("Quantos alunos tem na sua sala de aula?")
    val qtdAlunos = readln().toInt()

    val notasAlunos = IntArray(qtdAlunos)

    var i = 0
    while(i < qtdAlunos){
        println("Digite a nota do ${i+1}º aluno(a):")
        notasAlunos[i] = readln().toInt()
        i++
    }

    var soma = 0
    var contador = 0
    while(contador < qtdAlunos){
        soma = soma+notasAlunos[contador]
        contador++
    }

    val media = soma/qtdAlunos

    println("A média de notas da turma foi: $media")

}