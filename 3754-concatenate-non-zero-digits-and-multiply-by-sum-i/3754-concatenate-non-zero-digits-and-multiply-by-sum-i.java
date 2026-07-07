class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder res1=new StringBuilder();
        if(n==0) return 0;
        int sum=0;
        while(n!=0){
            int res=n%10;
            if(res!=0){
                sum+=res;
                res1.append(res);
            }
            n=n/10;
        }
        String k=res1.reverse().toString();
        long m=Long.parseLong(k);
        m=m*sum;
        return m;
    }
}