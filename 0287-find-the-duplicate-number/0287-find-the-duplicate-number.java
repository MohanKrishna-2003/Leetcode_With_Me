class Solution {
    public int findDuplicate(int[] nums) 
    {
        // here I am using Floyd's Torotise and Hare also knows as cycle detection problem.
        int tortoise = nums[0];
        int rabbit = nums[0];

        do 
        {
            tortoise = nums[tortoise];
            rabbit = nums[nums[rabbit]];
        }while(tortoise!=rabbit);

        tortoise = nums[0];
        while(tortoise!=rabbit)
        {
            tortoise = nums[tortoise];
            rabbit = nums[rabbit];
        }
        return rabbit;
    }
}