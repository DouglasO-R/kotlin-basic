package oliveira.technological.solutions.main.basicSyntax

//Toda classe em kotlin e final por isso em caso de heranca deve ser usado o idendtificador open
open class Shape

class Rectangle(val height: Double, val lenght: Double):Shape() {
    val perimeter = (height + lenght) * 2
}


fun main() {
    val rectangle1 = Rectangle(lenght = 3.5, height = 5.2)
    println("O perimetro e do retangulo 1 e: ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(2.5, 10.0)
    println("O perimetro e do retangulo 2 e: ${rectangle2.perimeter}")
}