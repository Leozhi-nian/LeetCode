package com.leozhi.topic140;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leozhi
 * 未通过
 */
public class Solution01 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>(wordDict);
        Set<String> firstWord = new HashSet<>();
        int left = 0, right = 1;
        StringBuilder stringBuilder = new StringBuilder();
        boolean end = false;
        while (!end) {
            left = 0;
            right = 1;
            stringBuilder.delete(0, stringBuilder.length());
            while (left < s.length()) {
                String s1 = s.substring(left, right);
                if (set.contains(s1)) {
                    if (!firstWord.contains(s1)) {
                        stringBuilder.append(s1).append(" ");
                    } else {
                        right++;
                        continue;
                    }
                    if (left == 0) {
                        firstWord.add(s1);
                    }
                } else {
                    if (right < s.length()) {
                        right++;
                        continue;
                    }
                    if (left == 0 && right == s.length()) {
                        end = true;
                    }
                }
                left = right;
                right = left + 1;
            }
            if (!end) {
                String s2 = stringBuilder.toString();
                res.add(s2.substring(0, s2.length() - 1));
            }
        }
        return res;
    }
}
