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

fun cheekyReverseString(name: String): String {
    val newString =
        CharArray(name.length) {
            name[it]
        }
    val length = name.length - 1
    val half = name.length / 2
    for (i in 0 until half) {
        val temp = name[length - i]
        val temp2 = name[i]
        newString[length - i] = temp2
        newString[i] = temp
    }

    return String(newString)
}
