package com.leozhi.topic198;

import com.leozhi.testcase.array.IntegerArray;

/**
 * @author leozhi
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = IntegerArray.getStrings(100, 0, 100, 0, 400);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
