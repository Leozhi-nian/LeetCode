package com.leozhi.contest.double42.topic1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 */
public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length, index = 0, count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.offer(student);
        }
        while (index < len) {
            if (!queue.isEmpty() && queue.peek() != sandwiches[index]) {
                ++count;
                if (count == queue.size()) {
                    break;
                }
            } else {
                count = 0;
            }
            while (!queue.isEmpty() && queue.peek() == sandwiches[index]) {
                queue.poll();
                ++index;
            }
            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }
        return queue.size();
    }

}
