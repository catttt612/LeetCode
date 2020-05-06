//Given a linked list, determine if it has a cycle in it. 
//
// To represent a cycle in the given linked list, we use an integer pos which re
//presents the position (0-indexed) in the linked list where tail connects to. If 
//pos is -1, then there is no cycle in the linked list. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the s
//econd node.
// 
// 
//
// 
// 
//
// Example 2: 
//
// 
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the f
//irst node.
// 
// 
//
// 
// 
//
// Example 3: 
//
// 
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.
// 
// 
//
// 
//
// 
//
// Follow up: 
//
// Can you solve it using O(1) (i.e. constant) memory? 
// Related Topics Linked List Two Pointers

package com.catttt.leetcode.editor.en;

/**
 * 141.环形链表
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(solution.hasCycle(node1));
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode fast = head.next;
            ListNode slow = head;
            while (fast != slow) {
                if (fast == null || fast.next == null) {
                    return false;
                }
                fast = fast.next.next;
                slow = slow.next;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}