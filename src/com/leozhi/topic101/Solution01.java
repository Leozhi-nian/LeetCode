package com.leozhi.topic101;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution01 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recursive(root.left, root.right);
    }

    /**
     * 判断两个树是否相同镜像对称
     */
    private boolean recursive(TreeNode leftTree, TreeNode rightTree) {
        // 左子树和右子树皆为空时镜像对称；一个不为空，一个为空时不对称
        if (leftTree == null && rightTree == null) {
            return true;
        } else if (leftTree == null || rightTree == null) {
            return false;
        }
        // 判断左子树的左子树和右子树的右子树是否镜像对称
        boolean b1 = recursive(leftTree.left, rightTree.right);
        // 判断左子树的右子树和右子树的左子树是否镜像对称
        boolean b2 = recursive(leftTree.right, rightTree.left);
        // 判断当前两个节点的值是否相同
        boolean b3 = leftTree.val == rightTree.val;
        return b1 && b2 && b3;
    }
}
