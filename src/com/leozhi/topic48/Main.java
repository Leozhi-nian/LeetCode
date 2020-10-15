package com.leozhi.topic48;

/**
 * @author leozhi
 * 48. 旋转图像
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        int[][] array = {{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        solution01.rotate(array);
    }
}
