package com.leozhi.topic5516;

import java.util.*;

/**
 * @author leozhi
 */
public class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < keyName.length; i++) {
            if (map.containsKey(keyName[i])) {
                List<String> time = map.get(keyName[i]);
                time.add(keyTime[i]);
                map.put(keyName[i], time);
            } else {
                List<String> time = new ArrayList<>();
                time.add(keyTime[i]);
                map.put(keyName[i], time);
            }

        }
        for (String name : map.keySet()) {
            int[] times = new int[map.get(name).size()];
            List<String> t = map.get(name);
            Collections.sort(t);
            for (int i = 0; i < t.size(); i++) {
                String time = t.get(i);
                times[i] = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
            }
            for (int i = 2; i < times.length; i++) {
                if (times[i] - times[i - 2] <= 60) {
                    result.add(name);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
