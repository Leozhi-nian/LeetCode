package com.leozhi.topic763;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 贪心算法 + 双指针
 * 官方题解
 * 3ms
 */
public class Solution02 {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int length = S.length();
        // 记录 S 中每种字符最后出现的位置
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }
}