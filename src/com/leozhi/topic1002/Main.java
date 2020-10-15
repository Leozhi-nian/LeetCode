package com.leozhi.topic1002;

/**
 * @author leozhi
 * 1002. 查找常用字符
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = {"bella","label","roller"};
        Solution01 solution01 = new Solution01();
        solution01.commonChars(strings);
    }
}
