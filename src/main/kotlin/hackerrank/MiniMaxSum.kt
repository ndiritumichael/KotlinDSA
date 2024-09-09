package org.devmike.hackerrank

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * Example
 * arr = [1,3,5,7,9]
 * The minimum sum is  and the maximum sum is . The function prints
 *
 * 16 24
 * Function Description
 *Complete the miniMaxSum function in the editor below.
 *
 * miniMaxSum has the following parameter(s):
 *
 * arr: an array of  integers
 *
 */
fun miniMaxSum(arr: Array<Int>) {
    arr.sort()
    println(arr.toList())
    var max = 0L
    var min = 0L
    for (i in 0..arr.size - 2) {
        min += arr[i]
    }

    for (i in 1..<arr.size) {
        max += arr[i]
    }

    print("$min $max")
}
