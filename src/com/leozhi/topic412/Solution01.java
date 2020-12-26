package com.leozhi.topic412;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 模拟
 * 通过
 * 1ms
 */
public class Solution01 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 15 == 0) {
                    res.add("FizzBuzz");
                    continue;
                }
                if (i % 3 == 0) {
                    res.add("Fizz");
                } else {
                    res.add("Buzz");
                }
                continue;
            }
            res.add(String.valueOf(i));
        }
        return res;
    }
}
