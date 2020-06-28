//Design a class to find the kth largest element in a stream. Note that it is th
//e kth largest element in the sorted order, not the kth distinct element. 
//
// Your KthLargest class will have a constructor which accepts an integer k and 
//an integer array nums, which contains initial elements from the stream. For each
// call to the method KthLargest.add, return the element representing the kth larg
//est element in the stream. 
//
// Example: 
//
// 
//int k = 3;
//int[] arr = [4,5,8,2];
//KthLargest kthLargest = new KthLargest(3, arr);
//kthLargest.add(3);   // returns 4
//kthLargest.add(5);   // returns 5
//kthLargest.add(10);  // returns 5
//kthLargest.add(9);   // returns 8
//kthLargest.add(4);   // returns 8
// 
//
// Note: 
//You may assume that nums' length ≥ k-1 and k ≥ 1. 
// Related Topics Heap


package com.catttt.leetcode.editor.en;

import java.util.PriorityQueue;

public class KthLargestElementInAStream extends Thread {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargestElementInAStream().new KthLargest(3, nums);
        kthLargest.add(3);
        kthLargest.add(5);
        kthLargest.add(10);
        kthLargest.add(9);
        kthLargest.add(4);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class KthLargest {
        private PriorityQueue<Integer> heap;
        private int k;

        public KthLargest(int k, int[] nums) {
            this.heap = new PriorityQueue<>(k);
            this.k = k;
            for (int num : nums) {
                heap.offer(num);
                if (heap.size() > k) heap.poll();
            }
        }

        public int add(int val) {
            heap.offer(val);
            if (heap.size() > k) heap.poll();
            return heap.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}