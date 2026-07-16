class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int m=arr[(arr.length-1)/2];
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(b[0],a[0]);
            }
            return Integer.compare(b[1],a[1]);
        });
        for(int i:arr){
            pq.add(new int[]{i,Math.abs(i-m)});
        }
        int nums[]=new int[k];
        int i=0;
        while(k>0){
            int []a=pq.poll();
            nums[i]=a[0];
            k--;
            i++;
        }
        return nums;


    }
}
