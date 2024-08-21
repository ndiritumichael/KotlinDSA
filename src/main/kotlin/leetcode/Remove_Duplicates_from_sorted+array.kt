@file:Suppress("ktlint:standard:filename")

package leetcode

class DupsSolution {
    // works on counting the number of non dups but doesnt modify the array
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size < 3) return nums.size
        var goodSize = 0
        val dupsMap = mutableMapOf<Int, Int>()
        for (i in nums) {
            if ((dupsMap[i] ?: 0) < 2) {
                goodSize++
                dupsMap[i] = (dupsMap[i] ?: 0) + 1
            }
        }

        return goodSize
    }

    fun improvedRemoveDuplicates(nums: IntArray): Int {
        if (nums.size < 3) return nums.size

        var slow = 2
        for (fast in 2 until nums.size) {
            if (nums[slow - 2] != nums[fast]) nums[slow++] = nums[fast]
        }
        return slow
    }
}

fun main() {
    println(
        DupsSolution().improvedRemoveDuplicates(
            intArrayOf(1, 1, 1, 2, 2, 3),
        ),
    )
}
