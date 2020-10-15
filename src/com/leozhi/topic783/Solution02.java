package com.leozhi.topic783;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 递归
 * 通过
 */
public class Solution02 {
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int ans = Integer.MAX_VALUE;
        int pre = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (i - pre < ans && pre != Integer.MAX_VALUE) {
                ans = i - pre;
            }
            pre = i;
        }
        return ans;
    }

    public void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
