class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int res[] = new int[2];
        int n=mat.length, m=mat[0].length;
        int maxCount=0, index=0;
        for(int i=0; i<n; i++)
        {
            int count=0;
            for(int j=0; j<m; j++)
            {
                if(mat[i][j]==1)
                    count++;
            }
            if(count>maxCount){
                maxCount = count;
                index=i;
            }
        }
        res[0] = index;
        res[1] = maxCount;
        return res;
    }
}