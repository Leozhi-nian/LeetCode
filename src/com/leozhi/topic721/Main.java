package com.leozhi.topic721;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 721. 账户合并
 * 给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该账户的邮箱地址。
 *
 * 现在，我们想合并这些账户。如果两个账户都有一些共同的邮箱地址，则两个账户必定属于同一个人。请注意，即使两个账户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的账户，但其所有账户都具有相同的名称。
 *
 * 合并账户后，按以下格式返回账户：每个账户的第一个元素是名称，其余元素是按字符 ASCII 顺序排列的邮箱地址。账户本身可以以任意顺序返回。
 */
public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"John", "johnsmith@mail.com", "john00@mail.com"},
                {"John", "johnnybravo@mail.com"},
                {"John", "johnsmith@mail.com", "john_newyork@mail.com"},
                {"Mary", "mary@mail.com"}};
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            List<String> list1 = new ArrayList<>();
            for (int i1 = 0; i1 < array1[i].length; i1++) {
                list1.add(array1[i][i1]);
            }
            list.add(list1);
        }
        Solution01 solution = new Solution01();
        solution.accountsMerge(list);
    }
}
