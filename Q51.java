class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result= new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
            
        }
        Set<Integer> cols=new HashSet<>();
        Set<Integer> diag1=new HashSet<>();
        Set<Integer> diag2=new HashSet<>();

        backtrack(0,board,result,cols,diag1,diag2);
        return result;
    }
    private void backtrack(int row,char[][],List<List<String>> result, Set<Integer> cols, Set<Integer> diag1, Set<Integer> diag2) ){
        int n= board.length;
        if(row==n){
            result.add(Construct(board));
            return;

        }
        for(int col=0;col<n;col++){
            int d1=row-col;
            int d2=row+col;
            if(cols.contains(col)||diag1.contains(d1)||diag2.contains(d2)){
                continue;
            }
            board[row][col]='Q';
            cols.add(col);
            diag1.add(d1);
            diag2.add(d2);
            backtrack(row+1,board,result,cols,diag1,diag2);

            board[row][col]='.';
            cols.remove(col);
            diag1.remove(d1);
            diag2.remove(d2);

        }


    }
    private List<String> construct(char[][]board){
        List<String> res=new ArrayList<>();
        for(char[]row:board){
            res.add(new String(row));
        }
        return res;
    }
}
public class Q51 {
    
}
