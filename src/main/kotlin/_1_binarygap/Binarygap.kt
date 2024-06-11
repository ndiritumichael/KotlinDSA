package org.devmike.binarygap

/**
 * problem statement https://app.codility.com/c/run/trainingBM76B6-7V7/
 */

fun solution(N: Int = 100): Int {

    val binaryString = Integer.toBinaryString(N)

    var foundFirst1: Boolean = false
    var longestGap = 0
    var currentgap = 0


    for (i in binaryString) {
        if (i == '0' && foundFirst1) {
            currentgap++
        } else if (i == '1') {
            foundFirst1 = true
            if (currentgap > longestGap) {
                longestGap = currentgap
            }
            currentgap = 0

        }
    }



    return longestGap

}