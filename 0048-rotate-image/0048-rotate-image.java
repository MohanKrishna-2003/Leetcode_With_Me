class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int res[][] = new int[m][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                res[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = res[i][j];
            }
       
        }
         for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}