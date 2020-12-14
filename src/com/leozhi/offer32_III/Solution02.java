package com.leozhi.offer32_III;

import java.util.*;

/**
 * @author leozhi
 * 广度优先搜索 + 双端队列
 * 通过
 * 1ms
 */
public class Solution02 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            // LinkedList 可从两端插入
            LinkedList<Integer> list = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                if (res.size() % 2 == 0) {
                    list.addLast(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
