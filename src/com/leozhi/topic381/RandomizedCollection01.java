package com.leozhi.topic381;

import java.util.HashMap;
import java.util.List;

/**
 * @author leozhi
 */
public class RandomizedCollection01 {
    List<Integer> nums;
    HashMap<Integer, Integer> valToIndex;
    HashMap<Integer, Integer> valToSize;
    public RandomizedCollection01() {

    }

    public boolean insert(int val) {
        if (valToSize.containsKey(val)) {
            valToSize.put(val, valToSize.get(val) + 1);
            return false;
        }
        valToIndex.put(val, nums.size());
        valToSize.put(val, 1);
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        int index = valToIndex.get(val);
        valToIndex.put(nums.get(nums.size() - 1), index);
        int temp = nums.get(index);
        nums.set(index, nums.get(nums.size() - 1));
        nums.set(nums.size() - 1, temp);
        return false;
    }

    public int getRandom() {
        return 0;
    }
}
