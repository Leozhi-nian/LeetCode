/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 28ms
 */
class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        if (intervals.empty()) {
            return 0;
        }
        sort(intervals.begin(), intervals.end(), [](const auto& u, const auto& v) {
           return u[1] < v[1];
        });
        int len = intervals.size(), res = 0;
        vector<int> pre = intervals[0];
        for (int i = 1; i < len; ++i) {
            if (intervals[i][0] < pre[1]) {
                ++res;
            } else {
                pre = intervals[i];
            }
        }
        return res;
    }
};