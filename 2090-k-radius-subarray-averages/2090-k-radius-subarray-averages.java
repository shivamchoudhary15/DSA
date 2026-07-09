class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        long sum=0;
        if(2*k+1>nums.length){
            return arr;
        }
        int count=0;
        for(int i=0;i<=2*k;i++){
            sum+=nums[i];
            count++;
        }
        int m=(int) (sum/count);
        arr[k]=m; 
        for(int i=k+1;i<nums.length-k;i++){
            sum=sum+nums[k+i]-nums[i-k-1];
            arr[i]=(int) (sum/count);
        }
        return arr;
    }
}