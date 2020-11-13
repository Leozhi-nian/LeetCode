package com.leozhi.topic429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 3ms
 */
public class Solution01 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                list.add(cur.val);
                List<Node> children = cur.children;
                queue.addAll(children);
            }
            res.add(list);
        }
        return res;
    }
}
