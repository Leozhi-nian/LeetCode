package com.leozhi.topic1111;

/**
 * @author leozhi
 * 找规律
 * 通过
 * 2ms
 * 括号序列   ( ( ) ( ( ) ) ( ) )
 * 下标编号   0 1 2 3 4 5 6 7 8 9
 * 嵌套深度   1 2 - 2 3 - - 2 - -
 * 嵌套深度   - - 2 - - 3 2 - 2 1
 *
 * 左括号 ( 的下标编号与嵌套深度的奇偶性相反，也就是说：
 * 下标编号为奇数的 (，其嵌套深度为偶数，分配给 B；
 * 下标编号为偶数的 (，其嵌套深度为奇数，分配给 A。
 *
 * 右括号 ) 的下标编号与嵌套深度的奇偶性相同，也就是说：
 * 下标编号为奇数的 )，其嵌套深度为奇数，分配给 A；
 * 下标编号为偶数的 )，其嵌套深度为偶数，分配给 B。
 */
public class Solution01 {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        for (int i = 0; i < seq.length(); i++) {
            if (i % 2 == 0) {
                // 下标编号为偶数
                if (seq.charAt(i) == ')') {
                    res[i] = 1;
                }
            } else {
                // 下标编号为奇数
                if (seq.charAt(i) == '(') {
                    res[i] = 1;
                }
            }
        }
        return res;
    }
}
