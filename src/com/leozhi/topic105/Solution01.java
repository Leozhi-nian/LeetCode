package com.leozhi.topic105;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表 + 递归
 * 通过
 * 2ms
 */
public class Solution01 {
    Map<Integer, Integer> preorderMap, inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        preorderMap = new HashMap<>(preorder.length);
        inorderMap = new HashMap<>(inorder.length);
        // 将前序遍历中各元素值与其索引进行映射
        for (int i = 0; i < preorder.length; i++) {
            preorderMap.put(preorder[i], i);
        }
        // 将中序遍历中各元素值与其索引进行映射
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return recursive(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    /**
     * 递归
     * @param preorder 前序遍历数组
     * @param preStart 前序遍历起始位置
     * @param preEnd 前序遍历结束位置
     * @param inorder 中序遍历数组
     * @param inStart 中序遍历起始位置
     * @param inEnd 中序遍历结束位置
     * @return 根节点
     */
    TreeNode recursive(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        // 当前序遍历起始位置大于结束位置时，结束递归
        if (preStart > preEnd) {
            return null;
        }
        // 根节点的值
        int rootVal = preorder[preStart];
        // 根节点在中序遍历数组中的索引
        int index = inorderMap.get(rootVal);
        // 创建根节点
        TreeNode root = new TreeNode(rootVal);
        // 中序遍历中，根节点左侧全为左子树中的节点，右侧全为右子树中的节点
        // 左子树的长度
        int leftLen = index - inStart;
        // 左子树前序遍历的起始位置为前序遍历中根节点右侧第一个节点，即 preStart + 1
        // 左子树前序遍历的结束位置为根节点的位置加上左子树长度
        int leftPreEnd = preStart + leftLen;
        // 右子树前序遍历的开始位置为左子树前序遍历的结束位置加 1 ,即 leftPreEnd + 1
        // 右子树前序遍历的结束位置为当前前序遍历的结束位置
        // 左子树中序遍历的开始位置为当前中序遍历的开始位置
        // 左子树中序遍历的结束位置为根节点在中序遍历中的位置减 1 ，即 index - 1
        // 右子树中序遍历的开始位置为根节点在中序遍历中的位置加 1 ，即 index + 1
        // 右子树中序遍历的结束位置为当前中序遍历的结束位置
        root.left = recursive(preorder, preStart + 1, leftPreEnd, inorder, inStart, index - 1);
        root.right = recursive(preorder, leftPreEnd + 1, preEnd, inorder, index + 1, inEnd);
        return root;
    }
}
