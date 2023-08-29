class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
     int i=0, j=i+1;
     while(j<nums.length)
     {
         if(nums[i]==nums[j])
            return true;
        else 
        {
            i++;
            j++;
        }
     }
     return false;
    }
}