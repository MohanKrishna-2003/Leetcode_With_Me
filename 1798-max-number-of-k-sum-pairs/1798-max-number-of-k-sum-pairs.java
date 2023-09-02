class Solution {
    public int maxOperations(int[] nums, int k) {
        int i=0, j=nums.length-1, pairs=0;
        Arrays.sort(nums); // 1 3 3 3 4
        while(i<j)
        {
            int total = nums[i] + nums[j];
            if(total==k)
            {
                pairs++;
                i++;
                j--;
            }
            else if(total>k)
                j--;
            else 
                i++;
        }
        return pairs;
    }
}