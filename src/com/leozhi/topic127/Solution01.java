package com.leozhi.topic127;

import java.util.*;

/**
 * @author leozhi
 */
public class Solution01 {
    Map<String, Integer> memo = new HashMap<>();;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        for (String s : wordList) {
            int count = 0;
            for (int i = 0; i < beginWord.length(); i++) {
                if (s.charAt(i) != beginWord.charAt(i)) {
                    count++;
                }
            }
            memo.put(s, count);
        }
        return ladder(beginWord, endWord, wordList);
    }

    private int ladder(String beginWord, String endWord, List<String> wordList) {
        if (!memo.containsKey(endWord)) {
            return 0;
        }else if (memo.get(endWord) == 1) {
            return 1;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < wordList.size(); i++) {
            int count = 0;
            for (int j = 0; j < endWord.length(); j++) {
                String s = wordList.get(i);
                if (wordList.get(i).charAt(j) != endWord.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                int temp = ladder(beginWord, wordList.get(i), wordList);
                if (temp != 0) {
                    res = Math.min(res, temp + 1);
                    return res;
                }
            }
        }
        return res;
    }
}
