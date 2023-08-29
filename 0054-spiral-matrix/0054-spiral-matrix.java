class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
            int n=matrix.length, m=matrix[0].length;
            int minrow=0, mincol=0, maxrow=n-1, maxcol=m-1;
            ArrayList<Integer> list = new ArrayList<>();
            int total = n*m, count=0;
            while(count<total)
            {
                //for upper top
                for(int i=minrow, j=mincol; j<=maxcol&&count<total; j++)
                {
                    list.add(matrix[i][j]);
                    count++;
                }
                minrow++;

                //for right end
                for(int i=minrow, j=maxcol; i<=maxrow&&count<total; i++)
                {
                    list.add(matrix[i][j]);
                    count++;
                }
                maxcol--;

                //for lower bottom
                for(int i=maxrow, j=maxcol; j>=mincol&&count<total; j--)
                {
                    list.add(matrix[i][j]);
                    count++;
                }
                maxrow--;

                //for bottom top
                for(int i=maxrow, j=mincol; i>=minrow&&count<total; i--)
                {
                    list.add(matrix[i][j]);
                    count++;
                }
                mincol++;

            }
            return list;
    }
}