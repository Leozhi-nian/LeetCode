package com.leozhi.topic1002;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    private final int N = 26;
    public List<String> commonChars(String[] A) {
        int[] hash = new int[N];
        int[] temp = new int[N];
        Arrays.fill(hash, 100);
        for (String s : A) {
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < N; j++) {
                hash[j] = Math.min(hash[j], temp[j]);
                temp[j] = 0;
            }
        }
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            while (hash[i] > 0) {
                ans.add(String.valueOf((char)(i + 'a')));
                hash[i]--;
            }
        }
        return ans;
    }
}
