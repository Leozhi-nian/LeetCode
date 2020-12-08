package com.leozhi.topic401;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 回溯
 * 通过
 * 13ms
 */
public class Solution01 {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        backtrack(res, 0, num, 0, 0);
        return res;
    }

    private void backtrack(List<String> res, int i, int num, int hour, int minute) {
        if (hour > 11 || minute > 59) {
            return;
        }
        // 亮灯数大于剩余的灯数
        if (num > 10 - i) {
            return;
        }
        // 触发结束条件
        if (num == 0) {
            String minStr = String.valueOf(minute);
            if (minute < 10) {
                minStr = "0" + minute;
            }
            res.add(hour + ":" + minStr);
            return;
        }
        // 不选当前位置
        backtrack(res, i + 1, num, hour, minute);
        // 选当前位置
        if (i < 4) {
            hour += (1 << i);
        } else {
            minute += (1 << (i - 4));
        }
        backtrack(res, i + 1, num - 1, hour, minute);
    }
}
