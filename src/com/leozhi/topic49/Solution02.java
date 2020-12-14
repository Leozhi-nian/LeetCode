package com.leozhi.topic49;

import java.util.*;

/**
 * @author leozhi
 * 哈希表 + 排序
 * 官方题解
 * 通过
 * 7ms
 */
public class Solution02 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        // 方法一
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
        // 方法二
        // return new ArrayList<>(map.values());
    }
}
