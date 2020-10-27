package com.leozhi.topic144;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * Morris 遍历
 * 通过
 * 0ms
 */
public class Solution01 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return null;
        }
        TreeNode cur = root;
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {
                    mostRight.right = cur;
                    res.add(cur.val);
                    cur = cur.left;
                    continue;
                } else {
                    mostRight.right = null;
                }
            } else {
                res.add(cur.val);
            }
            cur = cur.right;
        }
        return res;
    }
}
