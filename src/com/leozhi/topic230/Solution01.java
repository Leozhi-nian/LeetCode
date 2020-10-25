package com.leozhi.topic230;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * Morris 遍历
 * 通过
 * 0ms
 */
public class Solution01 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> traversal = new ArrayList<>();
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
            traversal.add(cur.val);
            if (traversal.size() == k) {
                return cur.val;
            }
            cur = cur.right;
        }
        return 0;
    }
}
