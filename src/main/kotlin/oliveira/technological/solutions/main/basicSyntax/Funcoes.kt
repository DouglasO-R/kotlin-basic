package oliveira.technological.solutions.main.basicSyntax

//funcao recebe os parametros tipando os parametros e retorno
fun sum(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}


//    essa funcao nao possui retorno
fun exemploFuncaoVoid(): Unit {
    println("funcao sem retorno")
}

//uma forma curta de escrever funcao
fun atalhoFuncao(num1: Int, num2: Int) = num1 + num2



//uma expressao funcao
val expresaoSoma: ((Int, Int) -> Int) = { num1, num2 -> num1 + num2 }