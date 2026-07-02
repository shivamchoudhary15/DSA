class Solution {
    public long[] sumOfThree(long num) {
        long x=(long)(num/3);
        long ans[]=new long[3];
        ans[0]=x-1;
        ans[1]=x;
        ans[2]=x+1;
        if(ans[0]+ans[1]+ans[2]==num){
            return ans;
        }
        return new long[0];
    
    }
}