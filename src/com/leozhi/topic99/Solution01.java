package com.leozhi.topic99;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author leozhi
 * 递归
 * 通过
 * 8ms
 */
public class Solution01 {
    private List<TreeNode> list;
    public void recoverTree(TreeNode root) {
        list = new ArrayList<>();
        traverse(root);
        List<TreeNode> tempList = new ArrayList<>(list);
        tempList.sort(Comparator.comparingInt(o -> o.val));
        List<Integer> wrongList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).val != tempList.get(i).val) {
                wrongList.add(i);
            }
        }
        change(list, wrongList.get(0), wrongList.get(1));
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        list.add(root);
        traverse(root.right);
    }

    private void change(List<TreeNode> list, int i, int j) {
        int temp = list.get(i).val;
        list.get(i).val = list.get(j).val;
        list.get(j).val = temp;
    }
}
