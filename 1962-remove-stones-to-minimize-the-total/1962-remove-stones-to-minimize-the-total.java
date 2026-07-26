class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.add(i);
        }
        while(k-->0){
            int m=pq.poll();
             int s = m - (m / 2);
            pq.add(s);
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}