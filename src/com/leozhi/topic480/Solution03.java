package com.leozhi.topic480;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 31ms
 */
public class Solution03 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length - k + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(binarySearch(list, nums[i]), nums[i]);
        }
        res[0] = getMedian(list, k);
        for (int i = k; i < nums.length; i++) {
            list.remove(binarySearch(list, nums[i - k]));
            list.add(binarySearch(list, nums[i]), nums[i]);
            res[i - k + 1] = getMedian(list, k);
        }
        return res;
    }

    private double getMedian(ArrayList<Integer> list, int k) {
        return (Double.valueOf(list.get((k - 1) / 2)) + Double.valueOf(list.get(k / 2))) / 2;
    }

    private int binarySearch(List<Integer> data, int target) {
        int left = 0, right = data.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = data.get(mid);
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}