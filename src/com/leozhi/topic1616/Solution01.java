package com.leozhi.topic1616;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public boolean checkPalindromeFormation(String a, String b) {
        String reverseA = new StringBuffer(a).reverse().toString();
        String reverseB = new StringBuffer(b).reverse().toString();
        if (reverseA.equals(a) || reverseB.equals(b)) {
            return true;
        }

        int index = 0, length = a.length();
        int left = 0, right = length - 1;
        while (index < length) {
            if (a.charAt(left) == b.charAt(right) || b.charAt(left) == a.charAt(right)) {
                if (right - left == 1) {
                    return true;
                }
                left++;
                right--;
            } else {
                if (b.charAt(left) == b.charAt(right) || a.charAt(left) == a.charAt(right)) {
                    if (right - left <= 1) {
                        return true;
                    }
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
            index++;
        }
        return false;
    }
}
