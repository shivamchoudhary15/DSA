class Solution {
    public int smallestNumber(int n, int t) {
        int a=n;
        while(true){
            if(isproduct(a,t)){
                return a;
            }
            else{
                a++;
            }
        }
    }
    public static boolean isproduct(int a ,int b){
        int p=1;
        while(a!=0){
            int k=a%10;
            p*=k;
            a=a/10;
        }
        if(p%b==0){
            return true;
        }
        return false;
    }
}