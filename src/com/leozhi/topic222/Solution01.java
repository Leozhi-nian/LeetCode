package com.leozhi.topic222;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过 5ms
 */
public class Solution01 {
    public int countNodes(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                res++;
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
        }
        return res;
    }
}
