//Reverse a singly linked list. 
//
// Example: 
//
// 
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
// 
//
// Follow up: 
//
// A linked list can be reversed either iteratively or recursively. Could you im
//plement both? 
// Related Topics Linked List

package com.catttt.leetcode.editor.en;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();
        ListNode listNode = ListNode.createListNode(1, 2, 3, 4, 5);
        System.out.println(solution.reverseList(listNode));
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        // 迭代
//        public ListNode reverseList(ListNode head) {
//            ListNode cur = head;
//            ListNode pre = null;
//            while (cur != null) {
//                // 就是头插法
//                ListNode tmp = cur.next;
//                cur.next = pre;
//                pre = cur;
//                cur = tmp;
//            }
//            return pre;
//        }

        // 递归
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}