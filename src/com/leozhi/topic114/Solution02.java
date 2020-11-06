package com.leozhi.topic114;

/**
 * @author leozhi
 * 寻找前驱节点
 * 通过
 * 0ms
 */
public class Solution02 {
    public void flatten(TreeNode root) {
        TreeNode cur = root, mostRight = null;
        while (cur != null) {
            if (cur.left != null) {
                // 寻找当前节点左子树中的最右的节点，即为前驱节点
                TreeNode nextRight = cur.left;
                while (nextRight.right != null) {
                    nextRight = nextRight.right;
                }
                mostRight = nextRight;
                mostRight.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
