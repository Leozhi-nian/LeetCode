package com.leozhi.topic143;

import java.util.HashMap;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 6ms
 */
public class Solution01 {
    public void reorderList(ListNode head) {
        ListNode left = head, right = head;
        int length = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();

        while (right != null && right.next != null) {
            length++;
            map.put(length, right);
            right = right.next;
        }

        if (map.size() % 2 != 0) {
            while (length - 1 > map.size() / 2) {
                right.next = left.next;
                left.next = right;
                left = right.next;
                right = map.get(length--);
                right.next = null;
            }
        } else {
            while (length > map.size() / 2) {
                right.next = left.next;
                left.next = right;
                left = right.next;
                right = map.get(length--);
                right.next = null;
            }
        }
    }
}
