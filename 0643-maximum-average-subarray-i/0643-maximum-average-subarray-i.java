class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length<k)
            return 0;
        if(nums.length==1)
            return (double)nums[0];
        double maxAvg = 0;
        int sum = 0;
        for(int i=0; i<k; i++)
        {
            sum += nums[i];
        }
        maxAvg = (double)sum/k;
        for(int i=k; i<nums.length; i++)
        {
            sum += nums[i] - nums[i-k];

            maxAvg = Math.max(maxAvg, (double)sum/k);
        }
        return maxAvg;
    }
}