package com.leozhi.topic278;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 16ms
 */
public class Solution01 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
