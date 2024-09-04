package org.devmike

fun getFibs(n: Int): Int {
    val fibMap = mutableMapOf<Int, Int>()

    return getFib(n, fibMap)
}

fun getFib(
    n: Int,
    data: MutableMap<Int, Int>,
): Int {
    val value = data[n]
    if (value != null) return value
    val result =
        if (n == 1 || n == 2) {
            1
        } else {
            val sum = (getFib(n - 1, data) + getFib(n - 2, data))

            data[n] = sum
            sum
        }
    return result
}

fun main() {
    val time = System.currentTimeMillis()
    println("Starting fib")
    println(getFibs(10)) // Output: 55
    val end = System.currentTimeMillis() - time
    println("Finished fib in $end")
}
