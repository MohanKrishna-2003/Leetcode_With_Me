class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        return getHCF(a, b);
    }
    public static int getHCF(int a, int b)
    {
        return b==0?a:getHCF(b, a%b);
    }
}