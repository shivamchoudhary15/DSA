class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        int a[]=new int[envelopes.length];
        int i=0;
        for(int[] arr:envelopes){
            a[i]=arr[1];
            i++;
        }
        int count=lengthOfLIS(a);
        return count;



        
    }
   public int lengthOfLIS(int[] nums) {
        List<Integer> tails=new ArrayList<>();
        
        for(int num:nums){
            int i=Collections.binarySearch(tails,num);
            
            if(i<0) i=-(i+1);
            
            if(i==tails.size()){
                tails.add(num);
            }else{
                tails.set(i,num);
            }
        }
        return tails.size();


        
    }
}