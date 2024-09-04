package org.devmike

fun reverseString(name: String): String {
    val newString =
        CharArray(name.length)
    val length = name.length - 1

    for (i in 0..length) {
        newString[i] = name[length - i]
    }

    return String(newString)
}
