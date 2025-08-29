class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board){
        for(int row=0;row<9;row++){
            for(int cols=0;cols<9;cols++){
                if(board[row][cols]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,row,cols,c)){
                            board[row][cols]=c;
                        if(solve(board))return true;
                        board[row][cols]='.';
                        }
                    }
                return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int row, int cols, char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c)return false;
            if(board[i][cols]==c)return false;
            int rowbox=3*(row/3)+i/3;
             int colsbox=3*(cols/3)+i%3;
             if(board[rowbox][colsbox]==c)return false;
        }
        return true;
    }
}
public class Q37 {
    
}
