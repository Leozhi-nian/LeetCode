package com.leozhi.topic145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 递归
 * 官方题解
 * 通过
 * 0ms
 */
public class Solution01 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        postOrder(root, array);
        return array;
    }

    public void postOrder(TreeNode root, List<Integer> array) {
        if (root == null) {
            return;
        }
        // 递归调用
        postOrder(root.left, array);
        postOrder(root.right, array);
        array.add(root.val);
    }
}
