package com.leozhi.interview0807;

import java.util.*;

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 92ms
 */
public class Solution01 {
    List<String> res;
    int count = 0;
    public String[] permutation(String S) {
        int len = S.length();
        res = new ArrayList<>();
        char[] chars = S.toCharArray();
        LinkedList<Character> track = new LinkedList<>();
        backtrack(track, chars, 0);
        return res.toArray(new String[0]);
    }

    private void backtrack(LinkedList<Character> track, char[] chars, int index) {
        // 满足结束条件
        if (track.size() == chars.length) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character character : track) {
                stringBuilder.append(character);
            }
            res.add(stringBuilder.toString());
        }

        // 做选择
        for (int i = 0; i < chars.length; i++) {
            if (track.contains(chars[i])) {
                continue;
            }
            track.add(chars[i]);
            backtrack(track, chars, i + 1);
            track.removeLast();
        }
    }
}