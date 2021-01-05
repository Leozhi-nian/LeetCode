package com.leozhi.topic1379;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 11ms
 */
public class Solution01 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(cloned);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                if (node.val == target.val) {
                    return node;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return null;
    }
}
