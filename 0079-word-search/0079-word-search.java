class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,0,word)==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public  boolean dfs(char[][] board ,int i,int j,int ind,String word){
        if(ind==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(ind)){
            return false ;
        }
        
        char temp = board[i][j];
        board[i][j] = '#';
        boolean f= dfs(board,i+1,j,ind+1,word) || dfs(board,i-1,j,ind+1,word) || dfs
        (board,i,j+1,ind+1,word)||  dfs(board,i,j-1,ind+1,word);
        board[i][j]=temp;
        return f;
    }
}