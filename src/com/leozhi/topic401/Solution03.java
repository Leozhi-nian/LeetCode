package com.leozhi.topic401;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 回溯
 * 通过
 * 7ms
 */
public class Solution03 {
    List<String> res;
    public List<String> readBinaryWatch(int num) {
        res = new ArrayList<>();
        if (num == 0) {
            res.add("0:00");
            return res;
        }
        String trace = "";
        backtrace(trace, num);
        return res;
    }

    private void backtrace(String trace, int num) {
        if (trace.length() > 10) {
            return;
        }
        if (num == 0) {
            int hour, minute;
            if (trace.length() <= 4) {
                hour = Integer.parseInt(trace, 2) << 4 - trace.length();
                minute = 0;
            } else {
                hour = Integer.parseInt(trace.substring(0, 4), 2);
                minute = Integer.parseInt(trace.substring(4), 2) << 10 - trace.length();
            }
            if (hour > 11 || minute > 59) {
                return;
            }
            String time;
            if (minute < 10) {
                time = hour + ":0" + minute;
            } else {
                time = hour + ":" + minute;
            }
            res.add(time);
            return;
        }
        // 选择 1
        trace += "1";
        backtrace(trace, --num);
        trace = trace.substring(0, trace.length() - 1);
        ++num;
        // 选择 0
        trace += "0";
        backtrace(trace, num);
    }
}
