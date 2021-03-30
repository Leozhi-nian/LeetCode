/**
 * @author leozhi
 * 位运算
 * 通过
 * 44ms
 */

public class Solution02 {
    public int HammingWeight(uint n) {
        n -= (n >> 1) & 0x55555555;
        n = (n & 0x33333333) + ((n >> 2) & 0x33333333);
        n = (n + (n >> 4)) & 0x0f0f0f0f;
        n += n >> 8;
        n += n >> 16;
        return (int) (n & 0x3f);
    }
}