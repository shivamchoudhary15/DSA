class Solution {
    public int maximumProduct(int[] nums, int k) {
        long prod=1;
        int mod=1000000007;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        while(k-->0){
            int m=pq.poll();
            pq.add(m+1);

        }
        while(!pq.isEmpty()){
            prod=(prod*pq.poll())%mod;
        }
        return (int)prod;
    }
}