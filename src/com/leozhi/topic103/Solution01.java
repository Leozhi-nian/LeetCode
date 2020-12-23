package com.leozhi.topic103;

import java.util.*;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 1ms
 */
public class Solution01 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            if (depth % 2 == 0) {
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}
