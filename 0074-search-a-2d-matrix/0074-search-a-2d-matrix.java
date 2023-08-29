class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int length = n*m, k=0;
        int rowMajor[] = new int[length];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                rowMajor[k++] = matrix[i][j]; 
            }
        }

        int low = 0, high = rowMajor.length-1, mid;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(rowMajor[mid]==target)
                return true;
            else if(target<rowMajor[mid])
                high = mid-1;
            else 
                low = mid +1;
        }
        return false;
    }
}