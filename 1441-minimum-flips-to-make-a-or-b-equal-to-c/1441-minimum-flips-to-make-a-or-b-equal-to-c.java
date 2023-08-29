class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(a!=0 || b!=0 || c!=0)
        {
            int x = a&1;
            int y = b&1;
            int z = c&1;
            if((x|y)!=z)
            {
                if(x==1 && y==1)
                    flips += 2;
                else 
                    flips += 1;
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return flips;
    }
}