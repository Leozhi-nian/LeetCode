package com.leozhi.testcase.array;

import java.util.Random;

/**
 * @author leozhi
 */
public class IntegerArray {
    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[] createArray(int size, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * max);
        }
        return array;
    }

    public static int[] createArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(max) % (max - min + 1) + min;
        }
        return array;
    }

    public static String getArrayString(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String[] getStrings(int size, int minLength, int maxLength, int arrayMin, int arrayMax) {
        String[] strings = new String[size];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = getArrayString(createArray(i, arrayMin, arrayMax));
        }
        return strings;
    }
}
