class Solution {
    public int minimumArea(int[][] grid) {
        int t=Integer.MAX_VALUE;
        int b= Integer.MIN_VALUE;
        int l=Integer.MAX_VALUE;
        int r= Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if (grid[i][j] == 1) {
                    t= Math.min(t, i);
                    b= Math.max(b, i);
                    l= Math.min(l, j);
                    r= Math.max(r, j);
                }
            }
        }
        if (t==Integer.MAX_VALUE) {
            return 0;
        }

        return (b - t+ 1) * (r-l + 1);
    }
}