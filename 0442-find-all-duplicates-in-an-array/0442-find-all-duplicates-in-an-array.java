class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            boolean flag = false;
            while(i<n-1 && nums[i]==nums[i+1])
            {
                flag = true;
                i++;
            }
            if(flag)
                list.add(nums[i]);
        }
        return list;
    }
}