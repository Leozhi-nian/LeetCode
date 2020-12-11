package com.leozhi.topic649;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 8ms
 */
public class Solution01 {
    public String predictPartyVictory(String senate) {
        int rCount = 0, dCount = 0;
        int rWillBeBanned = 0, dWillBeBanned = 0, rBanned = 0, dBanned = 0, len = senate.length();
        // 数组用来记录议员是否被禁止行使权利
        int[] disable = new int[len];
        // 计算 R 和 D 分别出现了多少次
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                ++rCount;
            } else {
                ++dCount;
            }
        }
        // 当全为 D 或全为 R 时直接返回
        if (rCount == 0 || dCount == 0) {
            return rCount == 0 ? "Dire" : "Radiant";
        }
        for (int i = 0; i < len; i++) {
            // 当字符为 R 且未被禁止时
            if (senate.charAt(i) == 'R' && disable[i] == 0) {
                // 当 R 将被禁止的议员为 0 时
                if (rWillBeBanned == 0) {
                    // 禁止该议员之后最近的未被禁止的 D 议员
                    ++dWillBeBanned;
                    // D 议员被禁止的议员总数增加
                    ++dBanned;
                } else {
                    // 禁止该 R 议员
                    disable[i] = 1;
                    // 将被禁止的 R 议员数量减少
                    --rWillBeBanned;
                }
            } else if (senate.charAt(i) == 'D' && disable[i] == 0){
                // 当 D 将被禁止的议员为 0 时
                if (dWillBeBanned == 0) {
                    // 禁止该议员之后最近的未被禁止的 R 议员
                    ++rWillBeBanned;
                    // D 议员被禁止的议员总数增加
                    ++rBanned;
                } else {
                    // 禁止该 D 议员
                    disable[i] = 1;
                    // 将被禁止的 D 议员数量减少
                    --dWillBeBanned;
                }
            }
            // 判断是否有一方的议员被全部禁止
            if (rCount == rBanned || dCount == dBanned) {
                if (dCount == dBanned) {
                    return "Radiant";
                } else {
                    return "Dire";
                }
            }
            // 到字符串末尾时从头开始
            if (i + 1 == len) {
                i = -1;
            }
        }
        return "";
    }
}
