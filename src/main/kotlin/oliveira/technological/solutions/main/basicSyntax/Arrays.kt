package oliveira.technological.solutions.main.basicSyntax

fun exemploArray(): Unit {
//    cria um arrays de rios
    var riversArray = arrayOf("Nilo", "Amazonia", "Yangtze")

//    usando o operador de atribuicao += cria um novo array, copiando o array original e adicionando o novo rio
    riversArray += "Missisipi"
    println(riversArray.joinToString())

//    cria um array simples com arrayOf
    val simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())

//    cria um array de inteiros ou nulos, esse array tem 3 posicoes null
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

//    cria um array com posicoes vazias
    var exampleArray = emptyArray<String>()

//    tambem pode ser declarado da seguinte forma
    var exampleArray2: Array<String> = emptyArray()

//    cria um array com 3 posicoes e preenche ele com zeros
    var initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString())

    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

//    array multidimensional de 2 dimensoes
    val twoDimensionArray = Array(2) { Array<Int>(3) { 0 } }
    println(twoDimensionArray.contentDeepToString())

    //    array multidimensional de 2 dimensoes
    val threeDimensionArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeDimensionArray.contentDeepToString())

}
