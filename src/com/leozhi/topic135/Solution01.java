package com.leozhi.topic135;

import java.util.Arrays;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 3ms
 */
public class Solution01 {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candies = new int[len];
        // 将每个孩子要发的糖果数都初始化为 1
        Arrays.fill(candies, 1);
        // 从左往右遍历一遍，如果右边的孩子比左边的孩子评分高，则将右边的孩子糖果数更新为左边孩子的糖果数加一
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        int res = candies[len - 1];
        // 从右往左遍历一遍
        // 如果左边的孩子比右边的孩子评分高且左边的孩子糖果数不大于右边的孩子，将左边的孩子的糖果数更新为右边的孩子的糖果数加一
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
            res += candies[i];
        }
        return res;
    }
}
