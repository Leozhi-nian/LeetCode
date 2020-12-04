package com.leozhi.topic659;

/**
 * @author leozhi
 * 659. 分割数组为连续子序列
 * 给你一个按升序排序的整数数组 num（可能包含重复数字），请你将它们分割成一个或多个子序列，其中每个子序列都由连续整数组成且长度至少为 3 。
 *
 * 如果可以完成上述分割，则返回 true ；否则，返回 false 。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.isPossible(new int[]{1,2,3,3,4,4,5,5});
    }
}
