package com.leozhi.topic143;

import java.util.HashMap;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 7ms
 */
public class Solution02 {
    public void reorderList(ListNode head) {
        ListNode left = head, right = head;
        int length = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        while (right != null && right.next != null) {
            map.put(++length, right);
            right = right.next;
        }
        while (length > (map.size() + 1) / 2) {
            right.next = left.next;
            left.next = right;
            left = right.next;
            right = map.get(length--);
            right.next = null;
        }
    }
}
