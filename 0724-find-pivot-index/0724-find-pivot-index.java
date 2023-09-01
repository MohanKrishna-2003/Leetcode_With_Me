class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        if(n==1)
            return 0;
        else if(n>=2)
        {
            int temp[] = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++)
            {
                sum += nums[i];
                temp[i] = sum;
            }
            int leftSum = 0, rightSum = 0, total = sum;
            for(int i=0; i<n; i++)
            {
                leftSum = temp[i] - nums[i];
                rightSum = total - temp[i];
                if(leftSum==rightSum)
                    return i;
            }
        }
        return -1;
    }
}