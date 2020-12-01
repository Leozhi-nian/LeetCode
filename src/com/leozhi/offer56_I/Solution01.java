package com.leozhi.offer56_I;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 1ms
 */
public class Solution01 {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int xor = 0;
        // 先将所有元素进行按位异或
        for (int num : nums) {
            xor ^= num;
        }
        // 获取异或结果的二进制表示中任意的 1 ，这里获取的是最低位的 1
        // 原因：由于异或结果中的 1 是由于两个数字对应位上的数字不同造成的，则可用位与运算将两个数分到不同的组中
        int low = xor & -xor;
        for (int num : nums) {
            // 通过位与运算将两个结果分开，同时由于其他数都有两个，所以最终 res[0] 必为两个结果中的一个数
            if ((low & num) == 0) {
                res[0] ^= num;
            }
        }
        // 利用自反性算出另一个结果
        res[1] = xor ^ res[0];
        return res;
    }
}
