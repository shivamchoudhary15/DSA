class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        return helper(text1,text2,n,m);
    }
    public  int helper(String s1,String s2,int n ,int m){
       int t[][]=new int[n+1][m+1];
       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                   t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][m];
    }
}