class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        int ans1=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans1=mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        a[0]=ans;
        a[1]=ans1;
        return a;
    }
}