package com.leozhi.topic2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 模拟
 * 通过
 * 3ms
 */
public class Solution01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> sumArray = new ArrayList<>();
        int carry = 0, sum;
        while (l1 != null || l2 != null) {
            sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            if (sum >= 10) {
                sum %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            sumArray.add(sum);
        }
        if (carry == 1) {
            sumArray.add(1);
        }
        ListNode head = new ListNode(sumArray.get(0)), tail = head;
        for (int i = 1; i < sumArray.size(); i++) {
            tail.next = new ListNode(sumArray.get(i));
            tail = tail.next;
        }
        return head;
    }
}
