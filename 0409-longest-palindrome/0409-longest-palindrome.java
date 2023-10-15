class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if(n==1)
            return 1;
        int len = 0;
        int count[] = new int[256];
        for(char ch : s.toCharArray())
            count[ch]++;

        boolean hasOdd = false;
        for(int i : count)
        {
            len = len + (i/2)*2;
            if(i%2!=0)
                hasOdd = true;
        }
        if(hasOdd)
            len++;
        return len;
    }
}