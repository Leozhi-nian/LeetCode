#include <algorithm>
#include <vector>
using namespace std;

/**
 * @author leozhi
 * 合并后排序
 * 通过
 * 4ms
 */
class Solution01 {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for (int i = m; i < m + n; ++i) {
            nums1[i] = nums2[i - m];
        }
        sort(nums1.begin(), nums1.end());
    }
};