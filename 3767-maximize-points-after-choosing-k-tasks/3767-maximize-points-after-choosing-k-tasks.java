class Solution {
    public long maxPoints(int[] t1, int[] t2, int k) {
         long ans=0;
         PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->{
            return Integer.compare(a[1],b[1]);
         });
         for(int i=0;i<t1.length;i++){
            if(t1[i]>=t2[i]){
                ans+=t1[i];
                k--;
            }
            else{
                pq.add(new int[]{i,t2[i]-t1[i]});
            }
         }
         while(!pq.isEmpty()){
            int [] a=pq.poll();
            if(k>0){
                ans+=t1[a[0]];
               k--;
             
            }
            else{
            
                ans+=t2[a[0]];
            }
            
         }
         return ans;

    }
}