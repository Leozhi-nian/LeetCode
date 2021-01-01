#include <vector>
using namespace std;

/**
 * @author leozhi
 * 埃氏筛
 * 通过
 * 52ms
 */
class Solution04 {
public:
    int countPrimes(int n) {
        int res = 0;
        vector<int> isPrime( n + 1, 0);
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 0) {
                ++res;
                for (int j = i; j <= n; j += i) {
                    isPrime[j] = 1;
                }
            }
        }
        return res;
    }
};