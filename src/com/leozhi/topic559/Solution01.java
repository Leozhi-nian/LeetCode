package com.leozhi.topic559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 2ms
 */
public class Solution01 {
    public int maxDepth(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        int res = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            ++res;
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                assert node != null;
                List<Node> children = node.children;
                queue.addAll(children);
            }
        }
        return res;
    }
}
