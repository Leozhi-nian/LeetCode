package com.leozhi.topic925;

/**
 * @author leozhi
 * 925. 长按键入
 * 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
 *
 * 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
 */
public class Main {
    public static void main(String[] args) {
        String name = "saeed";
        String typed = "ssaaedd";
        Solution01 solution01 = new Solution01();
        solution01.isLongPressedName(name, typed);
    }
}
