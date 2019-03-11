package uk.co.logiccache

fun getMiddle(input: String): String {
    assert(input.isNotBlank())
    return if (input.length % 2 == 0) {
        input.substring(input.length / 2, (input.length / 2) + 1)
    } else {
        input[input.length / 2].toString()
    }
}