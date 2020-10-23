package com.leozhi.topic234;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 集合 + 快慢指针
 * 通过
 * 4ms
 */
public class Solution01 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }
        int left = 0, right = array.size() - 1;
        while (left < right) {
            if (!array.get(left).equals(array.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
