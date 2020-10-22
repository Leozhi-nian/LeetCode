package com.leozhi.topic763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表 + 双指针
 * 通过
 * 18ms
 */
public class Solution01 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        int left = 0, right = 0;
        while (right < S.length()) {
            if (map.get(S.charAt(left)) > 1) {
                right = S.lastIndexOf(S.charAt(left));
                int i = left;
                while (i < right) {
                    i++;
                    int j = S.lastIndexOf(S.charAt(i));
                    if (right < j) {
                        right = j;
                    }
                }
            }
            right++;
            res.add(right - left);
            left = right;

        }
        return res;
    }
}
