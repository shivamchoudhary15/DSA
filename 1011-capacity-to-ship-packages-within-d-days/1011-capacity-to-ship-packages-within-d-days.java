class Solution {
    public static boolean ismid(int [] weights,int mid,int d){
        int count=1;
        int s=0;
        for(int i:weights){
            if(i>mid) return  false;
            s+=i;
            if(s>mid){
                s=i;
                count++;
            }
        }
        if(count<=d) return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        for(int i:weights){
            if(i>s){
                s=i;
            }
        }
        int e=0;
        for(int i:weights){
            e+=i;
        }
        int ans=e;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ismid(weights,mid,days)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}