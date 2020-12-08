package com.leozhi.topic401;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 计数
 * 通过
 * 20ms
 */
public class Solution02 {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == num) {
                    res.add(String.format("%d:%02d", hour, minute));
                }
            }
        }
        return res;
    }
}
