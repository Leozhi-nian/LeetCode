package com.leozhi.topic106;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表 + 递归
 * 通过 2ms
 */
public class Solution01 {
    Map<Integer, Integer> inorderMap;
    Map<Integer, Integer> postorderMap;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        inorderMap = new HashMap<>(n);
        postorderMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            inorderMap.put(inorder[i], i);
        }
        for (int i = 0; i < n; i++) {
            postorderMap.put(postorder[i], i);
        }
        return recursive(0, postorder, 0, n - 1);
    }

    private TreeNode recursive(int inStart, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        int index = inorderMap.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        int leftLen = index - inStart;
        int newPostEnd = postStart + leftLen - 1;
        root.left = recursive(inStart, postorder, postStart, newPostEnd);
        root.right = recursive(index + 1, postorder, newPostEnd + 1, postEnd - 1);
        return root;
    }
}
