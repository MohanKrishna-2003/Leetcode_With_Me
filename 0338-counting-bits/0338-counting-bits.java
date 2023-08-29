class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        int count=0;
        for(int i=0; i<=n; i++)
        {
            res[i] = getBit(i);
        }
        return res;
    }
    public static int getBit(int num)
    {
        int count=0;
        while(num>0)
        {
            count += num&1;
            num>>=1;
        }
        return count;
    }
}