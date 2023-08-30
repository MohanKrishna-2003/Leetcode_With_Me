class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i=0, cnt=0;
        while(i<len)
        {
            if(flowerbed[i]==0)
                if((i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0))
                {
                    flowerbed[i] = 1;
                    cnt++;
                }
            if(n<=cnt)
                return true;
            i++;
        }
        return false;
    }
}