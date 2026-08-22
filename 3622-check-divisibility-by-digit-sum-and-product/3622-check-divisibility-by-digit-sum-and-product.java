class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int m=n; 
        int sum1=1; 
        while(m>0){
            int k=m%10;
            sum+=k;
            sum1*=k;
            m=m/10;
        }
        
        if(n%(sum+sum1)==0) return true;
        return false;
    }
}