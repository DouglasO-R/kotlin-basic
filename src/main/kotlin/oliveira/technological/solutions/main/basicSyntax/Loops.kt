package oliveira.technological.solutions.main.basicSyntax

fun main() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0

//    interando uma lista pelos items usando for
    for (item in items) {
        println(item)
    }

//    iterando uma lista pelo indice usando for
    for (index in items.indices) {
        println("item no indice ${items[index]}")
    }

    //    iterando uma lista pelo indice usando while
    while (index < items.size) {
        println("item no indice ${items[index]}")
        index++
    }

    //    Exemplo de when
    fun describe(obj: Any): String = when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

//    Ranges
    val x: Int = 10
    val y: Int = 9

//    Verifica se um numero esta entre x e y + 1
    if (x in 1..y + 1) {
        println("esta entre os valores ")
    }

//    verifica se um numero esta fora da lista
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 esta fora da faixa de valores")
    }

    if (list.size !in list.indices) {
        println("o tamanho da lista esta fora do intervalo")
    }

//    interando um range(intervalo)
    for (x in 1..5) {
        println(x)
    }

    println("progressao")
    for (x in 1..10 step 2) {
        println(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        println(x)
    }

//    Collections
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

//    usando lambda expression para filtar e iterar uma colecao
    val fruits = listOf("banana","avocado","apple","kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach{ println(it) }




}

