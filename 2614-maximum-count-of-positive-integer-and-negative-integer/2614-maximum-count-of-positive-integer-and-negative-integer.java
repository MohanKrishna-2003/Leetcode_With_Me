class Solution {
    public int maximumCount(int[] nums) {
        int poscount=0, negcount=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
                poscount++;
            else if(nums[i]<0)
                negcount++;
        }
        int res = Math.max(poscount, negcount);
        return res;
    }
}