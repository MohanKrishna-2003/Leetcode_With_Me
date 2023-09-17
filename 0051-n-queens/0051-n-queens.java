class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        placeQueens(board, 0, n, list);
        return list;
    }

    public static void placeQueens(char[][] board, int row, int n, List<List<String>> list) 
    {
        if(row==n)
        {
        List<String> res = new ArrayList<>();
        for(char[] val : board)
        {
            res.add(new String(val));
        }
        list.add(res);
        return;
        }
        else 
        {
            for(int col=0; col<n; col++)
            {
                if(isValidMove(board, row, col, n))
                {
                    board[row][col] = 'Q';
                    placeQueens(board, row+1, n, list);
                    board[row][col] = '.';
                }
            }
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col, int n)
    {
        for(int i=0; i<row; i++)
        {
            if(board[i][col]=='Q')
                return false;
        }

        for(int i=row, j=col; i>=0&&j>=0; i--, j--)
        {
            if(board[i][j]=='Q')
                return false;
        }

        for(int i=row, j=col; i>=0 && j<n; i--, j++)
        {
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
}