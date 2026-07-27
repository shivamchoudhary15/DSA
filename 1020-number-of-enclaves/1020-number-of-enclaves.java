class Solution {
    public int numEnclaves(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean [][]  visted=new boolean [n][m];
        for(int i=0;i<m;i++){
            if(!visted[0][i] && board[0][i]==1){
                dfs(0,i,board,visted,n,m);
            }
            if(!visted[n-1][i] && board[n-1][i]==1){
                dfs(n-1,i,board,visted,n,m);
            }
        }

        for(int j=0;j<n;j++){
            if(!visted[j][0] && board[j][0]==1){
                dfs(j,0,board,visted,n,m);
            }
            if(!visted[j][m-1] && board[j][m-1]==1){
                dfs(j,m-1,board,visted,n,m);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( !visted[i][j] && board[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int i ,int j,int [][] board ,boolean [][] visted,int n,int m){

        visted[i][j]=true;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};

        for(int k=0;k<4;k++){
            int nr=i+dr[k];
            int nc=j+dc[k];

            if(nr>=0 && nr<n && nc>=0 && nc<m && !visted[nr][nc] && board[nr][nc]==1){
                dfs(nr,nc,board,visted,n,m);
            }
        }
    }

}
 