package com.leozhi.topic94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * Morris 遍历
 * 通过
 */
public class Solution01 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        TreeNode cur = root;
        TreeNode mostRight;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    mostRight.right = null;
                }
            }
            ans.add(cur.val);
            cur = cur.right;
        }
        return ans;
    }
}
