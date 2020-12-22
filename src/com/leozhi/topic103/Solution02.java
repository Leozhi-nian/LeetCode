package com.leozhi.topic103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 深度优先搜索
 * 通过
 * 1ms
 */
public class Solution02 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        travel(root, res, 0);
        return res;
    }

    private void travel(TreeNode cur, List<List<Integer>> res, int level) {
        if (cur == null) {
            return;
        }
        if (res.size() <= level) {
            List<Integer> newLevel = new LinkedList<>();
            res.add(newLevel);
        }
        List<Integer> list = res.get(level);
        if (level % 2 == 0) {
            list.add(cur.val);
        } else {
            list.add(0, cur.val);
        }
        travel(cur.left, res, level + 1);
        travel(cur.right, res, level + 1);
    }
}
