package com.leozhi.topic1232;

/**
 * @author leozhi
 * 1232. 缀点成线
 * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
 *
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.checkStraightLine(new int[][]{{0, 0}, {0, 1}, {0, -1}});
    }
}
