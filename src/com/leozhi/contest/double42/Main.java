package com.leozhi.contest.double42;

import com.leozhi.contest.double42.topic1.Solution;

/**
 * @author leozhi
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1});
        // solution.averageWaitingTime(new int[][]{{5,2},{5,4},{10,3},{20,1}});
    }
}
