package com.leozhi.topic21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leozhi
 * 集合
 * 通过
 * 3ms
 */
public class Solution01 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(list);
        ListNode res = null;
        for (int i = list.size() - 1; i >= 0; i--) {
            res = new ListNode(list.get(i), res);
        }
        return res;
    }
}
