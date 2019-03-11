package uk.co.logiccache

fun getMiddle(input: String): String {
    check(input.isNotBlank()) { "input must contain at least one character" }
    return if (input.length % 2 == 0) {
        input.substring((input.length / 2) - 1, (input.length / 2) + 1)
    } else {
        input[input.length / 2].toString()
    }
}