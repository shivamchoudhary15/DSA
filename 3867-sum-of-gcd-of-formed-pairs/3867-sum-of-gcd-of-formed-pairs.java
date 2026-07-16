class Solution {
    public long gcdSum(int[] nums) {
        long ans=0;
         int max=0;
         int arr[]=new int[nums.length];
        if(nums.length == 2){
            return gcd(nums[0], nums[1]);
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                arr[i]=gcd(max,nums[i]);
            }
            else{
                arr[i]=gcd(max,nums[i]);
            }
         
        }
        
        Arrays.sort(arr);
        
        long sum=0;
        if(arr.length%2==0){
           int l=0;
           int r=arr.length-1;
           while(l<r){
            sum+=gcd(arr[l],arr[r]);
            l++;
            r--;
           }
        }
        else{
            int l=0;
            int r=arr.length-1;
            while(l!=r){
                sum+=gcd(arr[l],arr[r]);
                l++;
                r--;
            }
        }
        return sum;
    }
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}