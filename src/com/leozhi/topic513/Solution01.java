package com.leozhi.topic513;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 2ms
 */
public class Solution01 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    res = node.val;
                }
                assert node != null;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return res;
    }
}
