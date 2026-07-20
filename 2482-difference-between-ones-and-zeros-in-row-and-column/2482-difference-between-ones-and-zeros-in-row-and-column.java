class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int onerow[]=new int[n];
        int zerorow[]=new int[n];
        for(int i=0;i<n;i++){
            int one=0;
            int zero=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    zero++;
                }
                else{
                    one++;
                }
            }
            onerow[i]=one;
            zerorow[i]=zero;
        }
         int onecol[]=new int[m];
        int zerocol[]=new int[m];

        for(int i=0;i<m;i++){
            int one=0;
            int zero=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    one++;
                }
                else{
                    zero++;
                }
            }
            onecol[i]=one;
            zerocol[i]=zero;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=onerow[i]+onecol[j]-zerorow[i]-zerocol[j];
            }
        }
        return grid;
    }
}