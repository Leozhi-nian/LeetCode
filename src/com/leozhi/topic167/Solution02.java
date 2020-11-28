package com.leozhi.topic167;

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 1ms
 */
public class Solution02 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
