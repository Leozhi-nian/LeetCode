package com.leozhi.topic239;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 单调队列
 * 通过
 * 39ms
 */
public class Solution01 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicQueue window = new MonotonicQueue();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                // 先填满窗口的前 k - 1
                window.push(nums[i]);
            } else {
                // 窗口向前滑动，加入新数字
                window.push(nums[i]);
                // 记录当前窗口的最大值
                res.add(window.max());
                // 移除旧数字
                window.pop(nums[i - k + 1]);
            }
        }
        // 需要转成 int[] 数组再返回
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}

class MonotonicQueue {
    LinkedList<Integer> queue = new LinkedList<>();
    public void push(int n) {
        // 将小于 n 的元素全部删除
        while (!queue.isEmpty() && queue.getLast() < n) {
            queue.pollLast();
        }
        // 然后将 n 加入队尾
        queue.addLast(n);
    }

    public int max() {
        return queue.getFirst();
    }

    public void pop(int n) {
        if (n == queue.getFirst()) {
            queue.pollFirst();
        }
    }
}