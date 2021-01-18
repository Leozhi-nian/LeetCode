package com.leozhi.topic721;

import java.util.*;

/**
 * @author leozhi
 * 未通过
 */
public class Solution01 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int len = accounts.size();
        // 每个邮箱只属于一个用户，使用邮箱作为键
        Map<String, Set<String>> emails = new HashMap<>();
        Set<String> set = new HashSet<>();
        // 遍历用户列表
        for (List<String> account : accounts) {
            int size = account.size();
            // 遍历每个用户的邮箱
            for (int j = 1; j < size; j++) {
                // 判断拥有该邮箱的用户是否已存在
                if (set.contains(account.get(j))) {
                    if (!emails.containsKey(account.get(j))) {
                        continue;
                    }
                } else {
                    set.add(account.get(j));
                }
                Set<String> res = emails.get(account.get(j));
                if (res == null) {
                    res = new LinkedHashSet<>();
                }
                if (res.isEmpty()) {
                    res.add(account.get(0));
                }
                for (int k = j; k < size; k++) {
                    res.add(account.get(k));
                }
                emails.put(account.get(j), res);
                break;
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : emails.entrySet()) {
            List<String> list = new ArrayList<>(entry.getValue());
            String name = list.get(0);
            list.remove(0);
            Collections.sort(list);
            List<String> newList = new ArrayList<>();
            newList.add(name);
            newList.addAll(list);
            res.add(newList);
        }
        return res;
    }
}
