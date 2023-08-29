class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer> hs = new HashSet();
        int longest = 1;
        for(int num : nums)
            hs.add(num); // 100 4 200 1 3 2 
        
        for(Integer x : hs)
        {
            if(hs.contains(x-1)==false)
            {
                int cnt = 1;
                int num = x;
                while(hs.contains(num+1)==true)
                {
                    num++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
            
        }
        return longest;

    }
}