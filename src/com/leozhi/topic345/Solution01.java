package com.leozhi.topic345;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 6ms
 */
public class Solution01 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (set.contains(chars[left]) && set.contains(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }else if (!set.contains(s.charAt(left))) {
                left++;
            } else if (!set.contains(s.charAt(right))) {
                right--;
            }
        }
        return new String(chars);
    }
}
