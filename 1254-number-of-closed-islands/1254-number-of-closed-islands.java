class Solution {
    public int closedIsland(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean used[][]=new boolean[n][m];
       for(int i=0;i<m;i++){
        if(grid[0][i]==0){
            dfs(n,m,0,i,grid,used);
        }
       }
       for(int j=0;j<n;j++){
        if(grid[j][0]==0){
              dfs(n,m,j,0,grid,used);
        }
       }
       for(int i=0;i<m;i++){
           if(grid[n-1][i]==0){
              dfs(n,m,n-1,i,grid,used);
           }
       }
       for(int j=0;j<n;j++){
        if(grid[j][m-1]==0){
              dfs(n,m,j,m-1,grid,used);
        }
       }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(used[i][j]==false &&  grid[i][j]==0){
                    count++;
                    dfs(n,m,i,j,grid,used);
                }
            }
        }
       return count;
    }
    public static void dfs(int n,int m,int i,int j,int [][] grid,boolean [][] used){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==1 || used[i][j]){
            return ;
        }
        used[i][j]=true;
        dfs(n,m,i+1,j,grid,used);
        dfs(n,m,i,j+1,grid,used);
        dfs(n,m,i-1,j,grid,used);
        dfs(n,m,i,j-1,grid,used);
    }
}