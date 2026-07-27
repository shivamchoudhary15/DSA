class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i:nums){
            while(i!=0){
                int res=i%10;
                if(res==digit){
                    count++;
                }
                i=i/10;
            }
        }
        return count;
    }
}