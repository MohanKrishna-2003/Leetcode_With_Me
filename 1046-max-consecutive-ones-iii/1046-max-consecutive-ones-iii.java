class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxCount = 0;
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                zeroCount++;
            
            while(zeroCount>k)
            {
                if(nums[left]==0)
                    zeroCount--;
                left++;
            }
            maxCount = Math.max(maxCount, i-left+1);
        }
        return maxCount;
    }
}