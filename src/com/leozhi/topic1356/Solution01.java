package com.leozhi.topic1356;

/**
 * @author leozhi
 * 暴力
 * 通过
 * 13ms
 */
public class Solution01 {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0, num = arr[i];
            while (num > 0) {
                if (num % 2 == 1) {
                    count++;
                }
                num >>= 1;
            }
            counts[i] = count;
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (counts[j] < counts[j - 1] || (counts[j] == counts[j - 1] && arr[j] < arr[j - 1])) {
                    swip(arr, j, j - 1);
                    swip(counts, j, j - 1);
                }
            }
        }
        return arr;
    }

    private void swip(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
