class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(palindrome(x)==true)
                return true;
        return false;
    }
    public static boolean palindrome(int x)
    {
        int rev = 0, temp, rem;
        temp = x;
        while(temp>0)
        {
            rem = temp%10;
            rev = rev*10 + rem;
            temp /= 10;
        }
        if(rev==x)
            return true;
        return false;
    }
}