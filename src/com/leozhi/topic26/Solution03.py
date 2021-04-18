"""
快慢指针
通过
16ms
"""
if __name__ == '__main__':
    class Solution(object):
        def removeDuplicates(self, nums):
            """
            :type nums: List[int]
            :rtype: int
            """
            if len(nums) == 0:
                return 0
            fast = 0
            slow = 0
            while fast < len(nums):
                if nums[fast] != nums[slow]:
                    slow = slow + 1
                    nums[slow] = nums[fast]
                fast = fast + 1
            return slow + 1
