class Solution {
    public boolean isHappy(int n) 
    {
        int rem=0, sum=0;
        int val = getVal(n);
        while(val>0)
        {
            val = getVal(val);
            if(val<=9)
                break;
        }
        if(val==1)
            return true;
        return false;
    }

    public static int getVal(int n)
    {
        int sum = 0, rem = 0;
        while(n>0)
        {
            rem = n%10;
            sum += (rem*rem);
            n/=10;
        }   
        return sum;
    }
}