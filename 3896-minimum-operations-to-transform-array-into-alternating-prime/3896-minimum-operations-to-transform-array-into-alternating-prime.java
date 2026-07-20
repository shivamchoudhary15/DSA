class Solution {
    public int minOperations(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(isprime(nums[i])==false){
                    int a=nextprime(nums[i]);
                    sum+=(a-nums[i]);
                }
            }
            else{
                if(isprime(nums[i])==true){
                    int a=nextnonprime(nums[i]);
                    
                    sum+=(a-nums[i]);
                }
            }
        }
        return sum;
    }
    public static boolean isprime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i=i+2){
            if(n%i==0) return false;
        }
        return true;
    }
    public static int  nextprime(int n){
        while(!isprime(n)){
            n++;
        }
        return n;
    }
    public static int  nextnonprime(int n){
        while(isprime(n)){
            n++;
        }
        return n;
    }
}