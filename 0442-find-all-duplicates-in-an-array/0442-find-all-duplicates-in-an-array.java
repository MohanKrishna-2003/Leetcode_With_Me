class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums); // 1 2 2 3 3 7 8
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            boolean flag = false;
            while(i<n-1 &&nums[i]==nums[i+1])
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