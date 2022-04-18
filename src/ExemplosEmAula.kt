//Exemplo Arrays (vetor)
fun main() {
    //Exemplo de declaração e adição de valores para o vetor
    var listaNomes = arrayOf("Jenny","Jessica","Kate")
    var listIdade = intArrayOf(27,30,24)
    var exemploSalarios = doubleArrayOf(12.4, 15.3)

    //Exemplo de declaração determinando o tamanho do vetor
    var listaFrutas = ArrayList<String>(10)
    var vetorNumeros = IntArray(4)
    vetorNumeros[0] = 35
    vetorNumeros[1] = 25
    vetorNumeros[2] = 15

    var listaSalarios = DoubleArray(12)

    var listaIdadeExemplos = ArrayList<Int>(3)

    // Exemplo pegando dados do usuário arrayOf()
    var nomeUsuario = arrayOfNulls<String>(3)
    print("Por favor, digite o nome 1 - ")
    nomeUsuario[0] = readln()

    print("Por favor, digite o nome 2 - ")
    nomeUsuario[1] = readln()

    println("O tamanho do array é de ${nomeUsuario.size}")
    println("O nome 1 é ${nomeUsuario[0]}")
    println("O nome 2 é ${nomeUsuario[1]}")


}

//exitProcess(0) para sair de um processo