package org.devmike.codility._2_cyclicrotation


/**
 *
 * [Problem link](https://app.codility.com/programmers/lessons/2-arrays/)
 *
 *
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Write a function:
 *
 * fun solution(A: IntArray, K: Int): IntArray
 *
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given
 *
 *     A = [3, 8, 9, 7, 6]
 *     K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 *
 *     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 *     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 *     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 *
 *     A = [0, 0, 0]
 *     K = 1
 * the function should return [0, 0, 0]
 *
 * Given
 *
 *     A = [1, 2, 3, 4]
 *     K = 4
 * the function should return [1, 2, 3, 4]
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 *

 */

fun cyclicRotation(A: IntArray, K: Int): IntArray {


    if (A.isEmpty() || K == 0) return A
    val n = A.size

    // use modulus to avoid unnecesary rotations
    val actualRotations = K % n

    if (actualRotations == 0) return A


    reverse(A, 0, n - actualRotations - 1)
    reverse(A, n - actualRotations, n - 1)
    reverse(A, 0, n - 1)

    return A
}


private fun reverse(A: IntArray, start: Int, end: Int) {
    var left = start
    var right = end
    while (left < right) {
        val temp = A[left]
        A[left] = A[right]
        A[right] = temp
        left++
        right--
    }
}