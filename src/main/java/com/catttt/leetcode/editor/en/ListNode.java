package com.catttt.leetcode.editor.en;

/**
 * 单链表数据结构
 *
 * @author: catttt612
 * @date: 2020/5/6 2:22 下午
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(int... vals) {
        ListNode head = new ListNode(vals[0]);
        insertNode(head, 1, vals);
        return head;
    }

    private static void insertNode(ListNode node, int i, int[] vals) {
        if (i == vals.length) return;
        ListNode newNode = new ListNode(vals[i]);
        node.next = newNode;
        insertNode(newNode, i + 1, vals);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        ListNode head = this;
        while (head != null) {
            stringBuilder.append(head.val);
            stringBuilder.append(",");
            head = head.next;
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
