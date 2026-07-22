class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
     
        int[][] next=new int[n][m];

        for (int i=0;i<n;i++) {
            for (int j=0; j <m;j++) {
                int l=countlive(n, m, i, j, board);
                if (board[i][j]==1) {
                     if (l == 2 || l == 3)
                     next[i][j]=1;
                      else
                      next[i][j]=0;
                } else {
                    if (l==3)
                    next[i][j]=1;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j =0;j<m;j++) {
                board[i][j]=next[i][j];
            }
        }
    }


    public static int  countlive(int n,int m,int i,int j,int [][]board){
        int[] dr ={-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        int l=0;
        for (int k= 0;k< 8; k++) {
            int nr =  i+ dr[k];
            int nc = j+ dc[k];
             if(nr>=0 && nc>=0 && nr<n && nc<m && board[nr][nc]==1){
                l++;
             }
        }
        return l;
    }
}