package com.leozhi.topic380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 11ms
 */
public class RandomizedSet01 {
    ArrayList<Integer> list;
    Map<Integer, Integer> valToIndex;
    public RandomizedSet01() {
        list = new ArrayList<>();
        valToIndex = new HashMap<>();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        valToIndex.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        int index = valToIndex.get(val);
        valToIndex.put(list.get(list.size() - 1), index);
        int temp = list.get(index);
        list.set(index, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
        list.remove(list.size() - 1);
        valToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}
