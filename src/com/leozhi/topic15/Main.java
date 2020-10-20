package com.leozhi.topic15;

/**
 * @author leozhi
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class Main {
    public static void main(String[] args) {
        Solution02 solution02 = new Solution02();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution02.threeSum(nums));
    }
}
