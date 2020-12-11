package com.leozhi.topic649;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author leozhi
 * 循环队列
 * 官方题解
 * 通过
 * 13ms
 */
public class Solution02 {
    public String predictPartyVictory(String senate) {
        int len = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll(), direIndex = dire.peek() != null ? dire.poll() : 0;
            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + len);
            } else {
                dire.offer(direIndex + len);
            }
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }
}
