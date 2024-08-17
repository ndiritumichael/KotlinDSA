package org.devmike.leetcode

/**
 * LRU Cache
Implement the Least Recently Used (LRU) cache class LRUCache. The class should support the following operations

LRUCache(int capacity) Initialize the LRU cache of size capacity.
int get(int key) Return the value cooresponding to the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the introduction of the new pair causes the cache to exceed its capacity, remove the least recently used key.
A key is considered used if a get or a put operation is called on it.

Ensure that get and put each run in
O
(
1
)
O(1) average time complexity.

Example 1:

Input:
["LRUCache", [2], "put", [1, 10],  "get", [1], "put", [2, 20], "put", [3, 30], "get", [2], "get", [1]]

Output:
[null, null, 10, null, null, 20, -1]

Explanation:
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 10);  // cache: {1=10}
lRUCache.get(1);      // return 10
lRUCache.put(2, 20);  // cache: {1=10, 2=20}
lRUCache.put(3, 30);  // cache: {2=20, 3=30}, key=1 was evicted
lRUCache.get(2);      // returns 20
lRUCache.get(1);      // return -1 (not found)
Constraints:

1 <= capacity <= 100
0 <= key <= 1000
0 <= value <= 1000

        */

class LRUCache(capacity: Int) {
    private val cache: LinkedHashMap<Int,Int>

    init {
        require(capacity > 0) { "Capacity must be positive" }
        cache = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
            override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int,Int>?): Boolean {
                return size > capacity
            }
        }
    }

    fun get(key: Int): Int {
        return cache[key]?:-1
    }

    fun put(key: Int, value: Int) {
        cache[key] = value
    }

    fun size(): Int = cache.size

    fun clear() {
        cache.clear()
    }
}

fun main(){
    val cache = LRUCache(2)
    cache.put(1, 10)
    println(cache.get(1))
    cache.put(2, 20)
    cache.put(3, 30)
    println(cache.get(2))
    println(cache.get(1))
    cache.put(4, 40)
    println(cache.get(3))
    println(cache.get(4))
    println(cache.size())
    cache.clear()
    println(cache.size())
}


