class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null || nums.length<=1 || k<=0)
            return false;
        int ind=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!set.add(nums[i]))
                return true;

            set.add(nums[i]);
            if(set.size()>=k+1)
                set.remove(nums[ind++]);
        }
        return false;
    }
}