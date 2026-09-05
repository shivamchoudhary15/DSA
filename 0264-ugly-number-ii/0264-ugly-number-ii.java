class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        Set<Long> visited=new HashSet<>();

        long factors[]={2,3,5};
        pq.add((long)1);
        visited.add((long)1);
        long ugly=1;
        for(int i=1;i<=n;i++){
             ugly=pq.poll();
            for(long factor:factors){
                if(!visited.contains(factor*ugly)){
                    pq.add(factor*ugly);
                    visited.add(factor*ugly);
                }
            }
        }
        return  (int) ugly;
    }
}