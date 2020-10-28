package com.leozhi.topic9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 集合 + 双指针
 * 通过
 * 12ms
 */
public class Solution02 {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (x / 10 > 0) {
            list.add(x % 10);
            x = x / 10;
        }
        list.add(x);
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
