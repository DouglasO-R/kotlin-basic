package oliveira.technological.solutions.main.basicSyntax

fun exemploVar() {
//  exmplos de tipos de var

//    inteiros
    var inteiro = 5
    var inteiro2: Int = 5
//    reassign valor do inteiro
    inteiro2 = 10

//    valor de ponto flutuante
    var double1 = 2.5
    var double: Double = 2.5

//    caracteres declarado com aspas simples
    var char = 'A'
    var char2: Char = 'S'

//    conjunto de carateres com aspas duplas
    var string = "vezes"
    var string2: String = "nos confundimos"

//    valores logicos como verdadeiro e falso
    var boleano = true
    var boalenao2: Boolean = false

    val texto = "$char$char2 $string somos nota $inteiro2 , $char$char2 $string $string2 e tiramos $double"
//  texto = "Ola mundo"
    println(texto)

}
