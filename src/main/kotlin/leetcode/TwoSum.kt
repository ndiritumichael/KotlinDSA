package org.devmike.leetcode

/**
1. Two Sum
Solved
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[ i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/
class TwoSumSolution {
    fun twoSum(
        nums: IntArray,
        target: Int,
    ): IntArray {
        val mapOfInt = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, number ->

            val key = target - number
            mapOfInt[number]?.let {
                return intArrayOf(it, index)
            }

            mapOfInt[key] = index
        }
        return intArrayOf()
    }
}

fun main() {
    val solution = TwoSumSolution()
    println(solution.twoSum(intArrayOf(2, 7, 11, 15), 9).toList()) // [0,1]
    println(solution.twoSum(intArrayOf(3, 2, 4), 6).toList()) // [1,2]
    println(solution.twoSum(intArrayOf(3, 3), 6).toList()) // [0,1]
}
