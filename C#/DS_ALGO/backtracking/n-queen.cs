public class Solution {
    public IList<IList<String>> SolveNQueens(int n) {
        char[][] board = new char[n][];
        for(int i = 0; i < n; i++) {
            var temp = new char[n];
            for(int j = 0; j < n; j++)
                temp[j] = '.';
            board[i] = temp;
        }
        var res = new List<IList<String>>();
        dfs(board, 0, res);
        return res;
    }
    
    private void dfs(char[][] board, int colIndex, IList<IList<String>> res) {
        if(colIndex == board.Length) {
            res.Add(construct(board));
            return;
        }
        
        for(int i = 0; i < board.Length; i++) {
            if(validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }
    }
    
    private bool validate(char[][] board, int x, int y) {
        for(int i = 0; i < board.Length; i++) {
            for(int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i))
                    return false;
            }
        }
        
        return true;
    }
    
    private IList<String> construct(char[][] board) {
        var res = new List<String>();
        for(int i = 0; i < board.Length; i++) {
            String s = new String(board[i]);
            res.Add(s);
        }
        return res;
    }
}