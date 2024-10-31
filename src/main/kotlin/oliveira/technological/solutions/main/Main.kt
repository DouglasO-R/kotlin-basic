package oliveira.technological.solutions.main

fun main() {
//    exemploVar()
    exemploClass()
}

fun exemploVar() {
//  exmplos de tipos de var

    var inteiro = 5
    var inteiro2: Int = 5

    var double1 = 2.5
    var double: Double = 2.5

    var char = 'A'
    var char2: Char = 'S'

    var string = "vezes"
    var string2: String = "nos confundimos"

    var boleano = true
    var boalenao2: Boolean = false

    val texto = "$char$char2 $string $string2"
//  texto = "Ola mundo"
    println(texto)


}

fun exemploClass() {
    val rectangle = Rectangle(2.5, 1.5)
    println(rectangle.perimeter)
}

class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2

}