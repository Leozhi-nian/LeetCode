#include <vector>
using namespace std;

/**
 * 贪心算法
 * 通过
 * 48ms
 */
class Solution01 {
public:
    int candy(vector<int>& ratings) {
        int len = ratings.size();
        vector<int> candies(len, 1);
        for (int i = 1; i < len; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        int res = candies[len - 1];
        for (int i = len - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
            res += candies[i];
        }
        return res;
    }
};