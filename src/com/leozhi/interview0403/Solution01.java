package com.leozhi.interview0403;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 1ms
 */
public class Solution01 {
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> list = new ArrayList<>();
        if (tree == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int len = queue.size();
            ListNode listNode = new ListNode(queue.peek().val);
            ListNode temp = listNode;
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                if (i != 0) {
                    temp.next = new ListNode(node.val);
                }
                temp = temp.next;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(listNode);
        }
        ListNode[] res = new ListNode[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
