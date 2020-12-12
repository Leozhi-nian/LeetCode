package com.leozhi.topic206;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 集合
 * 通过
 * 1ms
 */
public class Solution01 {
    public ListNode reverseList(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            nums.add(node.val);
            node = node.next;
        }
        node = head;
        for (int i = nums.size() - 1; i >= 0; i--) {
            node.val = nums.get(i);
            node = node.next;
        }
        return head;
    }
}
