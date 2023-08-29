class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(checkEven(nums[i])==true)
                count++;
        }
        return count;
    }
    public static boolean checkEven(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        return (count%2==0);
    }

}