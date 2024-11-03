package oliveira.technological.solutions.main.basicSyntax

fun maxOff(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun minOff(a: Int, b: Int) = if (a < b) b else a
