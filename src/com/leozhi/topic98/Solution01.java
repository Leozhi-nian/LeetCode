package com.leozhi.topic98;

import java.util.Stack;

/**
 * @author leozhi
 * 中序遍历 + 栈
 * 通过
 * 1ms
 */
public class Solution01 {
    Stack<Integer> stack = new Stack<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);
        boolean cur = true;
        if (stack.size() != 0) {
            cur = root.val > stack.peek();
        }
        stack.push(root.val);
        boolean right = isValidBST(root.right);
        return left && cur && right;
    }
}
