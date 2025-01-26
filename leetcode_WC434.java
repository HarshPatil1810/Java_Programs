class Solution(object):
    def countPartitions(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total_sum=sum(nums)
        left=0
        right=0
        c=0

        for i in range(len(nums)-1):
            left+=nums[i]
            right=total_sum-left

            if(left%2 == right%2):
                c+=1

        return c
        ©leetcode
