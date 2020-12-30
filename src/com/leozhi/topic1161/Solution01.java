package com.leozhi.topic1161;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 13ms
 */
public class Solution01 {
    public int maxLevelSum(TreeNode root) {
        int res = Integer.MIN_VALUE, sum = Integer.MIN_VALUE, depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int curSum = 0;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                curSum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (curSum > sum) {
                sum = curSum;
                res = depth;
            }
            ++depth;
        }
        return res;
    }
}
