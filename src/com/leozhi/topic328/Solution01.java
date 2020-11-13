package com.leozhi.topic328;

/**
 * @author leozhi
 * 分离节点后合并
 * 通过
 * 0ms
 */
public class Solution01 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head, even = odd.next;
        //  创建哑节点用于连接偶数节点，tail 指向该链表尾节点
        ListNode dummy = new ListNode(0), tail = dummy;
        while (even != null) {
            // 将偶数节点添加至偶数链表尾部
            tail.next = even;
            // 更新尾节点
            tail = tail.next;
            // 原链表中移除偶数节点
            odd.next = even.next;
            // 判断是否到达原链表尾部
            if (odd.next != null) {
                odd = odd.next;
            } else {
                break;
            }
            even = odd.next;
        }
        // 尾节点的后面可能有奇数的后继节点，应将其置空
        tail.next = null;
        // 将偶数链表添加至原链表
        odd.next = dummy.next;
        return head;
    }
}
