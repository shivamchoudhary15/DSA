class Solution {

    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean used[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && used[i][j]==false){
                    long ans=dfs(n,m,i,j,grid,used);
                    if(ans%k==0){
                         count++;
                    }
                }
            }
        }
        return count;
    }
    public static long dfs(int n,int m,int i,int j,int [][] grid,boolean [][] used){
       
        
        if( i<0 || j<0 || i>=n || j>=m || used[i][j]|| grid[i][j]==0 ){
            return 0;
        }
         used[i][j]=true;
        long sum=grid[i][j];
        sum+=dfs(n,m,i+1,j,grid,used);
        sum+= dfs(n,m,i,j+1,grid,used);
        sum+= dfs(n,m,i-1,j,grid,used);
        sum+= dfs(n,m,i,j-1,grid,used);
        return sum;
    }
}