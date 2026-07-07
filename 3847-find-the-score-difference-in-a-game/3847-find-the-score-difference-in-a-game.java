class Solution {
    public int scoreDifference(int[] nums) {
        int alice=0;
        int bob=0;
        boolean hasalice=true;
        boolean hasbob=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                if(hasalice){
                    hasalice=false;
                    hasbob=true;
                }
                else{
                    hasalice=true;
                    hasbob=false;
                }
            }
            if(i%6==5){
                if(hasalice){
                    hasalice=false;
                    hasbob=true;
                }
                else{
                    hasalice=true;
                    hasbob=false;
                }
            }
            if(hasalice){
                alice+=nums[i];
            }else{
                bob+=nums[i];
            }
        }
        return alice-bob;
    }
}