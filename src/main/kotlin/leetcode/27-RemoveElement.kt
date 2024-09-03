@file:Suppress("ktlint:standard:filename")

package org.devmike.leetcode

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 *
 * int k = removeElement(nums, val); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 */

class RemoveElement {
    fun removeElement(
        nums: IntArray,
        `val`: Int,
    ): Int {
        var nonVal = 0
        for (i in nums.indices) {
            //  println("The i is $i")
            for (m in nums.indices) {
                val new = nums[m]
                // println("new $new $m $i")
                if (new == `val` && m < nums.size - 1) {
                    nums[m] = nums[m + 1]
                    nums[m + 1] = new
                }
// println(nums.toList().toString())
            }

            // if(nums[i] != `val`)  nonVal++
        }
        //  print("the value is "+nonVal)
        // print(nums.toList().toString())
        return nums.count {
            it != `val`
        }
    }
}
