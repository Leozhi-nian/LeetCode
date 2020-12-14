package com.leozhi.topic49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 63ms
 */
public class Solution01 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> table = new HashMap<>();
        for (String str : strs) {
            Map<Character, Integer> map = new HashMap<>();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            List<String> list;
            if (table.containsKey(map)) {
                list = table.get(map);
            } else {
                list = new ArrayList<>();
            }
            list.add(str);
            table.put(map, list);
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry entry : table.entrySet()) {
            res.add((List<String>) entry.getValue());
        }
        return res;
    }
}
