class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        long j = (long) Math.sqrt(c);
        while(i<=j){
            long k=(i*i)+(j*j);
            if(k==c){
                return true;
            }
            else if(k>c){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
