package com.leozhi.topic111;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 0ms
 */
public class Solution03 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return trace(queue, 0);
    }

    private int trace(Queue<TreeNode> queue, int level) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode cur = queue.poll();
            if (cur.left == null && cur.right == null) {
                return level + 1;
            }
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return trace(queue, level + 1);
    }
}
